package com.test.mapper;

import com.test.pojo.Qiuyuananalyse;
import com.test.pojo.QiuyuananalyseExample;
import com.test.pojo.QiuyuananalyseWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QiuyuananalyseMapper {
    int countByExample(QiuyuananalyseExample example);

    int deleteByExample(QiuyuananalyseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QiuyuananalyseWithBLOBs record);

    int insertSelective(QiuyuananalyseWithBLOBs record);

    List<QiuyuananalyseWithBLOBs> selectByExampleWithBLOBs(QiuyuananalyseExample example);

    List<Qiuyuananalyse> selectByExample(QiuyuananalyseExample example);

    QiuyuananalyseWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QiuyuananalyseWithBLOBs record, @Param("example") QiuyuananalyseExample example);

    int updateByExampleWithBLOBs(@Param("record") QiuyuananalyseWithBLOBs record, @Param("example") QiuyuananalyseExample example);

    int updateByExample(@Param("record") Qiuyuananalyse record, @Param("example") QiuyuananalyseExample example);

    int updateByPrimaryKeySelective(QiuyuananalyseWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(QiuyuananalyseWithBLOBs record);

    int updateByPrimaryKey(Qiuyuananalyse record);
}