package server.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.db.primary.mapper.SysControlMapper;
import server.db.primary.mapper.SysControlTestMapper;
import server.db.primary.model.SysControl;
import server.db.primary.model.SysControlTest;
import server.service.SysControlService;

@Service
public class SysControlImp implements SysControlService {

    @Autowired
    SysControlMapper sysControlMapper;
    @Autowired
    SysControlTestMapper sysControltTestMapper;

    @Override
    public int insertOneDataBaseByWellId(SysControl record) {

        return  sysControlMapper.insertSelective(record);

    }

    @Override
    public int insertDataBaseByWellId(SysControlTest record) {

        return  sysControltTestMapper.insertSelective(record);

    }
}
