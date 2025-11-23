package com.aurora.extendsUse.MemberVariable;

public class Test03 {
    public static void main(String[] args) {
        //父类
        Fu fu = new Fu();
        System.out.println(fu.num);

        //子类
        Zi zi = new Zi();
        System.out.println(zi.num);
    }
}
