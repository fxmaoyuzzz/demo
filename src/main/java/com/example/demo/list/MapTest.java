package com.example.demo.list;

import com.example.demo.entity.Able;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author: zenghai.li
 * @Description:
 * @Date: 2022/04/24
 */
public class MapTest {

    public static void main(String[] args) {

        ArrayList<Able> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Able able = new Able();
            able.setId(i);
            able.setNum(i);
            able.setName("zzz");
            list.add(able);
        }
        Able able1 = new Able();
        able1.setId(100);
        able1.setNum(100);
        list.add(able1);

        Map<String, List<Able>> map = list.stream().collect(Collectors.groupingBy(Able::getName));
        System.out.println(map);
    }
}
