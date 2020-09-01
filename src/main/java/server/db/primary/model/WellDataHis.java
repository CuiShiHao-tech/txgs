package server.db.primary.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class WellDataHis implements Serializable {
    private Long id;

    private String rtuIpaddr;

    private Long wellId;

    public String getRtuIpaddr() {
        return rtuIpaddr;
    }

    public void setRtuIpaddr(String rtuIpaddr) {
        this.rtuIpaddr = rtuIpaddr;
    }

    private String wellName;

    private Long wellNum;

    private Long areaId;

    private String areaName;

    private BigDecimal uA;

    private BigDecimal uB;

    private BigDecimal uC;

    private BigDecimal iA;

    private BigDecimal iB;

    private BigDecimal iC;

    private BigDecimal eP;

    private BigDecimal eQ;

    private BigDecimal eCos;

    private BigDecimal eE;

    private BigDecimal eFreq;

    private BigDecimal eDay;

    private BigDecimal wellStroke;

    private BigDecimal wellFreq;

    private BigDecimal pressCase;

    private BigDecimal pressPipe;

    private BigDecimal pressDownhole;

    private BigDecimal tempDownhole;

    private BigDecimal lengthDownhole;

    private BigDecimal flowGasInstant;

    private BigDecimal flowGasTotle;

    private BigDecimal flowGasPress;

    private BigDecimal flowGasTemp;

    private BigDecimal flowGasTotle0;

    private Date flowGasTotle0Time;

    private BigDecimal flowGasDay;

    private BigDecimal fGasDay;

    private BigDecimal flowWaterInstant;

    private BigDecimal flowWaterTotle;

    private BigDecimal flowWaterTotle0;

    private Date flowWaterTotle0Time;

    private BigDecimal flowWaterDay;

    private BigDecimal fWaterDay;

    private Short vfdRunMode;

    private String vfdRunModeInfo;

    private Short vfdCtrlMode;

    private String vfdCtrlModeInfo;

    private BigDecimal vfdFreqConf;

    private BigDecimal vfdFreqRun;

    private Integer vfdFreqErr;

    private BigDecimal vfdOutI;

    private BigDecimal vfdOutTorque;

    private Short autoMode;

    private String autoModeInfo;

    private BigDecimal autoDownLen;

    private Short deviceMode;

    private String deviceModeInfo;

    private Short deviceStat;

    private String deviceStatInfo;

    private Long gtId;

    private Long gtBaseId;

    private BigDecimal iUpper;

    private BigDecimal iLower;

    private BigDecimal loadUpper;

    private BigDecimal loadLower;

    private String timeMark;

    private String remark;

    private Short mark;

    private Date stime;

    private Date etime;

    private BigDecimal flowWaterPTotle;

    private BigDecimal flowWaterRTotle;

    private BigDecimal gasConfig;

    private BigDecimal gasValue;

    private Date gtTime;

    private BigDecimal loadMax;

    private BigDecimal loadMin;

    private String runState;

    private BigDecimal pumpEff;

    private String stateFrequency;

    private BigDecimal producingfluidlevel;

    private BigDecimal flowWater;

    private BigDecimal flowGas;

    public BigDecimal getFlowWater() {
        return flowWater;
    }

    public void setFlowWater(BigDecimal flowWater) {
        this.flowWater = flowWater;
    }

    public BigDecimal getFlowGas() {
        return flowGas;
    }

    public void setFlowGas(BigDecimal flowGas) {
        this.flowGas = flowGas;
    }

    public BigDecimal getfGasDay() {
        return fGasDay;
    }

    public void setfGasDay(BigDecimal fGasDay) {
        this.fGasDay = fGasDay;
    }

    public BigDecimal getfWaterDay() {
        return fWaterDay;
    }

    public void setfWaterDay(BigDecimal fWaterDay) {
        this.fWaterDay = fWaterDay;
    }

    public BigDecimal getProducingfluidlevel() {
        return producingfluidlevel;
    }

    public void setProducingfluidlevel(BigDecimal producingfluidlevel) {
        this.producingfluidlevel = producingfluidlevel;
    }

    public String getStateFrequency() {
        return stateFrequency;
    }

    public void setStateFrequency(String stateFrequency) {
        this.stateFrequency = stateFrequency;
    }

    public BigDecimal getPumpEff() {
        return pumpEff;
    }

    public void setPumpEff(BigDecimal pumpEff) {
        this.pumpEff = pumpEff;
    }

    public String getRunState() {
        return runState;
    }

    public void setRunState(String runState) {
        this.runState = runState;
    }

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWellId() {
        return wellId;
    }

    public void setWellId(Long wellId) {
        this.wellId = wellId;
    }

    public String getWellName() {
        return wellName;
    }

    public void setWellName(String wellName) {
        this.wellName = wellName == null ? null : wellName.trim();
    }

    public Long getWellNum() {
        return wellNum;
    }

    public void setWellNum(Long wellNum) {
        this.wellNum = wellNum;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public BigDecimal getuA() {
        return uA;
    }

    public void setuA(BigDecimal uA) {
        this.uA = uA;
    }

    public BigDecimal getuB() {
        return uB;
    }

    public void setuB(BigDecimal uB) {
        this.uB = uB;
    }

    public BigDecimal getuC() {
        return uC;
    }

    public void setuC(BigDecimal uC) {
        this.uC = uC;
    }

    public BigDecimal getiA() {
        return iA;
    }

    public void setiA(BigDecimal iA) {
        this.iA = iA;
    }

    public BigDecimal getiB() {
        return iB;
    }

    public void setiB(BigDecimal iB) {
        this.iB = iB;
    }

    public BigDecimal getiC() {
        return iC;
    }

    public void setiC(BigDecimal iC) {
        this.iC = iC;
    }

    public BigDecimal geteP() {
        return eP;
    }

    public void seteP(BigDecimal eP) {
        this.eP = eP;
    }

    public BigDecimal geteQ() {
        return eQ;
    }

    public void seteQ(BigDecimal eQ) {
        this.eQ = eQ;
    }

    public BigDecimal geteCos() {
        return eCos;
    }

    public void seteCos(BigDecimal eCos) {
        this.eCos = eCos;
    }

    public BigDecimal geteE() {
        return eE;
    }

    public void seteE(BigDecimal eE) {
        this.eE = eE;
    }

    public BigDecimal geteFreq() {
        return eFreq;
    }

    public void seteFreq(BigDecimal eFreq) {
        this.eFreq = eFreq;
    }

    public BigDecimal geteDay() {
        return eDay;
    }

    public void seteDay(BigDecimal eDay) {
        this.eDay = eDay;
    }

    public BigDecimal getWellStroke() {
        return wellStroke;
    }

    public void setWellStroke(BigDecimal wellStroke) {
        this.wellStroke = wellStroke;
    }

    public BigDecimal getWellFreq() {
        return wellFreq;
    }

    public void setWellFreq(BigDecimal wellFreq) {
        this.wellFreq = wellFreq;
    }

    public BigDecimal getPressCase() {
        return pressCase;
    }

    public void setPressCase(BigDecimal pressCase) {
        this.pressCase = pressCase;
    }

    public BigDecimal getPressPipe() {
        return pressPipe;
    }

    public void setPressPipe(BigDecimal pressPipe) {
        this.pressPipe = pressPipe;
    }

    public BigDecimal getPressDownhole() {
        return pressDownhole;
    }

    public void setPressDownhole(BigDecimal pressDownhole) {
        this.pressDownhole = pressDownhole;
    }

    public BigDecimal getTempDownhole() {
        return tempDownhole;
    }

    public void setTempDownhole(BigDecimal tempDownhole) {
        this.tempDownhole = tempDownhole;
    }

    public BigDecimal getLengthDownhole() {
        return lengthDownhole;
    }

    public void setLengthDownhole(BigDecimal lengthDownhole) {
        this.lengthDownhole = lengthDownhole;
    }

    public BigDecimal getFlowGasInstant() {
        return flowGasInstant;
    }

    public void setFlowGasInstant(BigDecimal flowGasInstant) {
        this.flowGasInstant = flowGasInstant;
    }

    public BigDecimal getFlowGasTotle() {
        return flowGasTotle;
    }

    public void setFlowGasTotle(BigDecimal flowGasTotle) {
        this.flowGasTotle = flowGasTotle;
    }

    public BigDecimal getFlowGasPress() {
        return flowGasPress;
    }

    public void setFlowGasPress(BigDecimal flowGasPress) {
        this.flowGasPress = flowGasPress;
    }

    public BigDecimal getFlowGasTemp() {
        return flowGasTemp;
    }

    public void setFlowGasTemp(BigDecimal flowGasTemp) {
        this.flowGasTemp = flowGasTemp;
    }

    public BigDecimal getFlowGasTotle0() {
        return flowGasTotle0;
    }

    public void setFlowGasTotle0(BigDecimal flowGasTotle0) {
        this.flowGasTotle0 = flowGasTotle0;
    }

    public Date getFlowGasTotle0Time() {
        return flowGasTotle0Time;
    }

    public void setFlowGasTotle0Time(Date flowGasTotle0Time) {
        this.flowGasTotle0Time = flowGasTotle0Time;
    }

    public BigDecimal getFlowGasDay() {
        return flowGasDay;
    }

    public void setFlowGasDay(BigDecimal flowGasDay) {
        this.flowGasDay = flowGasDay;
    }

    public BigDecimal getFlowWaterInstant() {
        return flowWaterInstant;
    }

    public void setFlowWaterInstant(BigDecimal flowWaterInstant) {
        this.flowWaterInstant = flowWaterInstant;
    }

    public BigDecimal getFlowWaterTotle() {
        return flowWaterTotle;
    }

    public void setFlowWaterTotle(BigDecimal flowWaterTotle) {
        this.flowWaterTotle = flowWaterTotle;
    }

    public BigDecimal getFlowWaterTotle0() {
        return flowWaterTotle0;
    }

    public void setFlowWaterTotle0(BigDecimal flowWaterTotle0) {
        this.flowWaterTotle0 = flowWaterTotle0;
    }

    public Date getFlowWaterTotle0Time() {
        return flowWaterTotle0Time;
    }

    public void setFlowWaterTotle0Time(Date flowWaterTotle0Time) {
        this.flowWaterTotle0Time = flowWaterTotle0Time;
    }

    public BigDecimal getFlowWaterDay() {
        return flowWaterDay;
    }

    public void setFlowWaterDay(BigDecimal flowWaterDay) {
        this.flowWaterDay = flowWaterDay;
    }

    public Short getVfdRunMode() {
        return vfdRunMode;
    }

    public void setVfdRunMode(Short vfdRunMode) {
        this.vfdRunMode = vfdRunMode;
    }

    public String getVfdRunModeInfo() {
        return vfdRunModeInfo;
    }

    public void setVfdRunModeInfo(String vfdRunModeInfo) {
        this.vfdRunModeInfo = vfdRunModeInfo == null ? null : vfdRunModeInfo.trim();
    }

    public Short getVfdCtrlMode() {
        return vfdCtrlMode;
    }

    public void setVfdCtrlMode(Short vfdCtrlMode) {
        this.vfdCtrlMode = vfdCtrlMode;
    }

    public String getVfdCtrlModeInfo() {
        return vfdCtrlModeInfo;
    }

    public void setVfdCtrlModeInfo(String vfdCtrlModeInfo) {
        this.vfdCtrlModeInfo = vfdCtrlModeInfo == null ? null : vfdCtrlModeInfo.trim();
    }

    public BigDecimal getVfdFreqConf() {
        return vfdFreqConf;
    }

    public void setVfdFreqConf(BigDecimal vfdFreqConf) {
        this.vfdFreqConf = vfdFreqConf;
    }

    public BigDecimal getVfdFreqRun() {
        return vfdFreqRun;
    }

    public void setVfdFreqRun(BigDecimal vfdFreqRun) {
        this.vfdFreqRun = vfdFreqRun;
    }

    public Integer getVfdFreqErr() {
        return vfdFreqErr;
    }

    public void setVfdFreqErr(Integer vfdFreqErr) {
        this.vfdFreqErr = vfdFreqErr;
    }

    public BigDecimal getVfdOutI() {
        return vfdOutI;
    }

    public void setVfdOutI(BigDecimal vfdOutI) {
        this.vfdOutI = vfdOutI;
    }

    public BigDecimal getVfdOutTorque() {
        return vfdOutTorque;
    }

    public void setVfdOutTorque(BigDecimal vfdOutTorque) {
        this.vfdOutTorque = vfdOutTorque;
    }

    public Short getAutoMode() {
        return autoMode;
    }

    public void setAutoMode(Short autoMode) {
        this.autoMode = autoMode;
    }

    public String getAutoModeInfo() {
        return autoModeInfo;
    }

    public void setAutoModeInfo(String autoModeInfo) {
        this.autoModeInfo = autoModeInfo == null ? null : autoModeInfo.trim();
    }

    public BigDecimal getAutoDownLen() {
        return autoDownLen;
    }

    public void setAutoDownLen(BigDecimal autoDownLen) {
        this.autoDownLen = autoDownLen;
    }

    public Short getDeviceMode() {
        return deviceMode;
    }

    public void setDeviceMode(Short deviceMode) {
        this.deviceMode = deviceMode;
    }

    public String getDeviceModeInfo() {
        return deviceModeInfo;
    }

    public void setDeviceModeInfo(String deviceModeInfo) {
        this.deviceModeInfo = deviceModeInfo == null ? null : deviceModeInfo.trim();
    }

    public Short getDeviceStat() {
        return deviceStat;
    }

    public void setDeviceStat(Short deviceStat) {
        this.deviceStat = deviceStat;
    }

    public String getDeviceStatInfo() {
        return deviceStatInfo;
    }

    public void setDeviceStatInfo(String deviceStatInfo) {
        this.deviceStatInfo = deviceStatInfo == null ? null : deviceStatInfo.trim();
    }

    public Long getGtId() {
        return gtId;
    }

    public void setGtId(Long gtId) {
        this.gtId = gtId;
    }

    public Long getGtBaseId() {
        return gtBaseId;
    }

    public void setGtBaseId(Long gtBaseId) {
        this.gtBaseId = gtBaseId;
    }

    public BigDecimal getiUpper() {
        return iUpper;
    }

    public void setiUpper(BigDecimal iUpper) {
        this.iUpper = iUpper;
    }

    public BigDecimal getiLower() {
        return iLower;
    }

    public void setiLower(BigDecimal iLower) {
        this.iLower = iLower;
    }

    public BigDecimal getLoadUpper() {
        return loadUpper;
    }

    public void setLoadUpper(BigDecimal loadUpper) {
        this.loadUpper = loadUpper;
    }

    public BigDecimal getLoadLower() {
        return loadLower;
    }

    public void setLoadLower(BigDecimal loadLower) {
        this.loadLower = loadLower;
    }

    public String getTimeMark() {
        return timeMark;
    }

    public void setTimeMark(String timeMark) {
        this.timeMark = timeMark == null ? null : timeMark.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Short getMark() {
        return mark;
    }

    public void setMark(Short mark) {
        this.mark = mark;
    }

    public Date getStime() {
        return stime;
    }

    public void setStime(Date stime) {
        this.stime = stime;
    }

    public Date getEtime() {
        return etime;
    }

    public void setEtime(Date etime) {
        this.etime = etime;
    }

    public BigDecimal getFlowWaterPTotle() {
        return flowWaterPTotle;
    }

    public void setFlowWaterPTotle(BigDecimal flowWaterPTotle) {
        this.flowWaterPTotle = flowWaterPTotle;
    }

    public BigDecimal getFlowWaterRTotle() {
        return flowWaterRTotle;
    }

    public void setFlowWaterRTotle(BigDecimal flowWaterRTotle) {
        this.flowWaterRTotle = flowWaterRTotle;
    }

    public BigDecimal getGasConfig() {
        return gasConfig;
    }

    public void setGasConfig(BigDecimal gasConfig) {
        this.gasConfig = gasConfig;
    }

    public BigDecimal getGasValue() {
        return gasValue;
    }

    public void setGasValue(BigDecimal gasValue) {
        this.gasValue = gasValue;
    }

    public Date getGtTime() {
        return gtTime;
    }

    public void setGtTime(Date gtTime) {
        this.gtTime = gtTime;
    }

    public BigDecimal getLoadMax() {
        return loadMax;
    }

    public void setLoadMax(BigDecimal loadMax) {
        this.loadMax = loadMax;
    }

    public BigDecimal getLoadMin() {
        return loadMin;
    }

    public void setLoadMin(BigDecimal loadMin) {
        this.loadMin = loadMin;
    }
}