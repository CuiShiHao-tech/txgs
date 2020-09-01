package server.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.db.primary.mapper.warn.WarnTimeOutMapper;
import server.db.primary.model.warn.WarnTimeOut;
import server.service.WarnTimeOutService;

import java.util.List;

@Service
public class WarnTimeOutImp implements WarnTimeOutService {

    @Autowired
    WarnTimeOutMapper warnTimeOutMapper;

    @Override
  public  int deleteByPrimaryKey(Integer id){
        return warnTimeOutMapper.deleteByPrimaryKey(id);
    }

    @Override
  public  int insertSelective(WarnTimeOut record){
        return warnTimeOutMapper.insertSelective(record);
    }

    @Override
   public WarnTimeOut selectByPrimaryKey(Integer id){
        return warnTimeOutMapper.selectByPrimaryKey(id);
    }

    @Override
    public  int updateByPrimaryKeySelective(WarnTimeOut record){
        return warnTimeOutMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<WarnTimeOut> search(List<Long> areaIds){
        return warnTimeOutMapper.search(areaIds);
    }

    @Override
    public  List<WarnTimeOut> selectNotConfigTimeOut(List<Long> areaIds){
        return warnTimeOutMapper.selectNotConfigTimeOut(areaIds);
    }

}
