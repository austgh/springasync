package com.ahzx.springasync.controller;

import com.ahzx.springasync.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author think
 * @version 1.0
 * @date 2022/3/20 21:54
 */
@RestController
public class TestController {
    @Autowired
    UserInfoService userInfoService;

    @GetMapping("/save")
    public String save() {
        userInfoService.save();
        return "ok";
    }

    @Value("${${user.age}}")
    private Integer userAge;

    @GetMapping("/getAge")
    public void getAge() {
        System.out.println("userAge=" + userAge);
    }
}
