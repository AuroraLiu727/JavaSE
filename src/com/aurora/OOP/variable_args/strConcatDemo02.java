package com.aurora.OOP.variable_args;

public class strConcatDemo02 {
    /*
        n个字符串进行拼接，每一个字符串之间使用某字符进行分割，如果没有传入字符串，那么返回空字符串""
     */
    public static void main(String[] args) {
        String concat_str = concat("-", "Java", "Python", "Matlab");
        System.out.println(concat_str);
    }

    public static String concat(String splitSign, String... str){
        if (str.length == 0){
            return "";
        }
        String concat_str = "";
        for (int i = 0; i < str.length - 1; i++) {
            concat_str += str[i];
            concat_str += splitSign;
        }
        concat_str += str[str.length - 1];
        return concat_str;
    }

}
