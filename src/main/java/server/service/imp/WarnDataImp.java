package server.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.db.primary.model.warn.WarnData;
import server.db.primary.model.warn.WarnDataAndDeal;
import server.service.WarnDataService;

import java.math.BigDecimal;
import java.util.List;

@Service
public class WarnDataImp implements WarnDataService {

    @Autowired
    server.db.primary.mapper.warn.WarnDataMapper WarnDataMapper;

    @Override
  public  int deleteByPrimaryKey(BigDecimal id){
        return WarnDataMapper.deleteByPrimaryKey(id);
    }

    @Override
  public  int insertSelective(WarnData record){
        return WarnDataMapper.insertSelective(record);
    }

    @Override
   public WarnData selectByPrimaryKey(BigDecimal id){
        return WarnDataMapper.selectByPrimaryKey(id);
    }

    @Override
    public  int updateByPrimaryKeySelective(WarnData record){
        return WarnDataMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public  List<WarnDataAndDeal> selectAll(List<Long> areaIds, String alertKind){
        return WarnDataMapper.selectAll(areaIds,alertKind);
    }

    @Override
    public List<WarnDataAndDeal>  Search(List<Long> areaIds, Integer areaId, Integer stationId, String wellName, String alertKind, String alertType, String handleWay, String maintainState, String timeStart, String timeEnd){
        return WarnDataMapper.Search(areaIds,areaId, stationId,wellName,alertKind,alertType,handleWay,maintainState,timeStart,timeEnd);
    }

}
