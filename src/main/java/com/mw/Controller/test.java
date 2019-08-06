package com.mw.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/test")
public class test {
//    @Autowired
//    private RestTemplate restTemplate;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @RequestMapping("/test")
    public String test(){
//        String sql="select * from customer ";
//        jdbcTemplate.query(sql);
        return "test";
    }
}
