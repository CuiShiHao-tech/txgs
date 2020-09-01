package server.db.primary.mapper.warn;

import server.db.primary.model.warn.WarnSysConfig;

import java.math.BigDecimal;

public interface WarnSysConfigMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(WarnSysConfig record);

    int insertSelective(WarnSysConfig record);

    WarnSysConfig selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(WarnSysConfig record);

    int updateByPrimaryKey(WarnSysConfig record);

    int Count(BigDecimal wellId);

    WarnSysConfig selectByWellId(BigDecimal wellId);
}