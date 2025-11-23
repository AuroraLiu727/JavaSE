package com.aurora.extendsUse.MemberMethod;

public class Test01 {
    public static void main(String[] args) {
        //父类
        Fu fu = new Fu();
        fu.methodFu();
        fu.method();

        System.out.println("---------------------");
        //子类
        Zi zi = new Zi();
        zi.methodZi();
        zi.method();
        zi.methodFu();

        System.out.println("---------------------");

        Fu fu1 = new Zi();
        fu1.method();
        System.out.println(fu1.name);

//        Zi zi1 = new Fu();

    }
}
