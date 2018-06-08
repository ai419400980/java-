package com.liangzi.mgr.blog.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.liangzi.blog.congfig.BlogConfig;
import com.liangzi.blog.congfig.WebConfig;
import com.liangzi.blog.service.LogsService;
import com.liangzi.blog.utils.TimesUtil;
import com.liangzi.blog.web.utils.IpUtils;
import com.liangzi.blog.web.utils.WebOrPhoneUtil;
import com.liangzi.mgr.blog.service.LoginService;
import com.liangzi.mgr.blog.web.utils.ImageCodeUtils;
import com.liangzi.mgr.blog.web.utils.SessionUtils;


/**
 * <p>Title 		: LoginController</p>
 * <p>Description   : 博客后台管理登录Controller</p>
 * <p>DevelopTools  : Eclipse_x64</p>
 * <p>DevelopSystem : windows10_x64</p>
 * <p>Company 		: com.liangzi</p>
 * @author  		: Liangzi
 * @date 			: 2016年12月8日 下午9:09:07
 * @version 		: 1.0
 */
@Controller("loginController")
@RequestMapping("/mgr")
public class LoginController {
	
	/**
	 * 注入service
	 */
	@Autowired
	private LoginService loginService;
	@Autowired
	private LogsService logsService;
	
	/**
	 * 跳到登入界面
	 * @return
	 */
	@RequestMapping("/getMgr.html")
	public ModelAndView getMgr(HttpServletRequest request){
		ModelAndView mv = new ModelAndView();
		String date = TimesUtil.getNow();
		Integer countForVisitors = loginService.getVisit(date);
		Integer countForVisitorsForPhone = loginService.getSearchForPhone(date);
		Integer countForVisitorsForPc = loginService.getCountForPc(date);
		Integer countForOperation = loginService.getVisitForOperation(date);
		Integer countForSearch = loginService.getSearchCount(date);
		Integer countForMessage = loginService.getMessageCount(date);
		Integer countForPraise = loginService.getPraiseCount(date);
		Integer countForArticleMessage = loginService.getArticleMessageCount(date);
		mv.addObject("countForVisitors", countForVisitors);
		mv.addObject("countForOperation", countForOperation);
		mv.addObject("countForSearch", countForSearch);
		mv.addObject("countForVisitorsForPc", countForVisitorsForPc);
		mv.addObject("countForVisitorsForPhone", countForVisitorsForPhone);
		mv.addObject("countForMessage", countForMessage);
		mv.addObject("countForPraise", countForPraise);
		mv.addObject("countForArticleMessage", countForArticleMessage);
		mv.setViewName("mgr/login");
		return mv;
	}
	
	/**
	 * 获得验证码
	 * @param request
	 * @param response
	 * @param time
	 */
	@RequestMapping("/image_code.html")
	public void imageCode(HttpServletRequest request, HttpServletResponse response, String time) {
		ImageCodeUtils.getImageCode(request, response, 4, WebConfig.MGR_IMAGE_CODE_NAME, 105, 32, WebConfig.MGR_IMAGE_CODE_OVER_TIME);
	}
	
	/**
	 * 检查登录信息
	 * @param request
	 * @param username
	 * @param password
	 * @param verify
	 * @return
	 */
	@RequestMapping("/login.html")
	@ResponseBody
	public String login(HttpServletRequest request, String username, String password, String verify) {
		JSONObject jsonObject = new JSONObject();
		Boolean check = ImageCodeUtils.isVerifyCode(request, verify, WebConfig.MGR_IMAGE_CODE_NAME);
		HttpSession session = SessionUtils.getHttpSession(request);
		String IP = IpUtils.getIp(request);
		int checking = WebOrPhoneUtil.check(request);
		String type = null;
		if (checking == 1) {
			type = BlogConfig.PC;
		} else {
			type = BlogConfig.PHONE;
		}
		if (check) {
			if (loginService.chenkLogin(username, password, session)) {
				// 通过
				jsonObject.put("check", 0);
				logsService.insertMgrLoginLogs(IP, session.getAttribute("account").toString(), WebConfig.LOGIN_SUCCESS,
						type);
				return jsonObject.toJSONString();
			} else {
				// 账号密码错误
				jsonObject.put("check", -2);
				logsService.insertMgrLoginLogs(IP, username + ":" + password, WebConfig.LOGIN_FAIL, type);
				return jsonObject.toJSONString();
			}
		} else {
			// 验证码错误
			jsonObject.put("check", -1);
			logsService.insertMgrLoginLogs(IP, username + ":" + password, WebConfig.LOGIN_ERROR, type);
			return jsonObject.toJSONString();
		}
	}
	
	/**
	 * 登录跳转链接
	 * @param request
	 * @return
	 */
	@RequestMapping("/logining.html")
	public ModelAndView logining(HttpServletRequest request){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("mgr/index");
		return mv;
	}
}
