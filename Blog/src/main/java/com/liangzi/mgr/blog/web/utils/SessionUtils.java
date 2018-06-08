package com.liangzi.mgr.blog.web.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


/**
 * <p>Title			: SessionUtils</p>
 * <p>Description	: Session工具类</p>
 * <p>DevelopTools	: Eclipse_x64</p>
 * <p>DevelopSystem	: Windows 10</p>
 * <p>Company		: com.51diaocha</p>
 * @author			: XuJun
 * @date			: 2016年6月21日 下午2:44:04
 * @version			: 1.0
 */
public class SessionUtils  {
	
	/**
	 * 从HttpServletRequest中获取HttpSession
	 * @param request 	HttpServletRequest
	 * @return 			HttpSession
	 */
	public static HttpSession getHttpSession(HttpServletRequest request) {
		return request.getSession();
	}
	
	/**
	 * 将数据设置到Session中
	 * @param key 		Key
	 * @param value 	数据
	 * @param request 	HttpServletRequest
	 */
	public static void set(HttpServletRequest request, String key, Object data) {
		set(request, key, data, null);
	}
	
	/**
	 * 将数据设置到Session中
	 * @param request 	HttpServletRequest
	 * @param key 		Key
	 * @param data 		数据
	 * @param overTime	超时时间(秒)
	 */
	public static void set(HttpServletRequest request, String key, Object data, Integer overTime) {
		HttpSession httpSession = getHttpSession(request);
		httpSession.setAttribute(key, data);
		if(overTime != null && overTime > 0) {
			httpSession.setMaxInactiveInterval(overTime);
		}
	}

	/**
	 * 获取Session中的数据
	 * @param request 	HttpServletRequest
	 * @param key 		Key
	 * @return 			数据
	 */
	public static Object get(HttpServletRequest request, String key) {
		return getHttpSession(request).getAttribute(key);
	}

	/**
	 * 移除Session
	 * @param request 	HttpServletRequest
	 * @param key 		Key
	 */
	public static void del(HttpServletRequest request, String key) {
		getHttpSession(request).removeAttribute(key);
	}

}
