package server.db.primary.mapper;

import org.apache.ibatis.annotations.Param;
import server.db.primary.model.WellGtDataZyProd;

public interface WellGtDataZyProdMapper {
    int insert(WellGtDataZyProd record);

    int insertSelective(WellGtDataZyProd record);

    WellGtDataZyProd selectByWellIdSum(@Param("objId") Integer objId,@Param("timeStart") String timeStart, @Param("timeEnd") String timeEnd);
}