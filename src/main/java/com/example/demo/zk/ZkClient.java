package com.example.demo.zk;

import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * @author: zenghai.li
 * @Date: 2022/01/26
 */
public class ZkClient {

    ZooKeeper zkClient;


    @Before
    public void init() throws IOException {
        //连接 zookeeper 客户顿
        String connectString = "fxmaoyuzzz101:2181,fxmaoyuzzz101:2181";

        int sessionTimeout = 2000;
        zkClient = new ZooKeeper(connectString, sessionTimeout, new Watcher() {
            @Override
            public void process(WatchedEvent watchedEvent) {

            //    List<String> children = null;
            //    try {
            //        children = zkClient.getChildren("/", true);
            //    } catch (KeeperException e) {
            //        e.printStackTrace();
            //    } catch (InterruptedException e) {
            //        e.printStackTrace();
            //    }
            }
        });
    }

    /**
     *  创建节点
     */
    @Test
    public void create() throws InterruptedException, KeeperException {
        String nodeCreate = zkClient.create("/fxmaoyuzzz", "zzz".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
    }

    /**
     * 监听节点变化
     */
    @Test
    public void getChildren() throws InterruptedException, KeeperException {
        List<String> children = zkClient.getChildren("/", true);
        for (String child : children) {
            System.out.println(child);
        }
        Thread.sleep(Long.MAX_VALUE);
    }

    /**
     * 判断节点是否存在
     * @throws InterruptedException
     * @throws KeeperException
     */
    @Test
    public void  exist() throws InterruptedException, KeeperException {
        Stat exists = zkClient.exists("/fxmaoyuzzz", false);
        System.out.println(exists == null ? "不存在" : "存在");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        countDownLatch.await();
    }
}
