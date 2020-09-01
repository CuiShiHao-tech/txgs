package server.db.primary.model.warn;

import java.math.BigDecimal;
import java.util.Date;

public class WarnTimeOut {
    private Short id;

    private Short userId;

    private String userName;

    private Date stime;

    private Short areaId;

    private String areaName;

    private BigDecimal commExTimeOut;

    private BigDecimal pressCommExTimeOut;

    private BigDecimal strokeCommExTimeOut;

    private BigDecimal uTimeOut;

    private BigDecimal iTimeOut;

    private BigDecimal pressOilTimeOut;

    private BigDecimal jigFrequencyTimeOut;

    private BigDecimal wellStrokeTimeOut;

    private BigDecimal loadTimeOut;

    private BigDecimal tempWellheadTimeOut;

    private BigDecimal gtProdTimeOut;

    private BigDecimal gtTimeOut;

    private String mark;

    private BigDecimal flowWaterInstantTimeOut;

    private BigDecimal closeWellExTimeOut;

    private BigDecimal pressCaseTimeOut;

    private BigDecimal pressDownholeTimeOut;

    public BigDecimal getPressCaseTimeOut() {
        return pressCaseTimeOut;
    }

    public void setPressCaseTimeOut(BigDecimal pressCaseTimeOut) {
        this.pressCaseTimeOut = pressCaseTimeOut;
    }

    public BigDecimal getPressDownholeTimeOut() {
        return pressDownholeTimeOut;
    }

    public void setPressDownholeTimeOut(BigDecimal pressDownholeTimeOut) {
        this.pressDownholeTimeOut = pressDownholeTimeOut;
    }

    public BigDecimal getCloseWellExTimeOut() {
        return closeWellExTimeOut;
    }

    public void setCloseWellExTimeOut(BigDecimal closeWellExTimeOut) {
        this.closeWellExTimeOut = closeWellExTimeOut;
    }

    public BigDecimal getFlowWaterInstantTimeOut() {
        return flowWaterInstantTimeOut;
    }

    public void setFlowWaterInstantTimeOut(BigDecimal flowWaterInstantTimeOut) {
        this.flowWaterInstantTimeOut = flowWaterInstantTimeOut;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Short getUserId() {
        return userId;
    }

    public void setUserId(Short userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getStime() {
        return stime;
    }

    public void setStime(Date stime) {
        this.stime = stime;
    }

    public Short getAreaId() {
        return areaId;
    }

    public void setAreaId(Short areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public BigDecimal getCommExTimeOut() {
        return commExTimeOut;
    }

    public void setCommExTimeOut(BigDecimal commExTimeOut) {
        this.commExTimeOut = commExTimeOut;
    }

    public BigDecimal getPressCommExTimeOut() {
        return pressCommExTimeOut;
    }

    public void setPressCommExTimeOut(BigDecimal pressCommExTimeOut) {
        this.pressCommExTimeOut = pressCommExTimeOut;
    }

    public BigDecimal getStrokeCommExTimeOut() {
        return strokeCommExTimeOut;
    }

    public void setStrokeCommExTimeOut(BigDecimal strokeCommExTimeOut) {
        this.strokeCommExTimeOut = strokeCommExTimeOut;
    }

    public BigDecimal getuTimeOut() {
        return uTimeOut;
    }

    public void setuTimeOut(BigDecimal uTimeOut) {
        this.uTimeOut = uTimeOut;
    }

    public BigDecimal getiTimeOut() {
        return iTimeOut;
    }

    public void setiTimeOut(BigDecimal iTimeOut) {
        this.iTimeOut = iTimeOut;
    }

    public BigDecimal getPressOilTimeOut() {
        return pressOilTimeOut;
    }

    public void setPressOilTimeOut(BigDecimal pressOilTimeOut) {
        this.pressOilTimeOut = pressOilTimeOut;
    }

    public BigDecimal getJigFrequencyTimeOut() {
        return jigFrequencyTimeOut;
    }

    public void setJigFrequencyTimeOut(BigDecimal jigFrequencyTimeOut) {
        this.jigFrequencyTimeOut = jigFrequencyTimeOut;
    }

    public BigDecimal getWellStrokeTimeOut() {
        return wellStrokeTimeOut;
    }

    public void setWellStrokeTimeOut(BigDecimal wellStrokeTimeOut) {
        this.wellStrokeTimeOut = wellStrokeTimeOut;
    }

    public BigDecimal getLoadTimeOut() {
        return loadTimeOut;
    }

    public void setLoadTimeOut(BigDecimal loadTimeOut) {
        this.loadTimeOut = loadTimeOut;
    }

    public BigDecimal getTempWellheadTimeOut() {
        return tempWellheadTimeOut;
    }

    public void setTempWellheadTimeOut(BigDecimal tempWellheadTimeOut) {
        this.tempWellheadTimeOut = tempWellheadTimeOut;
    }

    public BigDecimal getGtProdTimeOut() {
        return gtProdTimeOut;
    }

    public void setGtProdTimeOut(BigDecimal gtProdTimeOut) {
        this.gtProdTimeOut = gtProdTimeOut;
    }

    public BigDecimal getGtTimeOut() {
        return gtTimeOut;
    }

    public void setGtTimeOut(BigDecimal gtTimeOut) {
        this.gtTimeOut = gtTimeOut;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }
}