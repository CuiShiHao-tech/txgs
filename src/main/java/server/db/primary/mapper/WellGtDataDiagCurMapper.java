package server.db.primary.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import server.db.primary.model.WellGtDataDiagCur;

import java.util.List;

@Component
public interface WellGtDataDiagCurMapper {
    int insert(WellGtDataDiagCur record);

    int insertSelective(WellGtDataDiagCur record);

    List<WellGtDataDiagCur> selectNcountByObjId(@Param("objId") Integer objId);

    List<WellGtDataDiagCur> selectByObjId(@Param("wellName") String wellName,@Param("objId") Integer objId);

    List<WellGtDataDiagCur> selectByNo(@Param("wellName") String wellName,@Param("objId") Integer objId);
}