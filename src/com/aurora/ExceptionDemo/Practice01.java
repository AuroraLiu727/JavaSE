package com.aurora.ExceptionDemo;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();

        try {
            int n1 = Integer.parseInt(s1);
            int n2 = Integer.parseInt(s2);

            int result = cal(n1,n2);
            System.out.println("result:"+result);
        } catch (NumberFormatException e) {
            System.out.println("参数格式不正确");
        } catch (ArithmeticException e) {
            System.out.println("出现了除0异常");
        } finally {
            System.out.println("没有异常");
        }
    }

    public static int cal(int n1, int n2) {
        return n1 / n2;
    }
}
