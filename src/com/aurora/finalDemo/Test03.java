package com.aurora.finalDemo;

public class Test03 {
    /*
        final修饰对象的示例
     */
    public static void main(String[] args) {
        final Person person = new Person("Tom", 20);
        person.setAge(21);      //可以修改对象中的属性值
        System.out.println(person.getAge());

        //不能让 p 指向另一个对象
//        person = new Person("Jerry", 22);     //编译错误
    }

}
