package com.example.demo.array;

import java.util.Arrays;

/**
 * @author: zenghai.li
 * @Date: 2021/12/29
 * @Description:
 */
public class Shuzu {

    public static void main(String[] args) {
        int index = 2;
        int value = 5;
        int[] array = new int[]{1,2,3,4};
        System.out.println(array.length);
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        System.out.println(Arrays.toString(newArray));
        for (int i = newArray.length - 1; i > index; i--) {
            newArray[i] = newArray[i - 1];
        }
        newArray[index] = value;
        System.out.println(Arrays.toString(array));
        System.out.println(array.length);
        array = newArray;
        System.out.println(Arrays.toString(array));
    }
}
