package com.example.demo.number;

import java.math.BigDecimal;

/**
 * @Author: zenghai.li
 * @Description:
 * @Date: 2022/04/22
 */
public class BigDecimalSum {

    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(100);
        BigDecimal bigDecimal1 = new BigDecimal(-10);
        BigDecimal bigDecimal2 = new BigDecimal(-40);

        BigDecimal add = bigDecimal.add(bigDecimal1).add(bigDecimal2);
        System.out.println(add);
    }
}
