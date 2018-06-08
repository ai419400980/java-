package com.liangzi.blog.dao;

import com.liangzi.blog.model.base.AticleType;
import com.liangzi.blog.model.base.AticleTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AticleTypeMapper {
    int countByExample(AticleTypeExample example);

    int deleteByExample(AticleTypeExample example);

    int deleteByPrimaryKey(Long atId);

    int insert(AticleType record);

    int insertSelective(AticleType record);

    List<AticleType> selectByExample(AticleTypeExample example);

    AticleType selectByPrimaryKey(Long atId);

    int updateByExampleSelective(@Param("record") AticleType record, @Param("example") AticleTypeExample example);

    int updateByExample(@Param("record") AticleType record, @Param("example") AticleTypeExample example);

    int updateByPrimaryKeySelective(AticleType record);

    int updateByPrimaryKey(AticleType record);
}