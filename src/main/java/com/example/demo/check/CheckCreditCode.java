package com.example.demo.check;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: zenghai.li
 * @Description:
 * @Date: 2022/05/11
 */
public class CheckCreditCode {

    public static void main(String[] args) {
        String s = "913200007589576661";
        Pattern pattern = Pattern.compile("^[0-9A-HJ-NPQRTUWXY]{2}\\d{6}[0-9A-HJ-NPQRTUWXY]{10}$");
        Matcher match = pattern.matcher(s);
        if (!match.matches()){
            System.out.println(false);
        }else {
            System.out.println(true);
        }
    }
}
