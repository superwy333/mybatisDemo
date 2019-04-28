package com.example.mybatis;

import com.example.mybatis.entity.SysUser;
import com.example.mybatis.mapper.IMapper;
import com.example.mybatis.mapper.SysUserMapper;
import com.example.mybatis.service.SysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisApplicationTests {


    @Autowired
    SysUserMapper sysUserMapper;
    @Autowired
    SysUserService sysUserService;
    @Autowired
    ApplicationContext ioc;

    @Test
    public void contextLoads() {
        SysUser sysUser = new SysUser();
        sysUser.setAddress("aaa");
        sysUser.setEmail("121401769@qq.com");
        sysUser.setBank("zgbank");
        sysUser.setBirth(new Date());
        sysUserService.add(sysUser);
        //sysUserMapper.insert(sysUser);


        System.out.println(ioc.containsBean("sysUserMapper"));
        List<SysUser> sysUserList = sysUserMapper.selectAll();
        System.out.println(sysUserList);

    }

    @Test
    public void test1() {
        SysUser sysUser = new SysUser();
        sysUser.setAddress("aaa");
        sysUser.setEmail("121401769@qq.com");
        sysUser.setBank("zgbank");
        sysUser.setBirth(new Date());
        sysUserService.add(sysUser);

    }

}
