package com.aurora.ProcessControl;

public class forDemo03 {
    /*
        for循环练习：统计1-100之间的偶数个数
     */
    public static void main(String[] args) {
        int i, count = 0;
        for (i = 1; i <= 100; i++){
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
