package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.mapper.Newinfo1Mapper;
import com.test.pojo.Newinfo1WithBLOBs;
import com.test.pojo.Newsinfo1Vo;
import com.test.service.Newinfo1Service;

public class Newinfo1ServiceImpl implements Newinfo1Service{
	@Autowired
	private Newinfo1Mapper newinfo1Mapper; 
	
	public  int insertSelective(Newinfo1WithBLOBs record)throws Exception{
		return newinfo1Mapper.insertSelective(record);
	}
	
	public  List<Newinfo1WithBLOBs> selectAll(Newsinfo1Vo newsinfo1Vo)throws Exception{
		return newinfo1Mapper.selectAll(newsinfo1Vo);
	}

	@Override
	public Newinfo1WithBLOBs selectByPrimaryKey(Integer newsid) throws Exception {
		// TODO Auto-generated method stub
		return newinfo1Mapper.selectByPrimaryKey(newsid);
	}

	@Override
	public int updateByPrimaryKeySelective(Newinfo1WithBLOBs record) throws Exception {
		// TODO Auto-generated method stub
		return newinfo1Mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer newsid) throws Exception {
		// TODO Auto-generated method stub
		return newinfo1Mapper.deleteByPrimaryKey(newsid);
	}
}
