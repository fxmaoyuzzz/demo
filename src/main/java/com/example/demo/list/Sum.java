package com.example.demo.list;

import com.example.demo.entity.Able;

import java.util.ArrayList;
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

        int sum = list.stream().mapToInt(Able::getNum).sum();
        System.out.println(sum);
        Integer a = 10;
        if(a < sum){
            System.out.println("zzz");
        }
    }
}
