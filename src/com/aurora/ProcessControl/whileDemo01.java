package com.aurora.ProcessControl;

public class whileDemo01 {
    /*
        while循环的使用示例：统计1-100之间偶数的个数
     */
    public static void main(String[] args) {
        int i = 1, count = 0;
        while ( i <= 100) {
            if (i % 2 == 0) {
                count++;
            }
            i++;
        }
        System.out.println("count = " + count);
    }
}
