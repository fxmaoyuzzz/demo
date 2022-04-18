package com.example.demo.sync;

import com.example.demo.entity.Able;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @Author: zenghai.li
 * @Description:
 * @Date: 2022/04/15
 */
public class FutureThree {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ArrayList<Able> list = new ArrayList<>();

        CompletableFuture<ArrayList<Able>> async = CompletableFuture.supplyAsync(() -> {
            for (int i = 0; i < 10; i++) {
                Able able = new Able();
                able.setId(i);
                list.add(able);
            }
            return list;
        }).thenApplyAsync((two) -> {
            for (Able able : two) {
                able.setName(able.getId() + "zzz");
            }
            return two;
        }).thenApplyAsync((three) -> {
            for (Able able : three) {
                able.setNum(able.getId());
            }
            return three;
        });
        ArrayList<Able> ableArrayList = async.get();
        System.out.println(ableArrayList);
    }
}
