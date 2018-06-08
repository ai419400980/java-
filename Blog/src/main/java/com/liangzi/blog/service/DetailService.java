package com.liangzi.blog.service;

import java.util.List;

import com.liangzi.blog.model.base.Aticle;
import com.liangzi.blog.model.base.AticleComment;

/**
 * <p>Title 		: DetailService</p>
 * <p>Description   : 文章详情页Service</p>
 * <p>DevelopTools  : Eclipse_x64</p>
 * <p>DevelopSystem : windows10_x64</p>
 * <p>Company 		: com.liangzi</p>
 * @author  		: Liangzi
 * @date 			: 2016年11月30日 下午8:14:39
 * @version 		: 1.0
 */
public interface DetailService {
	
	/**
	 * 获取文章详情
	 * @param id
	 * @param operationType
	 * @param Ip
	 * @return
	 */
	public Aticle getAticleById(Long id, String operationType, String IP ,int check);
	
	/**
	 * 点赞文章
	 * @param id
	 */
	public void updatePraise(Long id ,String ip ,int check);
	
	/**
	 * 获取文章评论列表
	 * @param id
	 * @return
	 */
	public List<AticleComment> getComment(Long id);
	
	/**
	 * 评论文章
	 * @param id
	 * @param comment
	 */
	public void addComment(Long id , String comment);
}
