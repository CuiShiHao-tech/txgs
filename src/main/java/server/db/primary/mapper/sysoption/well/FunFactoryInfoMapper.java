package server.db.primary.mapper.sysoption.well;

import org.springframework.stereotype.Component;
import server.db.common.CommonMapper;
import server.db.primary.model.sysoption.well.FactoryInfo;

import java.util.List;

@Component
public interface FunFactoryInfoMapper extends CommonMapper<FactoryInfo> {
    List<FactoryInfo> selecFactoryAreaTree();

//    List<FactoryInfo> selectUnitTree();
}