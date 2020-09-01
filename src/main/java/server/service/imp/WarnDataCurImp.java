package server.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.db.primary.model.warn.WarnDataCur;
import server.service.WarnDataCurService;

import java.math.BigDecimal;
import java.util.List;

@Service
public class WarnDataCurImp implements WarnDataCurService {

    @Autowired
    server.db.primary.mapper.warn.WarnDataCurMapper WarnDataCurMapper;

    @Override
  public  int deleteByPrimaryKey(BigDecimal id){
        return WarnDataCurMapper.deleteByPrimaryKey(id);
    }

    @Override
  public  int insertSelective(WarnDataCur record){
        return WarnDataCurMapper.insertSelective(record);
    }

    @Override
   public WarnDataCur selectByPrimaryKey(BigDecimal id){
        return WarnDataCurMapper.selectByPrimaryKey(id);
    }

    @Override
     public  int updateByPrimaryKeySelective(WarnDataCur record){
        return WarnDataCurMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<WarnDataCur> selectAll(String alertKind, List<Long> areaIds){
        return WarnDataCurMapper.selectAll(alertKind,areaIds);
    }

   @Override
   public  List<WarnDataCur> Search(Integer areaId, Integer stationId, String wellName, String  alertKind, String alertType, String timeStart, String timeEnd, List<Long> areaIds){
       return WarnDataCurMapper.Search(areaId,stationId,wellName,alertKind,alertType,timeStart,timeEnd,areaIds);
   }

    @Override
    public  List<WarnDataCur>  selectDistinctWell(List<Long> areaIds, Integer areaId, Integer stationId, String wellName, String alertKind)
    {
       return WarnDataCurMapper.selectDistinctWell(areaIds,areaId,stationId,wellName,alertKind);
    }

    @Override
    public WarnDataCur AlertMark(List<Long> areaIds){

        return WarnDataCurMapper.AlertMark(areaIds);
    }

    @Override
    public  int deleteMore( String[] Ids){
       return WarnDataCurMapper.deleteMore(Ids);
    }

    @Override
     public int deleteMore1( Integer wellId, String alertKind,String alertType)
    {
        return WarnDataCurMapper.deleteMore1(wellId, alertKind, alertType);
    }

    @Override
    public  List<WarnDataCur> Search1(Integer areaId, Integer stationId, Integer wellId, String wellName, String  alertKind, String alertType, String timeStart, String timeEnd, List<Long> areaIds){
        return WarnDataCurMapper.Search1(areaId,stationId,wellId,wellName,alertKind,alertType,timeStart,timeEnd,areaIds);
    }

}
