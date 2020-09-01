package server.db.primary.model.sysoption.well;

import lombok.Data;

import java.util.List;

@Data
public class FactoryInfo {
    private Long id;

    private String name;

    private List<AreaInfo> areaInfoList;
}