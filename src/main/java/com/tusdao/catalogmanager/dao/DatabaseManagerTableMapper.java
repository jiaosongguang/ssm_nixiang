package com.tusdao.catalogmanager.dao;

import com.tusdao.catalogmanager.model.DatabaseManagerTable;
import com.tusdao.catalogmanager.model.DatabaseManagerTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DatabaseManagerTableMapper {
    long countByExample(DatabaseManagerTableExample example);

    int deleteByExample(DatabaseManagerTableExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DatabaseManagerTable record);

    int insertSelective(DatabaseManagerTable record);

    List<DatabaseManagerTable> selectByExample(DatabaseManagerTableExample example);

    DatabaseManagerTable selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DatabaseManagerTable record, @Param("example") DatabaseManagerTableExample example);

    int updateByExample(@Param("record") DatabaseManagerTable record, @Param("example") DatabaseManagerTableExample example);

    int updateByPrimaryKeySelective(DatabaseManagerTable record);

    int updateByPrimaryKey(DatabaseManagerTable record);

    int batchInsert(@Param("recordList") List<DatabaseManagerTable> recordList);
}