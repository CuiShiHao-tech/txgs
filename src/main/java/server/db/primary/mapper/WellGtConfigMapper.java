package server.db.primary.mapper;

import org.springframework.stereotype.Component;
import server.db.primary.model.WellGtConfig;

@Component
public interface WellGtConfigMapper {
    int insert(WellGtConfig record);

    int insertSelective(WellGtConfig record);

    WellGtConfig selectGtConfigByWellId(Long wellId);
}