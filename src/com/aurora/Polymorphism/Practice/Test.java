package com.aurora.Polymorphism.Practice;

public class Test {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();

        //鼠标的使用
        Mouse mouse = new Mouse();
        laptop.start();
        laptop.use_USB(mouse);
        laptop.stop();

        System.out.println("=========================");

        //键盘的使用
        keyBoard keyboard = new keyBoard();
        laptop.start();
        laptop.use_USB(keyboard);
        laptop.stop();
    }
}
