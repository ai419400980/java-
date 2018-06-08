package com.liangzi.blog.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;


/**
 * <p>Title			: XssFilter</p>
 * <p>Description	: XSS过滤器</p>
 * <p>DevelopTools	: Eclipse_x64_v4.6.1</p>
 * <p>DevelopSystem	: Windows10</p>
 * <p>Company		: com.51diaocha</p>
 * @author			: XuJun
 * @date			: 2016年11月21日 下午2:24:53
 * @version			: 1.0.0
 */
public class XssFilter implements Filter {
	

	/** 初始化 **/
	public void init(FilterConfig filterConfig) throws ServletException {
//		// 读取排除URL的配置信息
//		String config = filterConfig.getInitParameter("excludedURL");
//		if (StringUtils.isNotEmpty(config)) {
//			excludedPages = ArraysUtils.getStringListByString(config);
//		}
//		excludedPages.add("/mgr/addAtcile.html");
	}

	/** 过滤 **/
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// 是否为排除的URL
		/**
		 * 排除的URL列表
		 */
		List<String> excludedPages = new ArrayList<String>();
		excludedPages.add("/mgr/addAtcile.html");
		boolean isExcludedPage = false;
		if (excludedPages != null && excludedPages.size() > 0) {
			for (String pageUrl : excludedPages) { // 判断是否在过滤url之外
				if (((HttpServletRequest) request).getServletPath().equals(pageUrl)) {
					isExcludedPage = true;
					break;
				}
			}
		}
		// 是否要XSS过滤
		if (!isExcludedPage) {
			chain.doFilter(new XssHttpServletRequestWrapper((HttpServletRequest) request), response);
		} else {
			chain.doFilter(request, response);
		}
	}

	/** 破坏 **/
	public void destroy() {}
}
