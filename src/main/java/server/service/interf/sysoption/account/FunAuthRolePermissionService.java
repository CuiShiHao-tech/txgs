package server.service.interf.sysoption.account;

import server.db.primary.model.sysoption.account.AuthRolePermission;

import java.util.List;

public interface FunAuthRolePermissionService {
    List<AuthRolePermission> selectPermissionByRoleId(Long roleId);

    boolean deleteRolePermissionByRoleId(Long roleId);

    boolean createRolePermission(AuthRolePermission authRolePermission);
}
