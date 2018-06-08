package com.liangzi.blog.dao;

import com.liangzi.blog.model.base.Comment;
import com.liangzi.blog.model.base.CommentExample;
import com.liangzi.blog.model.extend.PageModel;
import com.liangzi.blog.model.extend.PageModelForComment;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentMapper {
    int countByExample(CommentExample example);

    int deleteByExample(CommentExample example);

    int deleteByPrimaryKey(Long coId);

    int insert(Comment record);

    int insertSelective(Comment record);

    List<Comment> selectByExampleWithBLOBs(CommentExample example);

    List<Comment> selectByExample(CommentExample example);

    Comment selectByPrimaryKey(Long coId);

    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByExampleWithBLOBs(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKeyWithBLOBs(Comment record);

    int updateByPrimaryKey(Comment record);
    
    int selectForCount(int status);
    
    List<Comment> selectForComment(PageModel pageModel);
    
    int getCommentCountForAll();
    
    List<Comment> getForPageList(PageModel pageModel);
    
    int getCommentCountForSearch(Comment comment);
    
    List<Comment> getForCommentPageListForSearch(PageModelForComment pageModelForComment);
}