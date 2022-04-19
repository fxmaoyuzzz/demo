package com.example.demo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: zenghai.li
 * @Description:
 * @Date: 2022/04/18
 */
public class Thread {

    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                10,
                20,
                10,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(3),
                Executors.defaultThreadFactory());

        for (int i = 0; i < 20; i++) {
            executor.execute(() -> {
                System.out.println(java.lang.Thread.currentThread().getId());
            });
        }
        executor.shutdown();
    }
}
