package server.db.primary.mapper.map;

import server.db.primary.model.map.WellDataCur;

import java.util.List;

public interface WellDataCurMapMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WellDataCur record);

    int insertSelective(WellDataCur record);

    WellDataCur selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WellDataCur record);

    int updateByPrimaryKey(WellDataCur record);

    List<WellDataCur> longitudeAndLatitude();

}