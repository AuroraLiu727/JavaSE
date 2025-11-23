package com.aurora.OOP.fengzhuang.fengzhuangDemo;

/*
    封装的使用示例
 */
public class Person {
    private String name;
    private int age;

    //为name提供get/set方法
    public void setName(String mingzi){
        name = mingzi;
    }
    public String getName(){
        return name;
    }

    //为age提供get/set方法
    public void setAge(int nianling){
        if(nianling < 0 || nianling > 150){
            System.out.println("岁数不符合实际");
        }else{
            age = nianling;
        }
    }
    public int getAge(){
        return age;
    }
}
