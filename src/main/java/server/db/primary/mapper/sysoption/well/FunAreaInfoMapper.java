package server.db.primary.mapper.sysoption.well;

import org.springframework.stereotype.Component;
import server.db.common.CommonMapper;
import server.db.primary.model.sysoption.well.AreaInfo;

import java.util.List;

@Component
public interface FunAreaInfoMapper extends CommonMapper<AreaInfo> {
    AreaInfo selectAreaInfoTableOneById(Long id);

    List<AreaInfo> selectAreaInfoTable();
}