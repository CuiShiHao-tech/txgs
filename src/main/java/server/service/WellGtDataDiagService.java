package server.service;

import server.db.primary.model.WellGtDataDiag;
import server.db.primary.model.WellGtDataDiagCur;
import server.db.primary.model.WellGtDataZyDiag;

import java.util.List;

public interface WellGtDataDiagService {
    List<WellGtDataDiagCur> selectOneDataByNcount(Integer objId);

    List<WellGtDataDiagCur> selectOneDataByObjId(String wellName,Integer objId);

    List<WellGtDataDiagCur> selectOneDataByNo(String wellName,Integer objId);

    WellGtDataDiag selectOneDataByGtRespId(Integer gtRespId);

    List<WellGtDataDiag> selectOneDataByWellId(Integer wellId, String wellName, String timeStart, String timeEnd,Integer objId);

    WellGtDataZyDiag selectOneDataByGtRespIdZy(Integer gtRespId);
}
