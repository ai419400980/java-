package com.liangzi.mgr.blog.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liangzi.blog.congfig.BlogConfig;
import com.liangzi.blog.dao.VisitorsLogsMapper;
import com.liangzi.blog.dao.VisitorsMapper;
import com.liangzi.blog.model.base.Visitors;
import com.liangzi.blog.model.base.VisitorsLogs;
import com.liangzi.blog.model.extend.PageModel;
import com.liangzi.blog.model.extend.PageModelForBlacklist;
import com.liangzi.blog.model.extend.PageModelForLoginLogs;
import com.liangzi.blog.model.extend.PageModelForLoginOperationLogin;
import com.liangzi.blog.model.extend.PageModelForVisitor;
import com.liangzi.blog.model.extend.PageModelForVisitorLogs;
import com.liangzi.blog.utils.PageUtil;
import com.liangzi.blog.utils.TimesUtil;
import com.liangzi.mgr.blog.dao.MgrBlacklistMapper;
import com.liangzi.mgr.blog.dao.MgrCountEverydayMapper;
import com.liangzi.mgr.blog.dao.MgrLoginLogsMapper;
import com.liangzi.mgr.blog.dao.MgrLogsMapper;
import com.liangzi.mgr.blog.model.base.MgrBlacklist;
import com.liangzi.mgr.blog.model.base.MgrCountEveryday;
import com.liangzi.mgr.blog.model.base.MgrLoginLogs;
import com.liangzi.mgr.blog.model.base.MgrLogs;
import com.liangzi.mgr.blog.service.MgrSystemService;

/**
 * <p>Title 		: MgrSystemServiceImpl</p>
 * <p>Description   : 博客后台管理ServiceImpl</p>
 * <p>DevelopTools  : Eclipse_x64</p>
 * <p>DevelopSystem : windows10_x64</p>
 * <p>Company 		: com.liangzi</p>
 * @author  		: Liangzi
 * @date 			: 2016年12月10日 下午1:08:52
 * @version 		: 1.0
 */
@Service("mgrSystemService")
public class MgrSystemServiceImpl implements MgrSystemService{

	@Autowired
	private VisitorsMapper visitorsMapper;
	@Autowired
	private VisitorsLogsMapper visitorsLogsMapper;
	@Autowired
	private MgrLoginLogsMapper mgrLoginLogsMapper;
	@Autowired
	private MgrLogsMapper mgrLogsMapper;
	@Autowired
	private MgrCountEverydayMapper mgrCountEverydayMapper;
	@Autowired
	private MgrBlacklistMapper mgrBlacklistMapper;
	
	/**
	 * 获取访问的ip的最大页数
	 * @param date
	 * @return
	 */
	public int getVisitCountForAll(){
		int maxPage = PageUtil.getMaxPageForMgr(visitorsMapper.getVisitCountForAll());
		return maxPage;
	}
	
	/**
	 * 获取单日访问ip详细情况
	 * @param date
	 * @return visitorsList
	 */
	public List<Visitors> getVisitor(Integer nowPageNum){
		PageModel pageModel = new PageModel();
		pageModel.setMaxCount((nowPageNum-1)*BlogConfig.PAGE_SIZE_MGR);
		pageModel.setPageSize(BlogConfig.PAGE_SIZE_MGR);
		List<Visitors> visitorsListPage = visitorsMapper.getForPageList(pageModel);
		for (Visitors visitors : visitorsListPage) {
			visitors.setViCreatTimeChange(TimesUtil.getCurrTime(visitors.getViCreatTime()));
		}
		return visitorsListPage;
	}
	
	/**
	 * 获取访问的ip的最大页数  有查询条件
	 * @param date
	 * @return
	 */
	public int getVisitCountForSearch(String viArea ,String viIp ,String vi_memo){
		Visitors visitors = new Visitors();
		if (viArea != null ) {
			visitors.setViArea(viArea);
		}
		if (viIp != null ) {
			visitors.setViIp(viIp);
		}
		if (vi_memo != null ) {
			visitors.setViMemo(vi_memo);
		}
		int maxPage = PageUtil.getMaxPageForMgr(visitorsMapper.getVisitCountForSearch(visitors));
		return maxPage;
	}
	
	/**
	 * 获取单日访问ip详细情况  有查询条件
	 * @param date
	 * @return visitorsList
	 */
	public List<Visitors> getForPageListForSearch(Integer nowPageNum ,String viArea ,String viIp ,String vi_memo){
		PageModelForVisitor pageModelForVisitor = new PageModelForVisitor();
		pageModelForVisitor.setMaxCount((nowPageNum-1)*BlogConfig.PAGE_SIZE_MGR);
		pageModelForVisitor.setPageSize(BlogConfig.PAGE_SIZE_MGR);
		pageModelForVisitor.setViMemo(vi_memo);
		pageModelForVisitor.setViArea(viArea);
		pageModelForVisitor.setViIp(viIp);
		List<Visitors> visitorsListPageForSearch = visitorsMapper.getForPageListForSearch(pageModelForVisitor);
		for (Visitors visitors : visitorsListPageForSearch) {
			visitors.setViCreatTimeChange(TimesUtil.getCurrTime(visitors.getViCreatTime()));
		}
		return visitorsListPageForSearch;
	}
	
	/**
	 * 获取访问的ip操作详情的最大页数
	 * @param date
	 * @return
	 */
	public int getVisitLogsCountForAll(){
		int maxPage = PageUtil.getMaxPageForMgr(visitorsLogsMapper.getVisitLogsCountForAll());
		return maxPage;
	}
	
	/**
	 * 获取单日访问ip操作详细情况
	 * @param date
	 * @return visitorsList
	 */
	public List<VisitorsLogs> getVisitorLogs(Integer nowPageNum){
		PageModel pageModel = new PageModel();
		pageModel.setMaxCount((nowPageNum-1)*BlogConfig.PAGE_SIZE_MGR);
		pageModel.setPageSize(BlogConfig.PAGE_SIZE_MGR);
		List<VisitorsLogs> visitorsLogsListPage = visitorsLogsMapper.getForPageList(pageModel);
		for (VisitorsLogs visitorsLogs : visitorsLogsListPage) {
			visitorsLogs.setVlCreatTimeChange(TimesUtil.getCurrTime(visitorsLogs.getVlCreatTime()));
		}
		return visitorsLogsListPage;
	}
	
	/**
	 * 获取访问的ip操作详情的最大页数  有查询条件
	 * @param vlArea
	 * @param vlIp
	 * @param vlTarget
	 * @param vlOperationContent
	 * @param vlMemo
	 * @return
	 */
	public int getVisitLogsCountForSearch(String vlArea ,String vlIp ,String vlTarget ,String vlOperationContent ,String vlMemo){
		VisitorsLogs visitorsLogs = new VisitorsLogs();
		if (vlArea != null) {
			visitorsLogs.setVlArea(vlArea);
		}
		if (vlIp != null) {
			visitorsLogs.setVlIp(vlIp);
		}
		if (vlTarget != null) {
			visitorsLogs.setVlTarget(vlTarget);
		}
		if (vlOperationContent != null) {
			visitorsLogs.setVlOperationContent(vlOperationContent);
		}
		if (vlMemo != null) {
			visitorsLogs.setVlMemo(vlMemo);
		}
		int maxPage = PageUtil.getMaxPageForMgr(visitorsLogsMapper.getVisitLogsCountForSearch(visitorsLogs));
		return maxPage;
	}
	
	/**
	 * 获取单日访问ip操作详细情况  有查询条件
	 * @param date
	 * @return visitorsList
	 */
	public List<VisitorsLogs> getForVisitorsLogsPageListForSearch(Integer nowPageNum ,String vlArea ,String vlIp ,String vlTarget ,String vlOperationContent ,String vlMemo){
		PageModelForVisitorLogs pageModelForVisitorLogs = new PageModelForVisitorLogs();
		pageModelForVisitorLogs.setMaxCount((nowPageNum-1)*BlogConfig.PAGE_SIZE_MGR);
		pageModelForVisitorLogs.setPageSize(BlogConfig.PAGE_SIZE_MGR);
		pageModelForVisitorLogs.setVlArea(vlArea);
		pageModelForVisitorLogs.setVlIp(vlIp);
		pageModelForVisitorLogs.setVlMemo(vlMemo);
		pageModelForVisitorLogs.setVlOperationContent(vlOperationContent);
		pageModelForVisitorLogs.setVlTarget(vlTarget);
		List<VisitorsLogs> visitorsLogsListPageForSearch = visitorsLogsMapper.getForVisitorsLogsPageListForSearch(pageModelForVisitorLogs);
		for (VisitorsLogs visitorsLogs : visitorsLogsListPageForSearch) {
			visitorsLogs.setVlCreatTimeChange(TimesUtil.getCurrTime(visitorsLogs.getVlCreatTime()));
		}
		return visitorsLogsListPageForSearch;
	}
	
	/**
	 * 获取管理员登录的最大页数
	 * @param date
	 * @return
	 */
	public int getLoginLogsCountForAll(){
		int maxPage = PageUtil.getMaxPageForMgr(mgrLoginLogsMapper.getLoginLogsCountForAll());
		return maxPage;
	}
	
	/**
	 * 获取管理员登录的详细情况
	 * @param date
	 * @return visitorsList
	 */
	public List<MgrLoginLogs> getLoginLogs(Integer nowPageNum){
		PageModel pageModel = new PageModel();
		pageModel.setMaxCount((nowPageNum-1)*BlogConfig.PAGE_SIZE_MGR);
		pageModel.setPageSize(BlogConfig.PAGE_SIZE_MGR);
		List<MgrLoginLogs> loginLogsListPage = mgrLoginLogsMapper.getForPageList(pageModel);
		for (MgrLoginLogs mgrLoginLogs : loginLogsListPage) {
			mgrLoginLogs.setMllCreatTimeChange(TimesUtil.getCurrTime(mgrLoginLogs.getMllCreatTime()));
		}
		return loginLogsListPage;
	}
	
	/**
	 * 获取管理员登录的最大页数  有查询条件
	 * @param vlArea
	 * @param vlIp
	 * @param vlTarget
	 * @param vlOperationContent
	 * @param vlMemo
	 * @return
	 */
	public int getLoginLogsCountForSearch(String mllIp ,String mllAccount ,String mllLoginStatus ,String mllMemo){
		MgrLoginLogs mgrLoginLogs = new MgrLoginLogs();
		if (mllIp != null) {
			mgrLoginLogs.setMllIp(mllIp);
		}
		if (mllAccount != null) {
			mgrLoginLogs.setMllAccount(mllAccount);
		}
		if (mllLoginStatus != null) {
			mgrLoginLogs.setMllLoginStatus(mllLoginStatus);
		}
		if (mllMemo != null) {
			mgrLoginLogs.setMllMemo(mllMemo);
		}
		int maxPage = PageUtil.getMaxPageForMgr(mgrLoginLogsMapper.getLoginLogsCountForSearch(mgrLoginLogs));
		return maxPage;
	}
	
	/**
	 * 获取管理员登录的情况  有查询条件
	 * @param nowPageNum
	 * @param mllIp
	 * @param mllAccount
	 * @param mllLoginStatus
	 * @param mllMemo
	 * @return
	 */
	public List<MgrLoginLogs> getForLoginLogsPageListForSearch(Integer nowPageNum ,String mllIp ,String mllAccount ,String mllLoginStatus ,String mllMemo){
		PageModelForLoginLogs pageModelForLoginLogs = new PageModelForLoginLogs();
		pageModelForLoginLogs.setMaxCount((nowPageNum-1)*BlogConfig.PAGE_SIZE_MGR);
		pageModelForLoginLogs.setPageSize(BlogConfig.PAGE_SIZE_MGR);
		pageModelForLoginLogs.setMllIp(mllIp);
		pageModelForLoginLogs.setMllAccount(mllAccount);
		pageModelForLoginLogs.setMllLoginStatus(mllLoginStatus);
		pageModelForLoginLogs.setMllMemo(mllMemo);
		List<MgrLoginLogs> loginLogsListPageForSearch = mgrLoginLogsMapper.getForVisitorsLogsPageListForSearch(pageModelForLoginLogs);
		for (MgrLoginLogs mgrLoginLogs : loginLogsListPageForSearch) {
			mgrLoginLogs.setMllCreatTimeChange(TimesUtil.getCurrTime(mgrLoginLogs.getMllCreatTime()));
		}
		return loginLogsListPageForSearch;
	}
	
	/**
	 * 获取管理员登录操作的最大页数
	 * @param date
	 * @return
	 */
	public int getLoginOperationCountForAll(){
		int maxPage = PageUtil.getMaxPageForMgr(mgrLogsMapper.getLoginOperationCountForAll());
		return maxPage;
	}
	
	/**
	 * 获取管理员登录的操作详细情况
	 * @param date
	 * @return visitorsList
	 */
	public List<MgrLogs> getLoginOperation(Integer nowPageNum){
		PageModel pageModel = new PageModel();
		pageModel.setMaxCount((nowPageNum-1)*BlogConfig.PAGE_SIZE_MGR);
		pageModel.setPageSize(BlogConfig.PAGE_SIZE_MGR);
		List<MgrLogs> loginOperationListPage = mgrLogsMapper.getForPageList(pageModel);
		for (MgrLogs mgrLogs : loginOperationListPage) {
			mgrLogs.setMlCreatTimeChange(TimesUtil.getCurrTime(mgrLogs.getMlCreatTime()));
		}
		return loginOperationListPage;
	}
	
	/**
	 * 获取管理员登录操作的最大页数 有查询条件
	 * @param date
	 * @return
	 */
	public int getLoginOperationCountForSearch(String mgrIp ,String mlName ,String mlTarget ,String mlOperationContent ,String mlMemo){
		MgrLogs mgrLogs = new MgrLogs();
		if (mgrIp != null) {
			mgrLogs.setMgrIp(mgrIp);
		}
		if (mlName != null) {
			mgrLogs.setMlName(mlName);;
		}
		if (mlTarget != null) {
			mgrLogs.setMlTarget(mlTarget);;
		}
		if (mlOperationContent != null) {
			mgrLogs.setMlOperationContent(mlOperationContent);;
		}
		if (mlMemo != null) {
			mgrLogs.setMlMemo(mlMemo);;
		}
		int maxPage = PageUtil.getMaxPageForMgr(mgrLogsMapper.getLoginOperationCountForSearch(mgrLogs));
		return maxPage;
	}
	
	/**
	 * 获取管理员登录的操作详细情况 有查询条件
	 * @param date
	 * @return visitorsList
	 */
	public List<MgrLogs> getForLoginOperationPageListForSearch(Integer nowPageNum ,String mgrIp ,String mlName ,String mlTarget ,String mlOperationContent ,String mlMemo){
		PageModelForLoginOperationLogin pageModelForLoginOperation = new PageModelForLoginOperationLogin();
		pageModelForLoginOperation.setMaxCount((nowPageNum-1)*BlogConfig.PAGE_SIZE_MGR);
		pageModelForLoginOperation.setPageSize(BlogConfig.PAGE_SIZE_MGR);
		pageModelForLoginOperation.setMgrIp(mgrIp);
		pageModelForLoginOperation.setMlName(mlName);
		pageModelForLoginOperation.setMlTarget(mlTarget);
		pageModelForLoginOperation.setMlOperationContent(mlOperationContent);
		pageModelForLoginOperation.setMlMemo(mlMemo);
		List<MgrLogs> loginOperationListPageForSearch = mgrLogsMapper.getForLoginOperationPageListForSearch(pageModelForLoginOperation);
		for (MgrLogs mgrLogs : loginOperationListPageForSearch) {
			mgrLogs.setMlCreatTimeChange(TimesUtil.getCurrTime(mgrLogs.getMlCreatTime()));
		}
		return loginOperationListPageForSearch;
	}
	
	/**
	 * 获取每日统计数据总页数
	 * @param date
	 * @return
	 */
	public int getEveryDayLogsCountForAll(){
		int maxPage = PageUtil.getMaxPageForMgr(mgrCountEverydayMapper.getEveryDayLogsCountForAll());
		return maxPage;
	}
	
	/**
	 * 获取每日统计数据
	 * @param nowPageNum
	 */
	public List<MgrCountEveryday> getEveryDayLogs(Integer nowPageNum){
		PageModel pageModel = new PageModel();
		pageModel.setMaxCount((nowPageNum-1)*BlogConfig.PAGE_SIZE_MGR);
		pageModel.setPageSize(BlogConfig.PAGE_SIZE_MGR);
		List<MgrCountEveryday> everyDayLogsListPage = mgrCountEverydayMapper.getEveryDayLogs(pageModel);
		for (MgrCountEveryday mgrCountEveryday : everyDayLogsListPage) {
			mgrCountEveryday.setMceCreatTimeChange(TimesUtil.getCurrTime(mgrCountEveryday.getMceCreatTime()));
		}
		return everyDayLogsListPage;
	}
	
	/**
	 * 获取黑名单的最大页数
	 * @param date
	 * @return
	 */
	public int getBlacklistCountForAll(){
		int maxPage = PageUtil.getMaxPageForMgr(mgrBlacklistMapper.getBlacklistCountForAll());
		return maxPage;
	}
	
	/**
	 * 获取黑名单详细情况
	 * @param date
	 * @return visitorsList
	 */
	public List<MgrBlacklist> getBlacklist(Integer nowPageNum){
		PageModel pageModel = new PageModel();
		pageModel.setMaxCount((nowPageNum-1)*BlogConfig.PAGE_SIZE_MGR);
		pageModel.setPageSize(BlogConfig.PAGE_SIZE_MGR);
		List<MgrBlacklist> blacklistListPage = mgrBlacklistMapper.getForPageList(pageModel);
		for (MgrBlacklist mgrBlacklist : blacklistListPage) {
			mgrBlacklist.setMbCreatTimeChange(TimesUtil.getCurrTime(mgrBlacklist.getMbCreatTime()));
		}
		return blacklistListPage;
	}
	
	/**
	 * 删除黑名单
	 * @param request
	 * @param id
	 * @return
	 */
	public void delBlacklist(Long id){
		mgrBlacklistMapper.deleteByPrimaryKey(id);
	}
	
	/**
	 * 获取黑名单的最大页数 有查询条件
	 * @param date
	 * @return
	 */
	public int getBlacklistCountForSearch(String ip){
		MgrBlacklist mgrBlacklist = new MgrBlacklist();
		if (ip != null) {
			mgrBlacklist.setMbIp(ip);
		}
		int maxPage = PageUtil.getMaxPageForMgr(mgrBlacklistMapper.getBlacklistCountForSearch(mgrBlacklist));
		return maxPage;
	}
	
	/**
	 * 获取黑名单详细情况 有查询条件
	 * @param date
	 * @return visitorsList
	 */
	public List<MgrBlacklist> getForBlacklistPageListForSearch(Integer nowPageNum ,String ip){
		PageModelForBlacklist pageModelForBlacklist = new PageModelForBlacklist();
		pageModelForBlacklist.setMaxCount((nowPageNum-1)*BlogConfig.PAGE_SIZE_MGR);
		pageModelForBlacklist.setPageSize(BlogConfig.PAGE_SIZE_MGR);
		pageModelForBlacklist.setMbIp(ip);
		List<MgrBlacklist> blacklistListPageForSearch = mgrBlacklistMapper.getForBlacklistPageListForSearch(pageModelForBlacklist);
		for (MgrBlacklist mgrBlacklist : blacklistListPageForSearch) {
			mgrBlacklist.setMbCreatTimeChange(TimesUtil.getCurrTime(mgrBlacklist.getMbCreatTime()));
		}
		return blacklistListPageForSearch;
	}
}
