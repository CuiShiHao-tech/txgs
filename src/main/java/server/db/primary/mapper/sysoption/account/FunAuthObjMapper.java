package server.db.primary.mapper.sysoption.account;

import org.springframework.stereotype.Component;
import server.db.common.CommonMapper;
import server.db.primary.model.sysoption.account.AuthObj;

import java.util.List;

@Component
public interface FunAuthObjMapper extends CommonMapper<AuthObj> {
    AuthObj selectObjTableOnebyId(Long id);

    List<AuthObj> selectObjTable();
}