package server.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.db.primary.mapper.map.WellDataCurMapMapper;
import server.db.primary.model.map.WellDataCur;
import server.db.primary.model.tool.MapData;
import server.service.WellDataCurMapService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by william on 2019/05/09
 * Description:
 **/
@Service
public class WellDataCurMapImp implements WellDataCurMapService {
    @Autowired
    WellDataCurMapMapper wellDataCurMapMapper;
    @Override
    public List<MapData> longitudeAndLatitude() {
        List<WellDataCur> wellDataCurs = wellDataCurMapMapper.longitudeAndLatitude();
        List<MapData> mapDatas =new ArrayList<>();
        for (WellDataCur wellDataCur:wellDataCurs){
            MapData mapData = new MapData();
            if (wellDataCur.getWellLat() != null && wellDataCur.getWellLong() != null){
                String lat = wellDataCur.getWellLat().toString();
                String log = wellDataCur.getWellLong().toString();
                String[] value = {log,lat};
                mapData.setValue(value);
            }
            mapData.setWellName(wellDataCur.getWellName());

            mapData.setDirection(wellDataCur.getRemark());
            mapDatas.add(mapData);
        }
        return mapDatas;
    }
}
