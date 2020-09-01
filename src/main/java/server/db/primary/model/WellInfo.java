package server.db.primary.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class WellInfo implements Serializable {
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

    private Short mark;

    private Date stime;

    private String remark;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWellName() {
        return wellName;
    }

    public void setWellName(String wellName) {
        this.wellName = wellName == null ? null : wellName.trim();
    }

    public String getWellNameAlias() {
        return wellNameAlias;
    }

    public void setWellNameAlias(String wellNameAlias) {
        this.wellNameAlias = wellNameAlias == null ? null : wellNameAlias.trim();
    }

    public Long getWellNum() {
        return wellNum;
    }

    public void setWellNum(Long wellNum) {
        this.wellNum = wellNum;
    }

    public Long getCoId() {
        return coId;
    }

    public void setCoId(Long coId) {
        this.coId = coId;
    }

    public String getCoName() {
        return coName;
    }

    public void setCoName(String coName) {
        this.coName = coName == null ? null : coName.trim();
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

    public Long getAreaNum() {
        return areaNum;
    }

    public void setAreaNum(Long areaNum) {
        this.areaNum = areaNum;
    }

    public Long getStationId() {
        return stationId;
    }

    public void setStationId(Long stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName == null ? null : stationName.trim();
    }

    public Long getStationNum() {
        return stationNum;
    }

    public void setStationNum(Long stationNum) {
        this.stationNum = stationNum;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public String getRtuType() {
        return rtuType;
    }

    public void setRtuType(String rtuType) {
        this.rtuType = rtuType == null ? null : rtuType.trim();
    }

    public String getRtuIpaddr() {
        return rtuIpaddr;
    }

    public void setRtuIpaddr(String rtuIpaddr) {
        this.rtuIpaddr = rtuIpaddr == null ? null : rtuIpaddr.trim();
    }

    public Integer getRtuPort() {
        return rtuPort;
    }

    public void setRtuPort(Integer rtuPort) {
        this.rtuPort = rtuPort;
    }

    public BigDecimal getWellX() {
        return wellX;
    }

    public void setWellX(BigDecimal wellX) {
        this.wellX = wellX;
    }

    public BigDecimal getWellY() {
        return wellY;
    }

    public void setWellY(BigDecimal wellY) {
        this.wellY = wellY;
    }

    public String getWellType() {
        return wellType;
    }

    public void setWellType(String wellType) {
        this.wellType = wellType == null ? null : wellType.trim();
    }

    public String getPumpType() {
        return pumpType;
    }

    public void setPumpType(String pumpType) {
        this.pumpType = pumpType == null ? null : pumpType.trim();
    }

    public Short getAutomationMark() {
        return automationMark;
    }

    public void setAutomationMark(Short automationMark) {
        this.automationMark = automationMark;
    }

    public Long getPressPipeWId() {
        return pressPipeWId;
    }

    public void setPressPipeWId(Long pressPipeWId) {
        this.pressPipeWId = pressPipeWId;
    }

    public String getPressPipeWName() {
        return pressPipeWName;
    }

    public void setPressPipeWName(String pressPipeWName) {
        this.pressPipeWName = pressPipeWName == null ? null : pressPipeWName.trim();
    }

    public Short getAutoDrainage() {
        return autoDrainage;
    }

    public void setAutoDrainage(Short autoDrainage) {
        this.autoDrainage = autoDrainage;
    }

    public Short getvMark() {
        return vMark;
    }

    public void setvMark(Short vMark) {
        this.vMark = vMark;
    }

    public Short getvType() {
        return vType;
    }

    public void setvType(Short vType) {
        this.vType = vType;
    }

    public String getvTypeName() {
        return vTypeName;
    }

    public void setvTypeName(String vTypeName) {
        this.vTypeName = vTypeName == null ? null : vTypeName.trim();
    }

    public String getvIpaddr() {
        return vIpaddr;
    }

    public void setvIpaddr(String vIpaddr) {
        this.vIpaddr = vIpaddr == null ? null : vIpaddr.trim();
    }

    public String getWellState() {
        return wellState;
    }

    public void setWellState(String wellState) {
        this.wellState = wellState == null ? null : wellState.trim();
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