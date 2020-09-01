package server.service.imp.sysoption.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.db.primary.mapper.sysoption.account.FunAuthRolePermissionMapper;
import server.db.primary.model.sysoption.account.AuthRolePermission;
import server.service.interf.sysoption.account.FunAuthRolePermissionService;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class FunAuthRolePermissionImp implements FunAuthRolePermissionService {
    @Autowired
    FunAuthRolePermissionMapper funAuthRolePermissionMapper;

    @Override
    public List<AuthRolePermission> selectPermissionByRoleId(Long roleId) {
        Example example = new Example(AuthRolePermission.class);
        example.createCriteria()
                .andEqualTo("roleId", roleId);
        return funAuthRolePermissionMapper.selectByExample(example);
    }

    @Override
    public boolean deleteRolePermissionByRoleId(Long roleId) {
        Example example = new Example(AuthRolePermission.class);
        example.createCriteria()
                .andEqualTo("roleId", roleId);
        return funAuthRolePermissionMapper.deleteByExample(example) > 0;
    }

    @Override
    public boolean createRolePermission(AuthRolePermission authRolePermission) {
        return funAuthRolePermissionMapper.insertSelective(authRolePermission) > 0;
    }
}
