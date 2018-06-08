package com.liangzi.mgr.blog.service;

import java.util.List;

import com.liangzi.blog.model.base.Visitors;
import com.liangzi.blog.model.base.VisitorsLogs;
import com.liangzi.mgr.blog.model.base.MgrBlacklist;
import com.liangzi.mgr.blog.model.base.MgrCountEveryday;
import com.liangzi.mgr.blog.model.base.MgrLoginLogs;
import com.liangzi.mgr.blog.model.base.MgrLogs;

/**+
 * <p>Title 		: MgrSystemService</p>
 * <p>Description   : 博客后台管理Service</p>
 * <p>DevelopTools  : Eclipse_x64</p>
 * <p>DevelopSystem : windows10_x64</p>
 * <p>Company 		: com.liangzi</p>
 * @author  		: Liangzi
 * @date 			: 2016年12月10日 下午1:08:22
 * @version 		: 1.0
 */
public interface MgrSystemService {
	
	/**
	 * 获取访问的ip的最大页数
	 * @param date
	 * @return
	 */
	public int getVisitCountForAll();
	
	/**
	 * 获取单日访问ip详细情况
	 * @param date
	 * @return
	 */
	public List<Visitors> getVisitor(Integer nowPageNum);
	
	/**
	 * 获取访问的ip的最大页数  有查询条件
	 * @param date
	 * @return
	 */
	public int getVisitCountForSearch(String viArea ,String viIp ,String vi_memo);
	
	/**
	 * 获取单日访问ip详细情况
	 * @param date
	 * @return visitorsList
	 */
	public List<Visitors> getForPageListForSearch(Integer nowPageNum ,String viArea ,String viIp ,String vi_memo);
	
	/**
	 * 获取访问的ip操作详情的最大页数
	 * @param date
	 * @return
	 */
	public int getVisitLogsCountForAll();
	
	/**
	 * 获取单日访问ip操作详细情况
	 * @param date
	 * @return visitorsList
	 */
	public List<VisitorsLogs> getVisitorLogs(Integer nowPageNum);
	
	/**
	 * 获取访问的ip操作详情的最大页数  有查询条件
	 * @param vlArea
	 * @param vlIp
	 * @param vlTarget
	 * @param vlOperationContent
	 * @param vlMemo
	 * @return
	 */
	public int getVisitLogsCountForSearch(String vlArea ,String vlIp ,String vlTarget ,String vlOperationContent ,String vlMemo);
	
	/**
	 * 获取单日访问ip操作详细情况  有查询条件
	 * @param date
	 * @return visitorsList
	 */
	public List<VisitorsLogs> getForVisitorsLogsPageListForSearch(Integer nowPageNum ,String vlArea ,String vlIp ,String vlTarget ,String vlOperationContent ,String vlMemo);

	/**
	 * 获取管理员登录的最大页数
	 * @param date
	 * @return
	 */
	public int getLoginLogsCountForAll();
	
	/**
	 * 获取单日访问ip操作详细情况
	 * @param date
	 * @return visitorsList
	 */
	public List<MgrLoginLogs> getLoginLogs(Integer nowPageNum);
	
	/**
	 * 获取管理员登录的最大页数  有查询条件
	 * @param vlArea
	 * @param vlIp
	 * @param vlTarget
	 * @param vlOperationContent
	 * @param vlMemo
	 * @return
	 */
	public int getLoginLogsCountForSearch(String mllIp ,String mllAccount ,String mllLoginStatus ,String mllMemo);
	
	/**
	 * 获取管理员登录的操作详细情况  有查询条件
	 * @param nowPageNum
	 * @param mllIp
	 * @param mllAccount
	 * @param mllLoginStatus
	 * @param mllMemo
	 * @return
	 */
	public List<MgrLoginLogs> getForLoginLogsPageListForSearch(Integer nowPageNum ,String mllIp ,String mllAccount ,String mllLoginStatus ,String mllMemo);
	
	/**
	 * 获取管理员登录操作的最大页数
	 * @param date
	 * @return
	 */
	public int getLoginOperationCountForAll();
	
	/**
	 * 获取管理员登录的操作详细情况
	 * @param date
	 * @return visitorsList
	 */
	public List<MgrLogs> getLoginOperation(Integer nowPageNum);
	
	/**
	 * 获取管理员登录操作的最大页数 有查询条件
	 * @param date
	 * @return
	 */
	public int getLoginOperationCountForSearch(String mgrIp ,String mlName ,String mlTarget ,String mlOperationContent ,String mlMemo);
	
	/**
	 * 获取管理员登录的操作详细情况 有查询条件
	 * @param date
	 * @return visitorsList
	 */
	public List<MgrLogs> getForLoginOperationPageListForSearch(Integer nowPageNum ,String mgrIp ,String mlName ,String mlTarget ,String mlOperationContent ,String mlMemo);

	/**
	 * 获取每日统计数据总页数
	 * @param date
	 * @return
	 */
	public int getEveryDayLogsCountForAll();
	
	/**
	 * 获取每日统计数据
	 * @param nowPageNum
	 */
	public List<MgrCountEveryday> getEveryDayLogs(Integer nowPageNum);
	
	/**
	 * 获取黑名单的最大页数
	 * @param date
	 * @return
	 */
	public int getBlacklistCountForAll();
	
	/**
	 * 获取黑名单详细情况
	 * @param date
	 * @return visitorsList
	 */
	public List<MgrBlacklist> getBlacklist(Integer nowPageNum);
	
	/**
	 * 删除黑名单
	 * @param request
	 * @param id
	 * @return
	 */
	public void delBlacklist(Long id);
	
	/**
	 * 获取黑名单的最大页数 有查询条件
	 * @param date
	 * @return
	 */
	public int getBlacklistCountForSearch(String ip);
	
	/**
	 * 获取黑名单详细情况 有查询条件
	 * @param date
	 * @return visitorsList
	 */
	public List<MgrBlacklist> getForBlacklistPageListForSearch(Integer nowPageNum ,String ip);
}
