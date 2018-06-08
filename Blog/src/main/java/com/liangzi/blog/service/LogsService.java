package com.liangzi.blog.service;

/**
 * <p>Title 		: LogsService</p>
 * <p>Description   : 日志Service</p>
 * <p>DevelopTools  : Eclipse_x64</p>
 * <p>DevelopSystem : windows10_x64</p>
 * <p>Company 		: com.liangzi</p>
 * @author  		: Liangzi
 * @date 			: 2016年11月29日 下午9:03:32
 * @version 		: 1.0
 */
public interface LogsService {
	
	/**
	 * 添加用户访问记录及访问目标
	 * @param IP
	 * @param target
	 */
	public void insertVisitLogs(String IP , String target , String operationType ,int check);
	
	/**
	 * 插入登入信息
	 * @param IP
	 * @param username
	 */
	public void insertMgrLoginLogs(String IP ,String username ,String mllLoginStatus ,String type);
	
	/**
	 * 后台操作信息
	 * @param IP
	 * @param mlName
	 * @param mlTarget
	 * @param mlOperationContent
	 */
	public void insertMgrLogs(String IP ,String mlName ,String mlTarget ,String mlOperationContent ,String type);
	
	/**
	 * 发送邮件
	 * @param context
	 * @param ip
	 */
	public  void sendEmail(String context, String ip);
}
