package server.db.primary.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class WellGtDataBase implements Serializable {
    private Long id;

    private Long gtId;

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

    private Short ncount;

    private String mark2;

    public Short getNcount() {
        return ncount;
    }

    public void setNcount(Short ncount) {
        this.ncount = ncount;
    }

    public String getMark2() {
        return mark2;
    }

    public void setMark2(String mark2) {
        this.mark2 = mark2;
    }

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGtId() {
        return gtId;
    }

    public void setGtId(Long gtId) {
        this.gtId = gtId;
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
}