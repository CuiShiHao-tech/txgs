package server.db.primary.model.warn;

import java.math.BigDecimal;
import java.util.Date;

public class WarnAllConfig {
    private BigDecimal id;

    private BigDecimal wellId;

    private BigDecimal uUp;

    private Long uUpLimit;

    private BigDecimal uDown;

    private Long uDownLimit;

    private BigDecimal pressOilUp;

    private Long pressOilUpLimit;

    private BigDecimal pressOilDown;

    private Long pressOilDownLimit;

    private BigDecimal jigFrequencyUp;

    private Long jigFrequencyUpLimit;

    private BigDecimal jigFrequencyDown;

    private Long jigFrequencyDownLimit;

    private BigDecimal wellStrokeUp;

    private Long wellStrokeUpLimit;

    private BigDecimal wellStrokeDown;

    private Long wellStrokeDownLimit;

    private BigDecimal loadMaxUp;

    private Long loadMaxUpLimit;

    private BigDecimal loadMaxDown;

    private Long loadMaxDownLimit;

    private BigDecimal loadMinUp;

    private Long loadMinUpLimit;

    private BigDecimal loadMinDown;

    private Long loadMinDownLimit;

    private Long uaUpCount;

    private Long uaDownCount;

    private Long ubUpCount;

    private Long ubDownCount;

    private Long ucUpCount;

    private Long ucDownCount;

    private Long pressOilUpCount;

    private Long pressOilDownCount;

    private Long jigFrequencyUpCount;

    private Long jigFrequencyDownCount;

    private Long wellStrokeUpCount;

    private Long wellStrokeDownCount;

    private Long loadMaxUpCount;

    private Long loadMaxDownCount;

    private Long loadMinUpCount;

    private Long loadMinDownCount;

    private BigDecimal tempWellheadUp;

    private Long tempWellheadUpCount;

    private BigDecimal tempWellheadDown;

    private Long tempWellheadDownCount;

    private BigDecimal gtProdUp;

    private Long gtProdUpCount;

    private BigDecimal gtProdDown;

    private Long gtProdDownCount;

    private String mark;

    private String mark1;

    private Long tempWellheadUpLimit;

    private Long tempWellheadDownLimit;

    private Long gtProdUpLimit;

    private Long gtProdDownLimit;

    private Date stime;

    private Long commExLimit;

    private Long closeWellExLimit;

    private Long pressCommExLimit;

    private Long strokeCommExLimit;

    private String mark2;

     private String wellName;

     private String sysMark;

     private String lMark;

     private String gtMark;

    private String uMark;

    private String iMark;

    private String pressOilMark;

    private String jigFrequencyMark;

    private String wellStrokeMark;

    private String loadMaxMark;

    private String loadMinMark;

    private String tempWellheadMark;

    private String gtProdMark;

    private String commExMark;

    private String pressCommExMark;

    private String strokeCommExMark;

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

    public String getSysMark() {
        return sysMark;
    }

    public void setSysMark(String sysMark) {
        this.sysMark = sysMark;
    }

    public String getlMark() {
        return lMark;
    }

    public void setlMark(String lMark) {
        this.lMark = lMark;
    }

    public String getGtMark() {
        return gtMark;
    }

    public void setGtMark(String gtMark) {
        this.gtMark = gtMark;
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

    public Long getuUpLimit() {
        return uUpLimit;
    }

    public void setuUpLimit(Long uUpLimit) {
        this.uUpLimit = uUpLimit;
    }

    public BigDecimal getuDown() {
        return uDown;
    }

    public void setuDown(BigDecimal uDown) {
        this.uDown = uDown;
    }

    public Long getuDownLimit() {
        return uDownLimit;
    }

    public void setuDownLimit(Long uDownLimit) {
        this.uDownLimit = uDownLimit;
    }

    public BigDecimal getPressOilUp() {
        return pressOilUp;
    }

    public void setPressOilUp(BigDecimal pressOilUp) {
        this.pressOilUp = pressOilUp;
    }

    public Long getPressOilUpLimit() {
        return pressOilUpLimit;
    }

    public void setPressOilUpLimit(Long pressOilUpLimit) {
        this.pressOilUpLimit = pressOilUpLimit;
    }

    public BigDecimal getPressOilDown() {
        return pressOilDown;
    }

    public void setPressOilDown(BigDecimal pressOilDown) {
        this.pressOilDown = pressOilDown;
    }

    public Long getPressOilDownLimit() {
        return pressOilDownLimit;
    }

    public void setPressOilDownLimit(Long pressOilDownLimit) {
        this.pressOilDownLimit = pressOilDownLimit;
    }

    public BigDecimal getJigFrequencyUp() {
        return jigFrequencyUp;
    }

    public void setJigFrequencyUp(BigDecimal jigFrequencyUp) {
        this.jigFrequencyUp = jigFrequencyUp;
    }

    public Long getJigFrequencyUpLimit() {
        return jigFrequencyUpLimit;
    }

    public void setJigFrequencyUpLimit(Long jigFrequencyUpLimit) {
        this.jigFrequencyUpLimit = jigFrequencyUpLimit;
    }

    public BigDecimal getJigFrequencyDown() {
        return jigFrequencyDown;
    }

    public void setJigFrequencyDown(BigDecimal jigFrequencyDown) {
        this.jigFrequencyDown = jigFrequencyDown;
    }

    public Long getJigFrequencyDownLimit() {
        return jigFrequencyDownLimit;
    }

    public void setJigFrequencyDownLimit(Long jigFrequencyDownLimit) {
        this.jigFrequencyDownLimit = jigFrequencyDownLimit;
    }

    public BigDecimal getWellStrokeUp() {
        return wellStrokeUp;
    }

    public void setWellStrokeUp(BigDecimal wellStrokeUp) {
        this.wellStrokeUp = wellStrokeUp;
    }

    public Long getWellStrokeUpLimit() {
        return wellStrokeUpLimit;
    }

    public void setWellStrokeUpLimit(Long wellStrokeUpLimit) {
        this.wellStrokeUpLimit = wellStrokeUpLimit;
    }

    public BigDecimal getWellStrokeDown() {
        return wellStrokeDown;
    }

    public void setWellStrokeDown(BigDecimal wellStrokeDown) {
        this.wellStrokeDown = wellStrokeDown;
    }

    public Long getWellStrokeDownLimit() {
        return wellStrokeDownLimit;
    }

    public void setWellStrokeDownLimit(Long wellStrokeDownLimit) {
        this.wellStrokeDownLimit = wellStrokeDownLimit;
    }

    public BigDecimal getLoadMaxUp() {
        return loadMaxUp;
    }

    public void setLoadMaxUp(BigDecimal loadMaxUp) {
        this.loadMaxUp = loadMaxUp;
    }

    public Long getLoadMaxUpLimit() {
        return loadMaxUpLimit;
    }

    public void setLoadMaxUpLimit(Long loadMaxUpLimit) {
        this.loadMaxUpLimit = loadMaxUpLimit;
    }

    public BigDecimal getLoadMaxDown() {
        return loadMaxDown;
    }

    public void setLoadMaxDown(BigDecimal loadMaxDown) {
        this.loadMaxDown = loadMaxDown;
    }

    public Long getLoadMaxDownLimit() {
        return loadMaxDownLimit;
    }

    public void setLoadMaxDownLimit(Long loadMaxDownLimit) {
        this.loadMaxDownLimit = loadMaxDownLimit;
    }

    public BigDecimal getLoadMinUp() {
        return loadMinUp;
    }

    public void setLoadMinUp(BigDecimal loadMinUp) {
        this.loadMinUp = loadMinUp;
    }

    public Long getLoadMinUpLimit() {
        return loadMinUpLimit;
    }

    public void setLoadMinUpLimit(Long loadMinUpLimit) {
        this.loadMinUpLimit = loadMinUpLimit;
    }

    public BigDecimal getLoadMinDown() {
        return loadMinDown;
    }

    public void setLoadMinDown(BigDecimal loadMinDown) {
        this.loadMinDown = loadMinDown;
    }

    public Long getLoadMinDownLimit() {
        return loadMinDownLimit;
    }

    public void setLoadMinDownLimit(Long loadMinDownLimit) {
        this.loadMinDownLimit = loadMinDownLimit;
    }

    public Long getUaUpCount() {
        return uaUpCount;
    }

    public void setUaUpCount(Long uaUpCount) {
        this.uaUpCount = uaUpCount;
    }

    public Long getUaDownCount() {
        return uaDownCount;
    }

    public void setUaDownCount(Long uaDownCount) {
        this.uaDownCount = uaDownCount;
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

    public Long getPressOilUpCount() {
        return pressOilUpCount;
    }

    public void setPressOilUpCount(Long pressOilUpCount) {
        this.pressOilUpCount = pressOilUpCount;
    }

    public Long getPressOilDownCount() {
        return pressOilDownCount;
    }

    public void setPressOilDownCount(Long pressOilDownCount) {
        this.pressOilDownCount = pressOilDownCount;
    }

    public Long getJigFrequencyUpCount() {
        return jigFrequencyUpCount;
    }

    public void setJigFrequencyUpCount(Long jigFrequencyUpCount) {
        this.jigFrequencyUpCount = jigFrequencyUpCount;
    }

    public Long getJigFrequencyDownCount() {
        return jigFrequencyDownCount;
    }

    public void setJigFrequencyDownCount(Long jigFrequencyDownCount) {
        this.jigFrequencyDownCount = jigFrequencyDownCount;
    }

    public Long getWellStrokeUpCount() {
        return wellStrokeUpCount;
    }

    public void setWellStrokeUpCount(Long wellStrokeUpCount) {
        this.wellStrokeUpCount = wellStrokeUpCount;
    }

    public Long getWellStrokeDownCount() {
        return wellStrokeDownCount;
    }

    public void setWellStrokeDownCount(Long wellStrokeDownCount) {
        this.wellStrokeDownCount = wellStrokeDownCount;
    }

    public Long getLoadMaxUpCount() {
        return loadMaxUpCount;
    }

    public void setLoadMaxUpCount(Long loadMaxUpCount) {
        this.loadMaxUpCount = loadMaxUpCount;
    }

    public Long getLoadMaxDownCount() {
        return loadMaxDownCount;
    }

    public void setLoadMaxDownCount(Long loadMaxDownCount) {
        this.loadMaxDownCount = loadMaxDownCount;
    }

    public Long getLoadMinUpCount() {
        return loadMinUpCount;
    }

    public void setLoadMinUpCount(Long loadMinUpCount) {
        this.loadMinUpCount = loadMinUpCount;
    }

    public Long getLoadMinDownCount() {
        return loadMinDownCount;
    }

    public void setLoadMinDownCount(Long loadMinDownCount) {
        this.loadMinDownCount = loadMinDownCount;
    }

    public BigDecimal getTempWellheadUp() {
        return tempWellheadUp;
    }

    public void setTempWellheadUp(BigDecimal tempWellheadUp) {
        this.tempWellheadUp = tempWellheadUp;
    }

    public Long getTempWellheadUpCount() {
        return tempWellheadUpCount;
    }

    public void setTempWellheadUpCount(Long tempWellheadUpCount) {
        this.tempWellheadUpCount = tempWellheadUpCount;
    }

    public BigDecimal getTempWellheadDown() {
        return tempWellheadDown;
    }

    public void setTempWellheadDown(BigDecimal tempWellheadDown) {
        this.tempWellheadDown = tempWellheadDown;
    }

    public Long getTempWellheadDownCount() {
        return tempWellheadDownCount;
    }

    public void setTempWellheadDownCount(Long tempWellheadDownCount) {
        this.tempWellheadDownCount = tempWellheadDownCount;
    }

    public BigDecimal getGtProdUp() {
        return gtProdUp;
    }

    public void setGtProdUp(BigDecimal gtProdUp) {
        this.gtProdUp = gtProdUp;
    }

    public Long getGtProdUpCount() {
        return gtProdUpCount;
    }

    public void setGtProdUpCount(Long gtProdUpCount) {
        this.gtProdUpCount = gtProdUpCount;
    }

    public BigDecimal getGtProdDown() {
        return gtProdDown;
    }

    public void setGtProdDown(BigDecimal gtProdDown) {
        this.gtProdDown = gtProdDown;
    }

    public Long getGtProdDownCount() {
        return gtProdDownCount;
    }

    public void setGtProdDownCount(Long gtProdDownCount) {
        this.gtProdDownCount = gtProdDownCount;
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

    public Long getTempWellheadUpLimit() {
        return tempWellheadUpLimit;
    }

    public void setTempWellheadUpLimit(Long tempWellheadUpLimit) {
        this.tempWellheadUpLimit = tempWellheadUpLimit;
    }

    public Long getTempWellheadDownLimit() {
        return tempWellheadDownLimit;
    }

    public void setTempWellheadDownLimit(Long tempWellheadDownLimit) {
        this.tempWellheadDownLimit = tempWellheadDownLimit;
    }

    public Long getGtProdUpLimit() {
        return gtProdUpLimit;
    }

    public void setGtProdUpLimit(Long gtProdUpLimit) {
        this.gtProdUpLimit = gtProdUpLimit;
    }

    public Long getGtProdDownLimit() {
        return gtProdDownLimit;
    }

    public void setGtProdDownLimit(Long gtProdDownLimit) {
        this.gtProdDownLimit = gtProdDownLimit;
    }

    public Date getStime() {
        return stime;
    }

    public void setStime(Date stime) {
        this.stime = stime;
    }

    public Long getCommExLimit() {
        return commExLimit;
    }

    public void setCommExLimit(Long commExLimit) {
        this.commExLimit = commExLimit;
    }

    public Long getCloseWellExLimit() {
        return closeWellExLimit;
    }

    public void setCloseWellExLimit(Long closeWellExLimit) {
        this.closeWellExLimit = closeWellExLimit;
    }

    public Long getPressCommExLimit() {
        return pressCommExLimit;
    }

    public void setPressCommExLimit(Long pressCommExLimit) {
        this.pressCommExLimit = pressCommExLimit;
    }

    public Long getStrokeCommExLimit() {
        return strokeCommExLimit;
    }

    public void setStrokeCommExLimit(Long strokeCommExLimit) {
        this.strokeCommExLimit = strokeCommExLimit;
    }

    public String getMark2() {
        return mark2;
    }

    public void setMark2(String mark2) {
        this.mark2 = mark2;
    }

    public String getWellName() {
        return wellName;
    }

    public void setWellName(String wellName) {
        this.wellName = wellName;
    }
}