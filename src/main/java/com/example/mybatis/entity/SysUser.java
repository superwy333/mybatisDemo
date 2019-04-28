package com.example.mybatis.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "sys_user")
public class SysUser extends BaseDomain {


//    @Id
//    @Column(name = "id")
//    @GeneratedValue(generator = "JDBC")
//    private Long id;
    @Column(name = "address")
    private String address;
    @Column(name = "bank")
    private String bank;
    @Column(name = "birth")
    private Date birth;
    @Column(name = "email")
    private String email;

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
