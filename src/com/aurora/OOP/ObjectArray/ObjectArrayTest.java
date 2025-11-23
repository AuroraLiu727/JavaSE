package com.aurora.OOP.ObjectArray;

public class ObjectArrayTest {
    /*
        1. 定义学生类Student，生命姓名和成绩成员变量
        2. 测试类ObjectArrayTest的main中创建一个可以装三个学生对象的数组，并且按照学生成绩排序，显示学生信息
     */
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("张三", 90);
        students[1] = new Student("李四", 80);
        students[2] = new Student("王五", 100);

        for (int i = 0; i < students.length; i++){
            for (int j = 0; j < students.length - 1 - i; j++){
                if (students[j].getGrade() > students[j + 1].getGrade()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getName() + "\t" + students[i].getGrade());
        }
    }
}
