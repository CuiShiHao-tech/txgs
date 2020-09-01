package server.service.imp.sysoption.well;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.db.primary.mapper.sysoption.well.FunAreaInfoMapper;
import server.db.primary.mapper.sysoption.well.FunFactoryInfoMapper;
import server.db.primary.mapper.sysoption.well.FunWellInfoMapper;
import server.db.primary.mapper.sysoption.well.FunManufacturerMapper;
import server.db.primary.model.sysoption.well.Manufacturer;
import server.db.primary.model.sysoption.well.WellInfo;
import server.service.interf.sysoption.well.FunWellInfoService;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class FunWellInfoImp implements FunWellInfoService {

    @Autowired
    FunWellInfoMapper funWellInfoMapper;
    @Autowired
    FunAreaInfoMapper funAreaInfoMapper;
    @Autowired
    FunFactoryInfoMapper funFactoryInfoMapper;
    @Autowired
    FunManufacturerMapper funManufacturerMapper;

    @Override
    public PageInfo selectWellPaged(Integer pageNum, Integer pageSize, List<Long> areaIds, Long searchAreaId, String searchWellName) {
        Example example = new Example(WellInfo.class);
        Example.Criteria criteria = example.createCriteria();
        if (searchAreaId != null) {
            criteria.andEqualTo("areaId", searchAreaId);
        }
        if (searchWellName != null) {
            criteria.andLike("wellName", "%" + searchWellName + "%");
        }
        criteria.andIn("areaId", areaIds);
        example.setOrderByClause("area_id,well_num");
        PageHelper.startPage(pageNum, pageSize);

        return new PageInfo<>(funWellInfoMapper.selectByExample(example));
    }

    @Override
    public WellInfo selectWellOneById(Long id) {
        Example example = new Example(WellInfo.class);
        example.createCriteria()
                .andEqualTo("id", id);
        return funWellInfoMapper.selectOneByExample(example);
    }

    @Override
    public List<WellInfo> selectWellForList(List<Long> areaIds) {
        Example example = new Example(WellInfo.class);
        example.selectProperties("id", "wellName");
        example.orderBy("wellName");
        Example.Criteria criteria = example.createCriteria();
        criteria.andIn("areaId", areaIds);

//        if (stationType != null) {
//            criteria.andEqualTo("stationType", stationType);
//        }
//        List<String> columnList = new ArrayList<>();
//        for (String column : extraColumn) {
//            columnList.add(column);
//        }
//        columnList.add("id");
//        columnList.add("stationName");
//        example.selectProperties(columnList.toArray(new String[]{}));
        return funWellInfoMapper.selectByExample(example);
    }

    @Override
    public boolean isWellNameExist(String wellName) {
        Example example = new Example(WellInfo.class);
        example.createCriteria()
                .andEqualTo("wellName", wellName);
        return funWellInfoMapper.selectByExample(example).size() > 0;
    }

    @Override
    public boolean createWell(WellInfo wellInfo) {
        updateTypeInfo(wellInfo);
        return funWellInfoMapper.insertSelective(wellInfo) > 0;
    }

    @Override
    public boolean isWellNameExistExceptSelf(Long id, String wellName) {
        Example example = new Example(WellInfo.class);
        example.createCriteria()
                .andEqualTo("wellName", wellName)
                .andNotEqualTo("id", id);
        return funWellInfoMapper.selectByExample(example).size() > 0;
    }

    @Override
    public boolean updateWell(WellInfo wellInfo) {
        Example example = new Example(WellInfo.class);
        example.createCriteria()
                .andEqualTo("id", wellInfo.getId());
        updateTypeInfo(wellInfo);
        return funWellInfoMapper.updateByExampleSelective(wellInfo, example) > 0;
    }

    private void updateTypeInfo(WellInfo wellInfo) {
        List<Manufacturer> manufacturerList = funManufacturerMapper.selectAll();
        for (Manufacturer manufacturer : manufacturerList) {
            if ("air".equals(manufacturer.getType()) && manufacturer.getValue().equals(wellInfo.getAirType())) {
                wellInfo.setAirTypeName(manufacturer.getName());
            } else if ("water".equals(manufacturer.getType()) && manufacturer.getValue().equals(wellInfo.getWaterType())) {
                wellInfo.setWaterTypeName(manufacturer.getName());
            } else if ("bottomPress".equals(manufacturer.getType()) && manufacturer.getValue().equals(wellInfo.getBottomPressType())) {
                wellInfo.setBottomPressTypeName(manufacturer.getName());
            }
        }
    }

    @Override
    public boolean deleteWellByIdList(List<Long> idList) {
        Example example = new Example(WellInfo.class);
        example.createCriteria()
                .andIn("id", idList);
        return funWellInfoMapper.deleteByExample(example) > 0;
    }

    @Override
    public List<WellInfo> selectWellForListNotInWellGtConfig(List<Long> areaIds) {
        return funWellInfoMapper.selectWellForListNotInWellGtConfig(areaIds);
    }

    @Override
    public List<WellInfo> selectWellForListNotInWellStateMan(List<Long> areaIds) {
        return funWellInfoMapper.selectWellForListNotInWellStateMan(areaIds);
    }

    @Override
    public boolean isRTUAddrExist(String rtuIpaddr, Integer rtuPort) {
        Example example = new Example(WellInfo.class);
        example.createCriteria()
                .andEqualTo("rtuIpaddr", rtuIpaddr)
                .andEqualTo("rtuPort", rtuPort);
        return funWellInfoMapper.selectByExample(example).size() > 0;
    }

    @Override
    public boolean isVIpaddrExist(String vIpaddr) {
        Example example = new Example(WellInfo.class);
        example.createCriteria()
                .andEqualTo("vIpaddr", vIpaddr);
        return funWellInfoMapper.selectByExample(example).size() > 0;
    }

    @Override
    public boolean isRTUAddrExistExceptSelf(Long wellId, String rtuIpaddr, Integer rtuPort) {
        Example example = new Example(WellInfo.class);
        example.createCriteria()
                .andNotEqualTo("id",wellId)
                .andEqualTo("rtuIpaddr", rtuIpaddr)
                .andEqualTo("rtuPort", rtuPort);
        return funWellInfoMapper.selectByExample(example).size() > 0;
    }

    @Override
    public boolean isVIpaddrExistExceptSelf(Long wellId, String vIpaddr) {
        Example example = new Example(WellInfo.class);
        example.createCriteria()
                .andNotEqualTo("id",wellId)
                .andEqualTo("vIpaddr", vIpaddr);
        return funWellInfoMapper.selectByExample(example).size() > 0;
    }
}
