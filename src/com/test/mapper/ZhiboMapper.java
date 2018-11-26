package com.test.mapper;

import com.test.pojo.Zhibo;
import com.test.pojo.ZhiboExample;
import com.test.pojo.ZhiboWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZhiboMapper {
    int countByExample(ZhiboExample example);

    int deleteByExample(ZhiboExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZhiboWithBLOBs record);

    int insertSelective(ZhiboWithBLOBs record);

    List<ZhiboWithBLOBs> selectByExampleWithBLOBs(ZhiboExample example);

    List<ZhiboWithBLOBs> selectByMatchid(Integer  matchid);
    
    List<Zhibo> selectByExample(ZhiboExample example);

    ZhiboWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZhiboWithBLOBs record, @Param("example") ZhiboExample example);

    int updateByExampleWithBLOBs(@Param("record") ZhiboWithBLOBs record, @Param("example") ZhiboExample example);

    int updateByExample(@Param("record") Zhibo record, @Param("example") ZhiboExample example);

    int updateByPrimaryKeySelective(ZhiboWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ZhiboWithBLOBs record);

    int updateByPrimaryKey(Zhibo record);
}