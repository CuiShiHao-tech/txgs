package server.db.primary.model.map;

import java.util.Date;

public class Affiche {
    private Long id;

    private Long numberId; //流水号

    private Long userId;//申请人账号ID

    private String userName;

    private Long wellId;

    private String wellName;

    private String data;//通知标题

    private String giveAd;//报送单位

    private Short mark1;//申请人状态ID（0=提交；1=暂存）

    private String remark1;

    private Long wellUserId;//部门领导账号ID

    private String wellUserName;

    private Short ideaId2;//部门领导审批结果（0=同意；1=不同意）

    private String ideaName2;

    private String ideaData2;//部门领导签名

    private Short mark2;//部门领导审批状态（0=未查看；1=已查看；2=提交；3=退回’）

    private String remark2;

    private Date stime2;//部门领导审批时间

    private Long stationUserId;//公司领导账号ID

    private String stationUserName;

    private Short ideaId3;//公司领导审批结果（0=同意；1=不同意）

    private String ideaName3;

    private String ideaData3;//公司领导签名

    private Short mark3;//公司领导审批状态（0=未查看；1=已查看；2=提交；3=退回’）

    private String remark3;

    private Date stime3;//公司领导审批时间

    private Short mark;//归档状态（0=未办结；1=办结）默认0

    private String remark;

    private Date stime;//办结时间

    private String data2;//通知内容

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumberId() {
        return numberId;
    }

    public void setNumberId(Long numberId) {
        this.numberId = numberId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
        this.wellName = wellName;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getGiveAd() {
        return giveAd;
    }

    public void setGiveAd(String giveAd) {
        this.giveAd = giveAd;
    }

    public Short getMark1() {
        return mark1;
    }

    public void setMark1(Short mark1) {
        this.mark1 = mark1;
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }

    public Long getWellUserId() {
        return wellUserId;
    }

    public void setWellUserId(Long wellUserId) {
        this.wellUserId = wellUserId;
    }

    public String getWellUserName() {
        return wellUserName;
    }

    public void setWellUserName(String wellUserName) {
        this.wellUserName = wellUserName;
    }

    public Short getIdeaId2() {
        return ideaId2;
    }

    public void setIdeaId2(Short ideaId2) {
        this.ideaId2 = ideaId2;
    }

    public String getIdeaName2() {
        return ideaName2;
    }

    public void setIdeaName2(String ideaName2) {
        this.ideaName2 = ideaName2;
    }

    public String getIdeaData2() {
        return ideaData2;
    }

    public void setIdeaData2(String ideaData2) {
        this.ideaData2 = ideaData2;
    }

    public Short getMark2() {
        return mark2;
    }

    public void setMark2(Short mark2) {
        this.mark2 = mark2;
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }

    public Date getStime2() {
        return stime2;
    }

    public void setStime2(Date stime2) {
        this.stime2 = stime2;
    }

    public Long getStationUserId() {
        return stationUserId;
    }

    public void setStationUserId(Long stationUserId) {
        this.stationUserId = stationUserId;
    }

    public String getStationUserName() {
        return stationUserName;
    }

    public void setStationUserName(String stationUserName) {
        this.stationUserName = stationUserName;
    }

    public Short getIdeaId3() {
        return ideaId3;
    }

    public void setIdeaId3(Short ideaId3) {
        this.ideaId3 = ideaId3;
    }

    public String getIdeaName3() {
        return ideaName3;
    }

    public void setIdeaName3(String ideaName3) {
        this.ideaName3 = ideaName3;
    }

    public String getIdeaData3() {
        return ideaData3;
    }

    public void setIdeaData3(String ideaData3) {
        this.ideaData3 = ideaData3;
    }

    public Short getMark3() {
        return mark3;
    }

    public void setMark3(Short mark3) {
        this.mark3 = mark3;
    }

    public String getRemark3() {
        return remark3;
    }

    public void setRemark3(String remark3) {
        this.remark3 = remark3;
    }

    public Date getStime3() {
        return stime3;
    }

    public void setStime3(Date stime3) {
        this.stime3 = stime3;
    }

    public Short getMark() {
        return mark;
    }

    public void setMark(Short mark) {
        this.mark = mark;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getStime() {
        return stime;
    }

    public void setStime(Date stime) {
        this.stime = stime;
    }

    public String getData2() {
        return data2;
    }

    public void setData2(String data2) {
        this.data2 = data2;
    }
}