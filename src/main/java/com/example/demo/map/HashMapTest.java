package com.example.demo.map;

import java.util.HashMap;

/**
 * @author: zenghai.li
 * @Date: 2022/02/22
 */
public class HashMapTest {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>(10);
        map.put(1, "1111");
        System.out.println(map.size());
    }
}
