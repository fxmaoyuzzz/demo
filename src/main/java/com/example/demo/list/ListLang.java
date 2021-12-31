package com.example.demo.list;

import cn.hutool.core.collection.ListUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zenghai.li
 * @Date: 2021/12/31
 * @Description:
 */
public class ListLang {

    public static void main(String[] args) {


        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }
        List<List<Integer>> split = ListUtil.split(integers, 4);
        System.out.println(split);
    }
}
