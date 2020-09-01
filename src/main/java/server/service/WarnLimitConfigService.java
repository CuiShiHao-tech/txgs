package server.service;
import server.db.primary.model.warn.WarnAllConfig;
import server.db.primary.model.warn.WarnLimitConfig;

import java.math.BigDecimal;
import java.util.List;

public interface WarnLimitConfigService {

    int deleteByPrimaryKey(BigDecimal id);

    int insertSelective(WarnLimitConfig record);

    WarnLimitConfig selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(WarnLimitConfig record);

    int Count(BigDecimal wellId);

    WarnLimitConfig selectByWellId(BigDecimal wellId);

    List<WarnAllConfig> selectConfigPage(List<Long> areaIds);

    List<WarnAllConfig>  searchByWellName(String wellName, List<Long> areaIds);

}
