package server.db.primary.mapper.map;

import org.apache.ibatis.annotations.Param;
import server.db.primary.model.map.Food;
import server.db.primary.model.map.FoodData;

import java.util.List;

public interface FoodMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Food record);

    int insertSelective(Food record);

    Food selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Food record);

    int updateByPrimaryKey(Food record);

    List<Food> selectByFood(@Param("time") String time);

    List<Food> selectOneByFood(@Param("timeStart") String timeStart, @Param("timeEnd") String timeEnd );
}