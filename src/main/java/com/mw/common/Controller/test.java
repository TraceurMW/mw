package com.mw.common.Controller;


import com.mw.User.Dao.UserRepository;
import com.mw.User.Entity.User;
import com.mw.common.Controller.CommonController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/test")
public class test extends CommonController {
    //    @Autowired
//    private RestTemplate restTemplate;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private UserRepository userRepository;
    @RequestMapping("/test")
    public User test(){
        Optional<User> byId = userRepository.findById(1L);
        User user = byId.get();
        System.out.println(user);
//        String sql="select * from customer ";
//        jdbcTemplate.query(sql);
        return user;
    }
}
