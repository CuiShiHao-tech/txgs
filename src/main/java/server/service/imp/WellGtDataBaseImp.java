package server.service.imp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.db.primary.mapper.WellGtDataBaseMapper;
import server.db.primary.model.WellGtDataBase;
import server.service.WellGtDataBaseService;

import java.util.List;


@Service
public class WellGtDataBaseImp implements WellGtDataBaseService {
    @Autowired
    WellGtDataBaseMapper wellGtDataBaseMapper;

    @Override
    public WellGtDataBase selectOneDataByWellId(Long wellId) {

        WellGtDataBase wellGtDataBase = wellGtDataBaseMapper.selectBywellId(wellId);
        return wellGtDataBase;
    }

    @Override
    public WellGtDataBase selectOneDataBaseByWellId(Long wellId) {

        WellGtDataBase wellGtDataBase = wellGtDataBaseMapper.selectBaseBywellId(wellId);
        return wellGtDataBase;
    }

    @Override
    public int insertOneDataBaseByWellId(WellGtDataBase record) {

        return  wellGtDataBaseMapper.insertSelective(record);

    }

    @Override
    public int updateOneDataBaseByWellId(WellGtDataBase record) {

        return  wellGtDataBaseMapper.updateByPrimaryKeySelective(record);

    }

    @Override
    public List<WellGtDataBase> selectOneDataByWellIdAll(Integer areaId,Integer stationId,String wellName,Integer objId) {
        List<WellGtDataBase> wellGtDataBase = wellGtDataBaseMapper.selectBywellIdAll(areaId,stationId,wellName,objId);
        return wellGtDataBase;
    }

}
