package com.aurora.DataType_Operation;

public class OperatorDemo05 {
    /*
        三元运算符的使用
     */
    public static void main(String[] args) {

        //成绩是否及格
        int score = 60;
        String result = score>=60?"及格":"不及格";
        System.out.println("result = " + result);

        //两者最大值
        int x = 70;
        int y = 80;
        int max = x>y?x:y;
        System.out.println("max = " + max);

        //三者最大值
        int a = 70;
        int b = 80;
        int c = 90;
        int max2 = (a>b?a:b)>c?(a>b?a:b):c;
        System.out.println("max2 = " + max2);
    }
}
