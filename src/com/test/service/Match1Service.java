package com.test.service;

import java.util.List;

import com.test.pojo.Match1;
import com.test.pojo.MatchWithBLOBs;
import com.test.pojo.ZhiboWithBLOBs;

public interface Match1Service {
/*public int insertmost(MatchWithBLOBs record)throws Exception;

public List<MatchWithBLOBs> selectAll(MatchWithBLOBs matchWithBLOBs)throws Exception;

public  int deleteByPrimaryKey(Integer matchid)throws Exception;

public MatchWithBLOBs selectByPrimaryKey(Integer matchid)throws Exception;

public int updateByPrimaryKeySelective(MatchWithBLOBs record)throws Exception;

public int insert(ZhiboWithBLOBs record)throws Exception;

public  List<ZhiboWithBLOBs> selectByMatchid(Integer  matchid) throws Exception;*/
	public int insertSelective(Match1 record)throws Exception;
	
	public List<Match1> selectAll(Match1 record)throws Exception;
	
	public int deleteByPrimaryKey(Integer id)throws Exception;
	
	public Match1 selectByPrimaryKey(Integer id)throws Exception;
	
	public int updateByPrimaryKeySelective(Match1 record)throws Exception;
	

	public int insert(ZhiboWithBLOBs record)throws Exception;

	public  List<ZhiboWithBLOBs> selectByMatchid(Integer  matchid) throws Exception;
	
	public List<Match1> selectStart(Match1 record)throws Exception;
	    
	   public List<Match1> selectEnd(Match1 record)throws Exception;
 }
