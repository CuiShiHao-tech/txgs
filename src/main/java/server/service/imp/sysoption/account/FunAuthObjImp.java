package server.service.imp.sysoption.account;

import com.alibaba.fastjson.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import server.db.primary.mapper.sysoption.account.FunAuthObjMapper;
import server.db.primary.mapper.sysoption.account.FunAuthObjStationMapper;
import server.db.primary.model.sysoption.account.AuthObj;
import server.db.primary.model.sysoption.account.AuthObjStation;
import server.service.interf.sysoption.account.FunAuthObjService;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class FunAuthObjImp implements FunAuthObjService {
    @Autowired
    FunAuthObjMapper funAuthObjMapper;
    @Autowired
    FunAuthObjStationMapper funAuthObjStationMapper;

    @Override
    public List<AuthObj> selectObj() {
        List<AuthObj> authObjList = funAuthObjMapper.selectObjTable();
        for (AuthObj anAuthObjList : authObjList) {
//            String logoPathNonstandard = anAuthObjList.getLogoPng();
//            String logoPathStandard = null;
//            if (!StringUtils.isEmpty(logoPathNonstandard)) {
//                logoPathStandard = logoWebPath + logoPathNonstandard.substring(logoPathNonstandard.lastIndexOf('/'));
//            }
//            anAuthObjList.setLogoPng(logoPathStandard);
            anAuthObjList.setStationInfoList(null);
        }
        return authObjList;
    }

    @Override
    public AuthObj selectObjById(Long id) {
        AuthObj authObj = funAuthObjMapper.selectObjTableOnebyId(id);
//        String logoPathNonstandard = authObj.getLogoPng();
//        String logoPathStandard = null;
//        if (!StringUtils.isEmpty(logoPathNonstandard)) {
//            logoPathStandard = logoWebPath + logoPathNonstandard.substring(logoPathNonstandard.lastIndexOf('/'));
//        }
//        authObj.setLogoPng(logoPathStandard);
        authObj.setStationInfoList(null);
//        JSONArray areaJA = new JSONArray();
//        JSONObject authObjJO = (JSONObject) JSONObject.toJSON(authObj);
//        for (Object areaJO : authObjJO.getJSONArray("areaInfoList")) {
//            areaJA.add(((JSONObject) areaJO).getInteger("id"));
//        }
//        authObjJO.put("areaInfoList", areaJA);
        return authObj;
    }

    @Override
    public List<AuthObj> selectObjForList() {
        Example example = new Example(AuthObj.class);
        example.selectProperties("id", "objNo", "objName");
        example.orderBy("objNo");
        return funAuthObjMapper.selectByExample(example);
    }

    @Override
    public boolean isObjExist(String objNo) {
        Example example = new Example(AuthObj.class);
        example.createCriteria()
                .andEqualTo("objNo", objNo);
        return funAuthObjMapper.selectByExample(example).size() > 0;
    }

    @Override
    public boolean isNameExist(String objName) {
        Example example = new Example(AuthObj.class);
        example.createCriteria()
                .andEqualTo("objName", objName);
        return funAuthObjMapper.selectByExample(example).size() > 0;
    }

    @Transactional
    @Override
    public boolean createObj(AuthObj authObj, List<Long> areaIdList) {
        if (funAuthObjMapper.insertSelective(authObj) > 0) {
            Long newObjId = funAuthObjMapper.selectSeq();
            updateAuthObjStation(newObjId, areaIdList);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isObjExistExceptSelf(Long id, String objNo) {
        Example example = new Example(AuthObj.class);
        example.createCriteria()
                .andEqualTo("objNo", objNo)
                .andNotEqualTo("id", id);
        return funAuthObjMapper.selectByExample(example).size() > 0;
    }

    @Override
    public boolean isNameExistExceptSelf(Long id, String objName) {
        Example example = new Example(AuthObj.class);
        example.createCriteria()
                .andEqualTo("objName", objName)
                .andNotEqualTo("id", id);
        return funAuthObjMapper.selectByExample(example).size() > 0;
    }

    @Transactional
    @Override
    public boolean updateObj(AuthObj authObj, List<Long> areaIdList) {
        Example example = new Example(AuthObj.class);
        example.createCriteria()
                .andEqualTo("id", authObj.getId());
        if (funAuthObjMapper.updateByExampleSelective(authObj, example) > 0) {
            Long objId = authObj.getId();
            updateAuthObjStation(objId, areaIdList);
            return true;
        } else {
            return false;
        }
    }

    private void updateAuthObjStation(Long objId, List<Long> areaIdList) {
        Example AuthObjStationExample = new Example(AuthObjStation.class);
        AuthObjStationExample.createCriteria()
                .andEqualTo("objId", objId);
        funAuthObjStationMapper.deleteByExample(AuthObjStationExample);
        for (Long areaId : areaIdList) {
            AuthObjStation authObjStation = new AuthObjStation();
            authObjStation.setObjId(objId);
            authObjStation.setStationId(areaId);
            authObjStation.setStationType((short) 2);
            funAuthObjStationMapper.insertSelective(authObjStation);
        }
    }

    @Override
    public boolean deleteObjByIdList(List<Long> idList) {
        Example example = new Example(AuthObj.class);
        example.createCriteria()
                .andIn("id", idList);
        return funAuthObjMapper.deleteByExample(example) > 0;
    }

}
