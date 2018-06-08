package com.liangzi.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * <p>Title 		: SystemController</p>
 * <p>Description   : 系统Controller</p>
 * <p>DevelopTools  : Eclipse_x64</p>
 * <p>DevelopSystem : windows10_x64</p>
 * <p>Company 		: com.liangzi</p>
 * @author  		: Liangzi
 * @date 			: 2016年12月29日 下午7:37:12
 * @version 		: 1.0
 */
@Controller("systemController")
public class SystemController {
	
	/**
	 * 黑名单放回界面
	 * @return
	 */
	@RequestMapping("/wocao.html")
	public ModelAndView wocao(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("wocao");
		return mv;
	}
	
	/**
	 * 黑名单放回界面
	 * @return
	 */
	@RequestMapping("/mgr/wocao.html")
	public ModelAndView mgrwocao(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("wocao");
		return mv;
	}
	
}
