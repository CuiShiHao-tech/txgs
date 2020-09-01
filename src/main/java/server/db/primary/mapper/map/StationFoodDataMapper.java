package server.db.primary.mapper.map;

import org.apache.ibatis.annotations.Param;
import server.db.primary.model.map.FoodData;
import server.db.primary.model.map.StationFoodData;

import java.util.List;

public interface StationFoodDataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(StationFoodData record);

    int insertSelective(StationFoodData record);

    StationFoodData selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(StationFoodData record);

    int updateByPrimaryKey(StationFoodData record);

    List<StationFoodData> selectByStationId(@Param("stationId") Integer stationId, @Param("timeStart") String timeStart, @Param("timeEnd") String timeEnd );

    List<StationFoodData> selectByHisdate(@Param("stationId") Integer stationId, @Param("timeStart") String timeStart, @Param("timeEnd") String timeEnd );


}