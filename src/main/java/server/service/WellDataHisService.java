package server.service;

import server.db.primary.model.WellDataHis;

import java.util.List;

public interface WellDataHisService {
    List<WellDataHis> selectOneDataByWellIdAll(String wellName, String timeStart, String timeEnd);

    List<WellDataHis> selectOneDataByWellId(Long wellId, String timeStart, String timeEnd);

    List<WellDataHis> selectOneDataByTrend(Long wellId, String timeStart, String timeEnd);

    List<WellDataHis> selectOneDataByTrendDay(Long wellId, String timeStart, String timeEnd);

    List<WellDataHis> selectOneDataByTrendHH(Long wellId, String timeStart, String timeEnd);

    List<WellDataHis> selectOneDataByHisDay(Long wellId, String timeStart, String timeEnd);

    List<WellDataHis> selectOneDataByHisHH(Long wellId, String timeStart, String timeEnd);
}
