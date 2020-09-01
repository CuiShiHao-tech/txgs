package server.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.db.primary.mapper.warn.WarnDealMapper;
import server.db.primary.model.warn.WarnDeal;
import server.service.WarnDealService;

import java.math.BigDecimal;
import java.util.List;

@Service
public class WarnDealImp implements WarnDealService {

    @Autowired
    WarnDealMapper warnDealMapper;

    @Override
  public  int deleteByPrimaryKey(BigDecimal id){
        return warnDealMapper.deleteByPrimaryKey(id);
    }

    @Override
  public  int insertSelective(WarnDeal record){
        return warnDealMapper.insertSelective(record);
    }

    @Override
   public WarnDeal selectByPrimaryKey(BigDecimal id){
        return warnDealMapper.selectByPrimaryKey(id);
    }

    @Override
    public  int updateByPrimaryKeySelective(WarnDeal record){
        return warnDealMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<WarnDeal> selectAll(){
        return warnDealMapper.selectAll();
    }

    @Override
   public WarnDeal selectByWarnId(int warnId){
        return warnDealMapper.selectByWarnId(warnId);
    }
}
