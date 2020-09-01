package server.service.interf.sysoption.well;

import com.github.pagehelper.PageInfo;
import server.db.primary.model.sysoption.well.WellGtConfig;
import server.db.primary.model.sysoption.well.WellGtConfigImport;
import server.service.imp.sysoption.well.FunWellGtConfigImp;

import java.util.List;
import java.util.Map;

public interface FunWellGtConfigService {

    PageInfo selectWellGtConfigPaged(Integer pageNum, Integer pageSize,List<Long> areaIds,  String searchWellName);

    WellGtConfig selectWellGtConfigOneByWellId(Long wellId);

    boolean isWellGtConfigWellExist(Long wellId);

    Map<String, Object> createWellGtConfig(WellGtConfig wellGtConfig);

    boolean updateWellGtConfig(WellGtConfig wellGtConfig);

    boolean deleteWellGtConfigByIdList(List<Long> wellIdList);

    FunWellGtConfigImp.ImportRes importInfo(List<WellGtConfigImport> wellGtConfigImportList);
}
