package com.liangzi.blog.web.utils;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.liangzi.blog.utils.ArraysUtils;
import com.liangzi.blog.utils.StringUtils;

/**
 * <p>Title 		: IpUtils</p>
 * <p>Description   : 获取用户ip</p>
 * <p>DevelopTools  : Eclipse_x64</p>
 * <p>DevelopSystem : windows10_x64</p>
 * <p>Company 		: com.liangzi</p>
 * @author  		: Liangzi
 * @date 			: 2016年11月29日 下午9:02:52
 * @version 		: 1.0
 */
public class IpUtils {
	
	/**
	 * 获取来访IP
	 * @param request 	HttpServletRequest
	 * @return 			来访IP
	 */
	public static String getIp(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {    
	        ip = request.getHeader("Proxy-Client-IP");    
	    }    
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {    
	        ip = request.getHeader("WL-Proxy-Client-IP");    
	    }    
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {    
	        ip = request.getRemoteAddr();    
	    }
		if (StringUtils.isEmpty(ip)) {
			return null;
		} else {
			List<String> ipList = ArraysUtils.getStringListByString(ip);
			int size = ipList.size();
			if(size > 1) {
				ip = ipList.get(0).trim();
			}
			return ip;
		}
	}
	
	
	
}
