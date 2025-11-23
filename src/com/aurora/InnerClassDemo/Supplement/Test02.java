package com.aurora.InnerClassDemo.Supplement;
/*
    抽象类作为方法参数和返回值
 */
public class Test02 {
    public static void main(String[] args) {
        Animal dog = new_Dog();
        Animal_eat(dog);
    }

    //抽象类作为方法参数
    public static void Animal_eat(Animal animal) {
        animal.eat();
    }

    //抽象方法作为方法返回值
    public static Animal new_Dog(){
        return new Dog();
    }
}
