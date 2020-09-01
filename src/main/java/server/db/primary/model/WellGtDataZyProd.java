package server.db.primary.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class WellGtDataZyProd implements Serializable {
    private Long id;

    private Long gtId;

    private Long gtRespId;

    private Long wellId;

    private String wellName;

    private Long areaId;

    private String areaName;

    private Long stationId;

    private String stationName;

    private BigDecimal watercut;

    private BigDecimal prodGasoilRatio;

    private BigDecimal pressTubing;

    private BigDecimal pressCasing;

    private BigDecimal tempWellhead;

    private BigDecimal levelProdFluid;

    private BigDecimal depthPump;

    private BigDecimal submergence;

    private BigDecimal pumpInTakeP;

    private BigDecimal pumpInTakeT;

    private BigDecimal pumpInTakeGol;

    private BigDecimal pumpOutLetP;

    private BigDecimal pumpOutLetT;

    private BigDecimal pumpOutLetGol;

    private BigDecimal pumpOutLetVisl;

    private BigDecimal pumpOutLetBo;

    private BigDecimal outputCoefficient;

    private BigDecimal prodLiquidV;

    private BigDecimal prodOilV;

    private BigDecimal prodWaterV;

    private BigDecimal prodStrokeV;

    private BigDecimal prodLeakPumpV;

    private BigDecimal prodLeakTvV;

    private BigDecimal prodLeakSvV;

    private BigDecimal prodGasInfluenceV;

    private BigDecimal prodLiquidW;

    private BigDecimal prodOilW;

    private BigDecimal prodWaterW;

    private BigDecimal prodStrokeW;

    private BigDecimal prodLeakPumpW;

    private BigDecimal prodLeakTvW;

    private BigDecimal prodLeakSvW;

    private BigDecimal prodGasInfluenceW;

    private String gtTime;

    private Short mark;

    private Date stime;

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

    public BigDecimal getWatercut() {
        return watercut;
    }

    public void setWatercut(BigDecimal watercut) {
        this.watercut = watercut;
    }

    public BigDecimal getProdGasoilRatio() {
        return prodGasoilRatio;
    }

    public void setProdGasoilRatio(BigDecimal prodGasoilRatio) {
        this.prodGasoilRatio = prodGasoilRatio;
    }

    public BigDecimal getPressTubing() {
        return pressTubing;
    }

    public void setPressTubing(BigDecimal pressTubing) {
        this.pressTubing = pressTubing;
    }

    public BigDecimal getPressCasing() {
        return pressCasing;
    }

    public void setPressCasing(BigDecimal pressCasing) {
        this.pressCasing = pressCasing;
    }

    public BigDecimal getTempWellhead() {
        return tempWellhead;
    }

    public void setTempWellhead(BigDecimal tempWellhead) {
        this.tempWellhead = tempWellhead;
    }

    public BigDecimal getLevelProdFluid() {
        return levelProdFluid;
    }

    public void setLevelProdFluid(BigDecimal levelProdFluid) {
        this.levelProdFluid = levelProdFluid;
    }

    public BigDecimal getDepthPump() {
        return depthPump;
    }

    public void setDepthPump(BigDecimal depthPump) {
        this.depthPump = depthPump;
    }

    public BigDecimal getSubmergence() {
        return submergence;
    }

    public void setSubmergence(BigDecimal submergence) {
        this.submergence = submergence;
    }

    public BigDecimal getPumpInTakeP() {
        return pumpInTakeP;
    }

    public void setPumpInTakeP(BigDecimal pumpInTakeP) {
        this.pumpInTakeP = pumpInTakeP;
    }

    public BigDecimal getPumpInTakeT() {
        return pumpInTakeT;
    }

    public void setPumpInTakeT(BigDecimal pumpInTakeT) {
        this.pumpInTakeT = pumpInTakeT;
    }

    public BigDecimal getPumpInTakeGol() {
        return pumpInTakeGol;
    }

    public void setPumpInTakeGol(BigDecimal pumpInTakeGol) {
        this.pumpInTakeGol = pumpInTakeGol;
    }

    public BigDecimal getPumpOutLetP() {
        return pumpOutLetP;
    }

    public void setPumpOutLetP(BigDecimal pumpOutLetP) {
        this.pumpOutLetP = pumpOutLetP;
    }

    public BigDecimal getPumpOutLetT() {
        return pumpOutLetT;
    }

    public void setPumpOutLetT(BigDecimal pumpOutLetT) {
        this.pumpOutLetT = pumpOutLetT;
    }

    public BigDecimal getPumpOutLetGol() {
        return pumpOutLetGol;
    }

    public void setPumpOutLetGol(BigDecimal pumpOutLetGol) {
        this.pumpOutLetGol = pumpOutLetGol;
    }

    public BigDecimal getPumpOutLetVisl() {
        return pumpOutLetVisl;
    }

    public void setPumpOutLetVisl(BigDecimal pumpOutLetVisl) {
        this.pumpOutLetVisl = pumpOutLetVisl;
    }

    public BigDecimal getPumpOutLetBo() {
        return pumpOutLetBo;
    }

    public void setPumpOutLetBo(BigDecimal pumpOutLetBo) {
        this.pumpOutLetBo = pumpOutLetBo;
    }

    public BigDecimal getOutputCoefficient() {
        return outputCoefficient;
    }

    public void setOutputCoefficient(BigDecimal outputCoefficient) {
        this.outputCoefficient = outputCoefficient;
    }

    public BigDecimal getProdLiquidV() {
        return prodLiquidV;
    }

    public void setProdLiquidV(BigDecimal prodLiquidV) {
        this.prodLiquidV = prodLiquidV;
    }

    public BigDecimal getProdOilV() {
        return prodOilV;
    }

    public void setProdOilV(BigDecimal prodOilV) {
        this.prodOilV = prodOilV;
    }

    public BigDecimal getProdWaterV() {
        return prodWaterV;
    }

    public void setProdWaterV(BigDecimal prodWaterV) {
        this.prodWaterV = prodWaterV;
    }

    public BigDecimal getProdStrokeV() {
        return prodStrokeV;
    }

    public void setProdStrokeV(BigDecimal prodStrokeV) {
        this.prodStrokeV = prodStrokeV;
    }

    public BigDecimal getProdLeakPumpV() {
        return prodLeakPumpV;
    }

    public void setProdLeakPumpV(BigDecimal prodLeakPumpV) {
        this.prodLeakPumpV = prodLeakPumpV;
    }

    public BigDecimal getProdLeakTvV() {
        return prodLeakTvV;
    }

    public void setProdLeakTvV(BigDecimal prodLeakTvV) {
        this.prodLeakTvV = prodLeakTvV;
    }

    public BigDecimal getProdLeakSvV() {
        return prodLeakSvV;
    }

    public void setProdLeakSvV(BigDecimal prodLeakSvV) {
        this.prodLeakSvV = prodLeakSvV;
    }

    public BigDecimal getProdGasInfluenceV() {
        return prodGasInfluenceV;
    }

    public void setProdGasInfluenceV(BigDecimal prodGasInfluenceV) {
        this.prodGasInfluenceV = prodGasInfluenceV;
    }

    public BigDecimal getProdLiquidW() {
        return prodLiquidW;
    }

    public void setProdLiquidW(BigDecimal prodLiquidW) {
        this.prodLiquidW = prodLiquidW;
    }

    public BigDecimal getProdOilW() {
        return prodOilW;
    }

    public void setProdOilW(BigDecimal prodOilW) {
        this.prodOilW = prodOilW;
    }

    public BigDecimal getProdWaterW() {
        return prodWaterW;
    }

    public void setProdWaterW(BigDecimal prodWaterW) {
        this.prodWaterW = prodWaterW;
    }

    public BigDecimal getProdStrokeW() {
        return prodStrokeW;
    }

    public void setProdStrokeW(BigDecimal prodStrokeW) {
        this.prodStrokeW = prodStrokeW;
    }

    public BigDecimal getProdLeakPumpW() {
        return prodLeakPumpW;
    }

    public void setProdLeakPumpW(BigDecimal prodLeakPumpW) {
        this.prodLeakPumpW = prodLeakPumpW;
    }

    public BigDecimal getProdLeakTvW() {
        return prodLeakTvW;
    }

    public void setProdLeakTvW(BigDecimal prodLeakTvW) {
        this.prodLeakTvW = prodLeakTvW;
    }

    public BigDecimal getProdLeakSvW() {
        return prodLeakSvW;
    }

    public void setProdLeakSvW(BigDecimal prodLeakSvW) {
        this.prodLeakSvW = prodLeakSvW;
    }

    public BigDecimal getProdGasInfluenceW() {
        return prodGasInfluenceW;
    }

    public void setProdGasInfluenceW(BigDecimal prodGasInfluenceW) {
        this.prodGasInfluenceW = prodGasInfluenceW;
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