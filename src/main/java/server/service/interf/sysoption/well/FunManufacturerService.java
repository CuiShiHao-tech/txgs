package server.service.interf.sysoption.well;

import server.db.primary.model.sysoption.well.Manufacturer;

import java.util.List;

public interface FunManufacturerService {
    List<Manufacturer> selectAll();
}
