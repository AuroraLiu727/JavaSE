package com.aurora.ExceptionDemo;

import java.util.Scanner;

public class UserLoginTest {
    public static void main(String[] args) throws LoginUserException{
        //定义一个用户名
        String user_name = "root";
        //键盘录入用户名用于登录
        Scanner sc = new Scanner(System.in);
        String login_name = sc.next();
        //判断用户名是否匹配
        try {
            CheckName(user_name, login_name);
        } catch (LoginUserException e) {
            //三种方式输出异常信息
            System.out.println("捕获异常" + e.getMessage());
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }

    public static void CheckName(String user_name, String login_name) throws LoginUserException{
        if (user_name.equals(login_name)) {
            System.out.println("登陆成功！");
        } else {
            throw new LoginUserException("登陆失败，用户名或密码有问题");
        }
    }
}
