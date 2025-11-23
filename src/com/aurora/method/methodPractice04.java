package com.aurora.method;

public class methodPractice04 {
    /*
        遍历数组
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        ArrayMethod(arr);
    }

    public static void ArrayMethod(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
