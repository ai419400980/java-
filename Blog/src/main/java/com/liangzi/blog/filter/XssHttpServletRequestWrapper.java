package com.liangzi.blog.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import org.apache.commons.lang3.StringEscapeUtils;

/**
 * <p>Title			: XssHttpServletRequestWrapper</p>
 * <p>Description	: XSS过滤器包装</p>
 * <p>DevelopTools	: Eclipse_x64_v4.6.1</p>
 * <p>DevelopSystem	: Windows10</p>
 * <p>Company		: com.51diaocha</p>
 * @author			: XuJun
 * @date			: 2016年11月21日 下午2:25:18
 * @version			: 1.0.0
 */
public class XssHttpServletRequestWrapper extends HttpServletRequestWrapper {

	public XssHttpServletRequestWrapper(HttpServletRequest request) {
		super(request);
	}

	public String getHeader(String name) {
		return StringEscapeUtils.escapeHtml4(super.getHeader(name));
	}

	public String getQueryString() {
		return StringEscapeUtils.escapeHtml4(super.getQueryString());
	}

	public String getParameter(String name) {
		return StringEscapeUtils.escapeHtml4(super.getParameter(name));
	}

	public String[] getParameterValues(String name) {
		String[] values = super.getParameterValues(name);
		if (values != null) {
			int length = values.length;
			String[] escapseValues = new String[length];
			for (int i = 0; i < length; i++) {
				escapseValues[i] = StringEscapeUtils.escapeHtml4(values[i]);
			}
			return escapseValues;
		}
		return super.getParameterValues(name);
	}

}
