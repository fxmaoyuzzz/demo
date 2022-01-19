package com.example.demo.map;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author: zenghai.li
 * @Date: 2022/01/19
 */
public class HashMapDemo {

    public static void main(String[] args) {
        //HashMap<String, Integer> map = new HashMap<>();
        //map.put("demo", 1);

        //HashSet<A> hashSet = new HashSet<>();
        //for (int i = 0; i < 100; i++) {
        //    hashSet.add(new A(i));
        //}

        Runtime runtime = Runtime.getRuntime();
        int i = runtime.availableProcessors();
        System.out.println(i);
        Thread thread = new Thread();
        thread.start();
    }


}

class A {
    private Integer age;

    public A(Integer age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        return 100;
    }
}
