package server.db.primary.model.sysoption.account;

import lombok.Data;

@Data
public class AuthRolePermission {
    private Long roleId;

    private String permissionId;
}