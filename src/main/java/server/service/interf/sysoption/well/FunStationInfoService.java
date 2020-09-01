package server.service.interf.sysoption.well;

import com.github.pagehelper.PageInfo;
import server.db.primary.model.sysoption.well.StationInfo;

import java.util.List;

public interface FunStationInfoService {
    PageInfo selectStationPaged(Integer pageNum, Integer pageSize);

    StationInfo selectStationOneById(Long id);

    boolean isStationNameExist(String stationName);

    boolean createStation(StationInfo stationInfo);

    boolean isStationNameExistExceptSelf(Long id, String stationName);

    boolean updateStation(StationInfo stationInfo);

    boolean deleteStationByIdList(List<Long> idList);


}
