package server.service;

import server.db.primary.model.warn.WarnGtConfig;

import java.math.BigDecimal;

public interface WarnGtConfigService {

    int deleteByPrimaryKey(BigDecimal id);

    int insertSelective(WarnGtConfig record);

    WarnGtConfig selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(WarnGtConfig record);

    int Count(BigDecimal wellId);

    WarnGtConfig selectByWellId(BigDecimal wellId);

}
