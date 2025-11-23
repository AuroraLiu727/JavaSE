package com.aurora.set.SetInteface;

import java.util.Objects;

public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 核心去重逻辑 1: 比较内容
     * 如果不重写，默认比较内存地址 (==)，那第3个对象就能加进去
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    /**
     * 核心去重逻辑 2: 计算特征码
     * 必须保证：如果两个对象 equals 为 true，它们的 hashCode 必须一样
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
