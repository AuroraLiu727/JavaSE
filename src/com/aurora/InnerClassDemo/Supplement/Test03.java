package com.aurora.InnerClassDemo.Supplement;

/*
    普通类作为方法参数以及返回值
 */
public class Test03 {
    public static void main(String[] args) {
        Person person = new_Person();
        Person_eat(person);
    }

    //普通类作为方法参数传递
    public static void Person_eat(Person person) {
        person.eat();
    }

    //普通类作为返回值返回
    public static Person new_Person() {
        return new Person();
    }
}
