package com.liangzi.mgr.blog.dao;

import com.liangzi.blog.model.extend.PageModel;
import com.liangzi.blog.model.extend.PageModelForBlacklist;
import com.liangzi.mgr.blog.model.base.MgrBlacklist;
import com.liangzi.mgr.blog.model.base.MgrBlacklistExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MgrBlacklistMapper {
    int countByExample(MgrBlacklistExample example);

    int deleteByExample(MgrBlacklistExample example);

    int deleteByPrimaryKey(Long mbId);

    int insert(MgrBlacklist record);

    int insertSelective(MgrBlacklist record);

    List<MgrBlacklist> selectByExample(MgrBlacklistExample example);

    MgrBlacklist selectByPrimaryKey(Long mbId);

    int updateByExampleSelective(@Param("record") MgrBlacklist record, @Param("example") MgrBlacklistExample example);

    int updateByExample(@Param("record") MgrBlacklist record, @Param("example") MgrBlacklistExample example);

    int updateByPrimaryKeySelective(MgrBlacklist record);

    int updateByPrimaryKey(MgrBlacklist record);
    
    void updateByIp(String ip);

    void updateByIpSql(String ip);
    
    int getBlacklistCountForAll();
    
    List<MgrBlacklist> getForPageList(PageModel pageModel);
    
    int getBlacklistCountForSearch(MgrBlacklist mgrBlacklist);
    
    List<MgrBlacklist> getForBlacklistPageListForSearch(PageModelForBlacklist pageModelForBlacklist);
}