package com.example.demo.controller;

import com.example.demo.bean.cus_info;
import com.example.demo.service.LoginServiceImpl;
import com.example.demo.service.LoginService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Resource
    private LoginService loginService = new LoginServiceImpl();

    @RequestMapping(value = "/loginSuccess",method = RequestMethod.GET)
    public String login(){
        String ret = loginService.login();
        return ret;
    }
}
