package com.aurora.Array;

public class ArrayPractice04 {
    /*
        定义一个数组{1, 2, 3, 4}，输出元素按照[1, 2, 3, 4]
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        for (int i = 0; i < arr.length; i++) {
            if(i == 0){
                System.out.print("["+ arr[i] + ",");
            }else if(i == arr.length - 1){
                System.out.print(arr[i] + "]");
            }else{
                System.out.printf(arr[i] + ",");
            }
        }
    }
}
