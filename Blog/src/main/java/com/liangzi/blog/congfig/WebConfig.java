package com.liangzi.blog.congfig;

/**
 * <p>Title 		: WebConfig</p>
 * <p>Description   : IP-Config</p>
 * <p>DevelopTools  : Eclipse_x64</p>
 * <p>DevelopSystem : windows10_x64</p>
 * <p>Company 		: com.liangzi</p>
 * @author  		: Liangzi
 * @date 			: 2016年11月29日 下午9:19:34
 * @version 		: 1.0
 */
public class WebConfig {
	
	/** 获取IP地址的详细信息 **/
	public static final String IP_GET_ADDR 					= "http://ip.taobao.com/service/getIpInfo.php";     //淘宝
	public static final String IP_GET_ADDR_SINA 			= "http://int.dpool.sina.com.cn/iplookup/iplookup.php"; //新浪 
	
	/** 内网默认ip **/
	public static final String DEFAULT_IP 					= "未分配或者内网IP";
	
	/** 验证码 **/
	public static final String STRINGSET_UPPERCASE 			= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String STRINGSET_LOWERCASE 			= "abcdefghijklmnopqrstuvwxyz";
	public static final String STRINGSET_NUMBER 			= "0123456789";
	public static final String STRINGSET_DEFAULT 			= STRINGSET_UPPERCASE + STRINGSET_LOWERCASE + STRINGSET_NUMBER;
	
	/** 图片验证码前缀 **/
	public static final String IMAGE_CODE_PREFIX 			= "imageCode_";
	
	/** Mgr图片验证码名称 **/ 
	public static final String MGR_IMAGE_CODE_NAME 			= "store.mgr.image.code";
	
	/** Mgr图片验证码Session超时时间(秒) **/ 
	public static final Integer MGR_IMAGE_CODE_OVER_TIME 	= 5 * 60;
	
	/** 登录记录 **/ 
	public static final String LOGIN_SUCCESS 				= "登陆成功";
	public static final String LOGIN_FAIL					= "账号密码错误";
	public static final String LOGIN_SQL_INTO				= "Sql注入";
	public static final String LOGIN_ERROR 					= "验证码错误";
	
	/** kindEditor **/ 
	public static final String PATH_LINE					= "/";
	public static final String PICTURE_SPACE_URL			= "/editorImages/";
	public static final String PICTURE_URL					= "/editorImages/";
}
