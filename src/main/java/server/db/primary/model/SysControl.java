package server.db.primary.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SysControl implements Serializable {
    private Short id;

    private Short wellId;

    private String wellName;

    private BigDecimal cmdValue;

    private String ip;

    private Date stime;

    private Integer typeId;

    private String cmdName;

    private String cmdAddress;

    private Long port;

    private static final long serialVersionUID = 1L;

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
        this.wellName = wellName == null ? null : wellName.trim();
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
        this.ip = ip == null ? null : ip.trim();
    }

    public Date getStime() {
        return stime;
    }

    public void setStime(Date stime) {
        this.stime = stime;
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
        this.cmdName = cmdName == null ? null : cmdName.trim();
    }

    public String getCmdAddress() {
        return cmdAddress;
    }

    public void setCmdAddress(String cmdAddress) {
        this.cmdAddress = cmdAddress == null ? null : cmdAddress.trim();
    }

    public Long getPort() {
        return port;
    }

    public void setPort(Long port) {
        this.port = port;
    }
}