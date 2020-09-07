package server.db.primary.mapper.map;

import server.db.primary.model.map.Affiche;
import server.db.primary.model.map.WellInfo;

import java.util.List;

public interface AfficheMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Affiche record);

    int insertSelective(Affiche record);

    Affiche selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Affiche record);

    int updateByPrimaryKey(Affiche record);

    List<Affiche> selectByAll();

    void deleteByPrimaryKey();
}