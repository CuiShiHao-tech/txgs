
package server.db.primary.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import server.db.primary.model.WellReportDay;

import java.util.List;

@Component
public interface WellReportDayMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WellReportDay record);

    int insertSelective(WellReportDay record);

    WellReportDay selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WellReportDay record);

    int updateByPrimaryKey(WellReportDay record);

    List<WellReportDay> selectByWellId(@Param("wellId") Long wellId, @Param("timeStart") String timeStart, @Param("timeEnd") String timeEnd );

    List<WellReportDay> selectByReportDate(@Param("reportDate") String reportDate);

    List<WellReportDay> dayProportion(@Param("reportDate") String reportDate);
    WellReportDay selectByDay(@Param("reportDate") String reportDate);
    List<WellReportDay> sevenDayTrend();
}