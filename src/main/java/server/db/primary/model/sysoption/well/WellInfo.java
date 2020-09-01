package server.db.primary.model.sysoption.well;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;


@Data
public class WellInfo {
    private Long id;

    private String wellName;

    private String wellNameAlias;

    private Long wellNum;

    private Long coId;

    private String coName;

    private Long areaId;

    private String areaName;

    private Long areaNum;

    private Long stationId;

    private String stationName;

    private Long stationNum;

    private Long groupId;

    private String groupName;

    private String rtuType;

    private String rtuIpaddr;

    private Integer rtuPort;

    private BigDecimal wellX;

    private BigDecimal wellY;

    private String wellType;

    private String pumpType;

    private Short automationMark;

    private Long pressPipeWId;

    private String pressPipeWName;

    private Short autoDrainage;

    private Short vMark;

    private Short vType;

    private String vTypeName;

    private String vIpaddr;

    private String wellState;

    private Long waterType;
    private String waterTypeName;
    private Long airType;
    private String airTypeName;
    private Long bottomPressType;
    private String bottomPressTypeName;

    private Short mark;

    private Date stime;

    private BigDecimal gasCheck;
    private BigDecimal waterCheck;

}