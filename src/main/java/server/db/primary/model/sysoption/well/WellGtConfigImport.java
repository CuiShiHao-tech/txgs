package server.db.primary.model.sysoption.well;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.regex.Pattern;

@Data
@Accessors(chain = true)
public class WellGtConfigImport {
    private String wellNumber;                              //井号
    private Double crudeOilDensity;                         //原油密度（g/cm^3）
    private Double naturalgasrelativedensity;               //天然气相对密度!
    private Double saturationPressure;                      //饱和压力(MPa)
    private Double tubingpressure;                          //油气藏压力(MPa)!
    private Double depthReservoir;                          //油气藏深度（m）!
    private Double tempReservoir;                           //油气藏温度(℃)!
    private Double moistureContent;                         //含水率(%)
    private Double producingfluidlevel;                     //动液面（m）!
    private Double pumpsettingdepth;                        //泵挂（m）!
    private Double productionGasOilRatio;                   //生产气油比
    private String rod1Grade;                               //一级杆级别!
    private Double rod1Diameter;                            //一级杆径(mm)!
    private Double rod1Length;                              //一级杆长度（m）!
    private String rod2Grade;                               //二级杆级别!
    private Double rod2Diameter;                            //二级杆径(mm)!
    private Double rod2Length;                              //二级杆长度（m）!
    private String rod3Grade;                               //三级杆级别!
    private Double rod3Diameter;                            //三级杆径(mm)!
    private Double rod3Length;                              //三级杆长度（m）!
    private String rod4Grade;                               //四级杆级别!
    private Double rod4Diameter;                            //四级杆径(mm)!
    private Double rod4Length;                              //四级杆长度（m）!
    private String pumpType;                                //泵筒类型!
    private String pumpGrade;                               //泵级别!
    private Double plungerlength;                           //柱塞长（m）!
    private Double pumpborediameter;                        //泵径(mm)!
    private Double tubingInsidediameter;                    //油管内径(mm)!
    private Double casingInsidediameter;                    //套管内径(mm)!

    public void setPumpGrade(String a) {
        pumpGrade = Pattern.compile("[^0-9]").matcher(a).replaceAll("");
    }
}
