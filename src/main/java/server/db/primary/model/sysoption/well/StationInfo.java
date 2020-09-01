package server.db.primary.model.sysoption.well;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.Date;
import java.util.List;

@Data
public class StationInfo {
    @Id
    private Long id;

    private String stationName;

    private String stationNameAlias;

    private Short stationType;

    private String stationTypeInfo;

    private Long fatherId;
    @Transient
    private String areaName;

    private Short mark;

    private Date stime;

}