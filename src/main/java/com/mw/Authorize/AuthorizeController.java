package com.mw.Authorize;

import com.mw.User.Entity.User;
import com.mw.User.Service.UserService;
import com.mw.common.Controller.CommonController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authorize")
public class AuthorizeController  {
    @PostMapping("login")
    public String login() {
        return "1";
    }

}
