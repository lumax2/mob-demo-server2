package com.mob.demo.mapper;

import com.mob.demo.domain.App;
import com.mob.demo.domain.AppExample;
import com.mob.demo.domain.AppWithBLOBs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AppMapper {
    int countByExample(AppExample example);

    int deleteByExample(AppExample example);

    int deleteByPrimaryKey(Integer appId);

    int insert(AppWithBLOBs record);

    int insertSelective(AppWithBLOBs record);

    List<AppWithBLOBs> selectByExampleWithBLOBs(AppExample example);

    List<App> selectByExample(AppExample example);

    AppWithBLOBs selectByPrimaryKey(Integer appId);

    int updateByExampleSelective(@Param("record") AppWithBLOBs record, @Param("example") AppExample example);

    int updateByExampleWithBLOBs(@Param("record") AppWithBLOBs record, @Param("example") AppExample example);

    int updateByExample(@Param("record") App record, @Param("example") AppExample example);

    int updateByPrimaryKeySelective(AppWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(AppWithBLOBs record);

    int updateByPrimaryKey(App record);
}