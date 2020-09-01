package server.service.interf.sysoption.account;

import server.db.primary.model.sysoption.account.CLogin;

import java.util.List;

public interface FunCLoginService {
    CLogin selectUserByUsername(String username);

    CLogin selectUserById(Long id);

    List<CLogin> selectUser();

    List<CLogin> selectUserForList();

    boolean isUsernameExist(String cLoginname);

    boolean createUser(CLogin clogin);

    boolean isUsernameExistExceptSelf(Long id, String cLoginname);

    boolean updateUser(CLogin cLogin);

    boolean deleteUserByIdList(List<Long> idList);

    CLogin selectUserOneById(Long id);
}
