package server.db.primary.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import server.db.primary.model.WellGtDataDiag;

import java.util.List;

@Component
public interface WellGtDataDiagMapper {
    int insert(WellGtDataDiag record);

    int insertSelective(WellGtDataDiag record);

    WellGtDataDiag selectByGtRespId(@Param("gtRespId") Integer gtRespId);

    List<WellGtDataDiag> selectByWellId( @Param("wellId") Integer wellId, @Param("wellName") String wellName, @Param("timeStart") String timeStart, @Param("timeEnd") String timeEnd,@Param("objId") Integer objId );
}