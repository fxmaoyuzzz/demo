package com.example.demo.map;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/**
 * @author: zenghai.li
 * @Date: 2022/01/07
 */
public class Map {

    //链表长度到8(实际是要超过8,也就是添加第9个元素时),一个是数组长度大于等于64链表转红黑树

    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<>();
        //map.put("name", "hahaha");
        //map.put("sum", 0);
        //ArrayList<java.util.Map<String, Object>> list = new ArrayList<>();
        //list.add(map);
        //
        //HashMap<String, Integer> hashMap = new HashMap<>();
        //
        //list.forEach(item -> hashMap.put(item.get("name").toString(), (Integer) item.get("sum")));
        //System.out.println(hashMap);
        for (int i = 0; i < 10; i++) {
            map.put(new Anu(i), "zzz");
        }
        for (int i = 10; i <20 ; i++) {
            map.put(new Bnu(i), "aaa");
        }
    }
}


    class Anu {
        private Integer age;

        public Anu(Integer age) {
            this.age = age;
        }

        @Override
        public int hashCode() {
            return 10;
        }
    }

class Bnu {
    private Integer age;

    public Bnu(Integer age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        return 20;
    }
}
