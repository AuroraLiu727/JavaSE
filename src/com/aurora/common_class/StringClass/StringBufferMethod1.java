package com.aurora.common_class.StringClass;

public class StringBufferMethod1 {
    public static void main(String[] args) {
        //1.append
        StringBuffer s1 = new StringBuffer("hello");
        s1.append(",");
        s1.append("world");
        s1.append(1).append(true);
        System.out.println(s1);     //hello,world1true

        //2.delete
        StringBuffer s2 = new StringBuffer("hello,world");
        s2.delete(5, 11);
        System.out.println(s2);     //hello

        //3.replace
        StringBuffer s3 = new StringBuffer("hello,world");
        s3.replace(6, 11, "Java");
        System.out.println(s3);     //hello,Java

        //4.insert
        StringBuffer s4 = new StringBuffer("hello,world");
        s4.insert(5, "Tom");
        System.out.println(s4);

        //5.length()
        StringBuffer s5 = new StringBuffer("hello,world");
        System.out.println(s5.length());
    }
}
