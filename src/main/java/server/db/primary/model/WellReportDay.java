package server.db.primary.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class WellReportDay implements Serializable {
    private Long id;

    private Long areaId;

    private String areaName;

    private String reportDate;

    private Long wellId;

    private String wellName;

    private String pId;

    private String pName;

    public String getPName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    private String prodWell;

    private BigDecimal pumpborediameter;

    private BigDecimal pumpDepth;

    private BigDecimal pressDepth;

    private BigDecimal wellStroke;

    private BigDecimal wellFreq;

    private BigDecimal producingfluidlevel;

    private BigDecimal flowGasTotle;

    private BigDecimal flowGasTotle8;

    private BigDecimal flowGasDay;

    private BigDecimal flowWaterTotle;

    private BigDecimal flowWaterTotle8;

    private BigDecimal flowWaterDay;

    private BigDecimal pressDownhole;

    private BigDecimal pressCase;

    private BigDecimal pressDownhole8;

    private BigDecimal pressValue;

    private String dischargeStage;

    private String designPress;

    private String ci;

    private String ph;

    private String remark;

    private Short mark;

    private Date stime;

    private BigDecimal pumpEff;

    private BigDecimal flowWaterMm;

    private BigDecimal flowGasMm;

    private BigDecimal flowGasYy;

    private BigDecimal flowWaterYy;

    private String pumpType;

    private String pumpName;

    private Long drainTime;

    private BigDecimal prodDate;

    private String startDate;

    private String wellGas;

    private Short pumpId;

    private Short pumpKw;

    private BigDecimal vfdFreqRun;

    public BigDecimal getVfdFreqRun() {
        return vfdFreqRun;
    }

    public void setVfdFreqRun(BigDecimal vfdFreqRun) {
        this.vfdFreqRun = vfdFreqRun;
    }

    private BigDecimal a1;

    private BigDecimal a2;

    public BigDecimal getA1() {
        return a1;
    }

    public void setA1(BigDecimal a1) {
        this.a1 = a1;
    }

    public BigDecimal getA2() {
        return a2;
    }

    public void setA2(BigDecimal a2) {
        this.a2 = a2;
    }

    public String getWellGas() {
        return wellGas;
    }

    public void setWellGas(String wellGas) {
        this.wellGas = wellGas;
    }

    public String getPId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public Short getPumpKw() {
        return pumpKw;
    }

    public void setPumpKw(Short pumpKw) {
        this.pumpKw = pumpKw;
    }

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate == null ? null : reportDate.trim();
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


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getProdWell() {
        return prodWell;
    }

    public void setProdWell(String prodWell) {
        this.prodWell = prodWell == null ? null : prodWell.trim();
    }

    public BigDecimal getPumpborediameter() {
        return pumpborediameter;
    }

    public void setPumpborediameter(BigDecimal pumpborediameter) {
        this.pumpborediameter = pumpborediameter;
    }

    public BigDecimal getPumpDepth() {
        return pumpDepth;
    }

    public void setPumpDepth(BigDecimal pumpDepth) {
        this.pumpDepth = pumpDepth;
    }

    public BigDecimal getPressDepth() {
        return pressDepth;
    }

    public void setPressDepth(BigDecimal pressDepth) {
        this.pressDepth = pressDepth;
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

    public BigDecimal getProducingfluidlevel() {
        return producingfluidlevel;
    }

    public void setProducingfluidlevel(BigDecimal producingfluidlevel) {
        this.producingfluidlevel = producingfluidlevel;
    }

    public BigDecimal getFlowGasTotle() {
        return flowGasTotle;
    }

    public void setFlowGasTotle(BigDecimal flowGasTotle) {
        this.flowGasTotle = flowGasTotle;
    }

    public BigDecimal getFlowGasTotle8() {
        return flowGasTotle8;
    }

    public void setFlowGasTotle8(BigDecimal flowGasTotle8) {
        this.flowGasTotle8 = flowGasTotle8;
    }

    public BigDecimal getFlowGasDay() {
        return flowGasDay;
    }

    public void setFlowGasDay(BigDecimal flowGasDay) {
        this.flowGasDay = flowGasDay;
    }

    public BigDecimal getFlowWaterTotle() {
        return flowWaterTotle;
    }

    public void setFlowWaterTotle(BigDecimal flowWaterTotle) {
        this.flowWaterTotle = flowWaterTotle;
    }

    public BigDecimal getFlowWaterTotle8() {
        return flowWaterTotle8;
    }

    public void setFlowWaterTotle8(BigDecimal flowWaterTotle8) {
        this.flowWaterTotle8 = flowWaterTotle8;
    }

    public BigDecimal getFlowWaterDay() {
        return flowWaterDay;
    }

    public void setFlowWaterDay(BigDecimal flowWaterDay) {
        this.flowWaterDay = flowWaterDay;
    }

    public BigDecimal getPressDownhole() {
        return pressDownhole;
    }

    public void setPressDownhole(BigDecimal pressDownhole) {
        this.pressDownhole = pressDownhole;
    }

    public BigDecimal getPressCase() {
        return pressCase;
    }

    public void setPressCase(BigDecimal pressCase) {
        this.pressCase = pressCase;
    }

    public BigDecimal getPressDownhole8() {
        return pressDownhole8;
    }

    public void setPressDownhole8(BigDecimal pressDownhole8) {
        this.pressDownhole8 = pressDownhole8;
    }

    public BigDecimal getPressValue() {
        return pressValue;
    }

    public void setPressValue(BigDecimal pressValue) {
        this.pressValue = pressValue;
    }

    public String getDischargeStage() {
        return dischargeStage;
    }

    public void setDischargeStage(String dischargeStage) {
        this.dischargeStage = dischargeStage == null ? null : dischargeStage.trim();
    }

    public String getDesignPress() {
        return designPress;
    }

    public void setDesignPress(String designPress) {
        this.designPress = designPress == null ? null : designPress.trim();
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci == null ? null : ci.trim();
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph == null ? null : ph.trim();
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

    public BigDecimal getPumpEff() {
        return pumpEff;
    }

    public void setPumpEff(BigDecimal pumpEff) {
        this.pumpEff = pumpEff;
    }

    public BigDecimal getFlowWaterMm() {
        return flowWaterMm;
    }

    public void setFlowWaterMm(BigDecimal flowWaterMm) {
        this.flowWaterMm = flowWaterMm;
    }

    public BigDecimal getFlowGasMm() {
        return flowGasMm;
    }

    public void setFlowGasMm(BigDecimal flowGasMm) {
        this.flowGasMm = flowGasMm;
    }

    public BigDecimal getFlowGasYy() {
        return flowGasYy;
    }

    public void setFlowGasYy(BigDecimal flowGasYy) {
        this.flowGasYy = flowGasYy;
    }

    public BigDecimal getFlowWaterYy() {
        return flowWaterYy;
    }

    public void setFlowWaterYy(BigDecimal flowWaterYy) {
        this.flowWaterYy = flowWaterYy;
    }

    public String getPumpType() {
        return pumpType;
    }

    public void setPumpType(String pumpType) {
        this.pumpType = pumpType == null ? null : pumpType.trim();
    }

    public String getPumpName() {
        return pumpName;
    }

    public void setPumpName(String pumpName) {
        this.pumpName = pumpName == null ? null : pumpName.trim();
    }

    public Long getDrainTime() {
        return drainTime;
    }

    public void setDrainTime(Long drainTime) {
        this.drainTime = drainTime;
    }

    public BigDecimal getProdDate() {
        return prodDate;
    }

    public void setProdDate(BigDecimal prodDate) {
        this.prodDate = prodDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate == null ? null : startDate.trim();
    }

    public Short getPumpId() {
        return pumpId;
    }

    public void setPumpId(Short pumpId) {
        this.pumpId = pumpId;
    }
}