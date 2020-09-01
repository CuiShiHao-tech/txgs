package server.controller.ulogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import server.db.primary.mapper.map.RoleMapper;
import server.db.primary.mapper.map.StationInfoMapper;
import server.db.primary.mapper.map.WellInfoMapper;
import server.db.primary.model.map.Role;
import server.db.primary.model.map.StationInfo;
import server.db.primary.model.map.ULogin;
import server.db.primary.model.map.WellInfo;
import server.tool.Res;

import java.util.List;


@RestController
public class StationInfoController {
    @Autowired
    StationInfoMapper stationInfoMapper;
    @Autowired
    WellInfoMapper wellInfoMapper;
    @Autowired
    RoleMapper roleMapper;


    @RequestMapping("/Station/Id")
    public Res stationById() {
        List<StationInfo> stationInfo = stationInfoMapper.selectById();
        return Res.success(stationInfo);
    }

    @RequestMapping("/Station/All")
    public Res stationByAll() {
        List<StationInfo> stationInfo = stationInfoMapper.selectByAll();
        return Res.success(stationInfo);
    }

    @RequestMapping("/Well/All")
    public Res wellByAll() {
        List<WellInfo> wellInfo = wellInfoMapper.selectByAll();
        return Res.success(wellInfo);
    }

    @RequestMapping("/Station/Updata")
    public Res stationByUpdata(StationInfo record) {
        int stationInfo = stationInfoMapper.updateByPrimaryKeySelective(record);
        return Res.success(stationInfo);
    }

    @RequestMapping("/Well/Updata")
    public Res wellByUpdata(WellInfo record) {
        int wellInfo = wellInfoMapper.updateByPrimaryKeySelective(record);
        return Res.success(wellInfo);
    }

    @RequestMapping("/Station/Insert")
    public Res stationByInsert(StationInfo record) {
        int stationInfo = stationInfoMapper.insertSelective(record);
        return Res.success(stationInfo);
    }

    @RequestMapping("/Well/Insert")
    public Res wellByInsert(WellInfo record) {
        int wellInfo = wellInfoMapper.insertSelective(record);
        return Res.success(wellInfo);
    }

    @RequestMapping("/Station/Delete")
    public Res stationByDelete(Long id) {
        int stationInfo = stationInfoMapper.deleteByPrimaryKey(id);
        return Res.success(stationInfo);
    }

    @RequestMapping("/Well/Delete")
    public Res wellByDelete(Long id) {
        int wellInfo = wellInfoMapper.deleteByPrimaryKey(id);
        return Res.success(wellInfo);
    }

    @RequestMapping("/Well/Id")
    public Res wellById() {
        List<WellInfo> wellInfo = wellInfoMapper.selectById();
        return Res.success(wellInfo);
    }

    @RequestMapping("/Role/Id")
    public Res roleById() {
        List<Role> role = roleMapper.selectById();
        return Res.success(role);
    }
}
