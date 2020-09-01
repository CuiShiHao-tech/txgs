package server.db.primary.mapper.map;

import org.apache.ibatis.annotations.Param;
import server.db.primary.model.map.ULogin;

import java.util.List;

public interface ULoginMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ULogin record);

    int insertSelective(ULogin record);

    ULogin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ULogin record);

    int updateByPrimaryKey(ULogin record);

    ULogin selectByName(String telephone);

    List<ULogin> selectByRole(@Param("telephone") String telephone);


}