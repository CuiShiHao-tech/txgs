package server.db.primary.mapper.warn;

import org.apache.ibatis.annotations.Param;
import server.db.primary.model.warn.WarnAllConfig;
import server.db.primary.model.warn.WarnLimitConfig;

import java.math.BigDecimal;
import java.util.List;

public interface WarnLimitConfigMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(WarnLimitConfig record);

    int insertSelective(WarnLimitConfig record);

    WarnLimitConfig selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(WarnLimitConfig record);

    int updateByPrimaryKey(WarnLimitConfig record);

    int Count(BigDecimal wellId);

    WarnLimitConfig selectByWellId(BigDecimal wellId);

    List<WarnAllConfig> selectConfigPage(@Param("areaIds") List<Long> areaIds);

    List<WarnAllConfig>  searchByWellName(@Param("wellName") String wellName, @Param("areaIds") List<Long> areaIds);
}