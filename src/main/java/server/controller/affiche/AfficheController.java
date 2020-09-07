package server.controller.affiche;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import server.db.primary.mapper.map.AfficheMapper;
import server.db.primary.model.map.Affiche;
import server.tool.Res;

import java.util.List;

@RestController
public class AfficheController {

    @Autowired
    AfficheMapper afficheMapper;

    /**
     * 保存
     * @param affiche
     * @return
     */
    @RequestMapping("/Affiche/save")
    public Res afficheByInsert(Affiche affiche) {
        int i = afficheMapper.insertSelective(affiche);
        return Res.success(i);
    }


    @RequestMapping("/Affiche/findByid")
    public Res afficheByid(long id) {
        Affiche affiche = afficheMapper.selectByPrimaryKey(id);
        return Res.success(affiche);
    }

    @RequestMapping("/Affiche/delete")
    public Res delete(long id) {
        int delete = afficheMapper.deleteByPrimaryKey(id);
        return Res.success(delete);

    }


    @RequestMapping("/Affiche/findAll")
    public Res findAll() {
        List<Affiche> affiches = afficheMapper.selectByAll();
        return Res.success(affiches);
    }





}
