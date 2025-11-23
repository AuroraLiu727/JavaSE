package com.aurora.extendsUse.MemberVariable;

public class Test02 {
    public static void main(String[] args) {
        //创建父类对象
        Fu fu = new Fu();
        System.out.println(fu.numFu);
        //System.out.println(fu.numZi);     //父类不能直接调用子类中特有的成员

        //创建子类对象
        Zi zi = new Zi();
        System.out.println(zi.numZi);
        System.out.println(zi.numFu);   //子类可以直接调用所父类中的非私有成员

    }
}
