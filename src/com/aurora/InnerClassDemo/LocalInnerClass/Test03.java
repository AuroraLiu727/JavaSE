package com.aurora.InnerClassDemo.LocalInnerClass;

/*
    局部内部类作为子类继承抽象类
 */

public class Test03 {
    public static void main(String[] args) {
        Animal dog = new_Dog();
        Animal_eat(dog);
    }

    //抽象类作为方法参数传递
    public static void Animal_eat(Animal animal) {
        animal.eat();
    }

    //抽象类作为返回值返回
    public static Animal new_Dog() {
        //直接使用局部内部类作为子类继承抽象类
        class Dog extends Animal{
            @Override
            public void eat() {
                System.out.println("Dog eat");
            }
        }
        return new Dog();
    }
}
