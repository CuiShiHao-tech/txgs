package server.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.db.primary.mapper.warn.WarnGtConfigMapper;
import server.db.primary.model.warn.WarnGtConfig;
import server.service.WarnGtConfigService;

import java.math.BigDecimal;

@Service
public class WarnGtConfigImp implements WarnGtConfigService {

    @Autowired
    WarnGtConfigMapper warnGtConfigMapper;

    @Override
  public  int deleteByPrimaryKey(BigDecimal id){
        return warnGtConfigMapper.deleteByPrimaryKey(id);
    }

    @Override
  public  int insertSelective(WarnGtConfig record){
        return warnGtConfigMapper.insertSelective(record);
    }

    @Override
   public WarnGtConfig selectByPrimaryKey(BigDecimal id){
        return warnGtConfigMapper.selectByPrimaryKey(id);
    }

    @Override
    public  int updateByPrimaryKeySelective(WarnGtConfig record){
        return warnGtConfigMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public  int Count(BigDecimal wellId){
        return warnGtConfigMapper.Count(wellId);
    }


    @Override
    public WarnGtConfig selectByWellId(BigDecimal wellId){
        return warnGtConfigMapper.selectByWellId(wellId);
    }

}
