package com.aurora.InnerClassDemo.LocalInnerClass;

/*
    局部内部类作为实现类
 */

public class Test02 {
    public static void main(String[] args) {
        USB mouse = new_Mouse();
        USB_open(mouse);
    }

    //接口作为方法参数传递
    public static void USB_open(USB usb) {
        usb.open();
    }

    //接口作为返回值返回
    public static USB new_Mouse(){
        //直接使用局部内部类实现USB接口
        class Mouse implements USB{
            @Override
            public void open() {
                System.out.println("Mouse open");
            }
        }
        return new Mouse();
    }
}
