package server.service;

import server.db.primary.model.warn.WarnData;
import server.db.primary.model.warn.WarnDataAndDeal;

import java.math.BigDecimal;
import java.util.List;

public interface WarnDataService {

    int deleteByPrimaryKey(BigDecimal id);

    int insertSelective(WarnData record);

    WarnData selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(WarnData record);

    List<WarnDataAndDeal> selectAll(List<Long> areaIds, String alertKind);

    List<WarnDataAndDeal> Search(List<Long> areaIds, Integer areaId, Integer stationId, String wellName, String alertKind, String alertType, String handleWay, String maintainState, String timeStart, String timeEnd);


}
