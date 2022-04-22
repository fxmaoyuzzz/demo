package com.example.demo.list;

import com.example.demo.entity.Able;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Author: zenghai.li
 * @Description:
 * @Date: 2022/04/22
 */
public class ListStream {

    public static void main(String[] args) {
        ArrayList<Able> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Able able = new Able();
            able.setNum(i);
            list.add(able);
        }

        Able able1 = new Able();
        able1.setNum(1);
        Able able2 = new Able();
        able2.setNum(-1);
        list.add(able1);
        list.add(able2);
        System.out.println(list);

        //Map<Able, Long> collect = list.stream().filter(item -> item.getNum() > 0).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<Able, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
