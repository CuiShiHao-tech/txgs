package server.db.primary.mapper;

import org.apache.ibatis.annotations.Param;
import server.db.primary.model.WellGtDataZyDiag;

public interface WellGtDataZyDiagMapper {
    int insert(WellGtDataZyDiag record);

    int insertSelective(WellGtDataZyDiag record);

    WellGtDataZyDiag selectByGtRespIdZy(@Param("gtRespId") Integer gtRespId);
}