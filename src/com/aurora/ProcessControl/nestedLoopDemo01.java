package com.aurora.ProcessControl;

public class nestedLoopDemo01 {
    /*
        嵌套循环:打印矩形
     */
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++){
            for (j = 1; j <= 5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
