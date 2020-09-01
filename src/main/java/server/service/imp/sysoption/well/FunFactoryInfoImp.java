package server.service.imp.sysoption.well;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.db.primary.mapper.sysoption.well.FunFactoryInfoMapper;
import server.db.primary.model.sysoption.well.AreaInfo;
import server.db.primary.model.sysoption.well.FactoryInfo;
import server.service.interf.sysoption.well.FunFactoryInfoService;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

@Service
public class FunFactoryInfoImp implements FunFactoryInfoService {
    @Autowired
    FunFactoryInfoMapper funFactoryInfoMapper;

    @Override
    public JSONArray getUnitTree() {
        List<FactoryInfo> factoryInfoList = funFactoryInfoMapper.selecFactoryAreaTree();
        JSONArray jA = new JSONArray();
        for (FactoryInfo factoryInfo : factoryInfoList) {
            JSONObject factoryJO = new JSONObject();
            factoryJO.put("id", factoryInfo.getId());
            factoryJO.put("label", factoryInfo.getName());
            JSONArray factoryChildJA = new JSONArray();
            for (AreaInfo areaInfo : factoryInfo.getAreaInfoList()) {
                JSONObject areaInfoJO = new JSONObject();
                areaInfoJO.put("id", areaInfo.getId());
                areaInfoJO.put("label", areaInfo.getAreaName());
                factoryChildJA.add(areaInfoJO);
            }
            if (factoryChildJA.size() > 0) {
                factoryJO.put("children", factoryChildJA);
            }
            jA.add(factoryJO);
        }
        return jA;
    }

    @Override
    public List<FactoryInfo> selectFactoryForList() {
        Example example = new Example(FactoryInfo.class);
        List<String> columnList = new ArrayList<>();
        columnList.add("id");
        columnList.add("name");
        example.selectProperties(columnList.toArray(new String[]{}));
        example.orderBy("id");
        return funFactoryInfoMapper.selectByExample(example);
    }


    @Override
    public FactoryInfo selectFactoryById(Long id) {
        Example example = new Example(FactoryInfo.class);
        example.createCriteria()
                .andEqualTo("id", id);
        return funFactoryInfoMapper.selectOneByExample(example);
    }
}
