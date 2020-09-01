package server.service.interf.sysoption.well;

import com.github.pagehelper.PageInfo;
import server.db.primary.model.sysoption.well.WellStateMan;

import java.util.List;
import java.util.Map;

public interface FunWellStateManService {
    PageInfo selectWellStateManPaged(Integer pageNum, Integer pageSize, List<Long> areaIds, String searchWellName, Long searchAreaId, Long searchStateTypeId, Long searchMark);

    WellStateMan selectWellStateManOneByWellId(Long wellId);

    boolean isWellStateManWellExist(Long wellId);

    Map<String, Object> createWellStateMan(WellStateMan wellStateMan);

    boolean updateWellStateMan(WellStateMan wellStateMan);

    boolean deleteWellStateManByIdList(List<Long> wellIdList);

}
