package com.aurora.common_class.Practice;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        //用户信息输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();
        System.out.println("请输入邮箱：");
        String email = sc.next();

        try {
            userRegister(username, password, email);
            System.out.println("恭喜您，注册成功！");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void userRegister(String username, String password, String email) {
        //1.检查用户名是否符合要求
        if (!(username.length() >= 2 && username.length() <= 4)) {
            throw new RuntimeException("要求用户名长度为2或3或4");
        }

        //2.检查密码是否符合要求
        if (!(password.length() == 6 && isDigit(password))) {
            throw new RuntimeException("要求密码的长度为6");
        }

        //3.检查邮箱是否符合要求
        if (!(email.indexOf("@") > 0 && email.indexOf("@") < email.indexOf("."))){
            throw new RuntimeException("要求邮箱中包含@和.，并且@在.前面");
        }
    }

    public static boolean isDigit(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if  (chars[i] < '0' || chars[i] > '9')
                return false;
        }

        return true;
    }
}
