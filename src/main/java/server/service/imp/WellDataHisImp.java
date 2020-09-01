package server.service.imp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.db.primary.mapper.WellDataHisMapper;
import server.db.primary.model.WellDataHis;
import server.service.WellDataHisService;

import java.util.List;

@Service
public class WellDataHisImp implements WellDataHisService {

    @Autowired
    WellDataHisMapper wellDataHisMapper;

    @Override
    public List<WellDataHis> selectOneDataByWellIdAll(String wellName, String timeStart, String timeEnd) {
        List<WellDataHis> wellDataHis = wellDataHisMapper.selectByWellIdAll(wellName, timeStart, timeEnd);
        return wellDataHis;
    }

    @Override
    public List<WellDataHis> selectOneDataByWellId(Long wellId, String timeStart, String timeEnd) {
        List<WellDataHis> wellDataHis = wellDataHisMapper.selectByWellId(wellId, timeStart, timeEnd);
        return wellDataHis;
    }

    @Override
    public List<WellDataHis> selectOneDataByTrend(Long wellId, String timeStart, String timeEnd) {
        List<WellDataHis> wellDataHis = wellDataHisMapper.selectByTrend(wellId, timeStart, timeEnd);
        return wellDataHis;
    }

    @Override
    public List<WellDataHis> selectOneDataByTrendDay(Long wellId, String timeStart, String timeEnd) {
        List<WellDataHis> wellDataHis = wellDataHisMapper.selectByTrendDay(wellId, timeStart, timeEnd);
        return wellDataHis;
    }

    @Override
    public List<WellDataHis> selectOneDataByTrendHH(Long wellId, String timeStart, String timeEnd) {
        List<WellDataHis> wellDataHis = wellDataHisMapper.selectByTrendHH(wellId, timeStart, timeEnd);
        return wellDataHis;
    }

    @Override
    public List<WellDataHis> selectOneDataByHisDay(Long wellId, String timeStart, String timeEnd) {
        List<WellDataHis> wellDataHis = wellDataHisMapper.selectByHisDay(wellId, timeStart, timeEnd);
        return wellDataHis;
    }

    @Override
    public List<WellDataHis> selectOneDataByHisHH(Long wellId, String timeStart, String timeEnd) {
        List<WellDataHis> wellDataHis = wellDataHisMapper.selectByHisHH(wellId, timeStart, timeEnd);
        return wellDataHis;
    }
}
