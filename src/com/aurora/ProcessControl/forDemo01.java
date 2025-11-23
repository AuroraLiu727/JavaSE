package com.aurora.ProcessControl;

public class forDemo01 {
    /*
        for循环练习：求1-3之间的数据和
     */
    public static void main(String[] args) {
        int i, sum = 0;
        for (i = 1; i <= 3; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
