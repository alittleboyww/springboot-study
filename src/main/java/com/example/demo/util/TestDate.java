package com.example.demo.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
    public static void main(String[] args){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        Date time = null;
        try {
            time = simpleDateFormat.parse("2019.02.16 21:31:23");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(time);
    }
}
