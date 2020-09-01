package server.db.primary.model.warn;

import java.math.BigDecimal;
import java.util.Date;

public class WarnDataCur {

    private BigDecimal id;

    private BigDecimal wellId;

    private String wellName;

    private String  stationName;

    private Long alertKindId;

    private String alertKind;

    private Short alertTypeId;

    private String alertType;

    private String status;

    private Date stime;

    private String mark;

    private String mark1;

    private BigDecimal alertCur;

    private BigDecimal alertUp;

    private BigDecimal alertDown;

    private  String advice;

    private Long areaId;

    private String areaName;

    private Date startTime;

    private Date endTime;

    private BigDecimal count;

    private BigDecimal stationId;

    public BigDecimal getStationId() {
        return stationId;
    }

    public void setStationId(BigDecimal stationId) {
        this.stationId = stationId;
    }

    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaid) {
        this.areaId = areaid;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getWellId() {
        return wellId;
    }

    public void setWellId(BigDecimal wellId) {
        this.wellId = wellId;
    }

    public String getWellName() {
        return wellName;
    }

    public void setWellName(String wellName) {
        this.wellName = wellName == null ? null : wellName.trim();
    }

    public Long getAlertKindId() {
        return alertKindId;
    }

    public void setAlertKindId(Long alertKindId) {
        this.alertKindId = alertKindId;
    }

    public String getAlertKind() {
        return alertKind;
    }

    public void setAlertKind(String alertKind) {
        this.alertKind = alertKind == null ? null : alertKind.trim();
    }

    public Short getAlertTypeId() {
        return alertTypeId;
    }

    public void setAlertTypeId(Short alertTypeId) {
        this.alertTypeId = alertTypeId;
    }

    public String getAlertType() {
        return alertType;
    }

    public void setAlertType(String alertType) {
        this.alertType = alertType == null ? null : alertType.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getStime() {
        return stime;
    }

    public void setStime(Date stime) {
        this.stime = stime;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    public String getMark1() {
        return mark1;
    }

    public void setMark1(String mark1) {
        this.mark1 = mark1 == null ? null : mark1.trim();
    }

    public BigDecimal getAlertCur() {
        return alertCur;
    }

    public void setAlertCur(BigDecimal alertCur) {
        this.alertCur = alertCur;
    }

    public BigDecimal getAlertUp() {
        return alertUp;
    }

    public void setAlertUp(BigDecimal alertUp) {
        this.alertUp = alertUp;
    }

    public BigDecimal getAlertDown() {
        return alertDown;
    }

    public void setAlertDown(BigDecimal alertDown) {
        this.alertDown = alertDown;
    }
}