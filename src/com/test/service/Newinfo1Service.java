package com.test.service;

import java.util.List;

import com.test.pojo.Newinfo1WithBLOBs;
import com.test.pojo.Newsinfo1Vo;

public interface Newinfo1Service {
public  int insertSelective(Newinfo1WithBLOBs record)throws Exception;

public  List<Newinfo1WithBLOBs> selectAll(Newsinfo1Vo newsinfo1Vo)throws Exception;

public Newinfo1WithBLOBs selectByPrimaryKey(Integer newsid)throws Exception;

public int updateByPrimaryKeySelective(Newinfo1WithBLOBs record) throws Exception;

public int deleteByPrimaryKey(Integer newsid)throws Exception;
}
