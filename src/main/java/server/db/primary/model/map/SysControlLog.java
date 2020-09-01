package server.db.primary.model.map;

import java.math.BigDecimal;
import java.util.Date;

public class SysControlLog {
    private Short id;

    private Short wellId;

    private String wellName;

    private BigDecimal cmdValue;

    private String ip;

    private Integer typeId;

    private String cmdName;

    private String cmdAddress;

    private Long port;

    private Date stime;

    private Date etime;

    private String serial;

    private String status;

    private String remark;

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

    public BigDecimal getCmdValue() {
        return cmdValue;
    }

    public void setCmdValue(BigDecimal cmdValue) {
        this.cmdValue = cmdValue;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getCmdName() {
        return cmdName;
    }

    public void setCmdName(String cmdName) {
        this.cmdName = cmdName;
    }

    public String getCmdAddress() {
        return cmdAddress;
    }

    public void setCmdAddress(String cmdAddress) {
        this.cmdAddress = cmdAddress;
    }

    public Long getPort() {
        return port;
    }

    public void setPort(Long port) {
        this.port = port;
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

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}