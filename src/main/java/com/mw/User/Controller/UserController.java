package com.mw.User.Controller;

import com.mw.User.Entity.User;
import com.mw.User.Service.UserService;
import com.mw.common.Controller.CommonController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController extends CommonController {
    @Autowired
    private UserService userService;

    @GetMapping("getUserById")
    public User getUserById(Long id) {
        return userService.getById(id);
    }

    @GetMapping("getUserList")
    public List getUserList() {
        return userService.getList();
    }

    @PostMapping("saveUser")
    public User saveUser(User user) {
        return userService.save(user);
    }

    @DeleteMapping("deleteUserById")
    public void deleteUser(Long id) {
        userService.deleteById(id);
    }
}
