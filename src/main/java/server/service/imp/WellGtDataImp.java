package server.service.imp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.db.primary.mapper.WellGtDataMapper;
import server.db.primary.model.WellDataCur;
import server.db.primary.model.WellGtData;
import server.service.WellGtDataService;

import java.util.List;

@Service
public class WellGtDataImp implements WellGtDataService {

    @Autowired
    WellGtDataMapper wellGtDataMapper;

    @Override
    public WellGtData selectGtDataById(Long Id) {
        WellGtData wellGtData = wellGtDataMapper.selectGtById(Id);
        return wellGtData;
    }

    @Override
    public List<WellGtData> selectOneDataByWellId(Long wellId, String timeStart, String timeEnd) {
        List<WellGtData> wellGtData = wellGtDataMapper.selectByWellId(wellId, timeStart, timeEnd);
        return wellGtData;
    }

    @Override
    public List<WellGtData> selectGtBaseByWellId(Long wellId, String timeStart, String timeEnd) {
        List<WellGtData> wellGtData = wellGtDataMapper.selectGtBaseByWellId(wellId, timeStart, timeEnd);
        return wellGtData;
    }

    @Override
    public List<WellGtData> selectOneDataByTime(Long wellId, String sql, String timeStart, String timeEnd) {
        List<WellGtData> wellGtData = wellGtDataMapper.selectGtByTime(wellId, sql, timeStart, timeEnd);
        return wellGtData;
    }

    @Override
    public List<WellGtData> selectOneDataByTimeCur(Long wellId, String sql) {
        List<WellGtData> wellGtData = wellGtDataMapper.selectGtByTimeCur(wellId, sql);
        return wellGtData;
    }

    @Override
    public List<WellGtData> selectOneDataByDay(Long wellId, String timeStart, String timeEnd) {
        List<WellGtData> wellGtData = wellGtDataMapper.selectByDay(wellId, timeStart, timeEnd);
        return wellGtData;
    }

}
