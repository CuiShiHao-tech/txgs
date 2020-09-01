package server.service.interf.sysoption.well;

import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Component;
import server.db.primary.model.sysoption.well.WellInfo;

import java.util.Date;
import java.util.List;

public interface FunWellInfoService {

    PageInfo selectWellPaged(Integer pageNum, Integer pageSize, List<Long> areaIds, Long searchAreaId, String searchWellName);

    WellInfo selectWellOneById(Long id);

    List<WellInfo> selectWellForList(List<Long> areaIds);

    boolean isWellNameExist(String wellName);

    boolean createWell(WellInfo wellInfo);

    boolean isWellNameExistExceptSelf(Long id, String wellName);

    boolean updateWell(WellInfo wellInfo);

    boolean deleteWellByIdList(List<Long> idList);

    List<WellInfo> selectWellForListNotInWellGtConfig(List<Long> areaIds);

    List<WellInfo> selectWellForListNotInWellStateMan(List<Long> areaIds);

    boolean isRTUAddrExist(String rtuIpaddr, Integer rtuPort);

    boolean isVIpaddrExist(String vIpaddr);

    boolean isRTUAddrExistExceptSelf(Long wellId,String rtuIpaddr, Integer rtuPort);

    boolean isVIpaddrExistExceptSelf(Long wellId,String vIpaddr);
}
