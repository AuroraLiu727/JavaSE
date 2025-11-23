package com.aurora.ProcessControl;

public class whileDemo02 {
    /*
        while练习1：纸张的折叠问题
     */
    public static void main(String[] args) {
        int mountain = 8844430;
        double paper = 0.1;
        int count = 0;
        while (paper < mountain){
            count++;
            paper *= 2;
        }
        System.out.println("count = " + count);
    }
}
