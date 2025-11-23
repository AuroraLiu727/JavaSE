package com.aurora.InnerClassDemo.AnonimousInnerClass;
/*
    匿名内部类使用示例
 */
public class Test01 {
    public static void main(String[] args) {
        USB usb = new USB() {
            @Override
            public void open() {
                System.out.println("USB open");
            }

            @Override
            public void close() {
                System.out.println("USB close");
            }
        };
        usb.open();
        usb.close();
    }
}
