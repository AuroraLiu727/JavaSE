package com.aurora.common_class.ArraysClass;

/*
    自然排序的使用
 */

import java.util.Arrays;

public class sortDemo01 {
    public static void main(String[] args) {
        //基本数据类型
        int[] arr = {1, -1, 7, 0 , 89};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //对象数组
        String[] strs = {"jack", "tom", "alice"};
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
    }
}
