package server.db.primary.mapper.sysoption.well;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import server.db.common.CommonMapper;
import server.db.primary.model.sysoption.well.WellInfo;

import java.util.List;

@Component
public interface FunWellInfoMapper extends CommonMapper<WellInfo> {
    List<WellInfo> selectWellForListNotInWellGtConfig(@Param("areaIds") List<Long> areaIds);

    List<WellInfo> selectWellForListNotInWellStateMan(@Param("areaIds") List<Long> areaIds);

}
