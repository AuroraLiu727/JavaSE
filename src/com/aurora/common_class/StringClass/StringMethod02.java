package com.aurora.common_class.StringClass;

public class StringMethod02 {
    public static void main(String[] args) {

        //1.toUpperCase
        String str1 = "hELlo";
        System.out.println(str1.toUpperCase());     //HELLO

        //2.toLowerCase
        System.out.println(str1.toLowerCase());     //hello

        //3.concat拼接字符串
        String str2 = "hello";
        str2 = str2.concat(",").concat("world").concat("!");    //hello,world!
        System.out.println(str2);

        //4.replace
        String older_str = "宝玉 and 林黛玉 林黛玉 林黛玉";
        String newer_str = older_str.replace("林黛玉", "薛宝钗");
        System.out.println(older_str);  //宝玉 and 林黛玉 林黛玉 林黛玉
        System.out.println(newer_str);  //宝玉 and 薛宝钗 薛宝钗 薛宝钗

        //5.split
        String poem = "锄禾日当午,汗滴禾下土,谁知盘中餐,粒粒皆辛苦";
        String[] split = poem.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        //需要转义符的情况
        String address = "E:\\aaa\\bbb";
        String[] address_split = address.split("\\\\"); //一个\符号加一个\转义
        for (int i = 0; i < address_split.length; i++) {
            System.out.println(address_split[i]);
        }

        //6.toCharArray
        String str3 = "hello";
        char[] chs = str3.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]);
        }

        //7.compareTo
        String a = "jack";
        String b = "jcck";
        System.out.println(a.compareTo(b));     //-2，返回的是'a' - 'c'的值
        a = "jack";
        b = "jackt";
        System.out.println(a.compareTo(b));     //-1,前面都一致，返回的是长度差值，并不是字符编码差值
        a = "jack";
        b = "jcckt";
        System.out.println(a.compareTo(b));     //-2,尽管长度不一样，但是逐字符比较过程中出现了不一致，所以返回字符编码的差值

        //8.format
        String name = "john";
        int age = 10;
        double score = 56.857;
        char gender = '男';

        //常规方法
        System.out.println("我的姓名是" + name + ", 年龄是" + age + ", 成绩是" + score + ", 性别是" + gender + "，希望大家喜欢我");

        String formatStr = "我的姓名是%s, 年龄是%d, 成绩是%.2f, 性别是%c, 希望大家喜欢我";
        String info = String.format(formatStr, name, age, score, gender);
        System.out.println(info);
    }
}
