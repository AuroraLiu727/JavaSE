package com.aurora.ProcessControl;

import java.util.Random;
import java.util.Scanner;

public class Practice01 {
    /*
        流程控制练习：猜数字小游戏
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int data = rand.nextInt(100) + 1;
        System.out.println("请输入您要猜的数字：");
        int user_num = sc.nextInt();
        while(true){
            if(user_num == data){
                System.out.println("猜对了！");
                break;
            }else if(user_num < data){
                System.out.println("猜小了，请再次输入您要猜的数字：");
                user_num = sc.nextInt();
            }else{
                System.out.println("猜大了，请再次输入您要猜的数字：");
                user_num = sc.nextInt();
            }
        }
    }
}
