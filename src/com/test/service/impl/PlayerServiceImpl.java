package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.mapper.PlayerMapper;
import com.test.mapper.QiuyuananalyseMapper;
import com.test.pojo.PlayerVo;
import com.test.pojo.PlayerWithBLOBs;
import com.test.pojo.QiuyuananalyseWithBLOBs;
import com.test.service.PlayerService;

public class PlayerServiceImpl implements PlayerService{
	@Autowired
	private PlayerMapper playerMapper;
	
	@Override
	public List<PlayerWithBLOBs> selectAll(PlayerVo playervo) throws Exception {
		// TODO Auto-generated method stub
		return playerMapper.selectAll(playervo);
	}
	@Override
	public  int insertSelective(PlayerWithBLOBs record) throws Exception {
		// TODO Auto-generated method stub
		return playerMapper.insertSelective(record);
	}
	@Override
	public int deleteByPrimaryKey(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return playerMapper.deleteByPrimaryKey(id);
	}
	@Override
	public PlayerWithBLOBs selectByPrimaryKey(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return playerMapper.selectByPrimaryKey(id);
	}
	@Override
	public int updateByPrimaryKeySelective(PlayerWithBLOBs record) throws Exception {
		// TODO Auto-generated method stub
		return playerMapper.updateByPrimaryKeySelective(record);
	}
	

}
