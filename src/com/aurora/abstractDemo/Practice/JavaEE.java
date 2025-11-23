package com.aurora.abstractDemo.Practice;

public class JavaEE extends Developer{
    public JavaEE() {
    }

    public JavaEE(String name, int id) {
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println("员工号为" + this.getId() + "的" + this.getName() + "员工，正在研发电商网站");
    }
}
