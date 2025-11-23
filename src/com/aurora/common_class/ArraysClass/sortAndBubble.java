package com.aurora.common_class.ArraysClass;

import java.util.Arrays;
import java.util.Comparator;

public class sortAndBubble {
    public static void main(String[] args) {
        Integer[] arr = {3, 1, 5, 7, 2};
        bubbleSort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1; //降序
            }
        });

        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(Integer[] arr, Comparator<Integer> comparator) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (comparator.compare(arr[j], arr[j + 1]) > 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
