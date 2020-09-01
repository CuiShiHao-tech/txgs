package server.db.primary.mapper.sysoption.well;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import server.db.common.CommonMapper;
import server.db.primary.model.sysoption.well.StationInfo;

import java.util.List;

@Component
public interface FunStationInfoMapper extends CommonMapper<StationInfo> {

}