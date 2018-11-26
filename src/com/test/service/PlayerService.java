package com.test.service;

import java.util.List;

import com.test.pojo.PlayerVo;
import com.test.pojo.PlayerWithBLOBs;
import com.test.pojo.QiuyuananalyseWithBLOBs;

public interface PlayerService {
   public List<PlayerWithBLOBs> selectAll(PlayerVo playervo)throws Exception;
   
   public int insertSelective(PlayerWithBLOBs record) throws Exception;
   
   public int deleteByPrimaryKey(Integer id)throws Exception;
   
   public  PlayerWithBLOBs selectByPrimaryKey(Integer id)throws Exception;
   
   public  int updateByPrimaryKeySelective(PlayerWithBLOBs record)throws Exception;
   
   
}
