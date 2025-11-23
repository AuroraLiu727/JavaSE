package com.aurora.method;

public class methodPractice05 {
    /*
        数组作为返回值返回
     */
    public static void main(String[] args) {
        int[] arr = method();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] method(){
        int a = 20, b = 10;
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;

        int[] arr = {sum, sub, mul, div};
        return arr;
    }
}
