package com.liangzi.blog.dao;

import com.liangzi.blog.model.base.Aticle;
import com.liangzi.blog.model.base.AticleExample;
import com.liangzi.blog.model.extend.PageModel;
import com.liangzi.blog.model.extend.PageModelForAticle;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AticleMapper {
    int countByExample(AticleExample example);

    int deleteByExample(AticleExample example);

    int deleteByPrimaryKey(Long atId);

    int insert(Aticle record);

    int insertSelective(Aticle record);

    List<Aticle> selectByExample(AticleExample example);

    Aticle selectByPrimaryKey(Long atId);

    int updateByExampleSelective(@Param("record") Aticle record, @Param("example") AticleExample example);

    int updateByExample(@Param("record") Aticle record, @Param("example") AticleExample example);

    int updateByPrimaryKeySelective(Aticle record);

    int updateByPrimaryKey(Aticle record);
    
    List<Aticle> selectByOrderAtid();
    
    List<Aticle> selectByOrderAtReadCount();
    
    int selectByTypeForCount(int typeId);
    
    List<Aticle> selectForPage(PageModel pageModel);
    
    List<Aticle> selectForSearch(PageModel pageModel);
    
    int selectForSearchCount(String tittle);
    
    int getAticleCountForAll();
    
    List<Aticle> getForPageList(PageModel pageModel);
    
    int getAticleCountForSearch(Aticle aticle);
    
    List<Aticle> getForAticlePageListForSearch(PageModelForAticle pageModelForAticle);
}