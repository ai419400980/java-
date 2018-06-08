package com.liangzi.blog.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.liangzi.blog.congfig.BlogConfig;
import com.liangzi.blog.model.base.Aticle;
import com.liangzi.blog.service.ActicleService;
import com.liangzi.blog.service.IndexService;
import com.liangzi.blog.service.LogsService;
import com.liangzi.blog.web.utils.IpUtils;
import com.liangzi.blog.web.utils.WebOrPhoneUtil;;

/**
 * <p>Title 		: IndexController</p>
 * <p>Description   : 首页Controller</p>
 * <p>DevelopTools  : Eclipse_x64</p>
 * <p>DevelopSystem : windows10_x64</p>
 * <p>Company 		: com.liangzi</p>
 * @author  		: Liangzi
 * @date 			: 2016年11月19日 下午9:56:39
 * @version 		: 1.0
 */
@Controller("indexController")
public class IndexController {
	
	/**
	 * 注入service
	 */
	@Autowired
	private IndexService indexService;
	
	@Autowired
	private LogsService logsService;
	
	@Autowired
	private ActicleService acticleService;
	
	/**
	 * 获取首页
	 * @param modelAndView
	 * @return
	 */
	@RequestMapping("/index.html")
	public ModelAndView getIndex(HttpServletRequest request) {
		ModelAndView mdelAndView = new ModelAndView();
		// 获取首页推荐文章
		List<Aticle> listFroUp = indexService.geIndex();
		// 获取首页最新文章
		List<Aticle> listByNew = indexService.getIndexForNew();
		// 获取首页点击率最高文章
		List<Aticle> listByCount = indexService.getIndexForCount();
		mdelAndView.addObject("listFroUp", listFroUp);
		mdelAndView.addObject("listByNew", listByNew);
		mdelAndView.addObject("listByCount", listByCount);
		// 获取IP地址
		String IP = IpUtils.getIp(request);
		int check = WebOrPhoneUtil.check(request);
		if (check == 1) {
			mdelAndView.setViewName("index");
		}else{
			mdelAndView.setViewName("phone/index");
		}
		logsService.insertVisitLogs(IP, BlogConfig.VISIT_INDEX, BlogConfig.OPERATIONTYPE_VISIT ,check);
		return mdelAndView;
	}
	
	/**
	 * 搜索文章
	 * @param request
	 * @param searchText
	 * @return
	 */
	@RequestMapping("/searchWorld.html")
	public ModelAndView search(HttpServletRequest request ,String searchText ,Integer nowPageNum){
		ModelAndView mv = new ModelAndView();
		if (searchText == null || "".equals(searchText) ) {
			// 获取首页推荐文章
			List<Aticle> listFroUp = indexService.geIndex();
			// 获取首页最新文章
			List<Aticle> listByNew = indexService.getIndexForNew();
			// 获取首页点击率最高文章
			List<Aticle> listByCount = indexService.getIndexForCount();
			mv.addObject("listFroUp", listFroUp);
			mv.addObject("listByNew", listByNew);
			mv.addObject("listByCount", listByCount);
			int check = WebOrPhoneUtil.check(request);
			if (check == 1) {
				mv.setViewName("index");
			}else{
				mv.setViewName("phone/index");
			}
			String IP = IpUtils.getIp(request);
			logsService.insertVisitLogs(IP, BlogConfig.SEARCH_NULL+" ", BlogConfig.OPERATIONTYPE_SEARCH,check);
		}else{
			// 判断是否是第一次进来
			if(nowPageNum == null  ){
				nowPageNum=1;
			}
			int maxPage = acticleService.getpSearchAticleCount(searchText);
			// 获取关键词文章
			List<Aticle> listBySearch = acticleService.getpSearchAticle(nowPageNum, searchText);
			// 获取首页最新文章
			List<Aticle> listByNew = indexService.getIndexForNew();
			// 获取首页点击率最高文章
			List<Aticle> listByCount = indexService.getIndexForCount();
			mv.addObject("listBySearch", listBySearch);
			mv.addObject("maxPage", maxPage);
			mv.addObject("nowPageNum", nowPageNum);
			mv.addObject("nowPageNumLast", nowPageNum-1);
			mv.addObject("nowPageNumAdd", nowPageNum+1);
			mv.addObject("listByNew", listByNew);
			mv.addObject("listByCount", listByCount);
			mv.addObject("searchText", searchText);
			int check = WebOrPhoneUtil.check(request);
			if (check == 1) {
				mv.setViewName("search");
			}else{
				mv.setViewName("phone/search");
			}
			String IP = IpUtils.getIp(request);
			logsService.insertVisitLogs(IP, BlogConfig.SEARCH_NULL+searchText, BlogConfig.OPERATIONTYPE_SEARCH ,check);
		}
		return mv;
	}
}
