package com.test.mapper;

import com.test.pojo.Qiutan;
import com.test.pojo.QiutanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QiutanMapper {
    int countByExample(QiutanExample example);

    int deleteByExample(QiutanExample example);

    int deleteByPrimaryKey(Integer qiutanid);

    int insert(Qiutan record);

    int insertSelective(Qiutan record);

    List<Qiutan> selectByExampleWithBLOBs(QiutanExample example);

    List<Qiutan> selectByExample(QiutanExample example);

    Qiutan selectByPrimaryKey(Integer qiutanid);

    int updateByExampleSelective(@Param("record") Qiutan record, @Param("example") QiutanExample example);

    int updateByExampleWithBLOBs(@Param("record") Qiutan record, @Param("example") QiutanExample example);

    int updateByExample(@Param("record") Qiutan record, @Param("example") QiutanExample example);

    int updateByPrimaryKeySelective(Qiutan record);

    int updateByPrimaryKeyWithBLOBs(Qiutan record);
}