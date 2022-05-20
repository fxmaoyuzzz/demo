package com.example.demo.check;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: zenghai.li
 * @Description:
 * @Date: 2022/05/20
 */
public class CheckNumber {

    public static void main(String[] args) {
        String str = "100.0";

        //Pattern pattern = Pattern.compile("^(([1-9]{1}\\d*)|(0{1}))(\\.\\d{1,2})?$");
        Pattern pattern = Pattern.compile("^\\d{1,16}$|^\\d{1,16}[.]\\d{1,2}$");

        Matcher match = pattern.matcher(str);
        if (!match.matches()){
            System.out.println(false);
        }
    }
}
