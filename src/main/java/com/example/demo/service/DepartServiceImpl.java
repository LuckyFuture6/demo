package com.example.demo.service;

import com.example.demo.bean.cus_info;
import com.example.demo.mapper.DepartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("departService")
public class DepartServiceImpl implements DepartService{
    @Autowired
    private DepartMapper departMapper;

    @Override
    public List<cus_info> selectAll() {
        return departMapper.selectAll();
    }
}