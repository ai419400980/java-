package com.liangzi.mgr.blog.service;

import java.util.List;

import com.liangzi.blog.model.base.Aticle;
import com.liangzi.blog.model.base.AticleComment;
import com.liangzi.blog.model.base.Comment;
import com.liangzi.blog.model.base.Mood;

/**
 * <p>Title			: MgrAticleServce</p>
 * <p>Description	: 文章管理Service</p>
 * <p>DevelopTools	: Eclipse_x64</p>
 * <p>DevelopSystem	: Windows_x64</p>
 * <p>Company		: 51diaocha</p>
 * @author			: Liangzl
 * @date			: 2016年12月19日 上午10:39:23
 * @version			: 1.0
 */
public interface MgrAticleService {
	
	/**
	 * 修改文章评论状态
	 * @param id
	 * @return
	 */
	public Integer changeAticleComment(Long id);

	/**
	 * 修改留言状态
	 * @param id
	 * @return
	 */
	public Integer changeComment(Long id);
	
	/**
	 * 修改心情状态
	 * @param id
	 * @return
	 */
	public Integer changeMood(Long id);
	
	/**
	 * 修改文章是否首页推荐
	 * @param id
	 * @return
	 */
	public Integer changeAticle(Long id);
	
	/**
	 * 删除文章
	 * @param id
	 * @return
	 */
	public void deleteAticle(Long id);
	
	/**
	 * 获取文章评论的最大页数
	 * @return
	 */
	public int getAticleCommentCountForAll();
	
	/**
	 * 获取文章评论的详细情况
	 * @param date
	 * @return visitorsList
	 */
	public List<AticleComment> getAticleComment(Integer nowPageNum);
	
	/**
	 * 获取文章评论的详细情况  有查询条件
	 * @param date
	 * @return visitorsList
	 */
	public List<AticleComment> getForPageListForSearch(Integer nowPageNum ,Long acAticleId ,Integer acStatus);
	
	/**
	 * 获取文章评论的最大页数  有查询条件
	 * @param date
	 * @return
	 */
	public int getAticleCommentCountForSearch(Long acAticleId ,Integer acStatus);
	
	/**
	 * 获取留言的最大页数
	 * @return
	 */
	public int getCommentCountForAll();
	
	/**
	 * 获取留言的详细情况
	 * @param date
	 * @return visitorsList
	 */
	public List<Comment> getComment(Integer nowPageNum);
	
	/**
	 * 获取留言的最大页数  有查询条件
	 * @param date
	 * @return
	 */
	public int getCommentCountForSearch(Integer coStatus);
	
	/**
	 * 获取留言的详细情况  有查询条件
	 * @param date
	 * @return visitorsList
	 */
	public List<Comment> getForCommentPageListForSearch(Integer nowPageNum ,Integer coStatus);
	
	/**
	 * 获取心情的最大页数
	 * @return
	 */
	public int getMoodCountForAll();
	
	/**
	 * 获取心情的详细情况
	 * @param date
	 * @return visitorsList
	 */
	public List<Mood> getMood(Integer nowPageNum);
	
	/**
	 * 获取心情的最大页数  有查询条件
	 * @param date
	 * @return
	 */
	public int getMoodCountForSearch(Integer moStatus);
	
	/**
	 * 获取心情的详细情况  有查询条件
	 * @param date
	 * @return moodListPageForSearch
	 */
	public List<Mood> getForMoodPageListForSearch(Integer nowPageNum ,Integer moStatus);
	
	/**
	 * 添加心情
	 * @param context
	 */
	public void addMood(String context);
	
	/**
	 * 获取文章的最大页数
	 * @return
	 */
	public int getAticleCountForAll();
	
	/**
	 * 获取文章的详细情况
	 * @param date
	 * @return visitorsList
	 */
	public List<Aticle> getAticle(Integer nowPageNum);
	
	/**
	 * 获取文章的最大页数  有查询条件
	 * @param date
	 * @return
	 */
	public int getAticleCountForSearch(String atTitle ,Integer atUpIndex ,String atTypeId);
	
	/**
	 * 获取文章的详细情况  有查询条件
	 * @param date
	 * @return moodListPageForSearch
	 */
	public List<Aticle> getForAticlePageListForSearch(Integer nowPageNum ,String atTitle ,Integer atUpIndex ,String atTypeId);
	
	/**
	 * 添加文章
	 * @param tittle
	 * @param introduction
	 * @param content
	 * @param type
	 */
	public void addAtcile(String tittle, String introduction, String content, String type, String imageUrl);
	
	/**
	 * 查询文章
	 * @param id
	 * @return
	 */
	public Aticle seleteAtcile(Long id);
	
	/**
	 * 更新文章
	 * @param tittle
	 * @param introduction
	 * @param content
	 * @param type
	 * @param id
	 */
	public void updateAtcile(String tittle ,String introduction ,String content ,String type ,Long id, String imageUrl);
}
