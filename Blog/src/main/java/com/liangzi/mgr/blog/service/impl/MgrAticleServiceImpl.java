package com.liangzi.mgr.blog.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liangzi.blog.congfig.BlogConfig;
import com.liangzi.blog.dao.AticleCommentMapper;
import com.liangzi.blog.dao.AticleMapper;
import com.liangzi.blog.dao.AticleTypeMapper;
import com.liangzi.blog.dao.CommentMapper;
import com.liangzi.blog.dao.MoodMapper;
import com.liangzi.blog.model.base.Aticle;
import com.liangzi.blog.model.base.AticleComment;
import com.liangzi.blog.model.base.AticleType;
import com.liangzi.blog.model.base.AticleTypeExample;
import com.liangzi.blog.model.base.Comment;
import com.liangzi.blog.model.base.Mood;
import com.liangzi.blog.model.extend.PageModel;
import com.liangzi.blog.model.extend.PageModelForAticle;
import com.liangzi.blog.model.extend.PageModelForAticleComment;
import com.liangzi.blog.model.extend.PageModelForComment;
import com.liangzi.blog.model.extend.PageModelForMood;
import com.liangzi.blog.utils.PageUtil;
import com.liangzi.blog.utils.TimesUtil;
import com.liangzi.mgr.blog.service.MgrAticleService;

/**
 * <p>Title			: MgrAticleServiceImpl</p>
 * <p>Description	: 文章管理ServiceImpl</p>
 * <p>DevelopTools	: Eclipse_x64</p>
 * <p>DevelopSystem	: Windows_x64</p>
 * <p>Company		: 51diaocha</p>
 * @author			: Liangzl
 * @date			: 2016年12月19日 上午10:40:10
 * @version			: 1.0
 */
@Service("mgrAticleService")
public class MgrAticleServiceImpl implements MgrAticleService {
	
	@Autowired
	private AticleCommentMapper aticleCommentMapper;
	@Autowired
	private CommentMapper commentMapper;
	@Autowired
	private MoodMapper moodMapper;
	@Autowired
	private AticleMapper aticleMapper;
	@Autowired
	private AticleTypeMapper aticleTypeMapper;
	
	/**
	 * 修改文章评论状态
	 * @param id
	 * @return
	 */
	public Integer changeAticleComment(Long id){
		AticleComment aticleComment = new AticleComment();
		aticleComment = aticleCommentMapper.selectByPrimaryKey(id);
		if (aticleComment.getAcStatus() == 0) {
			aticleComment.setAcStatus(1);
			aticleCommentMapper.updateByPrimaryKey(aticleComment);
			return 1;
		}else{
			aticleComment.setAcStatus(0);
			aticleCommentMapper.updateByPrimaryKey(aticleComment);
			return 0;
		}
		
	}
	
	/**
	 * 修改留言状态
	 * @param id
	 * @return
	 */
	public Integer changeComment(Long id){
		Comment comment = new Comment();
		comment = commentMapper.selectByPrimaryKey(id);
		if (comment.getCoStatus() == 0) {
			comment.setCoStatus(1);
			commentMapper.updateByPrimaryKey(comment);
			return 1;
		}else{
			comment.setCoStatus(0);
			commentMapper.updateByPrimaryKey(comment);
			return 0;
		}
		
	}
	
	/**
	 * 修改文章是否首页推荐
	 * @param id
	 * @return
	 */
	public Integer changeAticle(Long id){
		Aticle aticle = new Aticle();
		aticle = aticleMapper.selectByPrimaryKey(id);
		if (aticle.getAtUpIndex() == 0) {
			aticle.setAtUpIndex(1);
			aticleMapper.updateByPrimaryKey(aticle);
			return 1;
		}else{
			aticle.setAtUpIndex(0);
			aticleMapper.updateByPrimaryKey(aticle);
			return 0;
		}
		
	}
	
	/**
	 * 修改心情状态
	 * @param id
	 * @return
	 */
	public Integer changeMood(Long id){
		Mood mood = new Mood();
		mood = moodMapper.selectByPrimaryKey(id);
		if (mood.getMoStatus() == 0) {
			mood.setMoStatus(1);
			moodMapper.updateByPrimaryKey(mood);
			return 1;
		}else{
			mood.setMoStatus(0);
			moodMapper.updateByPrimaryKey(mood);
			return 0;
		}
		
	}
	
	/**
	 * 删除文章
	 * @param id
	 * @return
	 */
	public void deleteAticle(Long id){
		aticleMapper.deleteByPrimaryKey(id);
	}
	
	/**
	 * 获取文章评论的最大页数
	 * @return
	 */
	public int getAticleCommentCountForAll(){
		int maxPage = PageUtil.getMaxPageForMgr(aticleCommentMapper.getAticleCommentCountForAll());
		return maxPage;
	}
	
	/**
	 * 获取文章评论的详细情况
	 * @param date
	 * @return visitorsList
	 */
	public List<AticleComment> getAticleComment(Integer nowPageNum){
		PageModel pageModel = new PageModel();
		pageModel.setMaxCount((nowPageNum-1)*BlogConfig.PAGE_SIZE_MGR);
		pageModel.setPageSize(BlogConfig.PAGE_SIZE_MGR);
		List<AticleComment> aticleCommentListPage = aticleCommentMapper.getAticleComment(pageModel);
		for (AticleComment aticleComment : aticleCommentListPage) {
			aticleComment.setAcCreatTimeChange(TimesUtil.getCurrTime(aticleComment.getAcCreatTime()));
		}
		return aticleCommentListPage;
	}
	
	/**
	 * 获取文章评论的最大页数  有查询条件
	 * @param date
	 * @return
	 */
	public int getAticleCommentCountForSearch(Long acAticleId ,Integer acStatus){
		AticleComment aticleComment = new AticleComment();
		if (acAticleId != null ) {
			aticleComment.setAcAticleId(acAticleId);
		}
		if (acStatus != null ) {
			aticleComment.setAcStatus(acStatus);
		}
		int maxPage = PageUtil.getMaxPageForMgr(aticleCommentMapper.getAticleCommentCountForSearch(aticleComment));
		return maxPage;
	}
	
	/**
	 * 获取文章评论的详细情况  有查询条件
	 * @param date
	 * @return visitorsList
	 */
	public List<AticleComment> getForPageListForSearch(Integer nowPageNum ,Long acAticleId ,Integer acStatus){
		PageModelForAticleComment pageModelForAticleComment = new PageModelForAticleComment();
		pageModelForAticleComment.setMaxCount((nowPageNum-1)*BlogConfig.PAGE_SIZE_MGR);
		pageModelForAticleComment.setPageSize(BlogConfig.PAGE_SIZE_MGR);
		pageModelForAticleComment.setAcAticleId(acAticleId);
		pageModelForAticleComment.setAcStatus(acStatus);
		List<AticleComment> aticleCommentListPageForSearch = aticleCommentMapper.getForAticleCommentPageListForSearch(pageModelForAticleComment);
		for (AticleComment aticleComment : aticleCommentListPageForSearch) {
			aticleComment.setAcCreatTimeChange(TimesUtil.getCurrTime(aticleComment.getAcCreatTime()));
		}
		return aticleCommentListPageForSearch;
	}
	
	/**
	 * 获取留言的最大页数
	 * @return
	 */
	public int getCommentCountForAll(){
		int maxPage = PageUtil.getMaxPageForMgr(commentMapper.getCommentCountForAll());
		return maxPage;
	}
	
	/**
	 * 获取留言的详细情况
	 * @param date
	 * @return visitorsList
	 */
	public List<Comment> getComment(Integer nowPageNum){
		PageModel pageModel = new PageModel();
		pageModel.setMaxCount((nowPageNum-1)*BlogConfig.PAGE_SIZE_MGR);
		pageModel.setPageSize(BlogConfig.PAGE_SIZE_MGR);
		List<Comment> commentListPage = commentMapper.getForPageList(pageModel);
		for (Comment comment : commentListPage) {
			comment.setCoCreatTimeChange(TimesUtil.getCurrTime(comment.getCoCreatTime()));
		}
		return commentListPage;
	}
	
	/**
	 * 获取留言的最大页数  有查询条件
	 * @param date
	 * @return
	 */
	public int getCommentCountForSearch(Integer coStatus){
		Comment comment = new Comment();
		if (coStatus != null ) {
			comment.setCoStatus(coStatus);
		}
		int maxPage = PageUtil.getMaxPageForMgr(commentMapper.getCommentCountForSearch(comment));
		return maxPage;
	}
	
	/**
	 * 获取留言的详细情况  有查询条件
	 * @param date
	 * @return visitorsList
	 */
	public List<Comment> getForCommentPageListForSearch(Integer nowPageNum ,Integer coStatus){
		PageModelForComment pageModelForComment = new PageModelForComment();
		pageModelForComment.setMaxCount((nowPageNum-1)*BlogConfig.PAGE_SIZE_MGR);
		pageModelForComment.setPageSize(BlogConfig.PAGE_SIZE_MGR);
		pageModelForComment.setCoStatus(coStatus);
		List<Comment> commentListPageForSearch = commentMapper.getForCommentPageListForSearch(pageModelForComment);
		for (Comment comment : commentListPageForSearch) {
			comment.setCoCreatTimeChange(TimesUtil.getCurrTime(comment.getCoCreatTime()));
		}
		return commentListPageForSearch;
	}
	
	/**
	 * 获取心情的最大页数
	 * @return
	 */
	public int getMoodCountForAll(){
		int maxPage = PageUtil.getMaxPageForMgr(moodMapper.getMoodCountForAll());
		return maxPage;
	}
	
	/**
	 * 获取心情的详细情况
	 * @param date
	 * @return visitorsList
	 */
	public List<Mood> getMood(Integer nowPageNum){
		PageModel pageModel = new PageModel();
		pageModel.setMaxCount((nowPageNum-1)*BlogConfig.PAGE_SIZE_MGR);
		pageModel.setPageSize(BlogConfig.PAGE_SIZE_MGR);
		List<Mood> moodListPage = moodMapper.getForPageList(pageModel);
		for (Mood mood : moodListPage) {
			mood.setMoCreatTimeChange(TimesUtil.getCurrTime(mood.getMoCreatTime()));
		}
		return moodListPage;
	}
	
	/**
	 * 获取心情的最大页数  有查询条件
	 * @param date
	 * @return
	 */
	public int getMoodCountForSearch(Integer moStatus){
		Mood mood = new Mood();
		if (moStatus != null ) {
			mood.setMoStatus(moStatus);
		}
		int maxPage = PageUtil.getMaxPageForMgr(moodMapper.getMoodCountForSearch(mood));
		return maxPage;
	}
	
	/**
	 * 获取心情的详细情况  有查询条件
	 * @param date
	 * @return moodListPageForSearch
	 */
	public List<Mood> getForMoodPageListForSearch(Integer nowPageNum ,Integer moStatus){
		PageModelForMood pageModelForMood = new PageModelForMood();
		pageModelForMood.setMaxCount((nowPageNum-1)*BlogConfig.PAGE_SIZE_MGR);
		pageModelForMood.setPageSize(BlogConfig.PAGE_SIZE_MGR);
		pageModelForMood.setMoStatus(moStatus);
		List<Mood> moodListPageForSearch = moodMapper.getForMoodPageListForSearch(pageModelForMood);
		for (Mood mood : moodListPageForSearch) {
			mood.setMoCreatTimeChange(TimesUtil.getCurrTime(mood.getMoCreatTime()));
		}
		return moodListPageForSearch;
	}
	
	/**
	 * 添加心情
	 * @param context
	 */
	public void addMood(String context){
		Mood mood = new Mood();
		mood.setMoContent(context);
		mood.setMoCreatTime(new Date());
		mood.setMoStatus(1);
		moodMapper.insert(mood);
	}
	
	/**
	 * 获取文章的最大页数
	 * @return
	 */
	public int getAticleCountForAll(){
		int maxPage = PageUtil.getMaxPageForMgr(aticleMapper.getAticleCountForAll());
		return maxPage;
	}
	
	/**
	 * 获取文章的详细情况
	 * @param date
	 * @return visitorsList
	 */
	public List<Aticle> getAticle(Integer nowPageNum){
		AticleTypeExample aticleTypeExample = new AticleTypeExample();
		AticleTypeExample.Criteria	criteriaType =aticleTypeExample.createCriteria();
		criteriaType.andAtIdIsNotNull();
		List<AticleType> listType = aticleTypeMapper.selectByExample(aticleTypeExample);
		PageModel pageModel = new PageModel();
		pageModel.setMaxCount((nowPageNum-1)*BlogConfig.PAGE_SIZE_MGR);
		pageModel.setPageSize(BlogConfig.PAGE_SIZE_MGR);
		List<Aticle> aticleListPage = aticleMapper.getForPageList(pageModel);
		for (Aticle aticle : aticleListPage) {
			aticle.setAtCreatTimeChange(TimesUtil.getCurrTime(aticle.getAtCreatTime()));
			String type = listType.get(Integer.parseInt(aticle.getAtTypeId())-1).getAtType();
			aticle.setAtTypeId(type);
		}
		return aticleListPage;
	}
	
	/**
	 * 获取文章的最大页数  有查询条件
	 * @param date
	 * @return
	 */
	public int getAticleCountForSearch(String atTitle ,Integer atUpIndex ,String atTypeId){
		Aticle aticle = new Aticle();
		if (atTitle != null ) {
			aticle.setAtTitle(atTitle);
		}
		if (atUpIndex != null ) {
			aticle.setAtUpIndex(atUpIndex);
		}
		if (atTypeId != null ) {
			AticleTypeExample aticleTypeExample = new AticleTypeExample();
			AticleTypeExample.Criteria	criteriaType =aticleTypeExample.createCriteria();
			criteriaType.andAtIdIsNotNull();
			List<AticleType> listType = aticleTypeMapper.selectByExample(aticleTypeExample);
			for (AticleType aticleType : listType) {
				if (aticleType.getAtType().equals(atTypeId)) {
					atTypeId = String.valueOf(aticleType.getAtId());
				}
			}
			aticle.setAtTypeId(atTypeId);
		}
		int maxPage = PageUtil.getMaxPageForMgr(aticleMapper.getAticleCountForSearch(aticle));
		return maxPage;
	}
	
	/**
	 * 获取文章的详细情况  有查询条件
	 * @param date
	 * @return moodListPageForSearch
	 */
	public List<Aticle> getForAticlePageListForSearch(Integer nowPageNum ,String atTitle ,Integer atUpIndex ,String atTypeId){
		AticleTypeExample aticleTypeExample = new AticleTypeExample();
		AticleTypeExample.Criteria	criteriaType =aticleTypeExample.createCriteria();
		criteriaType.andAtIdIsNotNull();
		List<AticleType> listType = aticleTypeMapper.selectByExample(aticleTypeExample);
		PageModelForAticle pageModelForAticle = new PageModelForAticle();
		pageModelForAticle.setMaxCount((nowPageNum-1)*BlogConfig.PAGE_SIZE_MGR);
		pageModelForAticle.setPageSize(BlogConfig.PAGE_SIZE_MGR);
		pageModelForAticle.setAtTitle(atTitle);
		pageModelForAticle.setAtUpIndex(atUpIndex);
		if (atTypeId != null ) {
			for (AticleType aticleType : listType) {
				if (aticleType.getAtType().equals(atTypeId)) {
					atTypeId = String.valueOf(aticleType.getAtId());
				}
			}
			pageModelForAticle.setAtTypeId(atTypeId);
		}
		List<Aticle> aticleListPageForSearch = aticleMapper.getForAticlePageListForSearch(pageModelForAticle);
		for (Aticle aticle : aticleListPageForSearch) {
			aticle.setAtCreatTimeChange(TimesUtil.getCurrTime(aticle.getAtCreatTime()));
			String type = listType.get(Integer.parseInt(aticle.getAtTypeId())-1).getAtType();
			aticle.setAtTypeId(type);
		}
		return aticleListPageForSearch;
	}
	
	/**
	 * 添加文章
	 * @param tittle
	 * @param introduction
	 * @param content
	 * @param type
	 */
	public void addAtcile(String tittle, String introduction, String content, String type, String imageUrl) {
		Aticle aticle = new Aticle();
		aticle.setAtTitle(tittle);
		aticle.setAcAuthor("梁钟霖");
		aticle.setAtIntroduction(introduction);
		aticle.setAtImageUrl(imageUrl);
		aticle.setAtContent(content);
		aticle.setAtReadCount(0L);
		aticle.setAtPraiseCount(0L);
		aticle.setAtUpIndex(0);
		aticle.setAtTypeId(type);
		aticle.setAtCreatTime(new Date());
		aticle.setAtModifyTime(new Date());
		aticleMapper.insert(aticle);
	}
	
	/**
	 * 查询文章
	 * @param id
	 * @return
	 */
	public Aticle seleteAtcile(Long id){
		Aticle aticle = aticleMapper.selectByPrimaryKey(id);
		return aticle;
	}
	
	/**
	 * 更新文章
	 * @param tittle
	 * @param introduction
	 * @param content
	 * @param type
	 * @param id
	 */
	public void updateAtcile(String tittle ,String introduction ,String content ,String type ,Long id, String imageUrl){
		Aticle aticle = aticleMapper.selectByPrimaryKey(id);
		aticle.setAtContent(content);
		aticle.setAtTypeId(type);
		aticle.setAtImageUrl(imageUrl);
		aticle.setAtIntroduction(introduction);
		aticle.setAtTitle(tittle);
		aticleMapper.updateByPrimaryKey(aticle);
	}
}
