package server.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.db.primary.mapper.WellGtDataDiagCurMapper;
import server.db.primary.mapper.WellGtDataDiagMapper;
import server.db.primary.mapper.WellGtDataZyDiagMapper;
import server.db.primary.model.WellGtDataDiag;
import server.db.primary.model.WellGtDataDiagCur;
import server.db.primary.model.WellGtDataZyDiag;
import server.service.WellGtDataDiagService;

import java.util.List;

@Service
public class WellGtDataDiagImp implements WellGtDataDiagService {
    @Autowired
    WellGtDataDiagCurMapper wellGtDataDiagCurMapper;
    @Autowired
    WellGtDataDiagMapper wellGtDataDiagMapper;
    @Autowired
    WellGtDataZyDiagMapper wellGtDataZyDiagMapper;

    @Override
    public List<WellGtDataDiagCur> selectOneDataByNcount(Integer objId) {
        List<WellGtDataDiagCur> wellGtDataDiagCur = wellGtDataDiagCurMapper.selectNcountByObjId(objId);
        return wellGtDataDiagCur;
    }

    @Override
    public List<WellGtDataDiagCur> selectOneDataByObjId(String wellName,Integer objId) {
        List<WellGtDataDiagCur> wellGtDataDiagCur = wellGtDataDiagCurMapper.selectByObjId(wellName,objId);
        return wellGtDataDiagCur;
    }

    @Override
    public List<WellGtDataDiagCur> selectOneDataByNo(String wellName,Integer objId) {
        List<WellGtDataDiagCur> wellGtDataDiagCur = wellGtDataDiagCurMapper.selectByNo(wellName,objId);
        return wellGtDataDiagCur;
    }

    @Override
    public WellGtDataDiag selectOneDataByGtRespId(Integer gtRespId) {
        WellGtDataDiag wellGtDataDiag = wellGtDataDiagMapper.selectByGtRespId(gtRespId);
        return wellGtDataDiag;
    }

    @Override
    public List<WellGtDataDiag> selectOneDataByWellId(Integer wellId, String wellName, String timeStart, String timeEnd,Integer objId) {
        List<WellGtDataDiag> wellGtDataDiag = wellGtDataDiagMapper.selectByWellId(wellId, wellName,timeStart, timeEnd,objId);
        return wellGtDataDiag;
    }

    @Override
    public WellGtDataZyDiag selectOneDataByGtRespIdZy(Integer gtRespId) {
        WellGtDataZyDiag wellGtDataZyDiag = wellGtDataZyDiagMapper.selectByGtRespIdZy(gtRespId);
        return wellGtDataZyDiag;
    }
}
