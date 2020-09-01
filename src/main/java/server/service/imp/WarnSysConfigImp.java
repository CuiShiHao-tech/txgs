package server.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.db.primary.mapper.warn.WarnSysConfigMapper;
import server.db.primary.model.warn.WarnSysConfig;
import server.service.WarnSysConfigService;

import java.math.BigDecimal;

@Service
public class WarnSysConfigImp implements WarnSysConfigService {

    @Autowired
    WarnSysConfigMapper warnSysConfigMapper;

    @Override
  public  int deleteByPrimaryKey(BigDecimal id){
        return warnSysConfigMapper.deleteByPrimaryKey(id);
    }

    @Override
  public  int insertSelective(WarnSysConfig record){
        return warnSysConfigMapper.insertSelective(record);
    }

    @Override
   public WarnSysConfig selectByPrimaryKey(BigDecimal id){
        return warnSysConfigMapper.selectByPrimaryKey(id);
    }

    @Override
    public  int updateByPrimaryKeySelective(WarnSysConfig record){
        return warnSysConfigMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int Count(BigDecimal wellId)
    {
        return warnSysConfigMapper.Count(wellId);
    }

    @Override
    public WarnSysConfig selectByWellId(BigDecimal wellId)
    {
        return warnSysConfigMapper.selectByWellId(wellId);
    }
}
