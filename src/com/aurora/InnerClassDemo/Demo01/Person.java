package com.aurora.InnerClassDemo.Demo01;

public class Person {
    public void eat(){
        System.out.println("人要吃饭");
    }

    //静态成员内部类
    static class Heart{
        public void jump(){
            System.out.println("心脏跳");
        }
    }

}
