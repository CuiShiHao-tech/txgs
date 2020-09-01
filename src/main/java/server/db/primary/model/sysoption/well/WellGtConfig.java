package server.db.primary.model.sysoption.well;

import lombok.Data;
import lombok.experimental.Accessors;
import org.apache.ibatis.type.JdbcType;
import tk.mybatis.mapper.annotation.ColumnType;

import javax.persistence.Column;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@Accessors(chain = true)
public class WellGtConfig {
    @Id
    @ColumnType(jdbcType = JdbcType.NUMERIC)
    private Long wellId;
    @ColumnType(jdbcType = JdbcType.VARCHAR)
    private String wellName;
    @ColumnType(jdbcType = JdbcType.NUMERIC)
    private Long wellNum;
    @ColumnType(jdbcType = JdbcType.NUMERIC)
    private Double naturalgasrelativedensity = 0.7;
    @ColumnType(jdbcType = JdbcType.NUMERIC)
    private Double waterdensity;
    @ColumnType(jdbcType = JdbcType.NUMERIC)
    private Double depthReservoir;
    @ColumnType(jdbcType = JdbcType.NUMERIC)
    private Double tempReservoir;
    @ColumnType(jdbcType = JdbcType.NUMERIC)
    private Short rod1Type;
    @ColumnType(jdbcType = JdbcType.VARCHAR)
    private String rod1Grade;
    @ColumnType(jdbcType = JdbcType.NUMERIC)
    private Double rod1Length;
    @ColumnType(jdbcType = JdbcType.NUMERIC)
    private Double rod1Diameter;
    @ColumnType(jdbcType = JdbcType.NUMERIC)
    private Short rod2Type;
    @ColumnType(jdbcType = JdbcType.VARCHAR)
    private String rod2Grade;
    @ColumnType(jdbcType = JdbcType.NUMERIC)
    private Double rod2Length;
    @ColumnType(jdbcType = JdbcType.NUMERIC)
    private Double rod2Diameter;
    @ColumnType(jdbcType = JdbcType.NUMERIC)
    private Short rod3Type;
    @ColumnType(jdbcType = JdbcType.VARCHAR)
    private String rod3Grade;
    @ColumnType(jdbcType = JdbcType.NUMERIC)
    private Double rod3Length;
    @ColumnType(jdbcType = JdbcType.NUMERIC)
    private Double rod3Diameter;
    @ColumnType(jdbcType = JdbcType.NUMERIC)
    private Short rod4Type;
    @ColumnType(jdbcType = JdbcType.VARCHAR)
    private String rod4Grade;
    @ColumnType(jdbcType = JdbcType.NUMERIC)
    private Double rod4Length;
    @ColumnType(jdbcType = JdbcType.NUMERIC)
    private Double rod4Diameter;
    @ColumnType(jdbcType = JdbcType.VARCHAR)
    private String pumpType;
    @ColumnType(jdbcType = JdbcType.NUMERIC)
    private Short pumpGrade;
    @ColumnType(jdbcType = JdbcType.NUMERIC)
    private Double plungerlength;
    @ColumnType(jdbcType = JdbcType.NUMERIC)
    private Double pumpborediameter;
    @ColumnType(jdbcType = JdbcType.NUMERIC)
    private Double tubingInsidediameter;
    @ColumnType(jdbcType = JdbcType.NUMERIC)
    private Double casingInsidediameter;
    @ColumnType(jdbcType = JdbcType.NUMERIC)
    private Double tubingpressure;
    @ColumnType(jdbcType = JdbcType.NUMERIC)
    private Double casingpressure;
    @ColumnType(jdbcType = JdbcType.NUMERIC)
    private Double wellheadfluidtemperature;
    @ColumnType(jdbcType = JdbcType.NUMERIC)
    private Double producingfluidlevel;
    @ColumnType(jdbcType = JdbcType.NUMERIC)
    private Double pumpsettingdepth;
    @ColumnType(jdbcType = JdbcType.NUMERIC)
    private Double pressDepth;
    @ColumnType(jdbcType = JdbcType.VARCHAR)
    private String prodWell;
    @ColumnType(jdbcType = JdbcType.NUMERIC)
    private Short mark = 0;

    private Date stime = new Date();
}
