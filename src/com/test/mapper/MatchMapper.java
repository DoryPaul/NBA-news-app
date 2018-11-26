package com.test.mapper;

import com.test.pojo.Match;
import com.test.pojo.MatchExample;
import com.test.pojo.MatchWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MatchMapper {
    int countByExample(MatchExample example);

    int deleteByExample(MatchExample example);

    int deleteByPrimaryKey(Integer matchid);

    int insert(MatchWithBLOBs record);

    int insertSelective(MatchWithBLOBs record);
    
    int insertmost(MatchWithBLOBs record);

    List<MatchWithBLOBs> selectByExampleWithBLOBs(MatchExample example);
    
    List<MatchWithBLOBs> selectAll(MatchWithBLOBs matchWithBLOBs);

    List<Match> selectByExample(MatchExample example);

    MatchWithBLOBs selectByPrimaryKey(Integer matchid);

    int updateByExampleSelective(@Param("record") MatchWithBLOBs record, @Param("example") MatchExample example);

    int updateByExampleWithBLOBs(@Param("record") MatchWithBLOBs record, @Param("example") MatchExample example);

    int updateByExample(@Param("record") Match record, @Param("example") MatchExample example);

    int updateByPrimaryKeySelective(MatchWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MatchWithBLOBs record);

    int updateByPrimaryKey(Match record);
}