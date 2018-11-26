package com.test.mapper;

import com.test.pojo.Player;
import com.test.pojo.PlayerExample;
import com.test.pojo.PlayerVo;
import com.test.pojo.PlayerWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlayerMapper {
    int countByExample(PlayerExample example);

    int deleteByExample(PlayerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PlayerWithBLOBs record);

    int insertSelective(PlayerWithBLOBs record);

    List<PlayerWithBLOBs> selectByExampleWithBLOBs(PlayerExample example);

    List<PlayerWithBLOBs> selectAll(PlayerVo playervo);
    
    List<Player> selectByExample(PlayerExample example);

    PlayerWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PlayerWithBLOBs record, @Param("example") PlayerExample example);

    int updateByExampleWithBLOBs(@Param("record") PlayerWithBLOBs record, @Param("example") PlayerExample example);

    int updateByExample(@Param("record") Player record, @Param("example") PlayerExample example);

    int updateByPrimaryKeySelective(PlayerWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PlayerWithBLOBs record);

    int updateByPrimaryKey(Player record);
}