package server.db.primary.mapper.map;

import server.db.primary.model.map.Seal;

public interface SealMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Seal record);

    int insertSelective(Seal record);

    Seal selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Seal record);

    int updateByPrimaryKey(Seal record);
}