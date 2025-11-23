package com.aurora.InnerClassDemo.LocalInnerClass;

public class Outer {

    void display(){
        //定义在方法里的局部内部类
        class LocalInner {
            void show(){
                System.out.println("局部内部类中的show方法");
            }
        }

        //创建局部内部类对象并使用
        LocalInner localInner = new LocalInner();
        localInner.show();
    }
}
