package server.service;

import server.db.primary.model.SysControl;
import server.db.primary.model.SysControlTest;

public interface SysControlService {
    int insertOneDataBaseByWellId(SysControl record);

    int insertDataBaseByWellId(SysControlTest record);
}
