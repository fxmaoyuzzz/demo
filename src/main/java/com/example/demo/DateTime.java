package com.example.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @Author: zenghai.li
 * @Description:
 * @Date: 2022/04/01
 */
public class DateTime {

    public static void main(String[] args) {
        //Date date = new Date();
        ////int hour1 = DateTime.of(date).hour(true);
        ////int minute1 = DateTime.of(date).minute();
        ////System.out.println(hour1);
        ////System.out.println(minute1);
        ////String dateStr = "1900-01-01 " + hour1 + ":" + minute1 + ":" + "00";
        //////DateTime parse = DateUtil.parse(dateStr);
        //////System.out.println(parse);
        //Date date1 = new Date(0, 0, 1, 20, 59);
        ////
        ////System.out.println(date1);
        ////Calendar cal = Calendar.getInstance();
        ////Calendar cal1 = Calendar.getInstance();
        ////cal.set(Calendar.YEAR, 1900);
        ////cal.set(Calendar.MONTH, 0);
        ////cal.set(Calendar.DAY_OF_MONTH, 1);
        ////cal1.set(1900, Calendar.JANUARY, 1, hour1, minute1);
        ////Date dateRepresentation = cal.getTime();
        ////Date dateRepresentation1 = cal1.getTime();
        ////System.out.println(dateRepresentation);
        ////System.out.println(dateRepresentation1);
        ////
        ////Calendar instance = Calendar.getInstance();
        //////int i = instance.get(Calendar.HOUR_OF_DAY);
        ////instance.setTime(date);
        ////System.out.println(instance);
        ////int i = instance.get(Calendar.HOUR_OF_DAY);
        //
        //
        //Calendar calendar = Calendar.getInstance();
        //calendar.setTime(date1);
        //int hour = calendar.get(Calendar.HOUR_OF_DAY);
        //int minute = calendar.get(Calendar.MINUTE);
        //Calendar calendar = Calendar.getInstance();
        //calendar.setTime(date);
        //int hour = calendar.get(Calendar.HOUR_OF_DAY);
        //int minute = calendar.get(Calendar.MINUTE);
        //calendar.set(Calendar.YEAR, 1900);
        //calendar.set(Calendar.MONTH, Calendar.JANUARY);
        //calendar.set(Calendar.DATE, 1);
        //calendar.set(Calendar.HOUR_OF_DAY, hour);
        //calendar.set(Calendar.MINUTE, minute);
        //calendar.set(Calendar.SECOND, 0);
        ////calendar.set(1900, Calendar.JANUARY, Calendar., hour, minute);
        //Date time = calendar.getTime();
        //System.out.println(hour);
        //System.out.println(minute);
        //System.out.println(time);
        //String startDay = "2022-04-01";
        //String endDay = "2022-04-05";

        Date startDay = new Date(1900,3,01);
        Date endDay = new Date(1900, 3,07);
        List<String> days = new ArrayList<>();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar tempStart = Calendar.getInstance();
        tempStart.setTime(startDay);
        Calendar tempEnd = Calendar.getInstance();
        tempEnd.setTime(endDay);
        tempEnd.add(Calendar.DATE, +1);// 日期加1(包含结束)
        while (tempStart.before(tempEnd)) {
            days.add(dateFormat.format(tempStart.getTime()));
            tempStart.add(Calendar.DAY_OF_YEAR, 1);
        }

        //List<String> days = new ArrayList<>();
        //DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //Date startDate = null;
        //try {
        //    startDate = dateFormat.parse(startDay.toString());
        //
        //    Date endDate = dateFormat.parse(endDay.toString());
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
        //    e.printStackTrace();
        //}
        System.out.println(days);
    }

}
