package com.aurora.OOP.ArrayArithmetic;

public class BubbleSortDemo01 {
    /*
        基础版本的冒泡排序
     */
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        BubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void BubbleSort(int[] arr){
        int temp;
        //外层循环控制趟数
        for (int i = 0; i < arr.length - 1; i++){
            //内层循环控制比较次数
            for (int j = 0; j < arr.length - 1 - i; j++){
                //升序排序，如果需要降序排序则修改成<
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
