package server.db.primary.mapper.map;

import org.apache.ibatis.annotations.Param;
import server.db.primary.model.map.FoodData;
import java.util.List;

public interface FoodDataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FoodData record);

    int insertSelective(FoodData record);

    FoodData selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FoodData record);

    int updateByPrimaryKey(FoodData record);

    List<FoodData> selectByUserId(@Param("userId") Integer userId, @Param("timeStart") String timeStart, @Param("timeEnd") String timeEnd );

    List<FoodData> selectById(@Param("userId") Integer userId, @Param("timeStart") String timeStart, @Param("timeEnd") String timeEnd );

    List<FoodData> selectByMoney(@Param("stationId") Integer stationId, @Param("timeStart") String timeStart, @Param("timeEnd") String timeEnd );

    List<FoodData> selectBySysdate(@Param("stationId") Integer stationId, @Param("time") String time);

    List<FoodData> selectByDatatime(@Param("stationId") Integer stationId, @Param("time") String time);

}