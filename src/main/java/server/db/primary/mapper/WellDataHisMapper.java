package server.db.primary.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import server.db.primary.model.WellDataHis;

import java.util.List;

@Component
public interface WellDataHisMapper {
    int insert(WellDataHis record);

    int insertSelective(WellDataHis record);

    List<WellDataHis> selectByWellIdAll(@Param("wellName") String wellName, @Param("timeStart") String timeStart, @Param("timeEnd") String timeEnd );

    List<WellDataHis> selectByWellId(@Param("wellId") Long wellId, @Param("timeStart") String timeStart, @Param("timeEnd") String timeEnd );

    List<WellDataHis> selectByTrend(@Param("wellId") Long wellId, @Param("timeStart") String timeStart, @Param("timeEnd") String timeEnd );

    List<WellDataHis> selectByTrendDay(@Param("wellId") Long wellId, @Param("timeStart") String timeStart, @Param("timeEnd") String timeEnd );

    List<WellDataHis> selectByTrendHH(@Param("wellId") Long wellId, @Param("timeStart") String timeStart, @Param("timeEnd") String timeEnd );

    List<WellDataHis> selectByHisDay(@Param("wellId") Long wellId, @Param("timeStart") String timeStart, @Param("timeEnd") String timeEnd );

    List<WellDataHis> selectByHisHH(@Param("wellId") Long wellId, @Param("timeStart") String timeStart, @Param("timeEnd") String timeEnd );


}