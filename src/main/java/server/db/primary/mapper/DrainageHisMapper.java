package server.db.primary.mapper;

import org.apache.ibatis.annotations.Param;
import server.db.primary.model.DrainageHis;

import java.util.List;

public interface DrainageHisMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DrainageHis record);

    int insertSelective(DrainageHis record);

    DrainageHis selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DrainageHis record);

    int updateByPrimaryKey(DrainageHis record);

    List<DrainageHis> search(@Param("areaIds") List<Long> areaIds,@Param("timeStart") String timeStart,@Param("timeEnd") String timeEnd, @Param("wellName") String wellName);
}