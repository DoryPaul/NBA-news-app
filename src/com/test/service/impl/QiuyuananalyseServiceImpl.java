package com.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.mapper.QiuyuananalyseMapper;
import com.test.pojo.QiuyuananalyseWithBLOBs;
import com.test.service.QiuyuananalyseService;

public class QiuyuananalyseServiceImpl implements QiuyuananalyseService{
	@Autowired
	private QiuyuananalyseMapper qiuyuananalyseMapper;
	
	@Override
	public int insertSelective(QiuyuananalyseWithBLOBs record) throws Exception {
		// TODO Auto-generated method stub
		return qiuyuananalyseMapper.insertSelective(record);
	}

}
