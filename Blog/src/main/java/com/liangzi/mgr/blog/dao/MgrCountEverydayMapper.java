package com.liangzi.mgr.blog.dao;

import com.liangzi.blog.model.extend.PageModel;
import com.liangzi.mgr.blog.model.base.MgrCountEveryday;
import com.liangzi.mgr.blog.model.base.MgrCountEverydayExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MgrCountEverydayMapper {
    int countByExample(MgrCountEverydayExample example);

    int deleteByExample(MgrCountEverydayExample example);

    int deleteByPrimaryKey(Long mceId);

    int insert(MgrCountEveryday record);

    int insertSelective(MgrCountEveryday record);

    List<MgrCountEveryday> selectByExample(MgrCountEverydayExample example);

    MgrCountEveryday selectByPrimaryKey(Long mceId);

    int updateByExampleSelective(@Param("record") MgrCountEveryday record, @Param("example") MgrCountEverydayExample example);

    int updateByExample(@Param("record") MgrCountEveryday record, @Param("example") MgrCountEverydayExample example);

    int updateByPrimaryKeySelective(MgrCountEveryday record);

    int updateByPrimaryKey(MgrCountEveryday record);
    
    int getEveryDayLogsCountForAll();
    
    List<MgrCountEveryday> getEveryDayLogs(PageModel pageModel);
}