package com.aurora.InnerClassDemo.AnonimousInnerClass;

/*
    匿名内部类作为返回值返回（作为子类继承抽象类）
 */

public class Test06 {
    public static void main(String[] args) {
        Animal dog = new_Dog();
        dog.eat();
    }

    public static Animal new_Dog() {
        return new Animal() {
            @Override
            public void eat() {
                System.out.println("Dog eat");
            }
        };
    }
}
