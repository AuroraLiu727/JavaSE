package com.aurora.Array;

public class ArrayPractice08 {
    /*
        数组扩容
     */
    public static void main(String[] args) {
        int[] oldArr = {1, 2, 3, 4, 5};
        //创建更长的新数组
        int[] newArr = new int[10];

        //将旧数组的内容复制到新数组中
        for (int i = 0; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
        }

        //将新数组的地址给旧数组
        oldArr = newArr;

        System.out.println("旧数组的长度变为：" + oldArr.length);
        for (int i = 0; i < oldArr.length; i++) {
            System.out.print(oldArr[i] + " ");
        }
    }
}
