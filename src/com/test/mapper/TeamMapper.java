package com.test.mapper;

import com.test.pojo.Team;
import com.test.pojo.TeamExample;
import com.test.pojo.TeamWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamMapper {
    int countByExample(TeamExample example);

    int deleteByExample(TeamExample example);

    int deleteByPrimaryKey(Integer teamid);

    int insert(TeamWithBLOBs record);

    int insertSelective(TeamWithBLOBs record);

    List<TeamWithBLOBs> selectByExampleWithBLOBs(TeamExample example);

    List<Team> selectByExample(TeamExample example);

    TeamWithBLOBs selectByPrimaryKey(Integer teamid);

    int updateByExampleSelective(@Param("record") TeamWithBLOBs record, @Param("example") TeamExample example);

    int updateByExampleWithBLOBs(@Param("record") TeamWithBLOBs record, @Param("example") TeamExample example);

    int updateByExample(@Param("record") Team record, @Param("example") TeamExample example);

    int updateByPrimaryKeySelective(TeamWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TeamWithBLOBs record);

    int updateByPrimaryKey(Team record);
}