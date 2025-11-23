package com.aurora.ExceptionDemo;

/*
    finally用于操作文件的场景
 */

import java.io.FileReader;
import java.io.IOException;

public class finallyDemo02 {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("E:\\code\\Java\\JavaSE\\module3\\src\\com\\aurora\\ExceptionDemo\\test.txt");
            //读取文件
        } catch (IOException e) {
            System.out.println("捕获异常：" + e.getMessage());
        } finally {
            try {
                if (fr != null){
                    fr.close();
                    System.out.println("文件已关闭");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
