package com.test.mapper;

import com.test.pojo.Match1;
import com.test.pojo.Match1Example;
import com.test.pojo.MatchWithBLOBs;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Match1Mapper {
    int countByExample(Match1Example example);

    int deleteByExample(Match1Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(Match1 record);

    int insertSelective(Match1 record);
    
    List<Match1> selectAll(Match1 record);
    
    List<Match1> selectStart(Match1 record);
    
    List<Match1> selectEnd(Match1 record);
    
    List<Match1> selectByExample(Match1Example example);

    Match1 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Match1 record, @Param("example") Match1Example example);

    int updateByExample(@Param("record") Match1 record, @Param("example") Match1Example example);

    int updateByPrimaryKeySelective(Match1 record);

    int updateByPrimaryKey(Match1 record);
}