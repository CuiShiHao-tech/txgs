package server.db.primary.mapper.map;

import org.apache.ibatis.annotations.Param;
import server.db.primary.model.map.SysControlLog;

import java.util.List;

public interface SysControlLogMapper {
    int deleteByPrimaryKey(Short id);

    int insert(SysControlLog record);

    int insertSelective(SysControlLog record);

    SysControlLog selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(SysControlLog record);

    int updateByPrimaryKey(SysControlLog record);

    List<SysControlLog> search(@Param("wellName") String wellName,@Param("timeStart") String timeStart,@Param("timeEnd")String timeEnd);
}