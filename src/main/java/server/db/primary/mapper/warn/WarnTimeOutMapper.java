package server.db.primary.mapper.warn;

import org.apache.ibatis.annotations.Param;
import server.db.primary.model.warn.WarnTimeOut;

import java.util.List;

public interface WarnTimeOutMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WarnTimeOut record);

    int insertSelective(WarnTimeOut record);

    WarnTimeOut selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WarnTimeOut record);

    int updateByPrimaryKey(WarnTimeOut record);

    List<WarnTimeOut> search(@Param("areaIds") List<Long> areaIds);

    List<WarnTimeOut> selectNotConfigTimeOut(@Param("areaIds") List<Long> areaIds);

}