package com.aurora.StudentsManagementSystem;

import java.util.Scanner;

public class StudentView {

    Scanner sc = new Scanner(System.in);

    //学生数组，初始长度50
    Student[] students = new Student[50];

    //记录学生数组中有多少个对象用于遍历，遍历时不能全部遍历学生数组，否则会出现空指针
    int count = 0;

    public void start(){
        while (true){
            System.out.println("------------------学生管理系统----------------------");
            System.out.println("1 添加学生");
            System.out.println("2 修改学生");
            System.out.println("3 删除学生");
            System.out.println("4 查看学生");
            System.out.println("5 退出系统");
            System.out.println("请选择(1-5)");
            int num = sc.nextInt();
            System.out.println("--------------------------------------------------");

            switch (num){
                case 1:
                    addStudent();
                    break;
                case 2:
                    updateStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    findAllStudents();
                    break;
                case 5:
                    System.out.println("再见！");
                    return;
            }
        }
    }

    //添加功能
    private void addStudent(){
        //1.键盘录入学生信息
        System.out.println("请输入学生学号：");
        int id = sc.nextInt();
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        System.out.println("请输入学生性别：");
        String gender = sc.next();

        //添加学生信息到students数组中
        if (count >= students.length){
            System.out.println("学生数组已满！");
            return;
        }
        //将学生信息封装到学生对象中并添加至学生数组
        students[count] = new Student(id, name, age, gender);
        count++;    //学生数加一
        System.out.println("添加成功！");
    }

    //查看功能
    private void findAllStudents(){
        //排序是为了防止：删除完之后再重新添加之前删除的序号对应的学生而发生乱序的情况
        ArrayUtils.BubbleSort(students, count);

        if (count == 0){
            System.out.println("目前班级还没有学生！");
        }
        for(int i = 0; i < count; i++){
            System.out.println(students[i].getId() + "\t" + students[i].getName() + "\t"
            + students[i].getAge() + "\t" + students[i].getGender());
        }
    }

    //修改功能
    private void updateStudent(){
        System.out.println("请输入您要修改的学生编号：");
        int id = sc.nextInt();
        int position = ArrayUtils.findIndexById(students, id, count);
        System.out.println("请输入学生姓名：");
        students[position].setName(sc.next());
        System.out.println("请输入学生年龄：");
        students[position].setAge(sc.nextInt());
        System.out.println("请输入学生性别");
        students[position].setGender(sc.next());
        System.out.println("修改成功！");
    }

    //删除功能
    private void deleteStudent(){
        System.out.println("请输入要删除的学生编号：");
        int id = sc.nextInt();
        int position = ArrayUtils.findIndexById(students, id, count);
        if (position == -1){
            System.out.println("班级里没有这个学生！");
            return;
        }

        //删除逻辑
        for (int i = position; i < count - 1; i++){
            students[i] = students[i + 1];
        }
        count--;
        System.out.println("删除成功！");
    }

}
