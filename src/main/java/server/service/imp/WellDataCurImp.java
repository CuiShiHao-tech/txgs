package server.service.imp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.db.primary.mapper.WellDataCurMapper;
import server.db.primary.mapper.WellGtDataZyProdMapper;
import server.db.primary.model.WellDataCur;
import server.db.primary.model.WellGtDataZyProd;
import server.service.WellDataCurService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class WellDataCurImp implements WellDataCurService {

    @Autowired
    WellDataCurMapper wellDataCurMapper;
    @Autowired
    WellGtDataZyProdMapper wellGtDataZyProdMapper;

    @Override
    public List<WellDataCur> selectOneDataByWellIdAll(String sqlrun,String wellName,Integer objId) {
        List<WellDataCur> wellDataCur = wellDataCurMapper.selectAllByWellId(sqlrun,wellName,objId);
        return wellDataCur;
    }

    @Override
    public WellDataCur selectOneDataByWellId(Long wellId,Integer objId) {
        WellDataCur wellDataCur = wellDataCurMapper.selectByWellId(wellId,objId);
        return wellDataCur;
    }

    @Override
    public WellDataCur selectOneDataByday(Integer objId) {
        WellDataCur wellDataCur = wellDataCurMapper.selectByday(objId);
        return wellDataCur;
    }

    @Override
    public  long Ncount( long state,Integer objId)
    {
        return wellDataCurMapper.Ncount(state,objId);
    }

    @Override
    public Map selectIndexByNcount(Integer objId, String timeStart, String timeEnd) {

        WellDataCur wellDataCurNcount=wellDataCurMapper.selectByWellIdNcount(objId);
        WellGtDataZyProd wellGtDataProd=wellGtDataZyProdMapper.selectByWellIdSum(objId,timeStart, timeEnd);
        Map map= new HashMap();

        map.put("wellDataCurNcount0",wellDataCurNcount);
        map.put("wellDataCurNcount1",wellGtDataProd);

        return map;
    }


}
