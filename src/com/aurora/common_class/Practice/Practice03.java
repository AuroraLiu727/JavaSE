package com.aurora.common_class.Practice;

public class Practice03 {
    public static void main(String[] args) {
        String name = "Han shun Ping";
        String format = formatName(name);
        System.out.println(format);
    }

    public static String formatName(String name){
        if (name==null){
            System.out.println("姓名不能为空");
            return "";
        }

        String[] strs = name.split(" ");

        //名字输入不规范
        if (strs.length != 3) {
            throw new RuntimeException("姓名输入格式不正确！");
        }

        String format = String.format("%s,%s .%c", strs[2], strs[0], strs[1].toUpperCase().charAt(0));
        return format;
    }
}
