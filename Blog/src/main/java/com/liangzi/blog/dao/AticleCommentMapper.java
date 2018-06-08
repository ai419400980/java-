package com.liangzi.blog.dao;

import com.liangzi.blog.model.base.AticleComment;
import com.liangzi.blog.model.base.AticleCommentExample;
import com.liangzi.blog.model.extend.PageModel;
import com.liangzi.blog.model.extend.PageModelForAticleComment;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AticleCommentMapper {
    int countByExample(AticleCommentExample example);

    int deleteByExample(AticleCommentExample example);

    int deleteByPrimaryKey(Long acId);

    int insert(AticleComment record);

    int insertSelective(AticleComment record);

    List<AticleComment> selectByExample(AticleCommentExample example);

    AticleComment selectByPrimaryKey(Long acId);

    int updateByExampleSelective(@Param("record") AticleComment record, @Param("example") AticleCommentExample example);

    int updateByExample(@Param("record") AticleComment record, @Param("example") AticleCommentExample example);

    int updateByPrimaryKeySelective(AticleComment record);

    int updateByPrimaryKey(AticleComment record);
    
    int getAticleCommentCountForAll();
    
    List<AticleComment> getAticleComment(PageModel pageModel);
    
    int getAticleCommentCountForSearch(AticleComment aticleComment);
    
    List<AticleComment> getForAticleCommentPageListForSearch(PageModelForAticleComment pageModelForAticleComment);
}