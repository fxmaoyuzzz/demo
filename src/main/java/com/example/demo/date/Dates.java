package com.example.demo.date;

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
 * @Date: 2022/04/02
 */
public class Dates {
    public static final String HHMM ="HH:mm";

    public static void main(String[] args) {
        String startDay = "09:23";
        DateFormat dateFormat = new SimpleDateFormat(HHMM);
        try {
            Date startDate = dateFormat.parse(startDay);
            System.out.println(startDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
