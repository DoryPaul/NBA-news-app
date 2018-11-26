package com.test.mapper;

import com.test.pojo.Fine;
import com.test.pojo.FineExample;
import com.test.pojo.FineWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FineMapper {
    int countByExample(FineExample example);

    int deleteByExample(FineExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FineWithBLOBs record);

    int insertSelective(FineWithBLOBs record);

    List<FineWithBLOBs> selectByExampleWithBLOBs(FineExample example);

    List<Fine> selectByExample(FineExample example);

    FineWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FineWithBLOBs record, @Param("example") FineExample example);

    int updateByExampleWithBLOBs(@Param("record") FineWithBLOBs record, @Param("example") FineExample example);

    int updateByExample(@Param("record") Fine record, @Param("example") FineExample example);

    int updateByPrimaryKeySelective(FineWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(FineWithBLOBs record);

    int updateByPrimaryKey(Fine record);
}