package server.db.primary.mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import server.db.primary.model.WellGtData;
import server.db.primary.model.WellGtDataBase;

import java.util.List;

@Component
public interface WellGtDataBaseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WellGtDataBase record);

    int insertSelective(WellGtDataBase record);

    WellGtDataBase selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WellGtDataBase record);

    int updateByPrimaryKey(WellGtDataBase record);

    WellGtDataBase selectBywellId(Long wellId);

    WellGtDataBase selectBaseBywellId(Long wellId);

    List<WellGtDataBase> selectBywellIdAll(@Param("areaId") Integer areaId, @Param("stationId") Integer stationId, @Param("wellName") String wellName,@Param("objId") Integer objId);


}