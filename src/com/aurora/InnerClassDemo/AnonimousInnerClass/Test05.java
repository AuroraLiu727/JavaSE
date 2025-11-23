package com.aurora.InnerClassDemo.AnonimousInnerClass;

/*
    匿名内部类作为参数传递（作为子类继承接口）
 */

public class Test05 {
    public static void main(String[] args) {
        Animal_eat(new Animal() {
            @Override
            public void eat() {
                System.out.println("Dog eat");
            }
        });
    }

    //匿名内部类作为子类继承抽象类并当作参数传递
    public static void Animal_eat(Animal animal) {
        animal.eat();
    }
}
