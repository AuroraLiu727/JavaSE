package com.aurora.OOP.ArrayArithmetic;

public class BubbleSortDemo02 {
    /*
        在冒泡排序时加入标志位，减少无效排序
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubbleSort(int[] arr){
        boolean flag;
        int count = 0;  //记录比较的趟数
        for(int i = 0; i < arr.length - 1; i++){
            flag = false;
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;    //表示这一趟进行了交换
                }
            }
            count++;
            if(!flag){
                break;  //flag为假，表示本趟没有交换，数组已经有序，没有必要继续排序
            }
        }
        System.out.println("共比较的趟数为：" + count);
    }
}
