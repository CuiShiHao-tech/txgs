package server.db.primary.model.warn;

import java.math.BigDecimal;
import java.util.Date;

public class WarnLimitConfig {
    private BigDecimal id;

    private BigDecimal wellId;

    private BigDecimal uUp;

    private BigDecimal uUpLimit;

    private BigDecimal uaUpCount;

    private BigDecimal uDown;

    private BigDecimal uDownLimit;

    private BigDecimal uaDownCount;

    private BigDecimal pressOilUp;

    private BigDecimal pressOilUpLimit;

    private BigDecimal pressOilUpCount;

    private BigDecimal pressOilDown;

    private BigDecimal pressOilDownLimit;

    private BigDecimal pressOilDownCount;

    private BigDecimal jigFrequencyUp;

    private BigDecimal jigFrequencyUpLimit;

    private BigDecimal jigFrequencyUpCount;

    private BigDecimal jigFrequencyDown;

    private BigDecimal jigFrequencyDownLimit;

    private BigDecimal jigFrequencyDownCount;

    private BigDecimal wellStrokeUp;

    private BigDecimal wellStrokeUpLimit;

    private BigDecimal wellStrokeUpCount;

    private BigDecimal wellStrokeDown;

    private BigDecimal wellStrokeDownLimit;

    private BigDecimal wellStrokeDownCount;

    private BigDecimal loadMaxUp;

    private BigDecimal loadMaxUpLimit;

    private BigDecimal loadMaxUpCount;

    private BigDecimal loadMaxDown;

    private BigDecimal loadMaxDownLimit;

    private BigDecimal loadMaxDownCount;

    private BigDecimal loadMinUp;

    private BigDecimal loadMinUpLimit;

    private BigDecimal loadMinUpCount;

    private BigDecimal loadMinDown;

    private BigDecimal loadMinDownLimit;

    private BigDecimal loadMinDownCount;

    private BigDecimal tempWellheadUp;

    private BigDecimal tempWellheadUpLimit;

    private BigDecimal tempWellheadUpCount;

    private BigDecimal tempWellheadDown;

    private BigDecimal tempWellheadDownLimit;

    private BigDecimal tempWellheadDownCount;

    private BigDecimal gtProdUp;

    private BigDecimal gtProdUpLimit;

    private BigDecimal gtProdUpCount;

    private BigDecimal gtProdDown;

    private BigDecimal gtProdDownLimit;

    private BigDecimal gtProdDownCount;

    private Date stime;

    private String mark;

    private String mark1;

    private Long ubUpCount;

    private Long ubDownCount;

    private Long ucUpCount;

    private Long ucDownCount;

    private BigDecimal uTimeOut;

    private BigDecimal iTimeOut;

    private BigDecimal pressOilTimeOut;

    private BigDecimal jigFrequencyTimeOut;

    private BigDecimal wellStrokeTimeOut;

    private BigDecimal loadTimeOut;

    private BigDecimal tempWellheadTimeOut;

    private BigDecimal gtProdTimeOut;

    private String uMark;

    private String iMark;

    private String pressOilMark;

    private String jigFrequencyMark;

    private String wellStrokeMark;

    private String loadMaxMark;

    private String loadMinMark;

    private String tempWellheadMark;

    private String gtProdMark;

    private BigDecimal iUp;

    private Long iUpLimit;

    private BigDecimal iDown;

    private Long iDownLimit;

    private Long iaUpCount;

    private Long ibUpCount;

    private Long icUpCount;

    private Long iaDownCount;

    private Long ibDownCount;

    private Long icDownCount;

    private BigDecimal flowWaterInstantUp;

    private BigDecimal flowWaterInstantUpLimit;

    private BigDecimal flowWaterInstantDown;

    private BigDecimal flowWaterInstantDownLimit;

    private String flowWaterInstantMark;

    private BigDecimal flowWaterInstantTimeOut;

    private BigDecimal pressCaseUp;

    private BigDecimal pressCaseUpLimit;

    private BigDecimal pressCaseDown;

    private BigDecimal pressCaseDownLimit;

    private String pressCaseMark;

    private BigDecimal pressDownholeUp;

    private BigDecimal pressDownholeUpLimit;

    private BigDecimal pressDownholeDown;

    private BigDecimal pressDownholeDownLimit;

    private String pressDownholeMark;


    public BigDecimal getPressCaseUp() {
        return pressCaseUp;
    }

    public void setPressCaseUp(BigDecimal pressCaseUp) {
        this.pressCaseUp = pressCaseUp;
    }

    public BigDecimal getPressCaseUpLimit() {
        return pressCaseUpLimit;
    }

    public void setPressCaseUpLimit(BigDecimal pressCaseUpLimit) {
        this.pressCaseUpLimit = pressCaseUpLimit;
    }

    public BigDecimal getPressCaseDown() {
        return pressCaseDown;
    }

    public void setPressCaseDown(BigDecimal pressCaseDown) {
        this.pressCaseDown = pressCaseDown;
    }

    public BigDecimal getPressCaseDownLimit() {
        return pressCaseDownLimit;
    }

    public void setPressCaseDownLimit(BigDecimal pressCaseDownLimit) {
        this.pressCaseDownLimit = pressCaseDownLimit;
    }

    public String getPressCaseMark() {
        return pressCaseMark;
    }

    public void setPressCaseMark(String pressCaseMark) {
        this.pressCaseMark = pressCaseMark;
    }

    public BigDecimal getPressDownholeUp() {
        return pressDownholeUp;
    }

    public void setPressDownholeUp(BigDecimal pressDownholeUp) {
        this.pressDownholeUp = pressDownholeUp;
    }

    public BigDecimal getPressDownholeUpLimit() {
        return pressDownholeUpLimit;
    }

    public void setPressDownholeUpLimit(BigDecimal pressDownholeUpLimit) {
        this.pressDownholeUpLimit = pressDownholeUpLimit;
    }

    public BigDecimal getPressDownholeDown() {
        return pressDownholeDown;
    }

    public void setPressDownholeDown(BigDecimal pressDownholeDown) {
        this.pressDownholeDown = pressDownholeDown;
    }

    public BigDecimal getPressDownholeDownLimit() {
        return pressDownholeDownLimit;
    }

    public void setPressDownholeDownLimit(BigDecimal pressDownholeDownLimit) {
        this.pressDownholeDownLimit = pressDownholeDownLimit;
    }

    public String getPressDownholeMark() {
        return pressDownholeMark;
    }

    public void setPressDownholeMark(String pressDownholeMark) {
        this.pressDownholeMark = pressDownholeMark;
    }

    public BigDecimal getFlowWaterInstantUp() {
        return flowWaterInstantUp;
    }

    public void setFlowWaterInstantUp(BigDecimal flowWaterInstantUp) {
        this.flowWaterInstantUp = flowWaterInstantUp;
    }

    public BigDecimal getFlowWaterInstantUpLimit() {
        return flowWaterInstantUpLimit;
    }

    public void setFlowWaterInstantUpLimit(BigDecimal flowWaterInstantUpLimit) {
        this.flowWaterInstantUpLimit = flowWaterInstantUpLimit;
    }

    public BigDecimal getFlowWaterInstantDown() {
        return flowWaterInstantDown;
    }

    public void setFlowWaterInstantDown(BigDecimal flowWaterInstantDown) {
        this.flowWaterInstantDown = flowWaterInstantDown;
    }

    public BigDecimal getFlowWaterInstantDownLimit() {
        return flowWaterInstantDownLimit;
    }

    public void setFlowWaterInstantDownLimit(BigDecimal flowWaterInstantDownLimit) {
        this.flowWaterInstantDownLimit = flowWaterInstantDownLimit;
    }

    public String getFlowWaterInstantMark() {
        return flowWaterInstantMark;
    }

    public void setFlowWaterInstantMark(String flowWaterInstantMark) {
        this.flowWaterInstantMark = flowWaterInstantMark;
    }

    public BigDecimal getFlowWaterInstantTimeOut() {
        return flowWaterInstantTimeOut;
    }

    public void setFlowWaterInstantTimeOut(BigDecimal flowWaterInstantTimeOut) {
        this.flowWaterInstantTimeOut = flowWaterInstantTimeOut;
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

    public BigDecimal getuUp() {
        return uUp;
    }

    public void setuUp(BigDecimal uUp) {
        this.uUp = uUp;
    }

    public BigDecimal getuUpLimit() {
        return uUpLimit;
    }

    public void setuUpLimit(BigDecimal uUpLimit) {
        this.uUpLimit = uUpLimit;
    }

    public BigDecimal getUaUpCount() {
        return uaUpCount;
    }

    public void setUaUpCount(BigDecimal uaUpCount) {
        this.uaUpCount = uaUpCount;
    }

    public BigDecimal getuDown() {
        return uDown;
    }

    public void setuDown(BigDecimal uDown) {
        this.uDown = uDown;
    }

    public BigDecimal getuDownLimit() {
        return uDownLimit;
    }

    public void setuDownLimit(BigDecimal uDownLimit) {
        this.uDownLimit = uDownLimit;
    }

    public BigDecimal getUaDownCount() {
        return uaDownCount;
    }

    public void setUaDownCount(BigDecimal uaDownCount) {
        this.uaDownCount = uaDownCount;
    }

    public BigDecimal getPressOilUp() {
        return pressOilUp;
    }

    public void setPressOilUp(BigDecimal pressOilUp) {
        this.pressOilUp = pressOilUp;
    }

    public BigDecimal getPressOilUpLimit() {
        return pressOilUpLimit;
    }

    public void setPressOilUpLimit(BigDecimal pressOilUpLimit) {
        this.pressOilUpLimit = pressOilUpLimit;
    }

    public BigDecimal getPressOilUpCount() {
        return pressOilUpCount;
    }

    public void setPressOilUpCount(BigDecimal pressOilUpCount) {
        this.pressOilUpCount = pressOilUpCount;
    }

    public BigDecimal getPressOilDown() {
        return pressOilDown;
    }

    public void setPressOilDown(BigDecimal pressOilDown) {
        this.pressOilDown = pressOilDown;
    }

    public BigDecimal getPressOilDownLimit() {
        return pressOilDownLimit;
    }

    public void setPressOilDownLimit(BigDecimal pressOilDownLimit) {
        this.pressOilDownLimit = pressOilDownLimit;
    }

    public BigDecimal getPressOilDownCount() {
        return pressOilDownCount;
    }

    public void setPressOilDownCount(BigDecimal pressOilDownCount) {
        this.pressOilDownCount = pressOilDownCount;
    }

    public BigDecimal getJigFrequencyUp() {
        return jigFrequencyUp;
    }

    public void setJigFrequencyUp(BigDecimal jigFrequencyUp) {
        this.jigFrequencyUp = jigFrequencyUp;
    }

    public BigDecimal getJigFrequencyUpLimit() {
        return jigFrequencyUpLimit;
    }

    public void setJigFrequencyUpLimit(BigDecimal jigFrequencyUpLimit) {
        this.jigFrequencyUpLimit = jigFrequencyUpLimit;
    }

    public BigDecimal getJigFrequencyUpCount() {
        return jigFrequencyUpCount;
    }

    public void setJigFrequencyUpCount(BigDecimal jigFrequencyUpCount) {
        this.jigFrequencyUpCount = jigFrequencyUpCount;
    }

    public BigDecimal getJigFrequencyDown() {
        return jigFrequencyDown;
    }

    public void setJigFrequencyDown(BigDecimal jigFrequencyDown) {
        this.jigFrequencyDown = jigFrequencyDown;
    }

    public BigDecimal getJigFrequencyDownLimit() {
        return jigFrequencyDownLimit;
    }

    public void setJigFrequencyDownLimit(BigDecimal jigFrequencyDownLimit) {
        this.jigFrequencyDownLimit = jigFrequencyDownLimit;
    }

    public BigDecimal getJigFrequencyDownCount() {
        return jigFrequencyDownCount;
    }

    public void setJigFrequencyDownCount(BigDecimal jigFrequencyDownCount) {
        this.jigFrequencyDownCount = jigFrequencyDownCount;
    }

    public BigDecimal getWellStrokeUp() {
        return wellStrokeUp;
    }

    public void setWellStrokeUp(BigDecimal wellStrokeUp) {
        this.wellStrokeUp = wellStrokeUp;
    }

    public BigDecimal getWellStrokeUpLimit() {
        return wellStrokeUpLimit;
    }

    public void setWellStrokeUpLimit(BigDecimal wellStrokeUpLimit) {
        this.wellStrokeUpLimit = wellStrokeUpLimit;
    }

    public BigDecimal getWellStrokeUpCount() {
        return wellStrokeUpCount;
    }

    public void setWellStrokeUpCount(BigDecimal wellStrokeUpCount) {
        this.wellStrokeUpCount = wellStrokeUpCount;
    }

    public BigDecimal getWellStrokeDown() {
        return wellStrokeDown;
    }

    public void setWellStrokeDown(BigDecimal wellStrokeDown) {
        this.wellStrokeDown = wellStrokeDown;
    }

    public BigDecimal getWellStrokeDownLimit() {
        return wellStrokeDownLimit;
    }

    public void setWellStrokeDownLimit(BigDecimal wellStrokeDownLimit) {
        this.wellStrokeDownLimit = wellStrokeDownLimit;
    }

    public BigDecimal getWellStrokeDownCount() {
        return wellStrokeDownCount;
    }

    public void setWellStrokeDownCount(BigDecimal wellStrokeDownCount) {
        this.wellStrokeDownCount = wellStrokeDownCount;
    }

    public BigDecimal getLoadMaxUp() {
        return loadMaxUp;
    }

    public void setLoadMaxUp(BigDecimal loadMaxUp) {
        this.loadMaxUp = loadMaxUp;
    }

    public BigDecimal getLoadMaxUpLimit() {
        return loadMaxUpLimit;
    }

    public void setLoadMaxUpLimit(BigDecimal loadMaxUpLimit) {
        this.loadMaxUpLimit = loadMaxUpLimit;
    }

    public BigDecimal getLoadMaxUpCount() {
        return loadMaxUpCount;
    }

    public void setLoadMaxUpCount(BigDecimal loadMaxUpCount) {
        this.loadMaxUpCount = loadMaxUpCount;
    }

    public BigDecimal getLoadMaxDown() {
        return loadMaxDown;
    }

    public void setLoadMaxDown(BigDecimal loadMaxDown) {
        this.loadMaxDown = loadMaxDown;
    }

    public BigDecimal getLoadMaxDownLimit() {
        return loadMaxDownLimit;
    }

    public void setLoadMaxDownLimit(BigDecimal loadMaxDownLimit) {
        this.loadMaxDownLimit = loadMaxDownLimit;
    }

    public BigDecimal getLoadMaxDownCount() {
        return loadMaxDownCount;
    }

    public void setLoadMaxDownCount(BigDecimal loadMaxDownCount) {
        this.loadMaxDownCount = loadMaxDownCount;
    }

    public BigDecimal getLoadMinUp() {
        return loadMinUp;
    }

    public void setLoadMinUp(BigDecimal loadMinUp) {
        this.loadMinUp = loadMinUp;
    }

    public BigDecimal getLoadMinUpLimit() {
        return loadMinUpLimit;
    }

    public void setLoadMinUpLimit(BigDecimal loadMinUpLimit) {
        this.loadMinUpLimit = loadMinUpLimit;
    }

    public BigDecimal getLoadMinUpCount() {
        return loadMinUpCount;
    }

    public void setLoadMinUpCount(BigDecimal loadMinUpCount) {
        this.loadMinUpCount = loadMinUpCount;
    }

    public BigDecimal getLoadMinDown() {
        return loadMinDown;
    }

    public void setLoadMinDown(BigDecimal loadMinDown) {
        this.loadMinDown = loadMinDown;
    }

    public BigDecimal getLoadMinDownLimit() {
        return loadMinDownLimit;
    }

    public void setLoadMinDownLimit(BigDecimal loadMinDownLimit) {
        this.loadMinDownLimit = loadMinDownLimit;
    }

    public BigDecimal getLoadMinDownCount() {
        return loadMinDownCount;
    }

    public void setLoadMinDownCount(BigDecimal loadMinDownCount) {
        this.loadMinDownCount = loadMinDownCount;
    }

    public BigDecimal getTempWellheadUp() {
        return tempWellheadUp;
    }

    public void setTempWellheadUp(BigDecimal tempWellheadUp) {
        this.tempWellheadUp = tempWellheadUp;
    }

    public BigDecimal getTempWellheadUpLimit() {
        return tempWellheadUpLimit;
    }

    public void setTempWellheadUpLimit(BigDecimal tempWellheadUpLimit) {
        this.tempWellheadUpLimit = tempWellheadUpLimit;
    }

    public BigDecimal getTempWellheadUpCount() {
        return tempWellheadUpCount;
    }

    public void setTempWellheadUpCount(BigDecimal tempWellheadUpCount) {
        this.tempWellheadUpCount = tempWellheadUpCount;
    }

    public BigDecimal getTempWellheadDown() {
        return tempWellheadDown;
    }

    public void setTempWellheadDown(BigDecimal tempWellheadDown) {
        this.tempWellheadDown = tempWellheadDown;
    }

    public BigDecimal getTempWellheadDownLimit() {
        return tempWellheadDownLimit;
    }

    public void setTempWellheadDownLimit(BigDecimal tempWellheadDownLimit) {
        this.tempWellheadDownLimit = tempWellheadDownLimit;
    }

    public BigDecimal getTempWellheadDownCount() {
        return tempWellheadDownCount;
    }

    public void setTempWellheadDownCount(BigDecimal tempWellheadDownCount) {
        this.tempWellheadDownCount = tempWellheadDownCount;
    }

    public BigDecimal getGtProdUp() {
        return gtProdUp;
    }

    public void setGtProdUp(BigDecimal gtProdUp) {
        this.gtProdUp = gtProdUp;
    }

    public BigDecimal getGtProdUpLimit() {
        return gtProdUpLimit;
    }

    public void setGtProdUpLimit(BigDecimal gtProdUpLimit) {
        this.gtProdUpLimit = gtProdUpLimit;
    }

    public BigDecimal getGtProdUpCount() {
        return gtProdUpCount;
    }

    public void setGtProdUpCount(BigDecimal gtProdUpCount) {
        this.gtProdUpCount = gtProdUpCount;
    }

    public BigDecimal getGtProdDown() {
        return gtProdDown;
    }

    public void setGtProdDown(BigDecimal gtProdDown) {
        this.gtProdDown = gtProdDown;
    }

    public BigDecimal getGtProdDownLimit() {
        return gtProdDownLimit;
    }

    public void setGtProdDownLimit(BigDecimal gtProdDownLimit) {
        this.gtProdDownLimit = gtProdDownLimit;
    }

    public BigDecimal getGtProdDownCount() {
        return gtProdDownCount;
    }

    public void setGtProdDownCount(BigDecimal gtProdDownCount) {
        this.gtProdDownCount = gtProdDownCount;
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

    public Long getUbUpCount() {
        return ubUpCount;
    }

    public void setUbUpCount(Long ubUpCount) {
        this.ubUpCount = ubUpCount;
    }

    public Long getUbDownCount() {
        return ubDownCount;
    }

    public void setUbDownCount(Long ubDownCount) {
        this.ubDownCount = ubDownCount;
    }

    public Long getUcUpCount() {
        return ucUpCount;
    }

    public void setUcUpCount(Long ucUpCount) {
        this.ucUpCount = ucUpCount;
    }

    public Long getUcDownCount() {
        return ucDownCount;
    }

    public void setUcDownCount(Long ucDownCount) {
        this.ucDownCount = ucDownCount;
    }

    public BigDecimal getuTimeOut() {
        return uTimeOut;
    }

    public void setuTimeOut(BigDecimal uTimeOut) {
        this.uTimeOut = uTimeOut;
    }

    public BigDecimal getiTimeOut() {
        return iTimeOut;
    }

    public void setiTimeOut(BigDecimal iTimeOut) {
        this.iTimeOut = iTimeOut;
    }

    public BigDecimal getPressOilTimeOut() {
        return pressOilTimeOut;
    }

    public void setPressOilTimeOut(BigDecimal pressOilTimeOut) {
        this.pressOilTimeOut = pressOilTimeOut;
    }

    public BigDecimal getJigFrequencyTimeOut() {
        return jigFrequencyTimeOut;
    }

    public void setJigFrequencyTimeOut(BigDecimal jigFrequencyTimeOut) {
        this.jigFrequencyTimeOut = jigFrequencyTimeOut;
    }

    public BigDecimal getWellStrokeTimeOut() {
        return wellStrokeTimeOut;
    }

    public void setWellStrokeTimeOut(BigDecimal wellStrokeTimeOut) {
        this.wellStrokeTimeOut = wellStrokeTimeOut;
    }

    public BigDecimal getLoadTimeOut() {
        return loadTimeOut;
    }

    public void setLoadTimeOut(BigDecimal loadTimeOut) {
        this.loadTimeOut = loadTimeOut;
    }

    public BigDecimal getTempWellheadTimeOut() {
        return tempWellheadTimeOut;
    }

    public void setTempWellheadTimeOut(BigDecimal tempWellheadTimeOut) {
        this.tempWellheadTimeOut = tempWellheadTimeOut;
    }

    public BigDecimal getGtProdTimeOut() {
        return gtProdTimeOut;
    }

    public void setGtProdTimeOut(BigDecimal gtProdTimeOut) {
        this.gtProdTimeOut = gtProdTimeOut;
    }

    public String getuMark() {
        return uMark;
    }

    public void setuMark(String uMark) {
        this.uMark = uMark;
    }

    public String getiMark() {
        return iMark;
    }

    public void setiMark(String iMark) {
        this.iMark = iMark;
    }

    public String getPressOilMark() {
        return pressOilMark;
    }

    public void setPressOilMark(String pressOilMark) {
        this.pressOilMark = pressOilMark;
    }

    public String getJigFrequencyMark() {
        return jigFrequencyMark;
    }

    public void setJigFrequencyMark(String jigFrequencyMark) {
        this.jigFrequencyMark = jigFrequencyMark;
    }

    public String getWellStrokeMark() {
        return wellStrokeMark;
    }

    public void setWellStrokeMark(String wellStrokeMark) {
        this.wellStrokeMark = wellStrokeMark;
    }

    public String getLoadMaxMark() {
        return loadMaxMark;
    }

    public void setLoadMaxMark(String loadMaxMark) {
        this.loadMaxMark = loadMaxMark;
    }

    public String getLoadMinMark() {
        return loadMinMark;
    }

    public void setLoadMinMark(String loadMinMark) {
        this.loadMinMark = loadMinMark;
    }

    public String getTempWellheadMark() {
        return tempWellheadMark;
    }

    public void setTempWellheadMark(String tempWellheadMark) {
        this.tempWellheadMark = tempWellheadMark;
    }

    public String getGtProdMark() {
        return gtProdMark;
    }

    public void setGtProdMark(String gtProdMark) {
        this.gtProdMark = gtProdMark;
    }

    public BigDecimal getiUp() {
        return iUp;
    }

    public void setiUp(BigDecimal iUp) {
        this.iUp = iUp;
    }

    public Long getiUpLimit() {
        return iUpLimit;
    }

    public void setiUpLimit(Long iUpLimit) {
        this.iUpLimit = iUpLimit;
    }

    public BigDecimal getiDown() {
        return iDown;
    }

    public void setiDown(BigDecimal iDown) {
        this.iDown = iDown;
    }

    public Long getiDownLimit() {
        return iDownLimit;
    }

    public void setiDownLimit(Long iDownLimit) {
        this.iDownLimit = iDownLimit;
    }

    public Long getIaUpCount() {
        return iaUpCount;
    }

    public void setIaUpCount(Long iaUpCount) {
        this.iaUpCount = iaUpCount;
    }

    public Long getIbUpCount() {
        return ibUpCount;
    }

    public void setIbUpCount(Long ibUpCount) {
        this.ibUpCount = ibUpCount;
    }

    public Long getIcUpCount() {
        return icUpCount;
    }

    public void setIcUpCount(Long icUpCount) {
        this.icUpCount = icUpCount;
    }

    public Long getIaDownCount() {
        return iaDownCount;
    }

    public void setIaDownCount(Long iaDownCount) {
        this.iaDownCount = iaDownCount;
    }

    public Long getIbDownCount() {
        return ibDownCount;
    }

    public void setIbDownCount(Long ibDownCount) {
        this.ibDownCount = ibDownCount;
    }

    public Long getIcDownCount() {
        return icDownCount;
    }

    public void setIcDownCount(Long icDownCount) {
        this.icDownCount = icDownCount;
    }
}