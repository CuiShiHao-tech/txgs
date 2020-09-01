package server.service.imp.sysoption.well;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.db.primary.mapper.sysoption.well.FunManufacturerMapper;
import server.db.primary.model.sysoption.well.Manufacturer;
import server.service.interf.sysoption.well.FunManufacturerService;

import java.util.List;

@Service
public class FunManufacturerImp implements FunManufacturerService {
    @Autowired
    FunManufacturerMapper manufacturerMapper;

    @Override
    public List<Manufacturer> selectAll() {
        return manufacturerMapper.selectAll();
    }
}
