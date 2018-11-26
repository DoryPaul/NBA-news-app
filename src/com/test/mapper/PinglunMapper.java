package com.test.mapper;

import com.test.pojo.Pinglun;
import com.test.pojo.PinglunExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PinglunMapper {
    int countByExample(PinglunExample example);

    int deleteByExample(PinglunExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Pinglun record);

    int insertSelective(Pinglun record);

    List<Pinglun> selectByExampleWithBLOBs(PinglunExample example);

    List<Pinglun> selectByExample(PinglunExample example);

    Pinglun selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Pinglun record, @Param("example") PinglunExample example);

    int updateByExampleWithBLOBs(@Param("record") Pinglun record, @Param("example") PinglunExample example);

    int updateByExample(@Param("record") Pinglun record, @Param("example") PinglunExample example);

    int updateByPrimaryKeySelective(Pinglun record);

    int updateByPrimaryKeyWithBLOBs(Pinglun record);

    int updateByPrimaryKey(Pinglun record);
}