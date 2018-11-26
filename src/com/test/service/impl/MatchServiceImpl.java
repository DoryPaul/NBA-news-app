package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.mapper.MatchMapper;
import com.test.mapper.ZhiboMapper;
import com.test.pojo.MatchWithBLOBs;
import com.test.pojo.ZhiboWithBLOBs;
import com.test.service.MatchService;

public class MatchServiceImpl implements MatchService{
	@Autowired
	MatchMapper matchMapper;
	
	@Autowired
	ZhiboMapper zhiboMapper;
	@Override
	public int insertmost(MatchWithBLOBs record) throws Exception {
		// TODO Auto-generated method stub
		return matchMapper.insertmost(record);
	}
	@Override
	public List<MatchWithBLOBs> selectAll(MatchWithBLOBs matchWithBLOBs) throws Exception {
		// TODO Auto-generated method stub
		return matchMapper.selectAll(matchWithBLOBs);
	}
	@Override
	public int deleteByPrimaryKey(Integer matchid) throws Exception {
		// TODO Auto-generated method stub
		return matchMapper.deleteByPrimaryKey(matchid);
	}
	@Override
	public MatchWithBLOBs selectByPrimaryKey(Integer matchid) throws Exception {
		// TODO Auto-generated method stub
		return matchMapper.selectByPrimaryKey(matchid);
	}
	@Override
	public int updateByPrimaryKeySelective(MatchWithBLOBs record) throws Exception {
		// TODO Auto-generated method stub
		return matchMapper.updateByPrimaryKeySelective(record);
	}
	@Override
	public int insert(ZhiboWithBLOBs record) throws Exception {
		// TODO Auto-generated method stub
		return zhiboMapper.insert(record);
	}
	@Override
	public List<ZhiboWithBLOBs> selectByMatchid(Integer matchid) throws Exception {
		// TODO Auto-generated method stub
		return zhiboMapper.selectByMatchid(matchid);
	}
	 

}
