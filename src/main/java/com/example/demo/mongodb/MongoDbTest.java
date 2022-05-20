package com.example.demo.mongodb;

import cn.hutool.core.util.RandomUtil;
import org.apache.shiro.codec.Hex;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: zenghai.li
 * @Description:
 * @Date: 2022/05/16
 */
public class MongoDbTest {

    public static void main(String[] args) {
        String str = "198";

        Pattern pattern = Pattern.compile("^[0-9]*$");
        Matcher match = pattern.matcher(str);
        if (!match.matches()){
            System.out.println("false");
        }
        System.out.println("true");
    }
}
