package com.aurora.common_class.MathClass;

public class MathMethod01 {
    public static void main(String[] args) {
        //1.abs 绝对值
        int abs = Math.abs(-10);
        System.out.println("abs = " + abs);    //10

        //2.pow 求幂
        double pow = Math.pow(2, 4);
        System.out.println("pow = " + pow);    //16.0

        //3.ceil 向上取整
        double ceil = Math.ceil(3.9);
        System.out.println("ceil = " + ceil);   //4.0

        //4.floor 向下取整
        double floor = Math.floor(3.9);
        System.out.println("floor = " + floor);  //3.0

        //5.round 四舍五入 +0.5后取floor
        long round = Math.round(3.45);
        System.out.println("round = " + round);  //3

        //6.sqrt 求开平方
        double sqrt = Math.sqrt(9.0);
        System.out.println("sqrt = " + sqrt);   //3.0

        //7.random 随机数
        double random1 = Math.random(); //取[0, 1)之间的随机数
        System.out.println("random1 = " + random1);
        double random2 = (int) (Math.random() * 10); //取[0, 10)之间的随机整数
        System.out.println("random2 = " + random2);
        double random3 = (int) (Math.random() * 5 + 2); //取[2, 7)之间的随机整数
        System.out.println("random3  = " + random3);

        //8.返回最大值和最小值
        int max = Math.max(10, 20);
        System.out.println("max = " + max);
        double min = Math.min(3.5, 4.5);  //参数和返回值都有多种类型，返回值随着参数变化而变化
        System.out.println("min  = " + min);
    }
}
