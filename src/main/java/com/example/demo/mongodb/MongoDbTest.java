package com.example.demo.mongodb;

import cn.hutool.core.util.RandomUtil;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @Author: zenghai.li
 * @Description:
 * @Date: 2022/05/16
 */
public class MongoDbTest {

    public static void main(String[] args) {
        //String numbers = RandomUtil.randomNumbers(6);
        String baseString = "0123456789";
        final StringBuilder sb = new StringBuilder(6);

        //if (6 < 1) {
        //    length = 1;
        //}
        int baseLength = baseString.length();
        for (int i = 0; i < 6; i++) {
            int number = ThreadLocalRandom.current().nextInt(baseLength);
            sb.append(baseString.charAt(number));
        }
        System.out.println(sb.toString());
    }
}
