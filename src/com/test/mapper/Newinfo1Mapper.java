package com.test.mapper;

import com.test.pojo.Newinfo1;
import com.test.pojo.Newinfo1Example;
import com.test.pojo.Newinfo1WithBLOBs;
import com.test.pojo.Newsinfo1Vo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Newinfo1Mapper {
    int countByExample(Newinfo1Example example);

    int deleteByExample(Newinfo1Example example);

    int deleteByPrimaryKey(Integer newsid);

    int insert(Newinfo1WithBLOBs record);

    int insertSelective(Newinfo1WithBLOBs record);

    List<Newinfo1WithBLOBs> selectByExampleWithBLOBs(Newinfo1Example example);
    
    List<Newinfo1WithBLOBs> selectAll(Newsinfo1Vo newsinfo1Vo);

    List<Newinfo1> selectByExample(Newinfo1Example example);

    Newinfo1WithBLOBs selectByPrimaryKey(Integer newsid);

    int updateByExampleSelective(@Param("record") Newinfo1WithBLOBs record, @Param("example") Newinfo1Example example);

    int updateByExampleWithBLOBs(@Param("record") Newinfo1WithBLOBs record, @Param("example") Newinfo1Example example);

    int updateByExample(@Param("record") Newinfo1 record, @Param("example") Newinfo1Example example);

    int updateByPrimaryKeySelective(Newinfo1WithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(Newinfo1WithBLOBs record);

    int updateByPrimaryKey(Newinfo1 record);
}