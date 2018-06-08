package com.liangzi.blog.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liangzi.blog.dao.AticleMapper;
import com.liangzi.blog.dao.AticleTypeMapper;
import com.liangzi.blog.model.base.Aticle;
import com.liangzi.blog.model.base.AticleExample;
import com.liangzi.blog.model.base.AticleType;
import com.liangzi.blog.model.base.AticleTypeExample;
import com.liangzi.blog.service.IndexService;
import com.liangzi.blog.utils.TimesUtil;

/**
 * <p>Title 		: IndexServiceImpl</p>
 * <p>Description   : 首页ServiceImpl</p>
 * <p>DevelopTools  : Eclipse_x64</p>
 * <p>DevelopSystem : windows10_x64</p>
 * <p>Company 		: com.liangzi</p>
 * @author  		: Liangzi
 * @date 			: 2016年11月22日 下午10:02:23
 * @version 		: 1.0
 */
@Service("indexService")
public class IndexServiceImpl implements IndexService {

	@Autowired
	private AticleMapper aticleMapper;
	@Autowired
	private AticleTypeMapper aticleTypeMapper;

	/**
	 * 获取首页推荐文章信息
	 * 
	 * @return List<Aticle>
	 */
	@Override
	public List<Aticle> geIndex() {
		AticleTypeExample aticleTypeExample = new AticleTypeExample();
		AticleTypeExample.Criteria	criteriaType =aticleTypeExample.createCriteria();
		criteriaType.andAtIdIsNotNull();
		List<AticleType> listType = aticleTypeMapper.selectByExample(aticleTypeExample);
		AticleExample aticleExample = new AticleExample();
		AticleExample.Criteria criteria = aticleExample.createCriteria();
		criteria.andAtUpIndexEqualTo(1);
		List<Aticle> listFroUp = (aticleMapper.selectByExample(aticleExample));
		for (Aticle aicle : listFroUp) {
			aicle.setAtCreatTimeChange(TimesUtil.getCurrTime(aicle.getAtCreatTime()));
			String type = listType.get(Integer.parseInt(aicle.getAtTypeId())-1).getAtType();
			aicle.setAtTypeId(type);
		}
		return listFroUp;
	}

	/**
	 * 获取首页最新文章信息
	 * @return listBynew
	 */
	@Override
	public List<Aticle> getIndexForNew() {
		List<Aticle> listBynew = aticleMapper.selectByOrderAtid();
		return listBynew;
	}

	/**
	 * 获取首页点击率最高文章信息
	 * @return	listByCount
	 */
	@Override
	public List<Aticle> getIndexForCount() {
		List<Aticle> listByCount = aticleMapper.selectByOrderAtReadCount();
		return listByCount;
	}

	/**
	 * 关键词搜索文章
	 * @param searchText
	 * @return
	 */
	public List<Aticle> getSearchAticle(String searchText) {
		AticleExample aticleExample = new AticleExample();
		AticleExample.Criteria criteria = aticleExample.createCriteria();
		criteria.andAtTitleLike(searchText);
		List<Aticle> listBySearch = aticleMapper.selectByExample(aticleExample);
		return listBySearch;
	}
}
