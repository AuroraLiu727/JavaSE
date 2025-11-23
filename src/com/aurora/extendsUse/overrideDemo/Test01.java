package com.aurora.extendsUse.overrideDemo;

public class Test01 {
    public static void main(String[] args) {
        //父类
        Fu fu = new Fu();
        fu.method();

        //子类
        Zi zi = new Zi();
        zi.method();
    }
}
