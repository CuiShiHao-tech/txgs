package server.db.primary.model.warn;

import java.math.BigDecimal;
import java.util.Date;

public class WarnSysConfig {
    private BigDecimal id;

    private BigDecimal wellId;

    private String commExLimit;

    private Long commExCount;

    private String closeWellExLimit;

    private Long closeWellExCount;

    private String pressCommExLimit;

    private Long pressCommExCount;

    private String strokeCommExLimit;

    private Long strokeCommExCount;

    private Date stime;

    private String mark;

    private String mark1;

    private BigDecimal commExTimeOut;

    private BigDecimal pressCommExTimeOut;

    private BigDecimal strokeCommExTimeOut;

    private String commExMark;

    private String pressCommExMark;

    private String strokeCommExMark;

    private BigDecimal closeWellExTimeOut;

    private String closeWellExMark;

    public BigDecimal getCloseWellExTimeOut() {
        return closeWellExTimeOut;
    }

    public void setCloseWellExTimeOut(BigDecimal closeWellExTimeOut) {
        this.closeWellExTimeOut = closeWellExTimeOut;
    }

    public String getCloseWellExMark() {
        return closeWellExMark;
    }

    public void setCloseWellExMark(String closeWellExMark) {
        this.closeWellExMark = closeWellExMark;
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

    public String getCommExLimit() {
        return commExLimit;
    }

    public void setCommExLimit(String commExLimit) {
        this.commExLimit = commExLimit;
    }

    public Long getCommExCount() {
        return commExCount;
    }

    public void setCommExCount(Long commExCount) {
        this.commExCount = commExCount;
    }

    public String getCloseWellExLimit() {
        return closeWellExLimit;
    }

    public void setCloseWellExLimit(String closeWellExLimit) {
        this.closeWellExLimit = closeWellExLimit;
    }

    public Long getCloseWellExCount() {
        return closeWellExCount;
    }

    public void setCloseWellExCount(Long closeWellExCount) {
        this.closeWellExCount = closeWellExCount;
    }

    public String getPressCommExLimit() {
        return pressCommExLimit;
    }

    public void setPressCommExLimit(String pressCommExLimit) {
        this.pressCommExLimit = pressCommExLimit;
    }

    public Long getPressCommExCount() {
        return pressCommExCount;
    }

    public void setPressCommExCount(Long pressCommExCount) {
        this.pressCommExCount = pressCommExCount;
    }

    public String getStrokeCommExLimit() {
        return strokeCommExLimit;
    }

    public void setStrokeCommExLimit(String strokeCommExLimit) {
        this.strokeCommExLimit = strokeCommExLimit;
    }

    public Long getStrokeCommExCount() {
        return strokeCommExCount;
    }

    public void setStrokeCommExCount(Long strokeCommExCount) {
        this.strokeCommExCount = strokeCommExCount;
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

    public String getCommExMark() {
        return commExMark;
    }

    public void setCommExMark(String commExMark) {
        this.commExMark = commExMark;
    }

    public String getPressCommExMark() {
        return pressCommExMark;
    }

    public void setPressCommExMark(String pressCommExMark) {
        this.pressCommExMark = pressCommExMark;
    }

    public String getStrokeCommExMark() {
        return strokeCommExMark;
    }

    public void setStrokeCommExMark(String strokeCommExMark) {
        this.strokeCommExMark = strokeCommExMark;
    }
}