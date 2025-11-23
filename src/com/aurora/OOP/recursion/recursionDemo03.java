package com.aurora.OOP.recursion;

public class recursionDemo03 {
    /*
        输出斐波那契数列的前n个值
     */
    public static void main(String[] args) {
        int result = Fibonacci(10);
        System.out.println(result);

        //输出Fibonacci数列的前10个值
        for(int i = 1; i <= 10; i++){
            System.out.print(Fibonacci(i) + " ");
        }
    }


    public static int Fibonacci(int n){
        if (n == 1 || n == 2){
            return 1;
        }else{
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }
}
