package server.db.primary.mapper;

import org.springframework.stereotype.Component;
import server.db.primary.model.SysControl;

@Component
public interface SysControlMapper {
    int deleteByPrimaryKey(Short id);

    int insert(SysControl record);

    int insertSelective(SysControl record);

    SysControl selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(SysControl record);

    int updateByPrimaryKey(SysControl record);
}