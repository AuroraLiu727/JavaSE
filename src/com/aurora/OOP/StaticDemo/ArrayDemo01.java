package com.aurora.OOP.StaticDemo;

public class ArrayDemo01 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 6, 7, 8, 3};
        int max = ArraysUtils.getMax(arr);
        System.out.println(max);
    }
}
