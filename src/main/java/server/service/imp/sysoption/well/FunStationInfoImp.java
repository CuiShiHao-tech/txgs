package server.service.imp.sysoption.well;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.db.primary.mapper.sysoption.well.FunAreaInfoMapper;
import server.db.primary.mapper.sysoption.well.FunStationInfoMapper;
import server.db.primary.model.sysoption.well.AreaInfo;
import server.db.primary.model.sysoption.well.FactoryInfo;
import server.db.primary.model.sysoption.well.StationInfo;
import server.service.interf.sysoption.well.FunStationInfoService;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class FunStationInfoImp implements FunStationInfoService {

    @Autowired
    FunStationInfoMapper funStationInfoMapper;
@Autowired
FunAreaInfoMapper funAreaInfoMapper;
    @Override
    public PageInfo selectStationPaged(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Example example = new Example(StationInfo.class);
        example.orderBy("stationName");

        List<AreaInfo> areaInfoList = funAreaInfoMapper.selectAll();
        Map<Long, String> factoryIdName = areaInfoList.stream().collect(Collectors.toMap(AreaInfo::getId, AreaInfo::getAreaName));
        List<StationInfo> stationInfoList = funStationInfoMapper.selectByExample(example);
        stationInfoList.forEach(e->e.setAreaName(factoryIdName.getOrDefault(e.getFatherId(),"")));
        return new PageInfo<>(stationInfoList);
    }

    @Override
    public StationInfo selectStationOneById(Long id) {
        return funStationInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean isStationNameExist(String stationName) {
        Example example = new Example(StationInfo.class);
        example.createCriteria()
                .andEqualTo("stationName", stationName);
        return funStationInfoMapper.selectByExample(example).size() > 0;
    }

    @Override
    public boolean createStation(StationInfo stationInfo) {
        return funStationInfoMapper.insertSelective(stationInfo) > 0;
    }

    @Override
    public boolean isStationNameExistExceptSelf(Long id, String stationName) {
        Example example = new Example(StationInfo.class);
        example.createCriteria()
                .andEqualTo("stationName", stationName)
                .andNotEqualTo("id", id);
        return funStationInfoMapper.selectByExample(example).size() > 0;
    }

    @Override
    public boolean updateStation(StationInfo stationInfo) {
        Example example = new Example(StationInfo.class);
        example.createCriteria()
                .andEqualTo("id", stationInfo.getId());
        return funStationInfoMapper.updateByExampleSelective(stationInfo, example) > 0;
    }

    @Override
    public boolean deleteStationByIdList(List<Long> idList) {
        Example example = new Example(StationInfo.class);
        example.createCriteria()
                .andIn("id", idList);
        return funStationInfoMapper.deleteByExample(example) > 0;
    }
}
