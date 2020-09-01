package server.controller.ulogin;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import server.db.primary.mapper.map.ULoginMapper;

import server.db.primary.model.map.ULogin;

import server.tool.Res;

import java.util.List;

@RestController
public class ULoginController {
    private final ULoginMapper uLoginMapper;
    @Autowired
    public ULoginController(ULoginMapper uLoginMapper) {
        this.uLoginMapper = uLoginMapper;
    }
    @PostMapping("/ulogin")
    public Res login(String telephone, String password) throws  Exception {

        String realPassword = "";
        ULogin uLogin = uLoginMapper.selectByName(telephone);
        if (uLogin == null) {
            return Res.success(null, "无此用户");
//            throw new Exception("无此用户");
        } else {
            realPassword = uLogin.getPassword();
        }

        if (!realPassword.equals(password)) {
            return Res.success(null, "密码错误");
//            throw new Exception("密码错误");
        }
        return Res.success(uLogin, "登录成功");
    }

    @RequestMapping("/ulogin/Updata")
    public Res uLoginByUpdata(ULogin record) {
        int uLogin = uLoginMapper.updateByPrimaryKeySelective(record);
        return Res.success(uLogin);
    }

    @RequestMapping("/ulogin/ByStationId")
    public Res uLoginByStationId(String telephone) {
        List<ULogin> uLogin = uLoginMapper.selectByRole(telephone);
        return Res.success(uLogin);
    }

    @RequestMapping("/ulogin/Insert")
    public Res uLoginByInster(ULogin record) {
        int uLogin = uLoginMapper.insertSelective(record);
        return Res.success(uLogin);
    }

    @RequestMapping("/ulogin/Delete")
    public Res uLoginByDelete(Long id) {
        int uLogin = uLoginMapper.deleteByPrimaryKey(id);
        return Res.success(uLogin);
    }
}
