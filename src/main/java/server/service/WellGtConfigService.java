package server.service;

import server.db.primary.model.WellGtConfig;

public interface WellGtConfigService {
    WellGtConfig selectOneDataByWellId(Long wellId);
}
