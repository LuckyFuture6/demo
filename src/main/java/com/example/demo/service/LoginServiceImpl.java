package com.example.demo.service;

import com.example.demo.bean.cus_info;
import com.example.demo.mapper.DepartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("LoginService")
public class LoginServiceImpl implements LoginService{

    @Override
    public String login(){
        return "success";
    }
}
