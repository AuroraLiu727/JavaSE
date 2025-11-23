package com.aurora.InnerClassDemo.Supplement;

/*
    接口作为参数传递，以及作为返回值返回
 */
public class Test01 {
    public static void main(String[] args) {
        USB mouse = new_Mouse();
        USB_open(mouse);
    }

    //接口作为参数传递
    public static void USB_open(USB usb) {
        usb.open();
    }

    //接口作为返回值返回
    public static USB new_Mouse(){
        return new Mouse();
    }
}
