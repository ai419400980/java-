package com.liangzi.blog.web.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.liangzi.blog.congfig.WebConfig;
import com.liangzi.blog.web.utils.model.IPAddr;
import com.liangzi.blog.web.utils.model.IPAddrSina;

/**
 * <p>Title			: AddressUtils</p>
 * <p>Description	: IP详细地址Util</p>
 * <p>DevelopTools	: Eclipse_x64</p>
 * <p>DevelopSystem	: Windows_x64</p>
 * <p>Company		: liangzl.com</p>
 * @author			: Liangzl
 * @date			: 2016年12月5日 下午5:28:58
 * @version			: 1.0
 */
public class AddressUtils {
	
	/**
	 *  获取ip的详细信息
	 * @param ip
	 * @return
	 */

	public static IPAddr getIPAddr(String ip) {
		if (ip == null || "".equals(ip)) {
			return null;
		}
		String content = get(WebConfig.IP_GET_ADDR + "?ip=" + ip);
		JSONObject data = JSONObject.parseObject(content);
		if (data.get("code").equals(0)) {
			data = JSONObject.parseObject(data.getString("data"));
			IPAddr iPAddr = JSONObject.toJavaObject(data, IPAddr.class);
			iPAddr.setCountryId(data.getString("country_id"));
			iPAddr.setAreaId(data.getString("area_id"));
			iPAddr.setRegionId(data.getString("region_id"));
			iPAddr.setCityId(data.getString("city_id"));
			iPAddr.setCountyId(data.getString("county_id"));
			iPAddr.setIspId(data.getString("isp_id"));
			return iPAddr;
		} else {
			return null;
		}
	}
	
	/**
	 * GET方式访问链接
	 * @param url 	网址
	 * @return 		访问结果
	 */
	public static String get(String url) {
		return get(url, null, "Utf-8");
	}
	
	/**
	 * GET方式访问链接
	 * @param url 			网址
	 * @param param 		参数
	 * @param charsetName 	字符集编码
	 * @return 				访问结果
	 */
	public static String get(String url, Map<String, Object> param, String charsetName) {
		if(url == null || "".equals(url)) {
			return null;
		}
		if(param != null) {
			url += "?" + transformationParam(param);
		}
		URLConnection connection = initConnection(url);
		if(connection == null) {
			return null;
		}
		try {
				connection.connect();
			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream(), charsetName));
			String line = null;
			StringBuffer stringBuffer = new StringBuffer();
			while ((line = in.readLine()) != null) {
				stringBuffer.append(line);
			}
			return stringBuffer.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 参数转换
	 * @param param 参数
	 * @return 		转换后的结果
	 */
	private static String transformationParam(Map<String, Object> param) {
		StringBuffer stringBuffer = new StringBuffer();
		for (String key : param.keySet()) {
			if (stringBuffer.length() != 0) {
				stringBuffer.append("&");
			}
			stringBuffer.append(key + "=" + param.get(key));
		}
		return stringBuffer.toString();
	}
	
	/**
	 * 初始化URL链接
	 * @param url 	URL
	 * @return 		URL链接
	 */
	private static URLConnection initConnection(String url) {
		try {
			URLConnection connection = (new URL(url)).openConnection();
			connection.setRequestProperty("accept", "*/*");
			connection.setRequestProperty("connection", "Keep-Alive");
			connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			return connection;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 获取IP的详细地址(新浪)
	 * @param ip 	IP
	 * @return 		详细地址
	 */
	public static IPAddrSina getIPAddrFromSina(String ip) {
		String content = get(WebConfig.IP_GET_ADDR_SINA + "?format=json&ip=" + ip);
		JSONObject data = null;
		try {
			data = JSONObject.parseObject(content);
			Integer status = data.getInteger("ret");
			if(status != null && status.equals(-1)) {
				return null;
			} else {
				IPAddrSina iPAddrSina = JSONObject.toJavaObject(data, IPAddrSina.class);
				return iPAddrSina;
			}
		} catch (Exception e) {
			return null;
		}
	}
	
}
