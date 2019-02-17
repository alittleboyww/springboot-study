package com.example.demo.bean;

import java.util.Date;

//公司
public class Company {

    private String name;    //公司名称
    private String address;//公司地址
    private Date upTime;    //上市时间

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getUpTime() {
        return upTime;
    }

    public void setUpTime(Date upTime) {
        this.upTime = upTime;
    }
}
