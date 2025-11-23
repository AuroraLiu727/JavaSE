package com.aurora.ExceptionDemo;

import java.io.FileReader;
import java.io.IOException;

public class throwsDemo01 {
    public static void main(String[] args) {
        try {
            readFile("test.txt");
        } catch (IOException e) {
            System.out.println("文件读取出错" + e.getMessage());
        }
    }

    public static void readFile(String filePath) throws IOException {
        FileReader fr = new FileReader(filePath);
        fr.close();
    }
}
