package com.aurora.ObjectDemo;

public class clonePerson implements Cloneable{
    String name;
    int age;

    public clonePerson() {
    }

    public clonePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof clonePerson) {
            clonePerson person = (clonePerson) obj;
            return name.equals(person.name) && age == person.age;
        }

        return false;
    }

    //重写clone方法

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
