package com.example.demo;

import cn.hutool.core.util.ArrayUtil;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: zenghai.li
 * @Date: 2021/12/30
 * @Description:
 */
public class ListSplit {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);

        List<List<Integer>> partition = Lists.partition(list, 2);
        //System.out.println(partition);

        int[] array = new int[]{1,2,3,4};
        int[] insert = ArrayUtils.insert(2, array, 5);
        array = insert;
        System.out.println(Arrays.toString(array));

    }
}
