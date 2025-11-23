package com.aurora.ObjectDemo;

/*
    equals默认比较地址示例
 */

public class equalsDemo01 {
    public static void main(String[] args) {
        //name和age属性相同的两个对象
        Person person1 = new Person("Tom", 20);
        Person person2 = new Person("Tom", 20);

        System.out.println("equals的比较结果：" + person1.equals(person2));
        System.out.println("==的比较结果：" + (person1 == person2));
    }
}
