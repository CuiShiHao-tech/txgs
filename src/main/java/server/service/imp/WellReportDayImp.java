package server.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.db.primary.mapper.WellReportDayMapper;
import server.db.primary.model.WellReportDay;
import server.service.WellReportDayService;

import java.math.BigDecimal;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class WellReportDayImp implements WellReportDayService {

    @Autowired
    WellReportDayMapper wellReportDayMapper;

    @Override
    public List<WellReportDay> selectOneDataByWellId(Long wellId, String timeStart, String timeEnd) {
        List<WellReportDay> wellReportDay = wellReportDayMapper.selectByWellId(wellId, timeStart, timeEnd);
        return wellReportDay;
    }

    @Override
    public int updateByPrimarySelective(WellReportDay record) {

        return  wellReportDayMapper.updateByPrimaryKeySelective(record);

    }

    @Override
    public List<WellReportDay> selectOneDataByReportDate(String reportDate) {
        List<WellReportDay> wellReportDay = wellReportDayMapper.selectByReportDate(reportDate);
        return wellReportDay;
    }

    @Override
    public List<WellReportDay> dayProportion() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        String format = df.format(new Date());
        List<WellReportDay> wellReportDays = wellReportDayMapper.dayProportion(format);
        return wellReportDays;
    }

    @Override
    public WellReportDay selectByDay() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        String format = df.format(new Date());
        WellReportDay wellReportDay = wellReportDayMapper.selectByDay(format);
        return wellReportDay;
    }

    @Override
    public Map<String,Object> sevenDayTrend() throws ParseException {
        List<WellReportDay> wellReportDays = wellReportDayMapper.sevenDayTrend();
        Map<String,Object> map =new HashMap<>();
        List<String> week = new ArrayList<>();
        List<BigDecimal> flowGasDay = new ArrayList<>();
        List<BigDecimal> flowWaterDay = new ArrayList<>();
        for (WellReportDay wellReportDay:wellReportDays){
            String reportDate = wellReportDay.getReportDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date parse = sdf.parse(reportDate);
            Format f = new SimpleDateFormat("E");
            String format = f.format(parse);
            week.add(format);
            flowGasDay.add(wellReportDay.getFlowGasDay());
            flowWaterDay.add(wellReportDay.getFlowWaterDay());
        }
        map.put("week",week);
        map.put("gas",flowGasDay);
        map.put("water",flowWaterDay);
        return map;
    }
}
