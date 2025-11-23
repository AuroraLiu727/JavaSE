package com.aurora.InnerClassDemo.AnonimousInnerClass;

/*
    匿名内部类作为子类继承抽象类
 */

public class Test02 {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            @Override
            public void eat() {
                System.out.println("Dog eat");
            }
        };
        dog.eat();
    }
}
