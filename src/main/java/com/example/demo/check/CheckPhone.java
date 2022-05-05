package com.example.demo.check;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: zenghai.li
 * @Description:
 * @Date: 2022/04/29
 */
public class CheckPhone {

    public static void main(String[] args) {
        //String phone = "13000000000";
        //Pattern pattern = Pattern.compile("^(13[0-9]|14[01456879]|15[0-35-9]|16[2567]|17[0-8]|18[0-9]|19[0-35-9])\\d{8}$");
        //Matcher match = pattern.matcher(phone);
        //if (!match.matches()){
        //    System.out.println(false);
        //}else {
        //    System.out.println(true);
        //}
        int a = 10;
        int b = -5;
        int i = a + b;

        int i1 = ~(a - 1);
        System.out.println(i1);

    }
}
