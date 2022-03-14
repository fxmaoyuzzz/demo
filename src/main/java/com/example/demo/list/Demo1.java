package com.example.demo.list;

import com.example.demo.entity.Able;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author: fxmaoyuzzzz
 * @Date: 2021/12/27
 * @Description:
 */
public class Demo1 {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list2.add(1);
        list2.add(2);

        for (Integer a : list1) {
            for (Integer b : list2) {
                if (a.equals(b)){
                    int sum = a + b;
                    list3.add(sum);
                }
            }
        }
        Set<Integer> tmpSet = new HashSet<>(list1);
        tmpSet.retainAll(list2);
        List<Integer> result = tmpSet.stream().map(k->k*3).collect(Collectors.toList());
        ArrayList<Able> ables = new ArrayList<>();
        ArrayList<Able> ables1 = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            Able able = new Able();
            able.setId(i);
            able.setNum(i+1);
            able.setName("hahah" + i);
            ables.add(able);
            ables1.add(able);
        }

        //System.out.println(list1);
        //System.out.println(list2);
        //System.out.println(tmpSet);
        //System.out.println(result);
        Map<Integer, Integer> map1 = ables.stream().collect(Collectors.groupingBy(Able::getId, Collectors.summingInt(Able::getNum)));
        Map<Integer, List<String>> collect = ables.stream().collect(Collectors.groupingBy(Able::getId, Collectors.mapping(Able::getName, Collectors.toList())));
        //System.out.println(collect);
        List<Able> result1 = ables1.stream().filter( k->map1.containsKey(k.getId())).map(k->new Able(k.getId(),map1.get(k.getId()) / k.getNum())).collect(Collectors.toList());
        System.out.println(ables);
        System.out.println(map1);

    }


}
