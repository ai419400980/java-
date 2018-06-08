package com.liangzi.mgr.blog.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.liangzi.blog.congfig.BlogConfig;
import com.liangzi.blog.model.base.Visitors;
import com.liangzi.blog.model.base.VisitorsLogs;
import com.liangzi.blog.service.LogsService;
import com.liangzi.blog.web.utils.IpUtils;
import com.liangzi.blog.web.utils.WebOrPhoneUtil;
import com.liangzi.mgr.blog.model.base.MgrBlacklist;
import com.liangzi.mgr.blog.model.base.MgrCountEveryday;
import com.liangzi.mgr.blog.model.base.MgrLoginLogs;
import com.liangzi.mgr.blog.model.base.MgrLogs;
import com.liangzi.mgr.blog.quartz.MgrBlacklistQuartz;
import com.liangzi.mgr.blog.service.MgrSystemService;
import com.liangzi.mgr.blog.web.utils.SessionUtils;

/**
 * <p>Title 		: MgrSystemController</p>
 * <p>Description   : 博客后台管理Controller</p>
 * <p>DevelopTools  : Eclipse_x64</p>
 * <p>DevelopSystem : windows10_x64</p>
 * <p>Company 		: com.liangzi</p>
 * @author  		: Liangzi
 * @date 			: 2016年12月9日 下午11:31:58
 * @version 		: 1.0
 */
@Controller("mgrSystemController")
@RequestMapping("/mgr")
public class MgrSystemController {
	
	/**
	 * 注入service
	 */
	@Autowired
	private MgrSystemService mgrSystemService;
	@Autowired
	private LogsService logsService;
	@Autowired
	private MgrBlacklistQuartz mgrBlacklistQuartz;
	/**
	 * 获取单日访问ip详情
	 * @param request
	 * @return
	 */
	@RequestMapping("/visitor.html")
	public ModelAndView getVisitor(HttpServletRequest request ,Integer nowPageNum){
		ModelAndView mv = new ModelAndView();
		// 判断是否是第一次进来
		if(nowPageNum == null){
			nowPageNum=1;
		}
		int maxPage = mgrSystemService.getVisitCountForAll();
		List<Visitors> visitorsListPage = mgrSystemService.getVisitor(nowPageNum);
		String IP=IpUtils.getIp(request);
		HttpSession session = SessionUtils.getHttpSession(request);
		int checking = WebOrPhoneUtil.check(request);
	    String type = null; 
		if (checking == 1) {
			type = BlogConfig.PC;
		}else{
			type = BlogConfig.PHONE;
		}
		logsService.insertMgrLogs(IP, session.getAttribute("account").toString(), BlogConfig.VISIT_IP_DETAIL, BlogConfig.OPERATIONTYPE_VISIT ,type);
		mv.addObject("visitorsListPage", visitorsListPage);
		mv.addObject("maxPage", maxPage);
		mv.addObject("nowPageNum", nowPageNum);
		mv.addObject("nowPageNumLast", nowPageNum-1);
		mv.addObject("nowPageNumAdd", nowPageNum+1);
		mv.addObject("skipurl", "visitor.html?");
		mv.setViewName("mgr/visitor");
		return mv;
	}
	
	/**
	 * 获取单日访问ip详情 按条件查询
	 * @param request
	 * @return
	 */
	@RequestMapping("/getSearchPageForVisitor.html")
	public ModelAndView getSearchPage(HttpServletRequest request ,Integer nowPageNum ,String viArea ,String viIp ,String vi_memo){
		ModelAndView mv = new ModelAndView();
		// 判断是否是第一次进来
		if(nowPageNum == null){
			nowPageNum=1;
		}
		int maxPage = mgrSystemService.getVisitCountForSearch(viArea, viIp, vi_memo);
		List<Visitors> visitorsListPageForSearch = mgrSystemService.getForPageListForSearch(nowPageNum, viArea, viIp, vi_memo);
		mv.addObject("visitorsListPage", visitorsListPageForSearch);
		mv.addObject("maxPage", maxPage);
		mv.addObject("nowPageNum", nowPageNum);
		mv.addObject("nowPageNumLast", nowPageNum-1);
		mv.addObject("nowPageNumAdd", nowPageNum+1);
		mv.addObject("viArea", viArea);
		mv.addObject("viIp", viIp);
		mv.addObject("vi_memo", vi_memo);
		if ("".equals(viArea) && "".equals(viIp) && "".equals(vi_memo)) {
			mv.addObject("skipurl", "visitor.html?");
		}else{
			mv.addObject("skipurl", "getSearchPage.html?");
		}
		mv.setViewName("mgr/visitor");
		return mv;
	}
	
	/**
	 * 获取单日访问ip操作详情
	 * @param request
	 * @param nowPageNum
	 * @return
	 */
	@RequestMapping("/visitorLogs.html")
	public ModelAndView getVisitorLogs(HttpServletRequest request ,Integer nowPageNum){
		ModelAndView mv = new ModelAndView();
		// 判断是否是第一次进来
		if(nowPageNum == null){
			nowPageNum=1;
		}
		int maxPage = mgrSystemService.getVisitLogsCountForAll();
		List<VisitorsLogs> visitorsLogsListPage = mgrSystemService.getVisitorLogs(nowPageNum);
		String IP=IpUtils.getIp(request);
		HttpSession session = SessionUtils.getHttpSession(request);
		int checking = WebOrPhoneUtil.check(request);
	    String type = null; 
		if (checking == 1) {
			type = BlogConfig.PC;
		}else{
			type = BlogConfig.PHONE;
		}
		logsService.insertMgrLogs(IP, session.getAttribute("account").toString(), BlogConfig.VISIT_IP_OPERATION, BlogConfig.OPERATIONTYPE_VISIT ,type);
		mv.addObject("visitorsLogsListPage", visitorsLogsListPage);
		mv.addObject("maxPage", maxPage);
		mv.addObject("nowPageNum", nowPageNum);
		mv.addObject("nowPageNumLast", nowPageNum-1);
		mv.addObject("nowPageNumAdd", nowPageNum+1);
		mv.addObject("skipurl", "visitorLogs.html?");
		mv.setViewName("mgr/visitorLogs");
		return mv;
	}
	
	/**
	 * 获取单日访问ip操作详情 按条件查询
	 * @param request
	 * @param nowPageNum
	 * @param vlArea
	 * @param vlIp
	 * @param vlTarget
	 * @param vlOperationContent
	 * @param vlMemo
	 * @return
	 */
	@RequestMapping("/getSearchPageForVisitorLogs.html")
	public ModelAndView getVisitorLogsForSearch(HttpServletRequest request ,Integer nowPageNum ,String vlArea ,String vlIp ,String vlTarget ,String vlOperationContent ,String vlMemo){
		ModelAndView mv = new ModelAndView();
		// 判断是否是第一次进来
		if(nowPageNum == null){
			nowPageNum=1;
		}
		int maxPage = mgrSystemService.getVisitLogsCountForSearch(vlArea, vlIp, vlTarget, vlOperationContent, vlMemo);
		List<VisitorsLogs> visitorsLogsListPageForSearch = mgrSystemService.getForVisitorsLogsPageListForSearch(nowPageNum, vlArea, vlIp, vlTarget, vlOperationContent, vlMemo);
		mv.addObject("visitorsLogsListPage", visitorsLogsListPageForSearch);
		mv.addObject("maxPage", maxPage);
		mv.addObject("nowPageNum", nowPageNum);
		mv.addObject("nowPageNumLast", nowPageNum-1);
		mv.addObject("nowPageNumAdd", nowPageNum+1);
		mv.addObject("vlArea", vlArea);
		mv.addObject("vlIp", vlIp);
		mv.addObject("vlTarget", vlTarget);
		mv.addObject("vlOperationContent", vlOperationContent);
		mv.addObject("vlMemo", vlMemo);
		if ("".equals(vlArea) && "".equals(vlIp) && "".equals(vlTarget) && "".equals(vlOperationContent) && "".equals(vlMemo)) {
			mv.addObject("skipurl", "visitorLogs.html?");
		}else{
			mv.addObject("skipurl", "getSearchPageForVisitorLogs.html?");
		}
		mv.setViewName("mgr/visitorLogs");
		return mv;
	}
	
	/**
	 * 获取用户登录记录
	 * @param request
	 * @param nowPageNum
	 * @return
	 */
	@RequestMapping("/loginLogs.html")
	public ModelAndView getLoginLogs(HttpServletRequest request ,Integer nowPageNum){
		ModelAndView mv = new ModelAndView();
		// 判断是否是第一次进来
		if(nowPageNum == null){
			nowPageNum=1;
		}
		int maxPage = mgrSystemService.getLoginLogsCountForAll();
		List<MgrLoginLogs>loginListPage = mgrSystemService.getLoginLogs(nowPageNum);
		String IP=IpUtils.getIp(request);
		HttpSession session = SessionUtils.getHttpSession(request);
		int checking = WebOrPhoneUtil.check(request);
	    String type = null; 
		if (checking == 1) {
			type = BlogConfig.PC;
		}else{
			type = BlogConfig.PHONE;
		}
		logsService.insertMgrLogs(IP, session.getAttribute("account").toString(), BlogConfig.VISIT_IP_LOGIN_LOGS, BlogConfig.OPERATIONTYPE_VISIT ,type);
		mv.addObject("loginListPage", loginListPage);
		mv.addObject("maxPage", maxPage);
		mv.addObject("nowPageNum", nowPageNum);
		mv.addObject("nowPageNumLast", nowPageNum-1);
		mv.addObject("nowPageNumAdd", nowPageNum+1);
		mv.addObject("skipurl", "loginLogs.html?");
		mv.setViewName("mgr/loginLogs");
		return mv;
	}
	
	/**
	 * 获取用户登录记录 按条件查询
	 * @param request
	 * @param nowPageNum
	 * @param mllIp
	 * @param mllAccount
	 * @param mllLoginStatus
	 * @param mllMemo
	 * @return
	 */
	@RequestMapping("/getSearchPageForLoginLogs.html")
	public ModelAndView getLoginLogsForSearch(HttpServletRequest request ,Integer nowPageNum ,String mllIp ,String mllAccount ,String mllLoginStatus ,String mllMemo){
		ModelAndView mv = new ModelAndView();
		// 判断是否是第一次进来
		if(nowPageNum == null){
			nowPageNum=1;
		}
		int maxPage = mgrSystemService.getLoginLogsCountForSearch(mllIp, mllAccount, mllLoginStatus, mllMemo);
		List<MgrLoginLogs> loginLogsListPageForSearch = mgrSystemService.getForLoginLogsPageListForSearch(nowPageNum, mllIp, mllAccount, mllLoginStatus, mllMemo);
		mv.addObject("loginListPage", loginLogsListPageForSearch);
		mv.addObject("maxPage", maxPage);
		mv.addObject("nowPageNum", nowPageNum);
		mv.addObject("nowPageNumLast", nowPageNum-1);
		mv.addObject("nowPageNumAdd", nowPageNum+1);
		mv.addObject("mllIp", mllIp);
		mv.addObject("mllAccount", mllAccount);
		mv.addObject("mllLoginStatus", mllLoginStatus);
		mv.addObject("mllMemo", mllMemo);
		if ("".equals(mllIp) && "".equals(mllAccount) && "".equals(mllLoginStatus) && "".equals(mllMemo)) {
			mv.addObject("skipurl", "loginLogs.html?");
		}else{
			mv.addObject("skipurl", "getSearchPageForLoginLogs.html?");
		}
		mv.setViewName("mgr/loginLogs");
		return mv;
	}
	
	/**
	 * 获取用户登录操作记录
	 * @param request
	 * @param nowPageNum
	 * @return
	 */
	@RequestMapping("/loginOperationLogs.html")
	public ModelAndView getLoginOperationLogs(HttpServletRequest request ,Integer nowPageNum){
		ModelAndView mv = new ModelAndView();
		// 判断是否是第一次进来
		if(nowPageNum == null){
			nowPageNum=1;
		}
		int maxPage = mgrSystemService.getLoginOperationCountForAll();
		List<MgrLogs>loginOperationListPage = mgrSystemService.getLoginOperation(nowPageNum);
		String IP=IpUtils.getIp(request);
		HttpSession session = SessionUtils.getHttpSession(request);
		int checking = WebOrPhoneUtil.check(request);
	    String type = null; 
		if (checking == 1) {
			type = BlogConfig.PC;
		}else{
			type = BlogConfig.PHONE;
		}
		logsService.insertMgrLogs(IP, session.getAttribute("account").toString(), BlogConfig.VISIT_IP_LOGIN_OPERATION_LOGS, BlogConfig.OPERATIONTYPE_VISIT ,type);
		mv.addObject("loginListPage", loginOperationListPage);
		mv.addObject("maxPage", maxPage);
		mv.addObject("nowPageNum", nowPageNum);
		mv.addObject("nowPageNumLast", nowPageNum-1);
		mv.addObject("nowPageNumAdd", nowPageNum+1);
		mv.addObject("skipurl", "loginOperationLogs.html?");
		mv.setViewName("mgr/loginOperationLogs");
		return mv;
	}
	
	/**
	 * 获取用户登录操作记录 有查询条件
	 * @param request
	 * @param nowPageNum
	 * @param mgrIp
	 * @param mlName
	 * @param mlTarget
	 * @param mlOperationContent
	 * @param mlMemo
	 * @return
	 */
	@RequestMapping("/getSearchPageForLoginOperation.html")
	public ModelAndView getSearchPageForLoginOperation(HttpServletRequest request ,Integer nowPageNum ,String mgrIp ,String mlName ,String mlTarget ,String mlOperationContent ,String mlMemo){
		ModelAndView mv = new ModelAndView();
		// 判断是否是第一次进来
		if(nowPageNum == null){
			nowPageNum=1;
		}
		int maxPage = mgrSystemService.getLoginOperationCountForSearch(mgrIp, mlName, mlTarget, mlOperationContent, mlMemo);
		List<MgrLogs> loginOperationListPageForSearch = mgrSystemService.getForLoginOperationPageListForSearch(nowPageNum, mgrIp, mlName, mlTarget, mlOperationContent, mlMemo);
		mv.addObject("loginListPage", loginOperationListPageForSearch);
		mv.addObject("maxPage", maxPage);
		mv.addObject("nowPageNum", nowPageNum);
		mv.addObject("nowPageNumLast", nowPageNum-1);
		mv.addObject("nowPageNumAdd", nowPageNum+1);
		mv.addObject("mgrIp", mgrIp);
		mv.addObject("mlName", mlName);
		mv.addObject("mlTarget", mlTarget);
		mv.addObject("mlOperationContent", mlOperationContent);
		mv.addObject("mlMemo", mlMemo);
		if ("".equals(mgrIp) && "".equals(mlName) && "".equals(mlTarget) && "".equals(mlOperationContent) && "".equals(mlMemo)) {
			mv.addObject("skipurl", "loginOperationLogs.html?");
		}else{
			mv.addObject("skipurl", "getSearchPageForLoginOperation.html?");
		}
		mv.setViewName("mgr/loginOperationLogs");
		return mv;
	}
	
	/**
	 * 获取每日消息记录统计
	 * @param request
	 * @param nowPageNum
	 * @return
	 */
	@RequestMapping("/everydayLogs.html")
	public ModelAndView getEveryDayLogs(HttpServletRequest request ,Integer nowPageNum){
		ModelAndView mv = new ModelAndView();
		// 判断是否是第一次进来
		if(nowPageNum == null){
			nowPageNum=1;
		}
		int maxPage = mgrSystemService.getEveryDayLogsCountForAll();
		List<MgrCountEveryday> everyDayLogsListPage = mgrSystemService.getEveryDayLogs(nowPageNum);
		String IP=IpUtils.getIp(request);
		HttpSession session = SessionUtils.getHttpSession(request);
		int checking = WebOrPhoneUtil.check(request);
	    String type = null; 
		if (checking == 1) {
			type = BlogConfig.PC;
		}else{
			type = BlogConfig.PHONE;
		}
		logsService.insertMgrLogs(IP, session.getAttribute("account").toString(), BlogConfig.VISIT_IP_LOGIN_EVERYDAY_LOGS, BlogConfig.OPERATIONTYPE_VISIT ,type);
		mv.addObject("loginListPage", everyDayLogsListPage);
		mv.addObject("maxPage", maxPage);
		mv.addObject("nowPageNum", nowPageNum);
		mv.addObject("nowPageNumLast", nowPageNum-1);
		mv.addObject("nowPageNumAdd", nowPageNum+1);
		mv.addObject("skipurl", "everydayLogs.html?");
		mv.setViewName("mgr/everydayLogs");
		return mv;
	}
	
	/**
	 * 获取黑名单
	 * @param request
	 * @param nowPageNum
	 * @return
	 */
	@RequestMapping("/blacklistLogs.html")
	public ModelAndView getBlacklistLogs(HttpServletRequest request ,Integer nowPageNum){
		ModelAndView mv = new ModelAndView();
		// 判断是否是第一次进来
		if(nowPageNum == null){
			nowPageNum=1;
		}
		int maxPage = mgrSystemService.getBlacklistCountForAll();
		List<MgrBlacklist> blacklistListPage = mgrSystemService.getBlacklist(nowPageNum);
		String IP=IpUtils.getIp(request);
		HttpSession session = SessionUtils.getHttpSession(request);
		int checking = WebOrPhoneUtil.check(request);
	    String type = null; 
		if (checking == 1) {
			type = BlogConfig.PC;
		}else{
			type = BlogConfig.PHONE;
		}
		logsService.insertMgrLogs(IP, session.getAttribute("account").toString(), BlogConfig.VISIT_IP_LOGIN_BLACKLISTLOGS, BlogConfig.OPERATIONTYPE_VISIT ,type);
		mv.addObject("blacklistListPage", blacklistListPage);
		mv.addObject("maxPage", maxPage);
		mv.addObject("nowPageNum", nowPageNum);
		mv.addObject("nowPageNumLast", nowPageNum-1);
		mv.addObject("nowPageNumAdd", nowPageNum+1);
		mv.addObject("skipurl", "blacklistLogs.html?");
		mv.setViewName("mgr/blacklistLogs");
		return mv;
	}
	
	/**
	 * 删除黑名单
	 * @param request
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/delBlacklist.html")
	public String delBlacklist(HttpServletRequest request, Long id, String ip) {
		JSONObject jsonObject = new JSONObject();
		mgrSystemService.delBlacklist(id);
		String IP=IpUtils.getIp(request);
		HttpSession session = SessionUtils.getHttpSession(request);
		int checking = WebOrPhoneUtil.check(request);
	    String type = null; 
		if (checking == 1) {
			type = BlogConfig.PC;
		}else{
			type = BlogConfig.PHONE;
		}
		logsService.insertMgrLogs(IP, session.getAttribute("account").toString(), ip, BlogConfig.OPERATIONTYPE_BLACK_DELETE ,type);
		return jsonObject.toJSONString();
	}
	
	/**
	 * 黑名单集合刷新
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/flush.html")
	public String flushBlackMap(){
		JSONObject jsonObject = new JSONObject();
		try {
			mgrBlacklistQuartz.afterPropertiesSet();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonObject.toJSONString();
	}

	@RequestMapping("/getSearchPageForblacklistLogs.html")
	public ModelAndView getSearchPageForblacklistLogs(HttpServletRequest request ,Integer nowPageNum ,String mbIp){
		ModelAndView mv = new ModelAndView();
		// 判断是否是第一次进来
		if(nowPageNum == null){
			nowPageNum=1;
		}
		int maxPage = mgrSystemService.getBlacklistCountForSearch(mbIp);
		List<MgrBlacklist> blacklistLogsListPageForSearch = mgrSystemService.getForBlacklistPageListForSearch(nowPageNum, mbIp);
		mv.addObject("blacklistListPage", blacklistLogsListPageForSearch);
		mv.addObject("maxPage", maxPage);
		mv.addObject("nowPageNum", nowPageNum);
		mv.addObject("nowPageNumLast", nowPageNum-1);
		mv.addObject("nowPageNumAdd", nowPageNum+1);
		mv.addObject("mbIp", mbIp);
		if ("".equals(mbIp)) {
			mv.addObject("skipurl", "blacklistLogs.html?");
		}else{
			mv.addObject("skipurl", "getSearchPageForblacklistLogs.html?");
		}
		mv.setViewName("mgr/blacklistLogs");
		return mv;
	}
}
