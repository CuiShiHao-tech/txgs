package server.db.primary.model;

import java.math.BigDecimal;
import java.util.Date;

public class Drainage {
    private Short id;

    private Short wellId;

    private String wellName;

    private Date setTime;

    private BigDecimal oldValue;

    private BigDecimal setValue;

    private Date stime;

    private Short stationId;

    private String stationName;

    private Short areaId;

    private String areaName;

    private BigDecimal flowGasPress;

    private BigDecimal flowGasInstant;

    private String drainageModel;

    private BigDecimal drainageValue;

    private BigDecimal wellFreq;

    private BigDecimal pressDownhole;

    private BigDecimal vfdFreqRun;

    private BigDecimal pressCase;

    private BigDecimal downRealMeter;

    private BigDecimal downShouldValue;

    private BigDecimal downRealValue;

    private String runState;

    private BigDecimal drainageTime;

    public BigDecimal getDrainageTime() {
        return drainageTime;
    }

    public void setDrainageTime(BigDecimal drainageTime) {
        this.drainageTime = drainageTime;
    }

    public String getRunState() {
        return runState;
    }

    public void setRunState(String runState) {
        this.runState = runState;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Short getWellId() {
        return wellId;
    }

    public void setWellId(Short wellId) {
        this.wellId = wellId;
    }

    public String getWellName() {
        return wellName;
    }

    public void setWellName(String wellName) {
        this.wellName = wellName;
    }

    public Date getSetTime() {
        return setTime;
    }

    public void setSetTime(Date setTime) {
        this.setTime = setTime;
    }

    public BigDecimal getOldValue() {
        return oldValue;
    }

    public void setOldValue(BigDecimal oldValue) {
        this.oldValue = oldValue;
    }

    public BigDecimal getSetValue() {
        return setValue;
    }

    public void setSetValue(BigDecimal setValue) {
        this.setValue = setValue;
    }

    public Date getStime() {
        return stime;
    }

    public void setStime(Date stime) {
        this.stime = stime;
    }

    public Short getStationId() {
        return stationId;
    }

    public void setStationId(Short stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
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
        this.areaName = areaName;
    }

    public BigDecimal getFlowGasPress() {
        return flowGasPress;
    }

    public void setFlowGasPress(BigDecimal flowGasPress) {
        this.flowGasPress = flowGasPress;
    }

    public BigDecimal getFlowGasInstant() {
        return flowGasInstant;
    }

    public void setFlowGasInstant(BigDecimal flowGasInstant) {
        this.flowGasInstant = flowGasInstant;
    }

    public String getDrainageModel() {
        return drainageModel;
    }

    public void setDrainageModel(String drainageModel) {
        this.drainageModel = drainageModel;
    }

    public BigDecimal getDrainageValue() {
        return drainageValue;
    }

    public void setDrainageValue(BigDecimal drainageValue) {
        this.drainageValue = drainageValue;
    }

    public BigDecimal getWellFreq() {
        return wellFreq;
    }

    public void setWellFreq(BigDecimal wellFreq) {
        this.wellFreq = wellFreq;
    }

    public BigDecimal getPressDownhole() {
        return pressDownhole;
    }

    public void setPressDownhole(BigDecimal pressDownhole) {
        this.pressDownhole = pressDownhole;
    }

    public BigDecimal getVfdFreqRun() {
        return vfdFreqRun;
    }

    public void setVfdFreqRun(BigDecimal vfdFreqRun) {
        this.vfdFreqRun = vfdFreqRun;
    }

    public BigDecimal getPressCase() {
        return pressCase;
    }

    public void setPressCase(BigDecimal pressCase) {
        this.pressCase = pressCase;
    }

    public BigDecimal getDownRealMeter() {
        return downRealMeter;
    }

    public void setDownRealMeter(BigDecimal downRealMeter) {
        this.downRealMeter = downRealMeter;
    }

    public BigDecimal getDownShouldValue() {
        return downShouldValue;
    }

    public void setDownShouldValue(BigDecimal downShouldValue) {
        this.downShouldValue = downShouldValue;
    }

    public BigDecimal getDownRealValue() {
        return downRealValue;
    }

    public void setDownRealValue(BigDecimal downRealValue) {
        this.downRealValue = downRealValue;
    }
}