package server.db.primary.mapper.map;

import server.db.primary.model.map.WellInfo;

import java.util.List;

public interface WellInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WellInfo record);

    int insertSelective(WellInfo record);

    WellInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WellInfo record);

    int updateByPrimaryKey(WellInfo record);

    List<WellInfo> selectById();

    List<WellInfo> selectByAll();
}