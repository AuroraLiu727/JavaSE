package com.aurora.abstractDemo.Practice;

public class Network extends Maintainer{
    //后续使用set()方法赋值，所以不需要构造方法
    @Override
    public void work() {
        System.out.println("员工号为" + this.getId() + "的" + this.getName() + "员工，正在检查网络是否通畅");
    }
}
