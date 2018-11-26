package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.mapper.Match1Mapper;
import com.test.mapper.ZhiboMapper;
import com.test.pojo.Match1;
import com.test.pojo.MatchWithBLOBs;
import com.test.pojo.ZhiboWithBLOBs;
import com.test.service.Match1Service;

public class Match1ServiceImpl implements Match1Service {
	@Autowired
	Match1Mapper match1Mapper;
	@Autowired
	ZhiboMapper zhiboMapper;
	@Override
	public int insertSelective(Match1 record) throws Exception {
		// TODO Auto-generated method stub
		return match1Mapper.insertSelective(record);
	}
	@Override
	public List<Match1> selectAll(Match1 record) throws Exception {
		// TODO Auto-generated method stub
		return match1Mapper.selectAll(record);
	}
	@Override
	public int deleteByPrimaryKey(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return match1Mapper.deleteByPrimaryKey(id);
	}
	@Override
	public Match1 selectByPrimaryKey(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return match1Mapper.selectByPrimaryKey(id);
	}
	@Override
	public int updateByPrimaryKeySelective(Match1 record) throws Exception {
		// TODO Auto-generated method stub
		return match1Mapper.updateByPrimaryKeySelective(record);
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
	@Override
	public List<Match1> selectStart(Match1 record) throws Exception {
		// TODO Auto-generated method stub
		return match1Mapper.selectStart(record);
	}
	@Override
	public List<Match1> selectEnd(Match1 record) throws Exception {
		// TODO Auto-generated method stub
		return match1Mapper.selectEnd(record);
	}

}
