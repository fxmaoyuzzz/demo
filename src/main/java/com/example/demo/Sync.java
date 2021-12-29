package com.example.demo;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.*;
import java.util.function.Supplier;

/**
 * @author: zenghai.li
 * @Date: 2021/12/29
 * @Description:
 */
public class Sync {

    public static void useCompletableFuture_simple() {
        // 这个方法时描述利用1.8新特性，简单使用CompletableFuture实现异步操作

        // 先创建两个活动线程的线程池
        ExecutorService executor = Executors.newFixedThreadPool(2);

        List<String> nameList = new ArrayList<String>();

        for (int i = 0; i < 1000; i++) {
            nameList.add(String.valueOf(i));
        }

        // 使用JDK 1.8的特性，stream()和Lambda表达式: (参数) -> {表达式}
        nameList.stream().forEach(name -> CompletableFuture.supplyAsync((Supplier<String>) () -> {
            print((String) name); // 封装了业务逻辑
            return "success";
        }, executor).exceptionally(e -> {
            System.out.println(e);
            return "false";
        }));

        executor.shutdown();

        while (!executor.isTerminated()) {
            System.out.println("no terminated");
            try {
                System.out.println("我要休眠一下");
                TimeUnit.MILLISECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Sync.useCompletableFuture_simple();
    }
    public static String print(String name){
        System.out.println(name);
        return name;
    }

}
