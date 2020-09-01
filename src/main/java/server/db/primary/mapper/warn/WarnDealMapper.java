package server.db.primary.mapper.warn;

import server.db.primary.model.warn.WarnDeal;

import java.math.BigDecimal;
import java.util.List;

public interface WarnDealMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(WarnDeal record);

    int insertSelective(WarnDeal record);

    WarnDeal selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(WarnDeal record);

    int updateByPrimaryKey(WarnDeal record);

    List<WarnDeal> selectAll();

    WarnDeal selectByWarnId(int warnId);
}