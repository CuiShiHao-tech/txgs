package server.db.primary.mapper.warn;

import org.apache.ibatis.annotations.Param;
import server.db.primary.model.warn.WarnDataCur;

import java.math.BigDecimal;
import java.util.List;


public interface WarnDataCurMapper {

    int deleteByPrimaryKey(BigDecimal id);

    int insert(WarnDataCur record);

    int insertSelective(WarnDataCur record);

    WarnDataCur selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(WarnDataCur record);

    int updateByPrimaryKey(WarnDataCur record);

    List<WarnDataCur> selectAll(@Param("alertKind") String alertKind, @Param("areaIds") List<Long> areaIds);

    List<WarnDataCur> Search(@Param("areaId") Integer areaId, @Param("stationId") Integer stationId, @Param("wellName") String wellName, @Param("alertKind") String alertKind, @Param("alertType") String alertType, @Param("timeStart") String timeStart, @Param("timeEnd") String timeEnd, @Param("areaIds") List<Long> areaIds);

    List<WarnDataCur>  selectDistinctWell(@Param("areaIds") List<Long> areaIds, @Param("areaId") Integer areaId, @Param("stationId") Integer stationId, @Param("wellName") String wellName, @Param("alertKind") String alertKind);

    WarnDataCur  AlertMark(@Param("areaIds") List<Long> areaIds);

    int deleteMore(@Param("Ids") String[] Ids);

    int deleteMore1(@Param("wellId") Integer wellId, @Param("alertKind") String alertKind, @Param("alertType") String alertType);

    List<WarnDataCur> Search1(@Param("areaId") Integer areaId, @Param("stationId") Integer stationId, @Param("wellId") Integer wellId, @Param("wellName") String wellName, @Param("alertKind") String alertKind, @Param("alertType") String alertType, @Param("timeStart") String timeStart, @Param("timeEnd") String timeEnd, @Param("areaIds") List<Long> areaIds);

}