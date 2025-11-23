package com.aurora.OOP.fengzhuang.fengzhuangDemo;

public class PersonDemo01 {
    /*
        封装的使用示例
     */
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("liu");
        person.setAge(21);

        String name = person.getName();
        int age = person.getAge();
        System.out.println(name);
        System.out.println(age);
    }
}
