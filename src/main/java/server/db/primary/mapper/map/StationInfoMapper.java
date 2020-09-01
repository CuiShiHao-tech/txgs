package server.db.primary.mapper.map;

import server.db.primary.model.map.StationInfo;

import java.util.List;

public interface StationInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(StationInfo record);

    int insertSelective(StationInfo record);

    StationInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(StationInfo record);

    int updateByPrimaryKey(StationInfo record);

    List<StationInfo> selectById();

    List<StationInfo> selectByAll();
}