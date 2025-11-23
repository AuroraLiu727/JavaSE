package com.aurora.OOP.variable_args;

public class strConcatDemo01 {
    /*
        返回n个字符串拼接结果，如果没有传入字符串，那么返回空字符串""
     */
    public static void main(String[] args) {
        //没有传入字符串
        String str1 = concat();
        System.out.println(str1);   //空字符串

        String str2 = concat("hello", ",", "world", ",", "Java");
        System.out.println(str2);
    }

    public static String concat(String... str){
        if (str.length == 0){
            return "";
        }
        String concat_str = "";
        for (int i = 0; i < str.length; i++) {
            concat_str += str[i];
        }
        return concat_str;
    }
}
