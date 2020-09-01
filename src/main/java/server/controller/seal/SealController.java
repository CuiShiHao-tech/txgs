package server.controller.seal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import server.db.primary.mapper.map.SealMapper;
import server.db.primary.model.map.Seal;
import server.tool.Res;


@RestController
public class SealController {
    @Autowired
    SealMapper sealMapper;

    @RequestMapping("/Seal/Insert")
    public Res sealByInsert(Seal record) {
        int seal = sealMapper.insertSelective(record);
        return Res.success(seal);
    }
}
