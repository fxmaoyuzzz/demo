package com.example.demo.list;

import com.example.demo.entity.Able;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @Author: zenghai.li
 * @Description:
 * @Date: 2022/04/18
 */
public class Sum {

    public static void main(String[] args) {
        ArrayList<Able> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Able able = new Able();
            able.setNum(i);
            list.add(able);
        }
        Able able = new Able();
        able.setNum(-5);
        list.add(able);

        int sum1 = list.stream().mapToInt(Able::getNum).sum();
        int sum = list.stream().filter(item -> item.getNum() > 0).mapToInt(Able::getNum).sum();
        System.out.println(sum);
        System.out.println(sum1);

        Integer a = 10;
        if(a < sum){
            System.out.println("zzz");
        }
    }
}
