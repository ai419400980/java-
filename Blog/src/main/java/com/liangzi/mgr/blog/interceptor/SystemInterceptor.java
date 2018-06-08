package com.liangzi.mgr.blog.interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>Title 		: SystemInterceptor</p>
 * <p>Description   : 系统Interceptor</p>
 * <p>DevelopTools  : Eclipse_x64</p>
 * <p>DevelopSystem : windows10_x64</p>
 * <p>Company 		: com.liangzi</p>
 * @author  		: Liangzi
 * @date 			: 2016年12月28日 下午7:49:55
 * @version 		: 1.0
 */
public class SystemInterceptor implements HandlerInterceptor {
	
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object arg2, Exception arg3)
			throws Exception {

	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {

	}

	// 非法的nowPageNum跳转到首页
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		if (request.getParameter("nowPageNum") == null) {
			return true;
		} else {
			try {
				Integer.parseInt(request.getParameter("nowPageNum"));
				return true;
			} catch (NumberFormatException e) {
				response.sendRedirect("index.html");
				return false;
			}
		}
	}
}
