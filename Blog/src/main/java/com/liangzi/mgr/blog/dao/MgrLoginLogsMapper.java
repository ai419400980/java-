package com.liangzi.mgr.blog.dao;

import com.liangzi.blog.model.extend.PageModel;
import com.liangzi.blog.model.extend.PageModelForLoginLogs;
import com.liangzi.mgr.blog.model.base.MgrLoginLogs;
import com.liangzi.mgr.blog.model.base.MgrLoginLogsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MgrLoginLogsMapper {
    int countByExample(MgrLoginLogsExample example);

    int deleteByExample(MgrLoginLogsExample example);

    int deleteByPrimaryKey(Long mllId);

    int insert(MgrLoginLogs record);

    int insertSelective(MgrLoginLogs record);

    List<MgrLoginLogs> selectByExample(MgrLoginLogsExample example);

    MgrLoginLogs selectByPrimaryKey(Long mllId);

    int updateByExampleSelective(@Param("record") MgrLoginLogs record, @Param("example") MgrLoginLogsExample example);

    int updateByExample(@Param("record") MgrLoginLogs record, @Param("example") MgrLoginLogsExample example);

    int updateByPrimaryKeySelective(MgrLoginLogs record);

    int updateByPrimaryKey(MgrLoginLogs record);
    
    int getLoginLogsCountForAll();
    
    List<MgrLoginLogs> getForPageList(PageModel pageModel);
    
    int getLoginLogsCountForSearch(MgrLoginLogs MgrLoginLogs);
    
    List<MgrLoginLogs> getForVisitorsLogsPageListForSearch(PageModelForLoginLogs pageModelForLoginLogs);
}