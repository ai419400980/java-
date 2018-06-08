package com.liangzi.mgr.blog.service;

import javax.servlet.http.HttpSession;

/**
 * <p>Title 		: LoginService</p>
 * <p>Description   : 博客后台管理登录Service</p>
 * <p>DevelopTools  : Eclipse_x64</p>
 * <p>DevelopSystem : windows10_x64</p>
 * <p>Company 		: com.liangzi</p>
 * @author  		: Liangzi
 * @date 			: 2016年12月8日 下午9:48:30
 * @version 		: 1.0
 */
public interface LoginService {
	
	/**
	 * 获取今天访问人数 
	 * @param date
	 * @return
	 */
	public int getVisit(String date);

	/**
	 * 获取今天操作人次 
	 * @param date
	 * @return
	 */
	public int getVisitForOperation(String date);
	
	/**
	 * 获取今天搜索次数 
	 * @param date
	 * @return
	 */
	
	public int getSearchCount(String date);
	
	/**
	 * 获取今天搜索次数 
	 * @param date
	 * @return
	 */
	public int getCountForPc(String date);
	
	/**
	 * 获取今天搜索次数 
	 * @param date
	 * @return
	 */
	public int getSearchForPhone(String date);
	
	/**
	 * 获取今天留言次数 
	 * @param date
	 * @return
	 */
	public int getMessageCount(String date);
	
	/**
	 * 获取今天点赞次数 
	 * @param date
	 * @return
	 */
	public int getPraiseCount(String date);
	
	/**
	 * 获取今天文章留言次数 
	 * @param date
	 * @return
	 */
	public int getArticleMessageCount(String date);
	
	/**
	 * 验证账号密码的正确性
	 * @param username
	 * @param password
	 * @return
	 */
	public boolean chenkLogin(String username ,String password ,HttpSession session);
}
