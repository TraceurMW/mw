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

    @GetMapping("get/{id}")
    public User getUserById(@PathVariable  Long id) {
        return userService.getById(id);
    }

    @GetMapping("getList")
    public List getUserList() {
        return userService.getList();
    }

    @PostMapping("save")
    public User saveUser(@RequestBody User user) {
        return userService.save(user);
    }

    @DeleteMapping("delete")
    public void deleteUser(Long id) {
        userService.deleteById(id);
    }

    @GetMapping("test")
    public String test(){
        return "1";
    }
}
