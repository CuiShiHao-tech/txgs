package server.db.primary.mapper;

import org.springframework.stereotype.Component;
import server.db.primary.model.SysControlTest;

@Component
public interface SysControlTestMapper {
    int deleteByPrimaryKey(Short id);

    int insert(SysControlTest record);

    int insertSelective(SysControlTest record);

    SysControlTest selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(SysControlTest record);

    int updateByPrimaryKey(SysControlTest record);
}