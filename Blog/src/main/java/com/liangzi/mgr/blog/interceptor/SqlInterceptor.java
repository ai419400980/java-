package com.liangzi.mgr.blog.interceptor;

import java.util.Date;
import java.util.Enumeration;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.liangzi.blog.congfig.BlogConfig;
import com.liangzi.blog.service.LogsService;
import com.liangzi.blog.utils.AJAXUtils;
import com.liangzi.blog.web.utils.IpUtils;
import com.liangzi.blog.web.utils.WebOrPhoneUtil;
import com.liangzi.mgr.blog.dao.MgrBlacklistMapper;
import com.liangzi.mgr.blog.model.base.MgrBlacklist;

/**
 * <p>Title 		: SqlInterceptor</p>
 * <p>Description   : SQL注入Interceptor</p>
 * <p>DevelopTools  : Eclipse_x64</p>
 * <p>DevelopSystem : windows10_x64</p>
 * <p>Company 		: com.liangzi</p>
 * @author  		: Liangzi
 * @date 			: 2016年12月28日 下午7:54:32
 * @version 		: 1.0
 */
public class SqlInterceptor implements HandlerInterceptor {

	@Autowired
	private LogsService logsService;
	@Autowired
	private MgrBlacklistMapper mgrBlacklistMapper;
	
	public static String reg = "(?:')|(?:--)|(/\\*(?:.|[\\n\\r])*?\\*/)|"   + "(\\b(select|update|and|or|delete|insert|trancate|char|into|substr|ascii|declare|exec|count|master|into|drop|execute)\\b)";  
	public static Pattern sqlPattern = Pattern.compile(reg, Pattern.CASE_INSENSITIVE);  
	
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object arg2, Exception arg3)
			throws Exception {

	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	/**
	 * 判断是否是sql注入
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		Enumeration<String> keys = request.getParameterNames();
		while (keys.hasMoreElements()) {
			String k = keys.nextElement();
			if (sqlPattern.matcher(request.getParameter(k)).find()) {
				String target = "'"+request.getParameter(k)+"'";
				String IP = IpUtils.getIp(request);
				int check = WebOrPhoneUtil.check(request);
				if (MgrBlackInterceptor.MgrBlacklistMap.containsKey(IP) ) {
					if (MgrBlackInterceptor.MgrBlacklistMap.get(IP) == 1) {
						mgrBlacklistMapper.updateByIpSql(IP);
						MgrBlackInterceptor.MgrBlacklistMap.put(IP, 2);
						// 发送邮件
						logsService.sendEmail(BlogConfig.OPERATIONTYPE_SQL_INJECTION, IP);
					}
				}else{
					MgrBlackInterceptor.MgrBlacklistMap.put(IP, 2);
					MgrBlacklist mgrBlacklist = new MgrBlacklist();
					mgrBlacklist.setMbCreatTime(new Date());
					mgrBlacklist.setMbIp(IP);
					mgrBlacklist.setMbGrade(2);
					mgrBlacklist.setMbReason(BlogConfig.OPERATIONTYPE_SQL_INJECTION);
					mgrBlacklistMapper.insert(mgrBlacklist);
					// 发送邮件
					logsService.sendEmail(BlogConfig.OPERATIONTYPE_SQL_INJECTION, IP);
				}
				logsService.insertVisitLogs(IP, target, BlogConfig.OPERATIONTYPE_SQL_INJECTION, check);
				if (AJAXUtils.isAjaxRequest(request)) {
					response.getWriter().write("-5");
					return false;
				}else{
					response.sendRedirect("wocao.html");
					return false;
				}
			}  
		}
		return true;
	}
}
