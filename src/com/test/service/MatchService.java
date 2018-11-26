package com.test.service;

import java.util.List;

import com.test.pojo.MatchWithBLOBs;
import com.test.pojo.ZhiboWithBLOBs;

public interface MatchService {
public int insertmost(MatchWithBLOBs record)throws Exception;

public List<MatchWithBLOBs> selectAll(MatchWithBLOBs matchWithBLOBs)throws Exception;

public  int deleteByPrimaryKey(Integer matchid)throws Exception;

public MatchWithBLOBs selectByPrimaryKey(Integer matchid)throws Exception;

public int updateByPrimaryKeySelective(MatchWithBLOBs record)throws Exception;

public int insert(ZhiboWithBLOBs record)throws Exception;

public  List<ZhiboWithBLOBs> selectByMatchid(Integer  matchid) throws Exception;
 }
