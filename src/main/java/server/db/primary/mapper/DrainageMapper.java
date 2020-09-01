package server.db.primary.mapper;

import org.apache.ibatis.annotations.Param;
import server.db.primary.model.Drainage;

import java.util.List;

public interface DrainageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Drainage record);

    int insertSelective(Drainage record);

    Drainage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Drainage record);

    int updateByPrimaryKey(Drainage record);

    List<Drainage> search(@Param("areaIds") List<Long> areaIds, @Param("wellName") String wellName);
}