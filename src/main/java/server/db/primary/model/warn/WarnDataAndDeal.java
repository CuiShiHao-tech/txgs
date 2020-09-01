package server.db.primary.model.warn;

import java.math.BigDecimal;
import java.util.Date;

public class WarnDataAndDeal {
    private BigDecimal id;

    private BigDecimal wellId;

    private String wellName;

    private String stationName;

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

    private String reporter;

    private Date alertDate;

    private String maintainer;

    private Date maintainDate;

    private String result;

    private String nextHandle;

    private String receiver;

    private BigDecimal timeSpan;

    private String maintainState;

    private String handleWay;

    private BigDecimal warnDealId;

    private BigDecimal count;

    private Date startTime;

    private Date endTime;



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

    public BigDecimal getWarnDealId() {
        return warnDealId;
    }

    public void setWarnDealId(BigDecimal warnDealId) {
        this.warnDealId = warnDealId;
    }

    public Date getMaintainDate() {
        return maintainDate;
    }

    public void setMaintainDate(Date maintainDate) {
        this.maintainDate = maintainDate;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public BigDecimal getTimeSpan() {
        return timeSpan;
    }

    public void setTimeSpan(BigDecimal timeSpan) {
        this.timeSpan = timeSpan;
    }

    public String getMaintainState() {
        return maintainState;
    }

    public void setMaintainState(String maintainState) {
        this.maintainState = maintainState;
    }

    public String getHandleWay() {
        return handleWay;
    }

    public void setHandleWay(String handleWay) {
        this.handleWay = handleWay;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
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
        this.wellName = wellName;
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
        this.alertKind = alertKind;
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
        this.alertType = alertType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        this.mark = mark;
    }

    public String getMark1() {
        return mark1;
    }

    public void setMark1(String mark1) {
        this.mark1 = mark1;
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

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public Date getAlertDate() {
        return alertDate;
    }

    public void setAlertDate(Date alertDate) {
        this.alertDate = alertDate;
    }

    public String getMaintainer() {
        return maintainer;
    }

    public void setMaintainer(String maintainer) {
        this.maintainer = maintainer;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getNextHandle() {
        return nextHandle;
    }

    public void setNextHandle(String nextHandle) {
        this.nextHandle = nextHandle;
    }
}