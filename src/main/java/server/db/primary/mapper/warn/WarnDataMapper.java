package server.db.primary.mapper.warn;

import org.apache.ibatis.annotations.Param;
import server.db.primary.model.warn.WarnData;
import server.db.primary.model.warn.WarnDataAndDeal;

import java.math.BigDecimal;
import java.util.List;

public interface WarnDataMapper {

    int deleteByPrimaryKey(BigDecimal id);

    int insert(WarnData record);

    int insertSelective(WarnData record);

    WarnData selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(WarnData record);

    int updateByPrimaryKey(WarnData record);

    List<WarnDataAndDeal> selectAll(@Param("areaIds") List<Long> areaIds, @Param("alertKind") String alertKind);

    List<WarnDataAndDeal> Search(@Param("areaIds") List<Long> areaIds, @Param("areaId") Integer areaId, @Param("stationId") Integer stationId, @Param("wellName") String wellName, @Param("alertKind") String alertKind, @Param("alertType") String alertType, @Param("handleWay") String handleWay, @Param("maintainState") String maintainState, @Param("timeStart") String timeStart, @Param("timeEnd") String timeEnd);

}