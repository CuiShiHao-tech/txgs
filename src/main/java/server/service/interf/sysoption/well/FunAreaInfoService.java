package server.service.interf.sysoption.well;

import com.github.pagehelper.PageInfo;
import server.db.primary.model.sysoption.well.AreaInfo;

import java.util.List;

public interface FunAreaInfoService {
    PageInfo selectAreaPaged(Integer pageNum, Integer pageSize);

    AreaInfo selectAreaOneById(Long id);

    List<AreaInfo> selectAreaForList(Long factoryId, List<Long> areaIds );

    boolean isAreaNameExist(String areaName);

    boolean createArea(AreaInfo cLogin);

    boolean isAreaNameExistExceptSelf(Long id, String areaName);

    boolean updateArea(AreaInfo cLogin);

    boolean deleteAreaByIdList(List<Long> idList);
}
