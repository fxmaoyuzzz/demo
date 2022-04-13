package com.example.demo.list;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;


/**
 * @Author: zenghai.li
 * @Description:
 * @Date: 2022/04/11
 */
public class ListMap {

    public static void main(String[] args) {
        //thenAcceptAsync:能接受上一步结果，但是无返回值
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        for (Integer integer : list) {
            CompletableFuture.supplyAsync(() -> {
                System.out.println("当前线程：" + Thread.currentThread().getId());
                int i = integer / 2;
                System.out.println("运行结果：" + i);
                System.out.println(Thread.currentThread().getId());
                return i;
            }).thenAccept(res -> {
                System.out.println("任务2启动了。。。" + res);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getId());
            });
            //获取异步任务的返回值
        }
        System.out.println("main方法结束。。。");
    }
}
