package com.liangzi.mgr.blog.interceptor;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.liangzi.blog.utils.AJAXUtils;
import com.liangzi.blog.web.utils.IpUtils;
import com.liangzi.mgr.blog.quartz.MgrCountForIpQuartz;


/**
 * <p>Title 		: MgrBlackInterceptor</p>
 * <p>Description   : 黑名单判断Interceptor</p>
 * <p>DevelopTools  : Eclipse_x64</p>
 * <p>DevelopSystem : windows10_x64</p>
 * <p>Company 		: com.liangzi</p>
 * @author  		: Liangzi
 * @date 			: 2016年12月28日 下午10:18:15
 * @version 		: 1.0
 */
public class MgrBlackInterceptor implements HandlerInterceptor{
	
	public static Map<String,Integer> MgrBlacklistMap = new HashMap<String, Integer>();
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object arg2, Exception arg3)
			throws Exception {

	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}
	
	//判断是否是黑名单
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		// 获取IP地址
		String IP = IpUtils.getIp(request);
		if (MgrBlacklistMap.containsKey(IP)) {
			int mbGrade = MgrBlacklistMap.get(IP);
			String url = request.getRequestURI();
			if (mbGrade == 1) {
				if ("/messageAdding.html".equals(url) || "/addCommenting.html".equals(url) || "/mgr/login.html".equals(url) || "/addPraise.html".equals(url)) {
					if (AJAXUtils.isAjaxRequest(request)) {
						response.getWriter().write("-4");
						return false;
					} else {
						response.sendRedirect("index.html");
						return false;
					}
				}else{
					if (MgrCountForIpQuartz.IpCountMap.containsKey(IP)) {
						MgrCountForIpQuartz.IpCountMap.replace(IP, MgrCountForIpQuartz.IpCountMap.get(IP).intValue()+1);
					}else{
						MgrCountForIpQuartz.IpCountMap.put(IP, 1);
					}
					return true;
				}
			}else if (mbGrade == 2) {
				if (AJAXUtils.isAjaxRequest(request)) {
					response.setContentType("text/html;charset=UTF-8");
					response.getWriter().write("你已经被管理员拉黑,请与站长联系!");
//					response.getWriter().write("-5");
					return false;
				} else {
					response.setContentType("text/html;charset=UTF-8");
					response.getWriter().write("你已经被管理员拉黑,请与站长联系!");
//					response.sendRedirect("wocao.html");
					return false;
				}
			}
			return false;
		} else {
			if (MgrCountForIpQuartz.IpCountMap.containsKey(IP)) {
				MgrCountForIpQuartz.IpCountMap.replace(IP, MgrCountForIpQuartz.IpCountMap.get(IP).intValue()+1);
			}else{
				MgrCountForIpQuartz.IpCountMap.put(IP, 1);
			}
			return true;
		}
	}
}
