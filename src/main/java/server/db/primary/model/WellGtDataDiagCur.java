package server.db.primary.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class WellGtDataDiagCur implements Serializable {
    private Long id;

    private Long gtId;

    private Long gtRespId;

    private Long wellId;

    private String wellName;

    private Short resultstatus;

    private Integer diagResultcode;

    private String diagResultstring;

    private Short errorcounter;

    private String errorstring;

    private Short warningcounter;

    private String warningstring;

    private Short sdkpluscounter;

    private String sdkplusstring;

    private Short cnt;

    private BigDecimal lengthall;

    private BigDecimal weightall;

    private BigDecimal buoyancyforceall;

    private BigDecimal leakPumpV;

    private BigDecimal leakTvV;

    private BigDecimal leakSvV;

    private BigDecimal gasInfluenceV;

    private BigDecimal leakPumpW;

    private BigDecimal leakTvW;

    private BigDecimal leakSvW;

    private BigDecimal gasInfluenceW;

    private String gtTime;

    private Long wellNum;

    private Short mark;

    private Date stime;

    private Long areaId;

    private String areaName;

    private Short ncount;

    public String getGtDiagOptimization() {
        return gtDiagOptimization;
    }

    public void setGtDiagOptimization(String gtDiagOptimization) {
        this.gtDiagOptimization = gtDiagOptimization;
    }

    private String gtDiagOptimization;

    public Short getNcount() {
        return ncount;
    }

    public void setNcount(Short ncount) {
        this.ncount = ncount;
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

    public Long getGtRespId() {
        return gtRespId;
    }

    public void setGtRespId(Long gtRespId) {
        this.gtRespId = gtRespId;
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

    public Short getResultstatus() {
        return resultstatus;
    }

    public void setResultstatus(Short resultstatus) {
        this.resultstatus = resultstatus;
    }

    public Integer getDiagResultcode() {
        return diagResultcode;
    }

    public void setDiagResultcode(Integer diagResultcode) {
        this.diagResultcode = diagResultcode;
    }

    public String getDiagResultstring() {
        return diagResultstring;
    }

    public void setDiagResultstring(String diagResultstring) {
        this.diagResultstring = diagResultstring == null ? null : diagResultstring.trim();
    }

    public Short getErrorcounter() {
        return errorcounter;
    }

    public void setErrorcounter(Short errorcounter) {
        this.errorcounter = errorcounter;
    }

    public String getErrorstring() {
        return errorstring;
    }

    public void setErrorstring(String errorstring) {
        this.errorstring = errorstring == null ? null : errorstring.trim();
    }

    public Short getWarningcounter() {
        return warningcounter;
    }

    public void setWarningcounter(Short warningcounter) {
        this.warningcounter = warningcounter;
    }

    public String getWarningstring() {
        return warningstring;
    }

    public void setWarningstring(String warningstring) {
        this.warningstring = warningstring == null ? null : warningstring.trim();
    }

    public Short getSdkpluscounter() {
        return sdkpluscounter;
    }

    public void setSdkpluscounter(Short sdkpluscounter) {
        this.sdkpluscounter = sdkpluscounter;
    }

    public String getSdkplusstring() {
        return sdkplusstring;
    }

    public void setSdkplusstring(String sdkplusstring) {
        this.sdkplusstring = sdkplusstring == null ? null : sdkplusstring.trim();
    }

    public Short getCnt() {
        return cnt;
    }

    public void setCnt(Short cnt) {
        this.cnt = cnt;
    }

    public BigDecimal getLengthall() {
        return lengthall;
    }

    public void setLengthall(BigDecimal lengthall) {
        this.lengthall = lengthall;
    }

    public BigDecimal getWeightall() {
        return weightall;
    }

    public void setWeightall(BigDecimal weightall) {
        this.weightall = weightall;
    }

    public BigDecimal getBuoyancyforceall() {
        return buoyancyforceall;
    }

    public void setBuoyancyforceall(BigDecimal buoyancyforceall) {
        this.buoyancyforceall = buoyancyforceall;
    }

    public BigDecimal getLeakPumpV() {
        return leakPumpV;
    }

    public void setLeakPumpV(BigDecimal leakPumpV) {
        this.leakPumpV = leakPumpV;
    }

    public BigDecimal getLeakTvV() {
        return leakTvV;
    }

    public void setLeakTvV(BigDecimal leakTvV) {
        this.leakTvV = leakTvV;
    }

    public BigDecimal getLeakSvV() {
        return leakSvV;
    }

    public void setLeakSvV(BigDecimal leakSvV) {
        this.leakSvV = leakSvV;
    }

    public BigDecimal getGasInfluenceV() {
        return gasInfluenceV;
    }

    public void setGasInfluenceV(BigDecimal gasInfluenceV) {
        this.gasInfluenceV = gasInfluenceV;
    }

    public BigDecimal getLeakPumpW() {
        return leakPumpW;
    }

    public void setLeakPumpW(BigDecimal leakPumpW) {
        this.leakPumpW = leakPumpW;
    }

    public BigDecimal getLeakTvW() {
        return leakTvW;
    }

    public void setLeakTvW(BigDecimal leakTvW) {
        this.leakTvW = leakTvW;
    }

    public BigDecimal getLeakSvW() {
        return leakSvW;
    }

    public void setLeakSvW(BigDecimal leakSvW) {
        this.leakSvW = leakSvW;
    }

    public BigDecimal getGasInfluenceW() {
        return gasInfluenceW;
    }

    public void setGasInfluenceW(BigDecimal gasInfluenceW) {
        this.gasInfluenceW = gasInfluenceW;
    }

    public String getGtTime() {
        return gtTime;
    }

    public void setGtTime(String gtTime) {
        this.gtTime = gtTime == null ? null : gtTime.trim();
    }

    public Long getWellNum() {
        return wellNum;
    }

    public void setWellNum(Long wellNum) {
        this.wellNum = wellNum;
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
}