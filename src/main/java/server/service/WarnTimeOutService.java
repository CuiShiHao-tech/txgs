package server.service;

import server.db.primary.model.warn.WarnTimeOut;

import java.util.List;

public interface WarnTimeOutService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(WarnTimeOut record);

    WarnTimeOut selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WarnTimeOut record);

    List<WarnTimeOut> search(List<Long> areaIds);

    List<WarnTimeOut> selectNotConfigTimeOut(List<Long> areaIds);

}
