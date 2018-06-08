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
import com.liangzi.blog.model.base.Aticle;
import com.liangzi.blog.model.base.AticleComment;
import com.liangzi.blog.model.base.Comment;
import com.liangzi.blog.model.base.Mood;
import com.liangzi.blog.service.LogsService;
import com.liangzi.blog.web.utils.IpUtils;
import com.liangzi.blog.web.utils.WebOrPhoneUtil;
import com.liangzi.mgr.blog.service.MgrAticleService;
import com.liangzi.mgr.blog.web.utils.SessionUtils;

/**
 * <p>Title			: MgrAticleController</p>
 * <p>Description	: 文章管理Controller</p>
 * <p>DevelopTools	: Eclipse_x64</p>
 * <p>DevelopSystem	: Windows_x64</p>
 * <p>Company		: 51diaocha</p>
 * @author			: Liangzl
 * @date			: 2016年12月19日 上午10:38:35
 * @version			: 1.0
 */
@Controller("mgrAticleController")
@RequestMapping("/mgr")
public class MgrAticleController {
	
	/**
	 * 注入service
	 */
	@Autowired
	private MgrAticleService mgrAticleService;
	@Autowired
	private LogsService logsService;
	
	/**
	 * 修改文章评论状态
	 * @param id
	 * @return
	 */
	@RequestMapping("/changeAticleComment.html")
	@ResponseBody
	public String changeAticleComment(HttpServletRequest request ,Long id){
		Integer status = mgrAticleService.changeAticleComment(id);
		String IP=IpUtils.getIp(request);
		HttpSession session = SessionUtils.getHttpSession(request);
		int checking = WebOrPhoneUtil.check(request);
	    String type = null; 
		if (checking == 1) {
			type = BlogConfig.PC;
		}else{
			type = BlogConfig.PHONE;
		}
		logsService.insertMgrLogs(IP, session.getAttribute("account").toString(), BlogConfig.VISIT_IP_LOGIN_ATICLE_COMMENT_OPERATION + id, BlogConfig.OPERATIONTYPE_CHANGE_ATICLE_COMMENT ,type);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("status", status);
		return jsonObject.toString();
	}
	
	/**
	 * 修改留言状态
	 * @param id
	 * @return
	 */
	@RequestMapping("/changeComment.html")
	@ResponseBody
	public String changeComment(HttpServletRequest request ,Long id){
		Integer status = mgrAticleService.changeComment(id);
		String IP=IpUtils.getIp(request);
		HttpSession session = SessionUtils.getHttpSession(request);
		int checking = WebOrPhoneUtil.check(request);
	    String type = null; 
		if (checking == 1) {
			type = BlogConfig.PC;
		}else{
			type = BlogConfig.PHONE;
		}
		logsService.insertMgrLogs(IP, session.getAttribute("account").toString(), BlogConfig.VISIT_IP_LOGIN_COMMENT_OPERATION + id, BlogConfig.OPERATIONTYPE_CHANGE_COMMENT ,type);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("status", status);
		return jsonObject.toString();
	}
	
	/**
	 * 修改文章是否首页推荐
	 * @param id
	 * @return
	 */
	@RequestMapping("/changeAticle.html")
	@ResponseBody
	public String changeAticle(HttpServletRequest request ,Long id){
		Integer status = mgrAticleService.changeAticle(id);
		String IP=IpUtils.getIp(request);
		HttpSession session = SessionUtils.getHttpSession(request);
		int checking = WebOrPhoneUtil.check(request);
	    String type = null; 
		if (checking == 1) {
			type = BlogConfig.PC;
		}else{
			type = BlogConfig.PHONE;
		}
		logsService.insertMgrLogs(IP, session.getAttribute("account").toString(), BlogConfig.VISIT_IP_LOGIN_ATICLE_OPERATION + id, BlogConfig.OPERATIONTYPE_CHANGE_ATCILE ,type);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("status", status);
		return jsonObject.toString();
	}
	
	/**
	 * 修改心情状态
	 * @param id
	 * @return
	 */
	@RequestMapping("/changeMood.html")
	@ResponseBody
	public String changeMood(HttpServletRequest request ,Long id){
		Integer status = mgrAticleService.changeMood(id);
		String IP=IpUtils.getIp(request);
		HttpSession session = SessionUtils.getHttpSession(request);
		int checking = WebOrPhoneUtil.check(request);
	    String type = null; 
		if (checking == 1) {
			type = BlogConfig.PC;
		}else{
			type = BlogConfig.PHONE;
		}
		logsService.insertMgrLogs(IP, session.getAttribute("account").toString(), BlogConfig.VISIT_IP_LOGIN_MOOD + id, BlogConfig.OPERATIONTYPE_CHANGE_MOOD ,type);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("status", status);
		return jsonObject.toString();
	}
	
	/**
	 * 删除文章
	 * @param id
	 * @return
	 */
	@RequestMapping("/deleteAticle.html")
	@ResponseBody
	public String deleteAticle(HttpServletRequest request ,Long id){
		mgrAticleService.deleteAticle(id);
		String IP=IpUtils.getIp(request);
		HttpSession session = SessionUtils.getHttpSession(request);
		int checking = WebOrPhoneUtil.check(request);
	    String type = null; 
		if (checking == 1) {
			type = BlogConfig.PC;
		}else{
			type = BlogConfig.PHONE;
		}
		logsService.insertMgrLogs(IP, session.getAttribute("account").toString(), BlogConfig.VISIT_IP_LOGIN_ATICLE_OPERATION + id, BlogConfig.OPERATIONTYPE_CHANGE_ATCILE_DELETE ,type);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("status", 1);
		return jsonObject.toString();
	}
	
	/**
	 * 获取文章评论
	 * @param request
	 * @return
	 */
	@RequestMapping("/aticleComment.html")
	public ModelAndView getVisitor(HttpServletRequest request ,Integer nowPageNum){
		ModelAndView mv = new ModelAndView();
		// 判断是否是第一次进来
		if(nowPageNum == null){
			nowPageNum=1;
		}
		int maxPage = mgrAticleService.getAticleCommentCountForAll();
		List<AticleComment> aticleCommentListPage = mgrAticleService.getAticleComment(nowPageNum);
		String IP=IpUtils.getIp(request);
		HttpSession session = SessionUtils.getHttpSession(request);
		int checking = WebOrPhoneUtil.check(request);
	    String type = null; 
		if (checking == 1) {
			type = BlogConfig.PC;
		}else{
			type = BlogConfig.PHONE;
		}
		logsService.insertMgrLogs(IP, session.getAttribute("account").toString(), BlogConfig.VISIT_IP_LOGIN_ATICLE_COMMENT, BlogConfig.OPERATIONTYPE_VISIT ,type);
		mv.addObject("aticleCommentListPage", aticleCommentListPage);
		mv.addObject("maxPage", maxPage);
		mv.addObject("nowPageNum", nowPageNum);
		mv.addObject("nowPageNumLast", nowPageNum-1);
		mv.addObject("nowPageNumAdd", nowPageNum+1);
		mv.addObject("skipurl", "aticleComment.html?");
		mv.setViewName("mgr/aticleComment");
		return mv;
	}
	
	/**
	 * 获取文章评论 有查询条件
	 * @param request
	 * @return
	 */
	@RequestMapping("/getSearchPageForAticleComment.html")
	public ModelAndView getSearchPageForAticleComment(HttpServletRequest request ,Integer nowPageNum ,Long acAticleId ,Integer acStatus){
		ModelAndView mv = new ModelAndView();
		// 判断是否是第一次进来
		if(nowPageNum == null){
			nowPageNum=1;
		}
		int maxPage = mgrAticleService.getAticleCommentCountForSearch(acAticleId, acStatus);
		List<AticleComment> aticleCommentListPageForSearch = mgrAticleService.getForPageListForSearch(nowPageNum, acAticleId, acStatus);
		mv.addObject("aticleCommentListPage", aticleCommentListPageForSearch);
		mv.addObject("maxPage", maxPage);
		mv.addObject("nowPageNum", nowPageNum);
		mv.addObject("nowPageNumLast", nowPageNum-1);
		mv.addObject("nowPageNumAdd", nowPageNum+1);
		mv.addObject("acAticleId", acAticleId);
		mv.addObject("acStatus", acStatus);
		if ("".equals(acAticleId) && "".equals(acStatus)) {
			mv.addObject("skipurl", "aticleComment.html?");
		}else{
			mv.addObject("skipurl", "getSearchPageForAticleComment.html?");
		}
		mv.setViewName("mgr/aticleComment");
		return mv;
	}
	
	/**
	 * 获取留言列表
	 * @param request
	 * @param nowPageNum
	 * @return
	 */
	@RequestMapping("/comment.html")
	public ModelAndView getComment(HttpServletRequest request ,Integer nowPageNum){
		ModelAndView mv = new ModelAndView();
		// 判断是否是第一次进来
		if(nowPageNum == null){
			nowPageNum=1;
		}
		int maxPage = mgrAticleService.getCommentCountForAll();
		List<Comment> commentListPage = mgrAticleService.getComment(nowPageNum);
		String IP=IpUtils.getIp(request);
		HttpSession session = SessionUtils.getHttpSession(request);
		int checking = WebOrPhoneUtil.check(request);
	    String type = null; 
		if (checking == 1) {
			type = BlogConfig.PC;
		}else{
			type = BlogConfig.PHONE;
		}
		logsService.insertMgrLogs(IP, session.getAttribute("account").toString(), BlogConfig.VISIT_IP_LOGIN_COMMENT, BlogConfig.OPERATIONTYPE_VISIT ,type);
		mv.addObject("commentListPage", commentListPage);
		mv.addObject("maxPage", maxPage);
		mv.addObject("nowPageNum", nowPageNum);
		mv.addObject("nowPageNumLast", nowPageNum-1);
		mv.addObject("nowPageNumAdd", nowPageNum+1);
		mv.addObject("skipurl", "comment.html?");
		mv.setViewName("mgr/comment");
		return mv;
	}
	
	/**
	 * 获取留言列表 有查询条件
	 * @param request
	 * @return
	 */
	@RequestMapping("/getSearchPageForComment.html")
	public ModelAndView getSearchPageForComment(HttpServletRequest request ,Integer nowPageNum ,Integer coStatus){
		ModelAndView mv = new ModelAndView();
		// 判断是否是第一次进来
		if(nowPageNum == null){
			nowPageNum=1;
		}
		int maxPage = mgrAticleService.getCommentCountForSearch(coStatus);
		List<Comment> commentListPageForSearch = mgrAticleService.getForCommentPageListForSearch(nowPageNum, coStatus);
		mv.addObject("commentListPage", commentListPageForSearch);
		mv.addObject("maxPage", maxPage);
		mv.addObject("nowPageNum", nowPageNum);
		mv.addObject("nowPageNumLast", nowPageNum-1);
		mv.addObject("nowPageNumAdd", nowPageNum+1);
		mv.addObject("coStatus", coStatus);
		if ("".equals(coStatus)) {
			mv.addObject("skipurl", "comment.html?");
		}else{
			mv.addObject("skipurl", "getSearchPageForComment.html?");
		}
		mv.setViewName("mgr/comment");
		return mv;
	}
	
	/**
	 * 获取心情列表
	 * @param request
	 * @param nowPageNum
	 * @return
	 */
	@RequestMapping("/mood.html")
	public ModelAndView getMood(HttpServletRequest request ,Integer nowPageNum){
		ModelAndView mv = new ModelAndView();
		// 判断是否是第一次进来
		if(nowPageNum == null){
			nowPageNum=1;
		}
		int maxPage = mgrAticleService.getMoodCountForAll();
		List<Mood> moodListPage = mgrAticleService.getMood(nowPageNum);
		String IP=IpUtils.getIp(request);
		HttpSession session = SessionUtils.getHttpSession(request);
		int checking = WebOrPhoneUtil.check(request);
	    String type = null; 
		if (checking == 1) {
			type = BlogConfig.PC;
		}else{
			type = BlogConfig.PHONE;
		}
		logsService.insertMgrLogs(IP, session.getAttribute("account").toString(), BlogConfig.VISIT_IP_LOGIN_MOOD_PAGE, BlogConfig.OPERATIONTYPE_VISIT ,type);
		mv.addObject("moodListPage", moodListPage);
		mv.addObject("maxPage", maxPage);
		mv.addObject("nowPageNum", nowPageNum);
		mv.addObject("nowPageNumLast", nowPageNum-1);
		mv.addObject("nowPageNumAdd", nowPageNum+1);
		mv.addObject("skipurl", "mood.html?");
		mv.setViewName("mgr/mood");
		return mv;
	}
	
	/**
	 * 获取心情列表 有查询条件
	 * @param request
	 * @return
	 */
	@RequestMapping("/getSearchPageForMood.html")
	public ModelAndView getSearchPageForMood(HttpServletRequest request ,Integer nowPageNum ,Integer moStatus){
		ModelAndView mv = new ModelAndView();
		// 判断是否是第一次进来
		if(nowPageNum == null){
			nowPageNum=1;
		}
		int maxPage = mgrAticleService.getMoodCountForSearch(moStatus);
		List<Mood> moodListPageForSearch = mgrAticleService.getForMoodPageListForSearch(nowPageNum, moStatus);
		mv.addObject("moodListPage", moodListPageForSearch);
		mv.addObject("maxPage", maxPage);
		mv.addObject("nowPageNum", nowPageNum);
		mv.addObject("nowPageNumLast", nowPageNum-1);
		mv.addObject("nowPageNumAdd", nowPageNum+1);
		mv.addObject("moStatus", moStatus);
		if ("".equals(moStatus)) {
			mv.addObject("skipurl", "mood.html?");
		}else{
			mv.addObject("skipurl", "getSearchPageForMood.html?");
		}
		mv.setViewName("mgr/mood");
		return mv;
	}
	
	/**
	 * 获取文章列表
	 * @param request
	 * @param nowPageNum
	 * @return
	 */
	@RequestMapping("/aticle.html")
	public ModelAndView getAticle(HttpServletRequest request ,Integer nowPageNum){
		ModelAndView mv = new ModelAndView();
		// 判断是否是第一次进来
		if(nowPageNum == null){
			nowPageNum=1;
		}
		int maxPage = mgrAticleService.getAticleCountForAll();
		List<Aticle> aticleListPage = mgrAticleService.getAticle(nowPageNum);
		String IP=IpUtils.getIp(request);
		HttpSession session = SessionUtils.getHttpSession(request);
		int checking = WebOrPhoneUtil.check(request);
	    String type = null; 
		if (checking == 1) {
			type = BlogConfig.PC;
		}else{
			type = BlogConfig.PHONE;
		}
		logsService.insertMgrLogs(IP, session.getAttribute("account").toString(), BlogConfig.VISIT_IP_LOGIN_ATICLE_PAGE, BlogConfig.OPERATIONTYPE_VISIT ,type);
		mv.addObject("aticleListPage", aticleListPage);
		mv.addObject("maxPage", maxPage);
		mv.addObject("nowPageNum", nowPageNum);
		mv.addObject("nowPageNumLast", nowPageNum-1);
		mv.addObject("nowPageNumAdd", nowPageNum+1);
		mv.addObject("skipurl", "aticle.html?");
		mv.setViewName("mgr/aticle");
		return mv;
	}
	
	/**
	 * 获取心情列表 有查询条件
	 * @param request
	 * @return
	 */
	@RequestMapping("/getSearchPageForAticle.html")
	public ModelAndView getSearchPageForAticle(HttpServletRequest request ,Integer nowPageNum ,String atTitle ,Integer atUpIndex ,String atTypeId){
		ModelAndView mv = new ModelAndView();
		// 判断是否是第一次进来
		if(nowPageNum == null){
			nowPageNum=1;
		}
		int maxPage = mgrAticleService.getAticleCountForSearch(atTitle, atUpIndex, atTypeId);
		List<Aticle> aticleListPageForSearch = mgrAticleService.getForAticlePageListForSearch(nowPageNum, atTitle, atUpIndex, atTypeId);
		mv.addObject("aticleListPage", aticleListPageForSearch);
		mv.addObject("maxPage", maxPage);
		mv.addObject("nowPageNum", nowPageNum);
		mv.addObject("nowPageNumLast", nowPageNum-1);
		mv.addObject("nowPageNumAdd", nowPageNum+1);
		mv.addObject("atTitle", atTitle);
		mv.addObject("atUpIndex", atUpIndex);
		mv.addObject("atTypeId", atTypeId);
		if ("".equals(atTitle) && "".equals(atUpIndex) && "".equals(atTypeId)) {
			mv.addObject("skipurl", "aticle.html?");
		}else{
			mv.addObject("skipurl", "getSearchPageForAticle.html?");
		}
		mv.setViewName("mgr/aticle");
		return mv;
	}
	
	/**
	 * 添加心情
	 * @param request
	 * @param content
	 * @return
	 */
	@RequestMapping("/addMood.html")
	@ResponseBody
	public String addMood(HttpServletRequest request ,String context ){
		JSONObject jsonObject = new JSONObject();
		String IP=IpUtils.getIp(request);
		HttpSession session = SessionUtils.getHttpSession(request);
		int checking = WebOrPhoneUtil.check(request);
	    String type = null; 
		if (checking == 1) {
			type = BlogConfig.PC;
		}else{
			type = BlogConfig.PHONE;
		}
		if (context == null || "".equals(context)) {
			jsonObject.put("check", 0);
		}else{
			mgrAticleService.addMood(context);
			logsService.insertMgrLogs(IP, session.getAttribute("account").toString(), context, BlogConfig.VISIT_IP_LOGIN_MOOD_ADD ,type);
			jsonObject.put("check", 1);
		}
		return jsonObject.toString();
	}
	
	/**
	 * 添加文章
	 * @param request
	 * @return
	 */
	@RequestMapping("/addAtcile.html")
	@ResponseBody
	public String addAtcile(HttpServletRequest request ,String tittle ,String introduction ,String content ,String type ,Long id ,String imageUrl){
		JSONObject jsonObject = new JSONObject();
		String IP=IpUtils.getIp(request);
		HttpSession session = SessionUtils.getHttpSession(request);
		int checking = WebOrPhoneUtil.check(request);
	    String typeforpcorphone = null; 
		if (checking == 1) {
			typeforpcorphone = BlogConfig.PC;
		}else{
			typeforpcorphone = BlogConfig.PHONE;
		}
		if ("".equals(tittle) || "".equals(introduction) || "".equals(content) || "".equals(imageUrl)) {
			jsonObject.put("check", 0);
		}else if (id == null) {
			mgrAticleService.addAtcile(tittle, introduction, content, type, imageUrl);
			logsService.insertMgrLogs(IP, session.getAttribute("account").toString(), tittle, BlogConfig.VISIT_IP_LOGIN_ATCILE_ADD ,typeforpcorphone);
			jsonObject.put("check", 1);
		}else{
			mgrAticleService.updateAtcile(tittle, introduction, content, type, id, imageUrl);
			logsService.insertMgrLogs(IP, session.getAttribute("account").toString(), tittle, BlogConfig.VISIT_IP_LOGIN_ATCILE_UPDATE ,typeforpcorphone);
			jsonObject.put("check", 1);
		}
		return jsonObject.toJSONString();
	}
	
	/**
	 * 修改文章
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/seleteAtcile.html",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String seleteAtcile(HttpServletRequest request ,Long id){
		JSONObject jsonObject = new JSONObject();
		Aticle aticle = mgrAticleService.seleteAtcile(id);
		jsonObject.put("aticle", aticle);
		return jsonObject.toString();
	} 
}
