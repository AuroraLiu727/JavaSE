package com.aurora.ExceptionDemo;

/*
    异常的传递（逐层上抛）
 */

import java.io.FileReader;
import java.io.IOException;

public class throwsDemo03 {
    public static void main(String[] args) {
        try {
            methodA();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("程序仍在运行");
    }

    public static void methodA() throws IOException{        //继续抛出IOException
        methodB();
    }

    public static void methodB() throws IOException {       //抛出IOException
        FileReader fr = new FileReader("test.txt");
    }
}
