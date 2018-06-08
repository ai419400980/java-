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
import com.liangzi.blog.model.base.AticleComment;
import com.liangzi.blog.service.DetailService;
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
 * <p>Title 		: DetailController</p>
 * <p>Description   : 文章详情Controller</p>
 * <p>DevelopTools  : Eclipse_x64</p>
 * <p>DevelopSystem : windows10_x64</p>
 * <p>Company 		: com.liangzi</p>
 * @author  		: Liangzi
 * @date 			: 2016年11月22日 下午11:17:47
 * @version 		: 1.0
 */
@Controller("detailController")
public class DetailController {
	
	/**
	 * 注入service
	 */
	@Autowired
	private DetailService detailService;
	@Autowired
	private IndexService indexService;
	@Autowired
	private LogsService logsService;
	@Autowired
	private MgrBlacklistMapper mgrBlacklistMapper;
	/**
	 * 获取文章详情
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping("/getAticle.html")
	public ModelAndView getAticle(Long id ,HttpServletRequest request){
		ModelAndView mv = new ModelAndView();
		// 获取IP地址
		String IP = IpUtils.getIp(request);
		int check = WebOrPhoneUtil.check(request);
		Aticle aticle = detailService.getAticleById(id, BlogConfig.OPERATIONTYPE_VISITFORATICLE, IP ,check);
		if (aticle != null) {
			mv.addObject("aticle", aticle);
			if (check == 1) {
				mv.setViewName("detail");
			}else{
				mv.setViewName("phone/detail");
			}
		}else{
			mv.setViewName("404");
		}
		// 获取首页最新文章
		List<Aticle> listByNew = indexService.getIndexForNew();
		// 获取首页点击率最高文章
		List<Aticle> listByCount = indexService.getIndexForCount();
		// 获取文章评论列表
		List<AticleComment> listComment = detailService.getComment(id);
		mv.addObject("listByNew", listByNew);
		mv.addObject("listByCount", listByCount);
		mv.addObject("listComment", listComment);
		return mv;
	}
	
	/**
	 * 点赞文章
	 * @param request
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/addPraise.html")
	public JSONObject addPraise(HttpServletRequest request ,Long id){
		// 获取IP地址
		String IP = IpUtils.getIp(request);
		detailService.updatePraise(id ,IP ,1);
		return null;
	}
	
	/**
	 * 评论文章
	 * @param request
	 * @param comment
	 * @param id
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("/addCommenting.html")
	@ResponseBody
	public String addCommenting(HttpServletRequest request, HttpServletResponse response, String comment, Long id ,String tittle) throws IOException {
		JSONObject jsonObject = new JSONObject();
		// 获取IP地址
		String IP = IpUtils.getIp(request);
		// 判断内容是非为空
		if (!StringUtils.isNotEmpty(comment) || !StringUtils.isNotEmpty(tittle)) {
			jsonObject.put("check", -6);
			return jsonObject.toJSONString();
		}
		// 判断是否是ajax提交
		if (!AJAXUtils.isAjaxRequest(request)) {
			MgrBlackInterceptor.MgrBlacklistMap.put(IP, 2);
			MgrBlacklist mgrBlacklist = new MgrBlacklist();
			mgrBlacklist.setMbCreatTime(new Date());
			mgrBlacklist.setMbIp(IP);
			mgrBlacklist.setMbGrade(2);
			mgrBlacklist.setMbReason(BlogConfig.OPERATIONTYPE_IP_COMMENT);
			// 加入黑名单
			mgrBlacklistMapper.insert(mgrBlacklist);
			// 发送邮件
			logsService.sendEmail(BlogConfig.OPERATIONTYPE_IP_COMMENT, IP);
			logsService.insertVisitLogs(IP, tittle+":"+comment, BlogConfig.OPERATIONTYPE_IP_BLACK_FIRST ,1);
			response.sendRedirect("wocao.html");
		}else{
			detailService.addComment(id, comment);
			logsService.insertVisitLogs(IP, tittle+":"+comment, BlogConfig.OPERATIONTYPE_COMMENT ,1);
			jsonObject.put("check", 1);
		}
		return jsonObject.toJSONString();
	}
}
