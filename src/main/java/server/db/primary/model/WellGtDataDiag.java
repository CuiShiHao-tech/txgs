package server.db.primary.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class WellGtDataDiag implements Serializable {
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

    public String getPumpGtData() {
        return pumpGtData;
    }

    public void setPumpGtData(String pumpGtData) {
        this.pumpGtData = pumpGtData;
    }

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

    private Short mark;

    private Date stime;

    private String fs;

    private String fs1;

    private String fs2;

    private String fs3;

    private String pumpGtData;

    private BigDecimal pumpEff1;

    private BigDecimal pumpEff2;

    private BigDecimal pumpEff3;

    private BigDecimal pumpEff4;

    private BigDecimal pumpEff;

    private BigDecimal sysEffSurface;

    private BigDecimal sysEffWelldown;

    private BigDecimal sysEff;

    private BigDecimal powerMotorInput;

    private BigDecimal powerPolishRod;

    private BigDecimal powerWater;

    private BigDecimal jigFreq;

    private BigDecimal wellStroke;

    private String loadData;

    private String iData;

    private String pData;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    private BigDecimal loadMax;

    public String getFs() {
        return fs;
    }

    public void setFs(String fs) {
        this.fs = fs;
    }

    public String getFs1() {
        return fs1;
    }

    public void setFs1(String fs1) {
        this.fs1 = fs1;
    }

    public String getFs2() {
        return fs2;
    }

    public void setFs2(String fs2) {
        this.fs2 = fs2;
    }

    public String getFs3() {
        return fs3;
    }

    public void setFs3(String fs3) {
        this.fs3 = fs3;
    }

    public BigDecimal getPumpEff1() {
        return pumpEff1;
    }

    public void setPumpEff1(BigDecimal pumpEff1) {
        this.pumpEff1 = pumpEff1;
    }

    public BigDecimal getPumpEff2() {
        return pumpEff2;
    }

    public void setPumpEff2(BigDecimal pumpEff2) {
        this.pumpEff2 = pumpEff2;
    }

    public BigDecimal getPumpEff3() {
        return pumpEff3;
    }

    public void setPumpEff3(BigDecimal pumpEff3) {
        this.pumpEff3 = pumpEff3;
    }

    public BigDecimal getPumpEff4() {
        return pumpEff4;
    }

    public void setPumpEff4(BigDecimal pumpEff4) {
        this.pumpEff4 = pumpEff4;
    }

    public BigDecimal getPumpEff() {
        return pumpEff;
    }

    public void setPumpEff(BigDecimal pumpEff) {
        this.pumpEff = pumpEff;
    }

    public BigDecimal getSysEffSurface() {
        return sysEffSurface;
    }

    public void setSysEffSurface(BigDecimal sysEffSurface) {
        this.sysEffSurface = sysEffSurface;
    }

    public BigDecimal getSysEffWelldown() {
        return sysEffWelldown;
    }

    public void setSysEffWelldown(BigDecimal sysEffWelldown) {
        this.sysEffWelldown = sysEffWelldown;
    }

    public BigDecimal getSysEff() {
        return sysEff;
    }

    public void setSysEff(BigDecimal sysEff) {
        this.sysEff = sysEff;
    }

    public BigDecimal getPowerMotorInput() {
        return powerMotorInput;
    }

    public void setPowerMotorInput(BigDecimal powerMotorInput) {
        this.powerMotorInput = powerMotorInput;
    }

    public BigDecimal getPowerPolishRod() {
        return powerPolishRod;
    }

    public void setPowerPolishRod(BigDecimal powerPolishRod) {
        this.powerPolishRod = powerPolishRod;
    }

    public BigDecimal getPowerWater() {
        return powerWater;
    }

    public void setPowerWater(BigDecimal powerWater) {
        this.powerWater = powerWater;
    }

    public BigDecimal getJigFreq() {
        return jigFreq;
    }

    public void setJigFreq(BigDecimal jigFreq) {
        this.jigFreq = jigFreq;
    }

    public BigDecimal getWellStroke() {
        return wellStroke;
    }

    public void setWellStroke(BigDecimal wellStroke) {
        this.wellStroke = wellStroke;
    }

    public String getLoadData() {
        return loadData;
    }

    public void setLoadData(String loadData) {
        this.loadData = loadData;
    }

    public String getiData() {
        return iData;
    }

    public void setiData(String iData) {
        this.iData = iData;
    }

    public String getpData() {
        return pData;
    }

    public void setpData(String pData) {
        this.pData = pData;
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

    public BigDecimal getGtArea() {
        return gtArea;
    }

    public void setGtArea(BigDecimal gtArea) {
        this.gtArea = gtArea;
    }

    private BigDecimal loadMin;

    private BigDecimal gtArea;

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