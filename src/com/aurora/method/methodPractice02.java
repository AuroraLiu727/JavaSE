package com.aurora.method;

public class methodPractice02 {
    /*
        1-100的和
     */
    public static void main(String[] args) {
        int result = sum();
        System.out.println("sum = " + result);
    }

    public static int sum(){
        int result = 0;
        for (int i = 1; i <= 100; i++){
            result += i;
        }
        return result;
    }
}
