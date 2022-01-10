package com.example.demo.number;

import cn.hutool.core.util.NumberUtil;

/**
 * @author: zenghai.li
 * @Date: 2021/12/30
 * @Description:
 */
public class NumberDemo {

    public static void main(String[] args) {
        Integer a = 0;

        Double b = a.doubleValue();
        System.out.println(b);

        double c = 10;
        double d = 3;

        double div = NumberUtil.div(d, c);

        System.out.println(div);

    //    merge test
    //
    }
}
