package server.db.primary.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class WellGtConfig implements Serializable {
    private Long id;

    private Long wellId;

    private String wellName;

    private Long wellNum;

    private BigDecimal naturalgasrelativedensity;

    private BigDecimal waterdensity;

    private BigDecimal depthReservoir;

    private BigDecimal tempReservoir;

    private Short rod1Type;

    private String rod1Grade;

    private BigDecimal rod1Length;

    private BigDecimal rod1Diameter;

    private Short rod2Type;

    private String rod2Grade;

    private BigDecimal rod2Length;

    private BigDecimal rod2Diameter;

    private Short rod3Type;

    private String rod3Grade;

    private BigDecimal rod3Length;

    private BigDecimal rod3Diameter;

    private Short rod4Type;

    private String rod4Grade;

    private BigDecimal rod4Length;

    private BigDecimal rod4Diameter;

    private String pumpType;

    private Short pumpGrade;

    private BigDecimal plungerlength;

    private BigDecimal pumpborediameter;

    private BigDecimal tubingInsidediameter;

    private BigDecimal casingInsidediameter;

    private BigDecimal tubingpressure;

    private BigDecimal casingpressure;

    private BigDecimal wellheadfluidtemperature;

    private BigDecimal producingfluidlevel;

    private BigDecimal pumpsettingdepth;

    private Short mark;

    private Date stime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public BigDecimal getNaturalgasrelativedensity() {
        return naturalgasrelativedensity;
    }

    public void setNaturalgasrelativedensity(BigDecimal naturalgasrelativedensity) {
        this.naturalgasrelativedensity = naturalgasrelativedensity;
    }

    public BigDecimal getWaterdensity() {
        return waterdensity;
    }

    public void setWaterdensity(BigDecimal waterdensity) {
        this.waterdensity = waterdensity;
    }

    public BigDecimal getDepthReservoir() {
        return depthReservoir;
    }

    public void setDepthReservoir(BigDecimal depthReservoir) {
        this.depthReservoir = depthReservoir;
    }

    public BigDecimal getTempReservoir() {
        return tempReservoir;
    }

    public void setTempReservoir(BigDecimal tempReservoir) {
        this.tempReservoir = tempReservoir;
    }

    public Short getRod1Type() {
        return rod1Type;
    }

    public void setRod1Type(Short rod1Type) {
        this.rod1Type = rod1Type;
    }

    public String getRod1Grade() {
        return rod1Grade;
    }

    public void setRod1Grade(String rod1Grade) {
        this.rod1Grade = rod1Grade == null ? null : rod1Grade.trim();
    }

    public BigDecimal getRod1Length() {
        return rod1Length;
    }

    public void setRod1Length(BigDecimal rod1Length) {
        this.rod1Length = rod1Length;
    }

    public BigDecimal getRod1Diameter() {
        return rod1Diameter;
    }

    public void setRod1Diameter(BigDecimal rod1Diameter) {
        this.rod1Diameter = rod1Diameter;
    }

    public Short getRod2Type() {
        return rod2Type;
    }

    public void setRod2Type(Short rod2Type) {
        this.rod2Type = rod2Type;
    }

    public String getRod2Grade() {
        return rod2Grade;
    }

    public void setRod2Grade(String rod2Grade) {
        this.rod2Grade = rod2Grade == null ? null : rod2Grade.trim();
    }

    public BigDecimal getRod2Length() {
        return rod2Length;
    }

    public void setRod2Length(BigDecimal rod2Length) {
        this.rod2Length = rod2Length;
    }

    public BigDecimal getRod2Diameter() {
        return rod2Diameter;
    }

    public void setRod2Diameter(BigDecimal rod2Diameter) {
        this.rod2Diameter = rod2Diameter;
    }

    public Short getRod3Type() {
        return rod3Type;
    }

    public void setRod3Type(Short rod3Type) {
        this.rod3Type = rod3Type;
    }

    public String getRod3Grade() {
        return rod3Grade;
    }

    public void setRod3Grade(String rod3Grade) {
        this.rod3Grade = rod3Grade == null ? null : rod3Grade.trim();
    }

    public BigDecimal getRod3Length() {
        return rod3Length;
    }

    public void setRod3Length(BigDecimal rod3Length) {
        this.rod3Length = rod3Length;
    }

    public BigDecimal getRod3Diameter() {
        return rod3Diameter;
    }

    public void setRod3Diameter(BigDecimal rod3Diameter) {
        this.rod3Diameter = rod3Diameter;
    }

    public Short getRod4Type() {
        return rod4Type;
    }

    public void setRod4Type(Short rod4Type) {
        this.rod4Type = rod4Type;
    }

    public String getRod4Grade() {
        return rod4Grade;
    }

    public void setRod4Grade(String rod4Grade) {
        this.rod4Grade = rod4Grade == null ? null : rod4Grade.trim();
    }

    public BigDecimal getRod4Length() {
        return rod4Length;
    }

    public void setRod4Length(BigDecimal rod4Length) {
        this.rod4Length = rod4Length;
    }

    public BigDecimal getRod4Diameter() {
        return rod4Diameter;
    }

    public void setRod4Diameter(BigDecimal rod4Diameter) {
        this.rod4Diameter = rod4Diameter;
    }

    public String getPumpType() {
        return pumpType;
    }

    public void setPumpType(String pumpType) {
        this.pumpType = pumpType == null ? null : pumpType.trim();
    }

    public Short getPumpGrade() {
        return pumpGrade;
    }

    public void setPumpGrade(Short pumpGrade) {
        this.pumpGrade = pumpGrade;
    }

    public BigDecimal getPlungerlength() {
        return plungerlength;
    }

    public void setPlungerlength(BigDecimal plungerlength) {
        this.plungerlength = plungerlength;
    }

    public BigDecimal getPumpborediameter() {
        return pumpborediameter;
    }

    public void setPumpborediameter(BigDecimal pumpborediameter) {
        this.pumpborediameter = pumpborediameter;
    }

    public BigDecimal getTubingInsidediameter() {
        return tubingInsidediameter;
    }

    public void setTubingInsidediameter(BigDecimal tubingInsidediameter) {
        this.tubingInsidediameter = tubingInsidediameter;
    }

    public BigDecimal getCasingInsidediameter() {
        return casingInsidediameter;
    }

    public void setCasingInsidediameter(BigDecimal casingInsidediameter) {
        this.casingInsidediameter = casingInsidediameter;
    }

    public BigDecimal getTubingpressure() {
        return tubingpressure;
    }

    public void setTubingpressure(BigDecimal tubingpressure) {
        this.tubingpressure = tubingpressure;
    }

    public BigDecimal getCasingpressure() {
        return casingpressure;
    }

    public void setCasingpressure(BigDecimal casingpressure) {
        this.casingpressure = casingpressure;
    }

    public BigDecimal getWellheadfluidtemperature() {
        return wellheadfluidtemperature;
    }

    public void setWellheadfluidtemperature(BigDecimal wellheadfluidtemperature) {
        this.wellheadfluidtemperature = wellheadfluidtemperature;
    }

    public BigDecimal getProducingfluidlevel() {
        return producingfluidlevel;
    }

    public void setProducingfluidlevel(BigDecimal producingfluidlevel) {
        this.producingfluidlevel = producingfluidlevel;
    }

    public BigDecimal getPumpsettingdepth() {
        return pumpsettingdepth;
    }

    public void setPumpsettingdepth(BigDecimal pumpsettingdepth) {
        this.pumpsettingdepth = pumpsettingdepth;
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