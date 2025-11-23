package com.aurora.common_class.ArraysClass;

import java.util.Arrays;
import java.util.Comparator;

public class sortDemo02 {
    public static void main(String[] args) {
        Integer[] arr = {3, 1, 5, 7, 2};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(arr));


    }
}
