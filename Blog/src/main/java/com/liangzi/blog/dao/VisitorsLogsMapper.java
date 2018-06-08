package com.liangzi.blog.dao;

import com.liangzi.blog.model.base.VisitorsLogs;
import com.liangzi.blog.model.base.VisitorsLogsExample;
import com.liangzi.blog.model.extend.PageModel;
import com.liangzi.blog.model.extend.PageModelForVisitorLogs;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VisitorsLogsMapper {
    int countByExample(VisitorsLogsExample example);

    int deleteByExample(VisitorsLogsExample example);

    int deleteByPrimaryKey(Long vlId);

    int insert(VisitorsLogs record);

    int insertSelective(VisitorsLogs record);

    List<VisitorsLogs> selectByExample(VisitorsLogsExample example);

    VisitorsLogs selectByPrimaryKey(Long vlId);

    int updateByExampleSelective(@Param("record") VisitorsLogs record, @Param("example") VisitorsLogsExample example);

    int updateByExample(@Param("record") VisitorsLogs record, @Param("example") VisitorsLogsExample example);

    int updateByPrimaryKeySelective(VisitorsLogs record);

    int updateByPrimaryKey(VisitorsLogs record);
    
    int getVisitForOperation(String date);
    
    int getSearchCount(String date);

    int getMessageCount(String date);
    
    int getPraiseCount(String date);
    
    int getArticleMessageCount(String date);
    
    int getVisitLogsCountForAll();
    
    List<VisitorsLogs> getForPageList(PageModel pageModel);
    
    int getVisitLogsCountForSearch(VisitorsLogs visitorsLogs);
    
    List<VisitorsLogs> getForVisitorsLogsPageListForSearch(PageModelForVisitorLogs pageModelForVisitorLogs);
    
}