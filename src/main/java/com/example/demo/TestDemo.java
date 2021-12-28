package com.example.demo;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: fxmaoyuzzzz
 * @Date: 2021/12/27
 * @Description:
 */
public class TestDemo {

    public static void main(String[] args) {
        ArrayList<Able> list1 = new ArrayList<>();
        ArrayList<Able> list2 = new ArrayList<>();

        for (int i = 1; i < 4; i++) {
            Able able = new Able();
            able.setNum(i);
            list1.add(able);
        }
        for (int i = 1; i < 3; i++) {
            Able able = new Able();
            able.setNum(i);
            list2.add(able);
        }
        System.out.println(list1);
        System.out.println(list2);
        ArrayList<Integer> integers = new ArrayList<>();
        //for (Able able : list1) {
        //    for (Able able1 : list2) {
        //        if (able.getNum().equals(able1.getNum())){
        //            int i = able.getNum() + able1.getNum();
        //            integers.add(i);
        //        }
        //    }
        //}

        Iterator<Able> iterator = list1.iterator();
        while (iterator.hasNext()){
            if (list2.contains(iterator.next())){
                //iterator
            }
        }


        System.out.println(integers);
    }
}
