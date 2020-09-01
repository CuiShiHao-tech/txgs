package server.service.interf.sysoption.well;

import com.alibaba.fastjson.JSONArray;
import server.db.primary.model.sysoption.well.FactoryInfo;

import java.util.List;

public interface FunFactoryInfoService {
    JSONArray getUnitTree();

    List<FactoryInfo> selectFactoryForList();

    FactoryInfo selectFactoryById(Long id);
}
