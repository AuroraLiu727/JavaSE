package com.aurora.extendsUse.super_and_this.Demo02;

public class Zi extends Fu{
    int num = 100;

    public Zi(){
        super();    //调用父类中的无参构造
        System.out.println("我是子类中的无参构造");
    }

    public Zi(int data){
        super(10);  //调用父类中的有参构造
        System.out.println("我是子类中的有参构造");
    }

    public void method(){
        super.method(); //调用父类中的method方法
        System.out.println("我是子类中的method方法");
        System.out.println("子类中的num = " + num);    //子类自己的num
        System.out.println("父类中的num = " + super.num);  //父类的num
    }
}
