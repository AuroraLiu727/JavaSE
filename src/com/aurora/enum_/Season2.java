package com.aurora.enum_;

public enum Season2 implements Info{

    SPRING("春天", "温暖"),
    SUMMER("夏天", "炎热"),
    AUTUMN("秋天", "凉爽"),
    WINTER("冬天", "寒冷");

    private String name;
    private String desc;

    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    //重写接口中的方法
    @Override
    public void show() {
        System.out.println(name + "的特点是" + desc);
    }
}
