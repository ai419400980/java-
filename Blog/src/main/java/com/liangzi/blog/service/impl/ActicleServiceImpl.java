package com.liangzi.blog.service.impl;

import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liangzi.blog.congfig.BlogConfig;
import com.liangzi.blog.dao.AticleMapper;
import com.liangzi.blog.dao.AticleTypeMapper;
import com.liangzi.blog.dao.CommentMapper;
import com.liangzi.blog.dao.MoodMapper;
import com.liangzi.blog.model.base.Aticle;
import com.liangzi.blog.model.base.AticleType;
import com.liangzi.blog.model.base.AticleTypeExample;
import com.liangzi.blog.model.base.Comment;
import com.liangzi.blog.model.base.Mood;
import com.liangzi.blog.model.extend.PageModel;
import com.liangzi.blog.service.ActicleService;
import com.liangzi.blog.utils.PageUtil;
import com.liangzi.blog.utils.TimesUtil;

/**
 * <p>Title 		: ActicleServiceImpl</p>
 * <p>Description   : 慢生活，学无止境，一骑绝尘ServiceImpl</p>
 * <p>DevelopTools  : Eclipse_x64</p>
 * <p>DevelopSystem : windows10_x64</p>
 * <p>Company 		: com.liangzi</p>
 * @author  		: Liangzi
 * @date 			: 2016年12月3日 下午8:14:09
 * @version 		: 1.0
 */
@Service("acticleService")
public class ActicleServiceImpl implements ActicleService{
	
	@Autowired
	private AticleMapper aticleMapper;
	
	@Autowired
	private AticleTypeMapper aticleTypeMapper;
	
	@Autowired
	private MoodMapper moodMapper;
	
	@Autowired
	private CommentMapper commentMapper;
	
	/**
	 *获取最大总页数 
	 * @return
	 */
	public int getMaxSize(int type) {
		int maxPage = PageUtil.getMaxPage(aticleMapper.selectByTypeForCount(type));
		return maxPage;
	}
	
	/**
	 *获取心情最大总页数 
	 * @return
	 */
	public int getMaxSizeForMood(int status) {
		int maxPage = PageUtil.getMaxPage(moodMapper.selectForCount(status));
		return maxPage;
	}

	/**
	 *获取评价最大总页数 
	 * @return
	 */
	public int getMaxSizeFoComment(int status) {
		int maxPage = PageUtil.getMaxPage(commentMapper.selectForCount(status));
		return maxPage;
	}
	
	/**
	 * 获取当前页面的文章
	 * @param nowPageNum
	 * @return
	 */
	public List<Aticle> getpPageAticle(int nowPageNum ,int typeid) {
		AticleTypeExample aticleTypeExample = new AticleTypeExample();
		AticleTypeExample.Criteria	criteria =aticleTypeExample.createCriteria();
		criteria.andAtIdIsNotNull();
		List<AticleType> listType = aticleTypeMapper.selectByExample(aticleTypeExample);
		PageModel pageModel = new PageModel();
		pageModel.setType(typeid);
		pageModel.setPageSize(BlogConfig.PAGE_SIZE);
		pageModel.setMaxCount((nowPageNum-1)*BlogConfig.PAGE_SIZE);
		List<Aticle> list = aticleMapper.selectForPage(pageModel);
		for (Aticle aicle : list) {
			aicle.setAtCreatTimeChange(TimesUtil.getCurrTime(aicle.getAtCreatTime()));
			String type = listType.get(Integer.parseInt(aicle.getAtTypeId())-1).getAtType();
			aicle.setAtTypeId(type);
		}
		return list;
	}

	/**
	 * 获取当前页面的心情
	 * @param nowPageNum
	 * @return
	 */
	public List<Mood> getMood(int nowPageNum, int status) {
		PageModel pageModel = new PageModel();
		pageModel.setStatus(status);
		pageModel.setPageSize(BlogConfig.PAGE_SIZE);
		pageModel.setMaxCount((nowPageNum-1)*BlogConfig.PAGE_SIZE);
		List<Mood> list = moodMapper.selectForMood(pageModel);
		for (Mood mood : list) {
			mood.setMoCreatTimeChange(TimesUtil.getCurrTime(mood.getMoCreatTime()));
		}
		return list;
	}

	/**
	 * 获取当前留言数据
	 * @param nowPageNum
	 * @return
	 */
	public List<Comment> getComment(int nowPageNum, int status) {
		PageModel pageModel = new PageModel();
		pageModel.setStatus(status);
		pageModel.setPageSize(BlogConfig.PAGE_SIZE);
		pageModel.setMaxCount((nowPageNum-1)*BlogConfig.PAGE_SIZE);
		List<Comment> list = commentMapper.selectForComment(pageModel);
		for (Comment Comment : list) {
			Comment.setCoCreatTimeChange(TimesUtil.getCurrTime(Comment.getCoCreatTime()));
		}
		return list;
	}

	/**
	 * 添加留言表
	 */
	public void saveComment(String context) {
		Comment comment= new Comment();
		comment.setCoContent(context);
		comment.setCoCreatTime(new Date());
		comment.setCoModifyTime(new Date());
		comment.setCoStatus(1);
		commentMapper.insert(comment);
	}
	
	/**
	 * 搜索关键词文章
	 * @param nowPageNum
	 * @param tittle
	 * @return
	 */
	public List<Aticle> getpSearchAticle(int nowPageNum ,String tittle) {
		AticleTypeExample aticleTypeExample = new AticleTypeExample();
		AticleTypeExample.Criteria	criteria =aticleTypeExample.createCriteria();
		criteria.andAtIdIsNotNull();
		List<AticleType> listType = aticleTypeMapper.selectByExample(aticleTypeExample);
		PageModel pageModel = new PageModel();
		pageModel.setTittle("%"+tittle+"%");
		pageModel.setPageSize(BlogConfig.PAGE_SIZE);
		pageModel.setMaxCount((nowPageNum-1)*BlogConfig.PAGE_SIZE);
		List<Aticle> list = aticleMapper.selectForSearch(pageModel);
		for (Aticle aicle : list) {
			aicle.setAtCreatTimeChange(TimesUtil.getCurrTime(aicle.getAtCreatTime()));
			String type = listType.get(Integer.parseInt(aicle.getAtTypeId())-1).getAtType();
			aicle.setAtTypeId(type);
		}
		return list;
	}
	
	/**
	 * 获取关键词文章数量
	 * @param tittle
	 * @return
	 */
	public int getpSearchAticleCount(String tittle) {
		int count = PageUtil.getMaxPage(aticleMapper.selectForSearchCount("%"+tittle+"%"));
		return count;
	}
	
}
