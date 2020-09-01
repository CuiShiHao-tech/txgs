package server.db.primary.model.sysoption.well;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class AreaInfo {
    private Long id;

    private String areaName;

    private String areaNameAlias;

    private Long coId;

    private String coName;

    private String remark;

    private Long mark;

    private Date stime;

    private List<StationInfo> stationInfoList;


}