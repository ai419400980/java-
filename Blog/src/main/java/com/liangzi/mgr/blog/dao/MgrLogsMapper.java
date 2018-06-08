package com.liangzi.mgr.blog.dao;

import com.liangzi.blog.model.extend.PageModel;
import com.liangzi.blog.model.extend.PageModelForLoginOperationLogin;
import com.liangzi.mgr.blog.model.base.MgrLogs;
import com.liangzi.mgr.blog.model.base.MgrLogsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MgrLogsMapper {
    int countByExample(MgrLogsExample example);

    int deleteByExample(MgrLogsExample example);

    int deleteByPrimaryKey(Long mlId);

    int insert(MgrLogs record);

    int insertSelective(MgrLogs record);

    List<MgrLogs> selectByExample(MgrLogsExample example);

    MgrLogs selectByPrimaryKey(Long mlId);

    int updateByExampleSelective(@Param("record") MgrLogs record, @Param("example") MgrLogsExample example);

    int updateByExample(@Param("record") MgrLogs record, @Param("example") MgrLogsExample example);

    int updateByPrimaryKeySelective(MgrLogs record);

    int updateByPrimaryKey(MgrLogs record);
    
    int getLoginOperationCountForAll();
    
    List<MgrLogs> getForPageList(PageModel pageModel);
    
    int getLoginOperationCountForSearch(MgrLogs MgrLogs);
    
    List<MgrLogs> getForLoginOperationPageListForSearch(PageModelForLoginOperationLogin pageModelForLoginOperation);
}