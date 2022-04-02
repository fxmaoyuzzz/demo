package com.example.demo.map;

import com.example.demo.entity.Able;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author: zenghai.li
 * @Description:
 * @Date: 2022/04/01
 */
public class MapValue {

    public static void main(String[] args) {
        ArrayList<Able> ableArrayList = new ArrayList<>();
        Able able = new Able();
        for (int i = 0; i < 10; i++) {
            Able able1 = new Able();
            able1.setId(i);
            able1.setName("zzz");
            able1.setNum(20);
            ableArrayList.add(able1);
        }
        able.setId(1);
        //able.setNum(20);
        able.setName("hhh");
        ableArrayList.add(able);
        System.out.println(ableArrayList.size());
        System.out.println(ableArrayList);
        Map<Integer, List<Able>> map = ableArrayList.stream().collect(Collectors.groupingBy(Able::getId));
        HashSet<Object> set = new HashSet<>();
        set.addAll(ableArrayList);

        //for (Map.Entry<Integer, List<Able>> entry : map.entrySet()) {
        //    List<Able> value = entry.getValue();
        //    //System.out.println(value);
        //    //if (value.size() > 1){
        //    //    System.out.println("有重复");
        //        for (Able aaa : value) {
        //            set.add(aaa);
        //            //System.out.println(aaa);
        //            //System.out.println(set);
        //        }
        //    //}
        //}
        System.out.println(set);
        System.out.println(set.size());
    }
}
