package com.aurora.InnerClassDemo.AnonimousInnerClass;

/*
    匿名内部类当参数传递
 */

public class Test03 {
    public static void main(String[] args) {
        String a = "a";
        //调用USB_operator函数，匿名内部类作为参数传递
        USB_operator(new USB() {
            @Override
            public void open() {
                System.out.println("Mouse open");
            }

            @Override
            public void close() {
                System.out.println("Mouse close");
            }
        });
    }


    public static void USB_operator(USB usb) {
        usb.open();
        usb.close();
    }
}
