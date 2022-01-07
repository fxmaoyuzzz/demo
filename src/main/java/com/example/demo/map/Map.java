package com.example.demo.map;


import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author: zenghai.li
 * @Date: 2022/01/07
 */
public class Map {

    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "hahaha");
        map.put("sum", 0);
        ArrayList<java.util.Map<String, Object>> list = new ArrayList<>();
        list.add(map);

        HashMap<String, Integer> hashMap = new HashMap<>();

        list.forEach(item -> hashMap.put(item.get("name").toString(), (Integer) item.get("sum")));
        System.out.println(hashMap);
    }
}
