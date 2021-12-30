package com.example.demo.list;

import com.example.demo.entity.Problem;
import com.example.demo.entity.Stu;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author: zenghai.li
 * @Date: 2021/12/30
 * @Description:
 */
public class Group {

    public static void main(String[] args) {
        ArrayList<Problem> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Problem problem = new Problem();
            problem.setId(i);
            problem.setStatus(1);
            list.add(problem);
        }

        for (int i = 6; i < 10; i++) {
            Problem problem = new Problem();
            problem.setId(i);
            problem.setStatus(2);
            list.add(problem);
        }

        for (int i = 11; i < 14; i++) {
            Problem problem = new Problem();
            problem.setId(i);
            problem.setStatus(3);
            list.add(problem);
        }

        //System.out.println(list);
        List<Problem> status1 = list.stream().filter(item -> item.getStatus().equals(1)).collect(Collectors.toList());
        List<Problem> status2 = list.stream().filter(item -> item.getStatus().equals(2)).collect(Collectors.toList());
        List<Problem> status3 = list.stream().filter(item -> item.getStatus().equals(3)).collect(Collectors.toList());
        System.out.println(status1.size());
        System.out.println(status2.size());
        System.out.println(status3.size());
        Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(Problem::getStatus, Collectors.counting()));
        System.out.println(map);
        Long aLong = map.get(1);
        System.out.println(aLong);
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            integers.add(i);
        }
        for (int i = 0; i < 6; i++) {
            integers.add(i);
        }
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }
        Map<Integer, Long> collect4 = integers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("integer:" + integers);
        System.out.println("coloect4:" + collect4);

        Map<Problem, Long> problemLongMap = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(problemLongMap);

        ArrayList<Stu> stus = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Stu stu = new Stu();
            stu.setId(i);
            stu.setName(i+"zz");
            stus.add(stu);
        }
        Map<Integer, String> map1 = stus.stream().collect(Collectors.toMap(Stu::getId, Stu::getName, (key1, key2) -> key2));
        System.out.println(map1);
    }
}
