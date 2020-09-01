package server.db.primary.mapper.warn;

import server.db.primary.model.warn.WarnGtConfig;

import java.math.BigDecimal;

public interface WarnGtConfigMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(WarnGtConfig record);

    int insertSelective(WarnGtConfig record);

    WarnGtConfig selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(WarnGtConfig record);

    int updateByPrimaryKey(WarnGtConfig record);

    int Count(BigDecimal wellId);

   WarnGtConfig selectByWellId(BigDecimal wellId);
}