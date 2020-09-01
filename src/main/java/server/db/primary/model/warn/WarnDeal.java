package server.db.primary.model.warn;

import java.math.BigDecimal;
import java.util.Date;

public class WarnDeal {
    private BigDecimal id;

    private BigDecimal warnId;

    private String reporter;

    private Date alertDate;

    private String maintainer;

    private Date maintainDate;

    private String result;

    private String nextHandle;

    private String mark;

    private String mark1;

    private String receiver;

    private BigDecimal timeSpan;

    private String maintainState;

    private String handleWay;

    public Date getMaintainDate() {
        return maintainDate;
    }

    public void setMaintainDate(Date maintainDate) {
        this.maintainDate = maintainDate;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getWarnId() {
        return warnId;
    }

    public void setWarnId(BigDecimal warnId) {
        this.warnId = warnId;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter == null ? null : reporter.trim();
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
        this.maintainer = maintainer == null ? null : maintainer.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public String getNextHandle() {
        return nextHandle;
    }

    public void setNextHandle(String nextHandle) {
        this.nextHandle = nextHandle == null ? null : nextHandle.trim();
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

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
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
        this.maintainState = maintainState == null ? null : maintainState.trim();
    }

    public String getHandleWay() {
        return handleWay;
    }

    public void setHandleWay(String handleWay) {
        this.handleWay = handleWay == null ? null : handleWay.trim();
    }
}