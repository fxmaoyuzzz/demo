package com.example.demo.array;

import com.alibaba.fastjson.JSON;

/**
 * @Author Flandre Lee
 * @Date 2022/3/15 16:36
 */
public class JsonUtils {

    public static boolean isJSON(String str) {
        boolean result = false;
        try {
            Object obj= JSON.parse(str);
            result = true;
        } catch (Exception e) {
            result=false;
        }
        return result;
    }
}
