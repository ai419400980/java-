package com.liangzi.blog.dao;

import com.liangzi.blog.model.base.Mood;
import com.liangzi.blog.model.base.MoodExample;
import com.liangzi.blog.model.extend.PageModel;
import com.liangzi.blog.model.extend.PageModelForMood;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MoodMapper {
    int countByExample(MoodExample example);

    int deleteByExample(MoodExample example);

    int deleteByPrimaryKey(Long moId);

    int insert(Mood record);

    int insertSelective(Mood record);

    List<Mood> selectByExampleWithBLOBs(MoodExample example);

    List<Mood> selectByExample(MoodExample example);

    Mood selectByPrimaryKey(Long moId);

    int updateByExampleSelective(@Param("record") Mood record, @Param("example") MoodExample example);

    int updateByExampleWithBLOBs(@Param("record") Mood record, @Param("example") MoodExample example);

    int updateByExample(@Param("record") Mood record, @Param("example") MoodExample example);

    int updateByPrimaryKeySelective(Mood record);

    int updateByPrimaryKeyWithBLOBs(Mood record);

    int updateByPrimaryKey(Mood record);
    
    int selectForCount(int status);
    
    List<Mood> selectForMood(PageModel pageModel);
    
    int getMoodCountForAll();
    
    List<Mood> getForPageList(PageModel pageModel);
    
    int getMoodCountForSearch(Mood mood);
    
    List<Mood> getForMoodPageListForSearch(PageModelForMood pageModelForMood);
}