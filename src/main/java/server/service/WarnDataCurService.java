package server.service;

import server.db.primary.model.warn.WarnDataCur;

import java.math.BigDecimal;
import java.util.List;

public interface WarnDataCurService {

    int deleteByPrimaryKey(BigDecimal id);

    int insertSelective(WarnDataCur record);

    WarnDataCur selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(WarnDataCur record);

    List<WarnDataCur> selectAll(String alertKind, List<Long> areaIds);

    List<WarnDataCur> Search(Integer areaId, Integer stationId, String wellName, String alertKind, String alertType, String timeStart, String timeEnd, List<Long> areaIds);

    List<WarnDataCur>  selectDistinctWell(List<Long> areaIds, Integer areaId, Integer stationId, String wellName, String alertKind);

    WarnDataCur AlertMark(List<Long> areaIds);

    int deleteMore(String[] Ids);

    int deleteMore1(Integer wellId, String alertKind, String alertType);

    List<WarnDataCur> Search1(Integer areaId, Integer stationId, Integer wellId, String wellName, String alertKind, String alertType, String timeStart, String timeEnd, List<Long> areaIds);

}
