package server.db.primary.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class WellGtData implements Serializable {
    private Long id;

    private String plcIpaddr;

    private Long wellId;

    private String wellName;

    private Long wellNum;

    private Integer stateNode;

    private Integer stateRead;

    private Integer stateAlert;

    private Integer collectPoint;

    private Integer decimalPoint;

    private Integer collectInterval;

    private Integer batteryVal;

    private BigDecimal jigFreq;

    private Long collecttimeInt;

    private String collectTime;

    private String gtBase;

    private String gtData;

    private String gtPosition;

    private String gtLoad;

    private String loadData;

    private BigDecimal loadMax;

    private BigDecimal loadMin;

    private BigDecimal pointUpper;

    private BigDecimal pointLower;

    private BigDecimal wellStroke;

    private BigDecimal gtArea;

    private Short mark;

    private Date stime;

    private String iData;

    private String pData;

    private BigDecimal iUpper;

    private BigDecimal iLower;

    private BigDecimal pUpper;

    private BigDecimal pLower;

    private BigDecimal pAvg;

    private BigDecimal pRmg;

    private BigDecimal wUpper;

    private BigDecimal pumpborediameter;

    private BigDecimal pumpsettingdepth;

    private BigDecimal producingfluidlevel;

    private String diagResultstring;

    private BigDecimal prodLiquidV;

    public BigDecimal getPumpborediameter() {
        return pumpborediameter;
    }

    public void setPumpborediameter(BigDecimal pumpborediameter) {
        this.pumpborediameter = pumpborediameter;
    }

    public BigDecimal getPumpsettingdepth() {
        return pumpsettingdepth;
    }

    public void setPumpsettingdepth(BigDecimal pumpsettingdepth) {
        this.pumpsettingdepth = pumpsettingdepth;
    }

    public BigDecimal getProducingfluidlevel() {
        return producingfluidlevel;
    }

    public void setProducingfluidlevel(BigDecimal producingfluidlevel) {
        this.producingfluidlevel = producingfluidlevel;
    }

    public String getDiagResultstring() {
        return diagResultstring;
    }

    public void setDiagResultstring(String diagResultstring) {
        this.diagResultstring = diagResultstring;
    }

    public BigDecimal getProdLiquidV() {
        return prodLiquidV;
    }

    public void setProdLiquidV(BigDecimal prodLiquidV) {
        this.prodLiquidV = prodLiquidV;
    }

    public BigDecimal getpRmg() {
        return pRmg;
    }

    public void setpRmg(BigDecimal pRmg) {
        this.pRmg = pRmg;
    }

    public BigDecimal getpAvg() {
        return pAvg;
    }

    public void setpAvg(BigDecimal pAvg) {
        this.pAvg = pAvg;
    }


    public BigDecimal getwUpper() {
        return wUpper;
    }

    public void setwUpper(BigDecimal wUpper) {
        this.wUpper = wUpper;
    }

    public BigDecimal getwLower() {
        return wLower;
    }

    public void setwLower(BigDecimal wLower) {
        this.wLower = wLower;
    }

    private BigDecimal wLower;

    public String getSsTime() {
        return ssTime;
    }

    public void setSsTime(String ssTime) {
        this.ssTime = ssTime;
    }

    private String ssTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlcIpaddr() {
        return plcIpaddr;
    }

    public void setPlcIpaddr(String plcIpaddr) {
        this.plcIpaddr = plcIpaddr == null ? null : plcIpaddr.trim();
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

    public Integer getStateNode() {
        return stateNode;
    }

    public void setStateNode(Integer stateNode) {
        this.stateNode = stateNode;
    }

    public Integer getStateRead() {
        return stateRead;
    }

    public void setStateRead(Integer stateRead) {
        this.stateRead = stateRead;
    }

    public Integer getStateAlert() {
        return stateAlert;
    }

    public void setStateAlert(Integer stateAlert) {
        this.stateAlert = stateAlert;
    }

    public Integer getCollectPoint() {
        return collectPoint;
    }

    public void setCollectPoint(Integer collectPoint) {
        this.collectPoint = collectPoint;
    }

    public Integer getDecimalPoint() {
        return decimalPoint;
    }

    public void setDecimalPoint(Integer decimalPoint) {
        this.decimalPoint = decimalPoint;
    }

    public Integer getCollectInterval() {
        return collectInterval;
    }

    public void setCollectInterval(Integer collectInterval) {
        this.collectInterval = collectInterval;
    }

    public Integer getBatteryVal() {
        return batteryVal;
    }

    public void setBatteryVal(Integer batteryVal) {
        this.batteryVal = batteryVal;
    }

    public BigDecimal getJigFreq() {
        return jigFreq;
    }

    public void setJigFreq(BigDecimal jigFreq) {
        this.jigFreq = jigFreq;
    }

    public Long getCollecttimeInt() {
        return collecttimeInt;
    }

    public void setCollecttimeInt(Long collecttimeInt) {
        this.collecttimeInt = collecttimeInt;
    }

    public String getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(String collectTime) {
        this.collectTime = collectTime == null ? null : collectTime.trim();
    }

    public String getGtBase() {
        return gtBase;
    }

    public void setGtBase(String gtBase) {
        this.gtBase = gtBase == null ? null : gtBase.trim();
    }

    public String getGtData() {
        return gtData;
    }

    public void setGtData(String gtData) {
        this.gtData = gtData == null ? null : gtData.trim();
    }

    public String getGtPosition() {
        return gtPosition;
    }

    public void setGtPosition(String gtPosition) {
        this.gtPosition = gtPosition == null ? null : gtPosition.trim();
    }

    public String getGtLoad() {
        return gtLoad;
    }

    public void setGtLoad(String gtLoad) {
        this.gtLoad = gtLoad == null ? null : gtLoad.trim();
    }

    public String getLoadData() {
        return loadData;
    }

    public void setLoadData(String loadData) {
        this.loadData = loadData == null ? null : loadData.trim();
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

    public BigDecimal getPointUpper() {
        return pointUpper;
    }

    public void setPointUpper(BigDecimal pointUpper) {
        this.pointUpper = pointUpper;
    }

    public BigDecimal getPointLower() {
        return pointLower;
    }

    public void setPointLower(BigDecimal pointLower) {
        this.pointLower = pointLower;
    }

    public BigDecimal getWellStroke() {
        return wellStroke;
    }

    public void setWellStroke(BigDecimal wellStroke) {
        this.wellStroke = wellStroke;
    }

    public BigDecimal getGtArea() {
        return gtArea;
    }

    public void setGtArea(BigDecimal gtArea) {
        this.gtArea = gtArea;
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

    public String getiData() {
        return iData;
    }

    public void setiData(String iData) {
        this.iData = iData == null ? null : iData.trim();
    }

    public String getpData() {
        return pData;
    }

    public void setpData(String pData) {
        this.pData = pData == null ? null : pData.trim();
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

    public BigDecimal getpUpper() {
        return pUpper;
    }

    public void setpUpper(BigDecimal pUpper) {
        this.pUpper = pUpper;
    }

    public BigDecimal getpLower() {
        return pLower;
    }

    public void setpLower(BigDecimal pLower) {
        this.pLower = pLower;
    }
}