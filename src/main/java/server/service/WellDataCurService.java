package server.service;

import server.db.primary.model.WellDataCur;

import java.util.List;
import java.util.Map;

public interface WellDataCurService {

    List<WellDataCur> selectOneDataByWellIdAll(String sqlrun, String wellName, Integer objId);

    WellDataCur selectOneDataByWellId(Long wellId, Integer objId);

    WellDataCur selectOneDataByday(Integer objId);

    long Ncount(long state, Integer objId);

    Map selectIndexByNcount(Integer objId, String timeStart, String timeEnd);
}
