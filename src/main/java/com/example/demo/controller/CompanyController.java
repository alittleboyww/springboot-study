package com.example.demo.controller;

import com.example.demo.bean.Company;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/companyInfo")
public class CompanyController {

    @RequestMapping(value = "getCompanyInfo",method = RequestMethod.GET)
    public Company getCompanyInfo(){
        Company company = new Company();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        Date time = null;
        try {
            time = simpleDateFormat.parse("2010.02.16 21:31:23");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        company.setName("人民银行");
        company.setAddress("江西新余");
        company.setUpTime(time);
        return company;
    }
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        return "test 热部署";
    }
    @RequestMapping(value = "/testreibushu",method = RequestMethod.GET)
    public String reibushu(){
        return "热部署测试";
    }
}
