package com.qinjie.chapter3.controller;

import com.qinjie.chapter3.config.ConfigBean;
import com.qinjie.chapter3.model.User;
import com.qinjie.chapter3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/user")
@RestController
@EnableConfigurationProperties(ConfigBean.class)
public class UserController {
    @Autowired
    private ConfigBean configBean;

    @Autowired
    private UserService userService;

    @GetMapping(value="test")
    public String test() {
        return configBean.getName()+configBean.getPassword();
    }
    @GetMapping("/{userName}")
    public User findUserByName(@PathVariable String userName) {
        return userService.findUserByName(userName);
    }
}
