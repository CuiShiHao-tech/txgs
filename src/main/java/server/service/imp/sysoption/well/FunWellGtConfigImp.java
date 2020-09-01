package server.service.imp.sysoption.well;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.Data;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import server.db.primary.mapper.sysoption.well.FunWellGtConfigMapper;
import server.db.primary.mapper.sysoption.well.FunWellInfoMapper;
import server.db.primary.model.sysoption.well.WellGtConfig;
import server.db.primary.model.sysoption.well.WellGtConfigImport;
import server.db.primary.model.sysoption.well.WellInfo;
import server.service.interf.sysoption.well.FunWellGtConfigService;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class FunWellGtConfigImp implements FunWellGtConfigService {

    @Autowired
    FunWellGtConfigMapper funWellGtConfigMapper;
    @Autowired
    FunWellInfoMapper funWellInfoMapper;
    @Autowired
    MapperFacade mapperFacade;

    @Override
    public PageInfo selectWellGtConfigPaged(Integer pageNum, Integer pageSize, List<Long> areaIds, String searchWellName) {

        Example example1 = new Example(WellInfo.class);
        example1.createCriteria()
                .andIn("areaId", areaIds);
        List<WellInfo> wellInfoList = funWellInfoMapper.selectByExample(example1);
        List<Long> wellIdList = new ArrayList<Long>() {{
            add(-1L);
        }};
        if (wellInfoList != null && wellInfoList.size() > 0) {
            wellIdList = wellInfoList.stream().map(WellInfo::getId).collect(Collectors.toList());
        }
        Example example = new Example(WellGtConfig.class);
        Example.Criteria criteria = example.createCriteria();
        if (searchWellName != null) {
            criteria.andLike("wellName", "%" + searchWellName + "%");
        }
        criteria.andIn("wellId", wellIdList);
//        criteria.andIn("areaId", areaIds);
//        example.setOrderByClause("area_id,well_name");
        example.orderBy("wellName");
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<>(funWellGtConfigMapper.selectByExample(example));
    }

    @Override
    public WellGtConfig selectWellGtConfigOneByWellId(Long wellId) {
        return funWellGtConfigMapper.selectByPrimaryKey(wellId);
    }

    @Override
    public boolean isWellGtConfigWellExist(Long wellId) {
        Example example = new Example(WellGtConfig.class);
        example.createCriteria()
                .andEqualTo("wellId", wellId);
        return funWellGtConfigMapper.selectCountByExample(example) > 0;
    }

    @Override
    public Map<String, Object> createWellGtConfig(WellGtConfig wellGtConfig) {
        Map<String, Object> map = new HashMap<>();
        WellInfo wellInfo = new WellInfo();
        wellInfo.setId(wellGtConfig.getWellId());

        wellInfo = funWellInfoMapper.selectOne(wellInfo);
        if (wellInfo != null) {
            wellGtConfig.setWellName(wellInfo.getWellName());
            wellGtConfig.setWellNum(wellInfo.getWellNum());
            map.put("result", funWellGtConfigMapper.insertSelective(wellGtConfig) > 0);
            map.put("msg", "成功");
            return map;
        } else {
            map.put("result", false);
            map.put("msg", "失败,无此井,[wellId]无法找到对应井信息");
            return map;
        }
    }

    @Override
    public boolean updateWellGtConfig(WellGtConfig wellGtConfig) {
        return funWellGtConfigMapper.updateByPrimaryKeySelective(wellGtConfig) > 0;
    }

    @Override
    public boolean deleteWellGtConfigByIdList(List<Long> wellIdList) {
        Example example = new Example(WellGtConfig.class);
        example.createCriteria()
                .andIn("wellId", wellIdList);
        return funWellGtConfigMapper.deleteByExample(example) > 0;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ImportRes importInfo(List<WellGtConfigImport> wellGtConfigImportList) {
        //获取本次导入涉及到的井信息，通过井名获取
        List<String> wellNameList = wellGtConfigImportList.stream().filter(e -> !StringUtils.isEmpty(e.getWellNumber())).map(WellGtConfigImport::getWellNumber).collect(Collectors.toList());
        Example example = new Example(WellInfo.class);
        example.createCriteria().andIn("wellName", wellNameList);
        List<WellInfo> wellInfoList = funWellInfoMapper.selectByExample(example);
        Map<String, WellInfo> wellInfoMap = wellInfoList.stream().collect(Collectors.toMap(WellInfo::getWellName, e -> e));
        //获取
        List<WellGtConfig> wellGtConfigList = funWellGtConfigMapper.selectAll();
        List<Long> wellGtConfigWellIdList = wellGtConfigList.stream().map(WellGtConfig::getWellId).collect(Collectors.toList());
        //
        ImportRes resultJO = new ImportRes();
        for (WellGtConfigImport wellGtConfigImport : wellGtConfigImportList) {
            if (wellInfoMap.containsKey(wellGtConfigImport.getWellNumber())) {
                WellInfo wellInfo = wellInfoMap.get(wellGtConfigImport.getWellNumber());

                WellGtConfig wellGtConfig = mapperFacade.map(wellGtConfigImport, WellGtConfig.class)
                        .setWellNum(wellInfo.getWellNum())
                        .setWellId(wellInfo.getId())
                        .setWellName(wellInfo.getWellName());
                int result;
                if (wellGtConfigWellIdList.contains(wellGtConfig.getWellId())) {
                    result = funWellGtConfigMapper.updateByPrimaryKey(wellGtConfig);
                    if (result > 0) {
                        resultJO.addUpdatedInfo(wellGtConfigImport.getWellNumber());
                    }
                } else {
                    result = funWellGtConfigMapper.insert(wellGtConfig);
                    if (result > 0) {
                        resultJO.addInsertedInfo(wellGtConfigImport.getWellNumber());
                    }
                }
            } else {
                resultJO.addNoExistInfo(wellGtConfigImport.getWellNumber());
            }
        }
        return resultJO;
    }

    @Data
    public class ImportRes {
        private List<String> insertedInfo = new ArrayList<>();
        private List<String> updatedInfo = new ArrayList<>();
        private List<String> noExistInfo = new ArrayList<>();
        private List<String> noPermissionInfo = new ArrayList<>();
        private String msg;

        public void addInsertedInfo(String a) {
            insertedInfo.add(a);
        }

        public void addUpdatedInfo(String a) {
            updatedInfo.add(a);
        }

        public void addNoExistInfo(String a) {
            noExistInfo.add(a);
        }

        public void addNoPermissionInfo(String a) {
            noPermissionInfo.add(a);
        }

    }
}
