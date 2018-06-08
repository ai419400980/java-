package com.liangzi.blog.service;

import java.util.List;

import com.liangzi.blog.model.base.Aticle;

/**
 * <p>Title 		: IndexService</p>
 * <p>Description   : 首页Service</p>
 * <p>DevelopTools  : Eclipse_x64</p>
 * <p>DevelopSystem : windows10_x64</p>
 * <p>Company 		: com.liangzi</p>
 * @author  		: Liangzi
 * @date 			: 2016年11月22日 下午10:02:52
 * @version 		: 1.0
 */
public interface IndexService {
	
	/**
	 * 获取首页推荐文章信息
	 * @return List<Aticle>
	 */
	public List<Aticle> geIndex();
	
	/**
	 * 获取首页最新文章信息
	 * @return
	 */
	public List<Aticle> getIndexForNew();
	
	/**
	 * 获取首页点击率最高文章信息
	 * @return
	 */
	public List<Aticle> getIndexForCount();
	
	/**
	 * 关键词搜索文章
	 * @param searchText
	 * @return
	 */
	public List<Aticle> getSearchAticle(String searchText);
}
