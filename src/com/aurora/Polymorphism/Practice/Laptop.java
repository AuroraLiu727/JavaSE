package com.aurora.Polymorphism.Practice;

public class Laptop {

    //运行功能
    public void start(){
        System.out.println("笔记本开机");
    }

    //关机功能
    public void stop(){
        System.out.println("笔记本关机");
    }

    //使用USB设备功能,多态的体现
    public void use_USB(USB usb){
        //调用公共功能_USB打开
        usb.open();

        //调用Mouse的特有功能
        if (usb instanceof Mouse){
            Mouse m = (Mouse) usb;
            m.click();
        }

        //调用keyBoard的特有功能
        if (usb instanceof keyBoard){
            keyBoard k = (keyBoard) usb;
            k.input();
        }

        //调用公共功能_USB关闭
        usb.close();
    }
}
