package com.liangzi.blog.dao;

import com.liangzi.blog.model.base.Visitors;
import com.liangzi.blog.model.base.VisitorsExample;
import com.liangzi.blog.model.extend.PageModel;
import com.liangzi.blog.model.extend.PageModelForVisitor;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VisitorsMapper {
    int countByExample(VisitorsExample example);

    int deleteByExample(VisitorsExample example);

    int deleteByPrimaryKey(Long viId);

    int insert(Visitors record);

    int insertSelective(Visitors record);

    List<Visitors> selectByExample(VisitorsExample example);

    Visitors selectByPrimaryKey(Long viId);

    int updateByExampleSelective(@Param("record") Visitors record, @Param("example") VisitorsExample example);

    int updateByExample(@Param("record") Visitors record, @Param("example") VisitorsExample example);

    int updateByPrimaryKeySelective(Visitors record);

    int updateByPrimaryKey(Visitors record);
    
    int getVisitCount(String date);
    
    int getVisitCountForWeb(String date);
    
    int getVisitCountForPhone(String date);
    
    List<Visitors> getForPageList(PageModel pageModel);
    
    List<Visitors> getForPageListForSearch(PageModelForVisitor pageModelForVisitor);
    
    int getVisitCountForAll();

    int getVisitCountForSearch(Visitors visitors);
}