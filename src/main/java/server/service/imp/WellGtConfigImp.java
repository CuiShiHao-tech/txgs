package server.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.db.primary.mapper.WellGtConfigMapper;
import server.db.primary.model.WellGtConfig;
import server.service.WellGtConfigService;

@Service
public class WellGtConfigImp implements WellGtConfigService {
    @Autowired
    WellGtConfigMapper wellGtConfigMapper;

    @Override
    public WellGtConfig selectOneDataByWellId(Long wellId) {

        WellGtConfig wellGtConfig = wellGtConfigMapper.selectGtConfigByWellId(wellId);
        return wellGtConfig;
    }
}