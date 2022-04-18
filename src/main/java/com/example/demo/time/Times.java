package com.example.demo.time;

import cn.hutool.core.date.DateUtil;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @Author: zenghai.li
 * @Description:
 * @Date: 2022/04/13
 */
public class Times {

    public static void main(String[] args) {
        //List<String> days = new ArrayList<>();
        //try {
        //
        //    String startDay = "2022-04-13";
        //    String endDay = "2022-04-13";
        //
        //    DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
        //    Date startDate = dateFormat.parse(startDay);
        //    Date endDate = dateFormat.parse(endDay);
        //    Calendar tempStart = Calendar.getInstance();
        //    tempStart.setTime(startDate);
        //    Calendar tempEnd = Calendar.getInstance();
        //    tempEnd.setTime(endDate);
        //    tempEnd.add(Calendar.DATE, +1);// 日期加1(包含结束)
        //    while (tempStart.before(tempEnd)) {
        //        days.add(dateFormat.format(tempStart.getTime()));
        //        tempStart.add(Calendar.DAY_OF_YEAR, 1);
        //    }
        //} catch (ParseException e) {
        //}
        Date days = new Date();
        DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
        String date = dateFormat.format(days);
        System.out.println(date);
    }
}
