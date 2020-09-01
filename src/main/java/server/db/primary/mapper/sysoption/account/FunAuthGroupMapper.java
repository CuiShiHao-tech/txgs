package server.db.primary.mapper.sysoption.account;

import org.springframework.stereotype.Component;
import server.db.common.CommonMapper;
import server.db.primary.model.sysoption.account.AuthGroup;

import java.util.List;

@Component
public interface FunAuthGroupMapper extends CommonMapper<AuthGroup> {

    List<AuthGroup> selectGroupTable();

    AuthGroup selectGroupOneById(Long id);
}