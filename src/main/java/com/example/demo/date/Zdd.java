package com.example.demo.date;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: zenghai.li
 * @Description:
 * @Date: 2022/04/02
 */
public class Zdd {

    public static void main(String[] args) {

        Double amount = 0.99;
        Pattern pattern = Pattern.compile("^(([1-9]{1}\\d*)|([0]{1}))(\\.(\\d){0,2})?$");
        Matcher matcher = pattern.matcher(amount.toString());
        if (matcher.matches()){
            System.out.println("TRUE");
        }else {
            System.out.println("FALSE");

        }
    }
}
