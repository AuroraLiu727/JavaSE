package com.aurora.ProcessControl;

public class forDemo02 {
    /*
        for练习：求出1-100的偶数和
     */
    public static void main(String[] args) {
        int i, sum = 0;
        for (i = 1; i <= 100; i++){
            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }
}
