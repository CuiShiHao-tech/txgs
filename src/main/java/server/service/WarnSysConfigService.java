package server.service;
import server.db.primary.model.warn.WarnSysConfig;

import java.math.BigDecimal;

public interface WarnSysConfigService {

    int deleteByPrimaryKey(BigDecimal id);

    int insertSelective(WarnSysConfig record);

    WarnSysConfig selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(WarnSysConfig record);

    int Count(BigDecimal wellId);

    WarnSysConfig selectByWellId(BigDecimal wellId);

}
