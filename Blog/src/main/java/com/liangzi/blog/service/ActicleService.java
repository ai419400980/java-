package com.liangzi.blog.service;

import java.util.List;

import com.liangzi.blog.model.base.Aticle;
import com.liangzi.blog.model.base.Comment;
import com.liangzi.blog.model.base.Mood;

/**
 * <p>Title 		: ActicleService</p>
 * <p>Description   : 慢生活，学无止境，一骑绝尘Service</p>
 * <p>DevelopTools  : Eclipse_x64</p>
 * <p>DevelopSystem : windows10_x64</p>
 * <p>Company 		: com.liangzi</p>
 * @author  		: Liangzi
 * @date 			: 2016年12月3日 下午8:15:00
 * @version 		: 1.0
 */
public interface ActicleService {
	
	/**
	 *获取最大总页数 
	 */
	public int getMaxSize(int type);
	
	/**
	 * 获取当前页面的文章
	 * @param nowPageNum
	 * @return
	 */
	public List<Aticle> getpPageAticle(int nowPageNum ,int type);
	
	/**
	 *获取心情最大总页数 
	 */
	public int getMaxSizeForMood(int status);
	
	/**
	 * 获取当前页面的心情
	 * @param nowPageNum
	 */
	public List<Mood> getMood(int nowPageNum ,int status);
	
	/**
	 * 获取当前留言数据
	 * @param nowPageNum
	 * @return
	 */
	public List<Comment> getComment(int nowPageNum, int status);
	
	/**
	 *获取评价最大总页数 
	 */
	public int getMaxSizeFoComment(int status);
	
	/**
	 * 添加留言表
	 */
	public void saveComment(String context);
	
	/**
	 * 搜索关键词文章
	 * @param nowPageNum
	 * @param tittle
	 * @return
	 */
	public List<Aticle> getpSearchAticle(int nowPageNum ,String tittle);
	
	/**
	 * 获取关键词文章数量
	 * @param tittle
	 * @return
	 */
	public int getpSearchAticleCount(String tittle);
}
