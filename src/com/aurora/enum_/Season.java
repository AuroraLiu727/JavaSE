package com.aurora.enum_;

//自定义实现枚举
//public class Season {
//    private String name;
//    private String desc;    //描述
//
//    //私有的构造方法
//    private Season(String name, String desc) {
//        this.name = name;
//        this.desc = desc;
//    }
//
//    //创建枚举对象
//    public static final Season SPRING = new Season("春天", "温暖");
//    public static final Season SUMMER = new Season("夏天", "炎热");
//    public static final Season AUTUMN = new Season("秋天", "凉爽");
//    public static final Season WINTER = new Season("冬天", "寒冷");
//
//    //提供get方法
//
//    public String getName() {
//        return name;
//    }
//
//    public String getDesc() {
//        return desc;
//    }
//
//    //重写toString方法
//    @Override
//    public String toString() {
//        return "Season{" +
//                "name='" + name + '\'' +
//                ", desc='" + desc + '\'' +
//                '}';
//    }
//}

//使用enum关键字实现枚举
enum Season {
    SPRING("春天", "温暖"), SUMMER("夏天", "炎热"), AUTUMN("秋天", "凉爽"),
    WINTER("冬天", "寒冷");

    String name;
    String desc;

    private Season() {
    }

    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
