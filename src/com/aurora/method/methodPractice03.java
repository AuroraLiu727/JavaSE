package com.aurora.method;

public class methodPractice03 {
    /*
        不定次数打印
     */
    public static void main(String[] args) {
        print(3);
    }

    public static void print(int times){
        for (int i = 0; i < times; i++){
            System.out.println("hello world!");
        }
    }
}
