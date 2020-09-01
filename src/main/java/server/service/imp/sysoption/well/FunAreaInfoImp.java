package server.service.imp.sysoption.well;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.db.primary.mapper.sysoption.well.FunAreaInfoMapper;
import server.db.primary.model.sysoption.well.AreaInfo;
import server.service.interf.sysoption.well.FunAreaInfoService;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

@Service
public class FunAreaInfoImp implements FunAreaInfoService {

    @Autowired
    FunAreaInfoMapper funAreaInfoMapper;

    @Override
    public PageInfo selectAreaPaged(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Example example = new Example(AreaInfo.class);
        example.orderBy("areaName");
        return new PageInfo<>(funAreaInfoMapper.selectByExample(example));
    }

    @Override
    public AreaInfo selectAreaOneById(Long id) {
        Example example = new Example(AreaInfo.class);
        example.createCriteria()
                .andEqualTo("id", id);
        return funAreaInfoMapper.selectOneByExample(example);
    }

    @Override
    public List<AreaInfo> selectAreaForList(Long factoryId, List<Long> areaIds) {
        Example example = new Example(AreaInfo.class);
//        example.selectProperties("id", "areaName");
        example.orderBy("areaName");
        Example.Criteria criteria = example.createCriteria();
        if (factoryId != null) {
            criteria.andEqualTo("coId", factoryId);
        }

        criteria.andIn("id", areaIds);
        List<String> columnList = new ArrayList<>();
        columnList.add("id");
        columnList.add("areaName");
        example.selectProperties(columnList.toArray(new String[]{}));
        return funAreaInfoMapper.selectByExample(example);
    }

    @Override
    public boolean isAreaNameExist(String areaName) {
        Example example = new Example(AreaInfo.class);
        example.createCriteria()
                .andEqualTo("areaName", areaName);
        return funAreaInfoMapper.selectByExample(example).size() > 0;
    }

    @Override
    public boolean createArea(AreaInfo areaInfo) {
        return funAreaInfoMapper.insertSelective(areaInfo) > 0;
    }

    @Override
    public boolean isAreaNameExistExceptSelf(Long id, String areaName) {
        Example example = new Example(AreaInfo.class);
        example.createCriteria()
                .andEqualTo("areaName", areaName)
                .andNotEqualTo("id", id);
        return funAreaInfoMapper.selectByExample(example).size() > 0;
    }

    @Override
    public boolean updateArea(AreaInfo areaInfo) {
        Example example = new Example(AreaInfo.class);
        example.createCriteria()
                .andEqualTo("id", areaInfo.getId());
        return funAreaInfoMapper.updateByExampleSelective(areaInfo, example) > 0;
    }

    @Override
    public boolean deleteAreaByIdList(List<Long> idList) {
        Example example = new Example(AreaInfo.class);
        example.createCriteria()
                .andIn("id", idList);
        return funAreaInfoMapper.deleteByExample(example) > 0;
    }

}
