package server.service;

import server.db.primary.model.map.WellDataCur;
import server.db.primary.model.tool.MapData;

import java.util.List;

/**
 * Created by william on 2019/05/09
 * Description:
 **/
public interface WellDataCurMapService {
    List<MapData> longitudeAndLatitude();
}
