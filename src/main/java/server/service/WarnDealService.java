package server.service;

import server.db.primary.model.warn.WarnDeal;

import java.math.BigDecimal;
import java.util.List;

public interface WarnDealService {

    int deleteByPrimaryKey(BigDecimal id);

    int insertSelective(WarnDeal record);

    WarnDeal selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(WarnDeal record);

    List<WarnDeal> selectAll();

    WarnDeal selectByWarnId(int warnId);

}
