package com.aurora.common_class.ArraysClass;

import java.util.Arrays;
import java.util.Comparator;

public class sortDemo03 {
    public static void main(String[] args) {
        String[] arr = {"jack", "tom", "a", "alice"};
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        System.out.println(Arrays.toString(arr));
    }
}
