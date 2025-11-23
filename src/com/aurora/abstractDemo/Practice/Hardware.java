package com.aurora.abstractDemo.Practice;

public class Hardware extends Maintainer{
    //后续使用set()方法赋值，所以不需要构造方法
    @Override
    public void work() {
        System.out.println("员工号为" + this.getId() + "的" + this.getName() + "员工，正在修复电脑主板");
    }
}
