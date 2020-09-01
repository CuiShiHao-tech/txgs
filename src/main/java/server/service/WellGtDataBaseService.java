package server.service;

import server.db.primary.model.WellGtDataBase;

import java.util.List;

public interface WellGtDataBaseService {
    WellGtDataBase selectOneDataByWellId(Long wellId);

    WellGtDataBase selectOneDataBaseByWellId(Long wellId);

    int insertOneDataBaseByWellId(WellGtDataBase record);

    int updateOneDataBaseByWellId(WellGtDataBase record);

    List<WellGtDataBase> selectOneDataByWellIdAll(Integer areaId, Integer stationId, String wellName,Integer objId);


}
