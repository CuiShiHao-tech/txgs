package server.service;

import server.db.primary.model.WellReportDay;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

public interface WellReportDayService {
    List<WellReportDay> selectOneDataByWellId(Long wellId, String timeStart, String timeEnd);

    int updateByPrimarySelective(WellReportDay record);

    List<WellReportDay> selectOneDataByReportDate(String reportDate);
    List<WellReportDay> dayProportion();
    WellReportDay selectByDay();
    Map<String,Object> sevenDayTrend() throws ParseException;

}
