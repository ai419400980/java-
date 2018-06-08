package com.liangzi.blog.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.liangzi.blog.congfig.BlogConfig;
import com.liangzi.blog.model.base.Aticle;
import com.liangzi.blog.model.base.Comment;
import com.liangzi.blog.model.base.Mood;
import com.liangzi.blog.service.ActicleService;
import com.liangzi.blog.service.IndexService;
import com.liangzi.blog.service.LogsService;
import com.liangzi.blog.utils.AJAXUtils;
import com.liangzi.blog.utils.StringUtils;
import com.liangzi.blog.web.utils.IpUtils;
import com.liangzi.blog.web.utils.WebOrPhoneUtil;
import com.liangzi.mgr.blog.dao.MgrBlacklistMapper;
import com.liangzi.mgr.blog.interceptor.MgrBlackInterceptor;
import com.liangzi.mgr.blog.model.base.MgrBlacklist;

/**
 * <p>Title 		: ActicleController</p>
 * <p>Description   : 慢生活，学无止境，一骑绝尘Controller</p>
 * <p>DevelopTools  : Eclipse_x64</p>
 * <p>DevelopSystem : windows10_x64</p>
 * <p>Company 		: com.liangzi</p>
 * @author  		: Liangzi
 * @date 			: 2016年12月3日 下午6:50:58
 * @version 		: 1.0
 */
@Controller("acticleController")
public class ActicleController {
	
	/**
	 * 注入service
	 */
	@Autowired
	private LogsService logsService;
	
	@Autowired
	private ActicleService acticleService;
	
	@Autowired
	private IndexService indexService;
	@Autowired
	private MgrBlacklistMapper mgrBlacklistMapper;
	/**
	 * 获取关于我的页面
	 * @param request
	 * @return
	 */
	@RequestMapping("/about.html")
	public ModelAndView getAboutMe(HttpServletRequest request){
		ModelAndView mv = new ModelAndView();
		// 获取IP地址
		String IP = IpUtils.getIp(request);
		int check = WebOrPhoneUtil.check(request);
		if (check == 1) {
			mv.setViewName("about");
		}else{
			mv.setViewName("phone/about");
		}
		logsService.insertVisitLogs(IP, BlogConfig.VISIT_ABOUT, BlogConfig.OPERATIONTYPE_VISIT ,check);
		return mv ;
	}
	
	/**
	 * 获取慢生活页面文章
	 * @param request
	 * @param nowPageNum
	 * @return
	 */
	@RequestMapping("/slowlife.html")
	public ModelAndView getSlowlife(HttpServletRequest request ,Integer nowPageNum){
		ModelAndView mv = new ModelAndView();
		// 判断是否是第一次进来
		if(nowPageNum == null){
			nowPageNum=1;
		}
		// 获取总的页数
		int maxPage = acticleService.getMaxSize(1);
		List<Aticle> listPage = acticleService.getpPageAticle(nowPageNum ,1);
		// 获取IP地址
		String IP = IpUtils.getIp(request);
		// 获取首页最新文章
		List<Aticle> listByNew = indexService.getIndexForNew();
		// 获取首页点击率最高文章
		List<Aticle> listByCount = indexService.getIndexForCount();
		mv.addObject("listPage", listPage);
		mv.addObject("maxPage", maxPage);
		mv.addObject("nowPageNum", nowPageNum);
		mv.addObject("nowPageNumLast", nowPageNum-1);
		mv.addObject("nowPageNumAdd", nowPageNum+1);
		mv.addObject("listByNew", listByNew);
		mv.addObject("listByCount", listByCount);
		int check = WebOrPhoneUtil.check(request);
		if (check == 1) {
			mv.setViewName("slowlife");
		}else{
			mv.setViewName("phone/slowlife");
		}
		logsService.insertVisitLogs(IP, BlogConfig.VISIT_SLOWLIFE, BlogConfig.OPERATIONTYPE_VISIT ,check);
		return mv;
	}
	
	/**
	 * 获取学无止境页面文章
	 * @param request
	 * @param nowPageNum
	 * @return
	 */
	@RequestMapping("/knowledge.html")
	public ModelAndView getKnowledge(HttpServletRequest request ,Integer nowPageNum){
		ModelAndView mv = new ModelAndView();
		// 判断是否是第一次进来
		if(nowPageNum == null){
			nowPageNum=1;
		}
		// 获取总的页数
		int maxPage = acticleService.getMaxSize(2);
		List<Aticle> listPage = acticleService.getpPageAticle(nowPageNum ,2);
		// 获取IP地址
		String IP = IpUtils.getIp(request);
		// 获取首页最新文章
		List<Aticle> listByNew = indexService.getIndexForNew();
		// 获取首页点击率最高文章
		List<Aticle> listByCount = indexService.getIndexForCount();
		mv.addObject("listPage", listPage);
		mv.addObject("maxPage", maxPage);
		mv.addObject("nowPageNum", nowPageNum);
		mv.addObject("nowPageNumLast", nowPageNum-1);
		mv.addObject("nowPageNumAdd", nowPageNum+1);
		mv.addObject("listByNew", listByNew);
		mv.addObject("listByCount", listByCount);
		int check = WebOrPhoneUtil.check(request);
		if (check == 1) {
			mv.setViewName("knowledge");
		}else{
			mv.setViewName("phone/knowledge");
		}
		logsService.insertVisitLogs(IP, BlogConfig.VISIT_KNOWLEDGE, BlogConfig.OPERATIONTYPE_VISIT ,check);
		return mv;
	}
	
	/**
	 * 获取一骑绝尘页面文章
	 * @param request
	 * @param nowPageNum
	 * @return
	 */
	@RequestMapping("/success.html")
	public ModelAndView getSuccess(HttpServletRequest request ,Integer nowPageNum){
		ModelAndView mv = new ModelAndView();
		// 判断是否是第一次进来
		if(nowPageNum == null){
			nowPageNum=1;
		}
		// 获取总的页数
		int maxPage = acticleService.getMaxSize(3);
		List<Aticle> listPage = acticleService.getpPageAticle(nowPageNum ,3);
		// 获取IP地址
		String IP = IpUtils.getIp(request);
		// 获取首页最新文章
		List<Aticle> listByNew = indexService.getIndexForNew();
		// 获取首页点击率最高文章
		List<Aticle> listByCount = indexService.getIndexForCount();
		mv.addObject("listPage", listPage);
		mv.addObject("maxPage", maxPage);
		mv.addObject("nowPageNum", nowPageNum);
		mv.addObject("nowPageNumLast", nowPageNum-1);
		mv.addObject("nowPageNumAdd", nowPageNum+1);
		mv.addObject("listByNew", listByNew);
		mv.addObject("listByCount", listByCount);
		int check = WebOrPhoneUtil.check(request);
		if (check == 1) {
			mv.setViewName("success");
		}else{
			mv.setViewName("phone/success");
		}
		logsService.insertVisitLogs(IP, BlogConfig.VISIT_SHARE, BlogConfig.OPERATIONTYPE_VISIT ,check);
		return mv;
	}
	
	/**
	 * 获取心情页面文章
	 * @param request
	 * @param nowPageNum
	 * @return
	 */
	@RequestMapping("/mood.html")
	public ModelAndView mood(HttpServletRequest request ,Integer nowPageNum){
		ModelAndView mv = new ModelAndView();
		// 判断是否是第一次进来
		if(nowPageNum == null){
			nowPageNum=1;
		}
		// 获取总的页数
		int maxPage = acticleService.getMaxSizeForMood(1);
		List<Mood> listMood = acticleService.getMood(nowPageNum,1);
		// 获取IP地址
		String IP = IpUtils.getIp(request);
		mv.addObject("listMood", listMood);
		mv.addObject("maxPage", maxPage);
		mv.addObject("nowPageNum", nowPageNum);
		mv.addObject("nowPageNumLast", nowPageNum-1);
		mv.addObject("nowPageNumAdd", nowPageNum+1);
		int check = WebOrPhoneUtil.check(request);
		if (check == 1) {
			mv.setViewName("mood");
		}else{
			mv.setViewName("phone/mood");
		}
		logsService.insertVisitLogs(IP, BlogConfig.VISIT_MOOD, BlogConfig.OPERATIONTYPE_VISIT ,check);
		return mv;
	}
	
	/**
	 * 获取留言板页面信息
	 * @param modelAndView
	 * @param nowPageNum
	 * @return
	 */
	@RequestMapping("/message.html")
	public ModelAndView message(HttpServletRequest request ,Integer nowPageNum){
		ModelAndView mv = new ModelAndView();
		// 判断是否是第一次进来
		if(nowPageNum == null){
			nowPageNum=1;
		}
		// 获取总的页数
		int maxPage = acticleService.getMaxSizeFoComment(1);
		List<Comment> listComment = acticleService.getComment(nowPageNum, 1);
		// 获取IP地址
		String IP = IpUtils.getIp(request);
		mv.addObject("listComment", listComment);
		mv.addObject("maxPage", maxPage);
		mv.addObject("nowPageNum", nowPageNum);
		mv.addObject("nowPageNumLast", nowPageNum-1);
		mv.addObject("nowPageNumAdd", nowPageNum+1);
		int check = WebOrPhoneUtil.check(request);
		if (check == 1) {
			mv.setViewName("message");
		}else{
			mv.setViewName("phone/message");
		}
		logsService.insertVisitLogs(IP, BlogConfig.VISIT_COMMENT, BlogConfig.OPERATIONTYPE_VISIT ,check);
		return mv;
	}
	
	/**
	 * 添加留言板
	 * @param request
	 * @param context
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("/messageAdding.html")
	@ResponseBody
	public String messageAdding(HttpServletRequest request, HttpServletResponse response, String context) throws IOException {
		JSONObject jsonObject = new JSONObject();
		// 获取IP地址
		String IP = IpUtils.getIp(request);
		// 判断内容是非为空
		if (!StringUtils.isNotEmpty(context) ) {
			jsonObject.put("check", -6);
			return jsonObject.toJSONString();
		}// 判断是否是ajax提交
		if (!AJAXUtils.isAjaxRequest(request)) {
			MgrBlackInterceptor.MgrBlacklistMap.put(IP, 2);
			MgrBlacklist mgrBlacklist = new MgrBlacklist();
			mgrBlacklist.setMbCreatTime(new Date());
			mgrBlacklist.setMbIp(IP);
			mgrBlacklist.setMbGrade(2);
			mgrBlacklist.setMbReason(BlogConfig.OPERATIONTYPE_IP_ATCILE_COMMENT);
			// 加入黑名单
			mgrBlacklistMapper.insert(mgrBlacklist);
			logsService.insertVisitLogs(IP, context, BlogConfig.OPERATIONTYPE_IP_BLACK_FIRST ,1);
			// 发送邮件
			logsService.sendEmail(BlogConfig.OPERATIONTYPE_IP_ATCILE_COMMENT, IP);
			response.sendRedirect("wocao.html");
		}else{
			acticleService.saveComment(context);
			logsService.insertVisitLogs(IP, context, BlogConfig.OPERATIONTYPE_MESSAGE ,1);
			jsonObject.put("check", 1);
		}
		return jsonObject.toJSONString();
	}
		
	
}
