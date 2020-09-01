package server.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.db.primary.mapper.warn.WarnLimitConfigMapper;
import server.db.primary.model.warn.WarnAllConfig;
import server.db.primary.model.warn.WarnLimitConfig;
import server.service.WarnLimitConfigService;

import java.math.BigDecimal;
import java.util.List;

@Service
public class WarnLimitConfigImp implements WarnLimitConfigService {

    @Autowired
    WarnLimitConfigMapper warnLimitConfigMapper;
    
    @Override
  public  int deleteByPrimaryKey(BigDecimal id){
        return warnLimitConfigMapper.deleteByPrimaryKey(id);
    }

    @Override
  public  int insertSelective(WarnLimitConfig record){
        return warnLimitConfigMapper.insertSelective(record);
    }

    @Override
   public WarnLimitConfig selectByPrimaryKey(BigDecimal id){
        return warnLimitConfigMapper.selectByPrimaryKey(id);
    }

    @Override
    public  int updateByPrimaryKeySelective(WarnLimitConfig record){
        return warnLimitConfigMapper.updateByPrimaryKeySelective(record);
    }

    @Override
      public int Count(BigDecimal wellId){
        return warnLimitConfigMapper.Count(wellId);
    }


    @Override
    public WarnLimitConfig selectByWellId(BigDecimal wellId){
        return warnLimitConfigMapper.selectByWellId(wellId);
    }

     @Override
    public   List<WarnAllConfig> selectConfigPage(List<Long> areaIds){
       return   warnLimitConfigMapper.selectConfigPage(areaIds);
     }


    @Override
    public   List<WarnAllConfig> searchByWellName(String wellName, List<Long> areaIds){
        return   warnLimitConfigMapper.searchByWellName(wellName,areaIds);
    }
}
