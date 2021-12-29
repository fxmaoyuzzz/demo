package com.example.demo;

import com.google.common.collect.Lists;

import javax.annotation.Resource;
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
public class Future {

    @Resource
    private static ThreadPoolExecutor executor;

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        List<List<Integer>> partition = Lists.partition(list, 3);
        System.out.println(partition);

        //List<Integer> operationList = Collections.synchronizedList(new ArrayList<>());
        //
        //list.stream().forEach((item) ->{
        //    CompletableFuture<Integer> unChecker1 = CompletableFuture.supplyAsync(() -> {
        //        // 持续天数的峰值判断的
        //        Integer futureList = getUserNameData(item);
        //        return futureList;
        //    }, executor);
        //    try {
        //        operationList.add(unChecker1.get());
        //    } catch (InterruptedException e) {
        //        e.printStackTrace();
        //    } catch (ExecutionException e) {
        //        e.printStackTrace();
        //    }
        //});
        //System.out.println("future" + operationList);

        List<Long> operationLong = Collections.synchronizedList(new ArrayList<>());
        list.stream().forEach(item -> {
            CompletableFuture<Long> future = CompletableFuture.supplyAsync((Supplier<Long>)() -> {
                long l = getData(item);
                System.out.println(l);
                return l;
            }, executor);
            try {
                operationLong.add(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
        System.out.println(operationLong);

    }

    public static Long getData(Integer list){
        return list.longValue();
    }
}
