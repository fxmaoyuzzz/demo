package com.example.demo.test;

import com.example.demo.entity.Shop;

/**
 * @Author: zenghai.li
 * @Description:
 * @Date: 2022/05/20
 */
public class Test {

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.setReviewStatus(1);
        shop.setStatusType(0);

        if (!shop.getReviewStatus().equals(1) && !shop.getStatusType().equals(1)){
            System.out.println("zzz");
        }
    }
}
