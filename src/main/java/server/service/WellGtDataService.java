package server.service;

import server.db.primary.model.WellGtData;

import java.util.List;

public interface WellGtDataService {
    WellGtData selectGtDataById(Long Id);

    List<WellGtData> selectOneDataByWellId(Long wellId, String timeStart, String timeEnd);

    List<WellGtData> selectGtBaseByWellId(Long wellId, String timeStart, String timeEnd);

    List<WellGtData> selectOneDataByTime(Long wellId, String sql, String timeStart, String timeEnd);

    List<WellGtData> selectOneDataByTimeCur(Long wellId, String sql);

    List<WellGtData> selectOneDataByDay(Long wellId, String timeStart, String timeEnd);
}
