package com.aurora.common_class.Practice;

public class Practice05 {
    public static void main(String[] args) {
        String s1 = "hspedu";
        Person a = new Person(s1);
        Person b = new Person(s1);

        System.out.println(a == b); //false
        System.out.println(a.equals(b));    //false
        System.out.println(a.name == b.name);   //true

        String s4 = new String("hspedu");
        String s5 = "hspedu";

        System.out.println(s1 == s4);   //false
        System.out.println(s4 == s5);   //false

        String t1 = "hello" + s1;
        String t2 = "hellohspedu";
        System.out.println(t1.intern() == t2);  //true
    }
}
