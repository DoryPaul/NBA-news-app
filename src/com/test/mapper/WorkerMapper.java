package com.test.mapper;

import com.test.pojo.Worker;
import com.test.pojo.WorkerExample;
import com.test.pojo.WorkerWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkerMapper {
    int countByExample(WorkerExample example);

    int deleteByExample(WorkerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WorkerWithBLOBs record);

    int insertSelective(WorkerWithBLOBs record);

    List<WorkerWithBLOBs> selectByExampleWithBLOBs(WorkerExample example);

    List<Worker> selectByExample(WorkerExample example);

    WorkerWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WorkerWithBLOBs record, @Param("example") WorkerExample example);

    int updateByExampleWithBLOBs(@Param("record") WorkerWithBLOBs record, @Param("example") WorkerExample example);

    int updateByExample(@Param("record") Worker record, @Param("example") WorkerExample example);

    int updateByPrimaryKeySelective(WorkerWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(WorkerWithBLOBs record);

    int updateByPrimaryKey(Worker record);
}