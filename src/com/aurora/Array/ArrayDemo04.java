package com.aurora.Array;

public class ArrayDemo04 {
    /*
        获取数组元素
     */
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        System.out.println("arr1 = " + arr1);   //数组起始地址
        System.out.println("arr1[0] = " + arr1[0]); //数组对应索引处的值

        //空整形数组
        int[] arr2 = new int[3];
        System.out.println("arr2[0] = " + arr2[0]);

        //空浮点型数组
        double[] arr3 = new double[3];
        System.out.println("arr3[0] = " + arr3[0]);

        //空字符型数组
        char[] arr4 = new char[3];
        System.out.println("arr4[0] = " + arr4[0]);

        //空布尔型数组
        boolean[] arr5 = new boolean[3];
        System.out.println("arr5[0] = " + arr5[0]);

        //空字符串型（引用型）数组
        String[] arr6 = new String[3];
        System.out.println("arr6[0] = " + arr6[0]);
    }
}
