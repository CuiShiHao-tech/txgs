package server.db.primary.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import server.db.primary.model.WellGtData;

import java.util.List;

@Component
public interface WellGtDataMapper {
    int insert(WellGtData record);

    int insertSelective(WellGtData record);

    WellGtData selectGtById(Long Id);

    List<WellGtData> selectByWellId(@Param("wellId") Long wellId, @Param("timeStart") String timeStart, @Param("timeEnd") String timeEnd );

    List<WellGtData> selectGtBaseByWellId(@Param("wellId") Long wellId, @Param("timeStart") String timeStart, @Param("timeEnd") String timeEnd );

    List<WellGtData> selectGtByTime(@Param("wellId") Long wellId, @Param("sql") String sql, @Param("timeStart") String timeStart, @Param("timeEnd") String timeEnd );

    List<WellGtData> selectGtByTimeCur(@Param("wellId") Long wellId, @Param("sql") String sql);

    List<WellGtData> selectByDay(@Param("wellId") Long wellId, @Param("timeStart") String timeStart, @Param("timeEnd") String timeEnd );
}