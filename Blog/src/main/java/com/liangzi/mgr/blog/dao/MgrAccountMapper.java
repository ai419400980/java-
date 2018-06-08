package com.liangzi.mgr.blog.dao;

import com.liangzi.mgr.blog.model.base.MgrAccount;
import com.liangzi.mgr.blog.model.base.MgrAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MgrAccountMapper {
    int countByExample(MgrAccountExample example);

    int deleteByExample(MgrAccountExample example);

    int deleteByPrimaryKey(Long macId);

    int insert(MgrAccount record);

    int insertSelective(MgrAccount record);

    List<MgrAccount> selectByExample(MgrAccountExample example);

    MgrAccount selectByPrimaryKey(Long macId);

    int updateByExampleSelective(@Param("record") MgrAccount record, @Param("example") MgrAccountExample example);

    int updateByExample(@Param("record") MgrAccount record, @Param("example") MgrAccountExample example);

    int updateByPrimaryKeySelective(MgrAccount record);

    int updateByPrimaryKey(MgrAccount record);
}