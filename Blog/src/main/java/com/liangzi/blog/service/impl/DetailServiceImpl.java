package com.liangzi.blog.service.impl;

import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liangzi.blog.congfig.BlogConfig;
import com.liangzi.blog.dao.AticleCommentMapper;
import com.liangzi.blog.dao.AticleMapper;
import com.liangzi.blog.dao.AticleTypeMapper;
import com.liangzi.blog.model.base.Aticle;
import com.liangzi.blog.model.base.AticleComment;
import com.liangzi.blog.model.base.AticleCommentExample;
import com.liangzi.blog.service.DetailService;
import com.liangzi.blog.service.LogsService;
import com.liangzi.blog.utils.TimesUtil;

/**
 * <p>Title 		: DetailServiceImpl</p>
 * <p>Description   : 文章详情页ServiceImpl</p>
 * <p>DevelopTools  : Eclipse_x64</p>
 * <p>DevelopSystem : windows10_x64</p>
 * <p>Company 		: com.liangzi</p>
 * @author  		: Liangzi
 * @date 			: 2016年11月30日 下午8:15:22
 * @version 		: 1.0
 */
@Service("detailService")
public class DetailServiceImpl implements DetailService{
	@Autowired
	private AticleMapper aticleMapper;
	@Autowired
	private LogsService logsService;
	@Autowired
	private AticleTypeMapper aticleTypeMapper;
	@Autowired
	private AticleCommentMapper aticleCommentMapper;
	
	/**
	 * 获取文章详情
	 * @param id
	 * @param operationType
	 * @param Ip
	 * @return aticle
	 */
	public Aticle getAticleById(Long id, String operationType, String IP ,int check) {
		Aticle aticle = aticleMapper.selectByPrimaryKey(id);
		if (aticle != null) {
			aticle.setAtCreatTimeChange(TimesUtil.getCurrTime(aticle.getAtCreatTime()));
			logsService.insertVisitLogs(IP, aticle.getAtTitle(), operationType,check);
			aticle.setAtReadCount(aticle.getAtReadCount()+1);
			aticleMapper.updateByPrimaryKeySelective(aticle);
			String type = aticleTypeMapper.selectByPrimaryKey(Long.parseLong(aticle.getAtTypeId())).getAtType();
			aticle.setAtTypeId(type);
			return aticle;
		}else{
			return null;
		}
	}

	/**
	 * 点赞文章
	 * @param id
	 */
	public void updatePraise(Long id ,String ip ,int check) {
		Aticle aticle = aticleMapper.selectByPrimaryKey(id);
		if (aticle != null) {
			aticle.setAtPraiseCount(aticle.getAtPraiseCount()+1);
			aticleMapper.updateByPrimaryKey(aticle);
			logsService.insertVisitLogs(ip, aticle.getAtTitle(), BlogConfig.OPERATIONTYPE_PRAISE ,check);
		}
	}

	/**
	 * 评论文章
	 * @param id
	 * @param comment
	 */
	public void addComment(Long id, String comment) {
		AticleComment aticleComment = new AticleComment();
		aticleComment.setAcAticleId(id);
		aticleComment.setAcContent(comment);
		aticleComment.setAcStatus(1);
		aticleComment.setAcModifyTime(new Date());
		aticleComment.setAcCreatTime(new Date());
		aticleCommentMapper.insert(aticleComment);
	}

	/**
	 * 获取文章评论列表
	 * @param id
	 * @return
	 */
	public List<AticleComment> getComment(Long id) {
		AticleCommentExample aticleCommentExample = new AticleCommentExample();
		AticleCommentExample.Criteria criteria = aticleCommentExample.createCriteria();
		criteria.andAcAticleIdEqualTo(id);
		criteria.andAcStatusEqualTo(1);
		List<AticleComment> list = aticleCommentMapper.selectByExample(aticleCommentExample);
		for (AticleComment aticleComment : list) {
			aticleComment.setAcCreatTimeChange(TimesUtil.getCurrTime(aticleComment.getAcCreatTime()));
		}
		return list;
	}
	
}
