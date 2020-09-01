package server.db.primary.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import server.db.primary.model.WellDataCur;

import java.util.List;


@Component
public interface WellDataCurMapper {
    int insert(WellDataCur record);

    int insertSelective(WellDataCur record);

    WellDataCur selectByWellId(@Param("wellId") Long wellId,@Param("objId") Integer objId);

    long Ncount(@Param("state") long state,@Param("objId") Integer objId);

    List<WellDataCur> selectAllByWellId(@Param("sqlrun") String sqlrun, @Param("wellName") String wellName,@Param("objId") Integer objId);

    WellDataCur selectByday(@Param("objId") Integer objId);

    WellDataCur selectByWellIdNcount(@Param("objId") Integer objId);
}