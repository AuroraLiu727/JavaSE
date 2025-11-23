package com.aurora.common_class.ArraysClass;

import java.util.Arrays;

public class sortLambdaDemo01 {
    public static void main(String[] args) {
        Integer[] arr = {3, 1, 5, 7, 2};
        Arrays.sort(arr, ((o1, o2) -> o2 - o1));
        System.out.println(Arrays.toString(arr));
    }
}
