package com.example.mybatis.service;


import com.example.mybatis.entity.BaseDomain;
import com.example.mybatis.mapper.IMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class BaseService<T>{

    @Autowired
    private IMapper<T> iMapper;






}
