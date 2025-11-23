package com.aurora.StudentsManagementSystem;

public class ArrayUtils {
    /*
        private ArrayUtils(){}的作用：
        防止创建 ArrayUtils 的实例（ArrayUtils utils = new ArrayUtils();），是因为这个类本质上是一个“工具类”，
        它的设计目的不是表示某种对象，而是提供一组通用的静态方法
        使用方法：直接通过类名调用，int index = ArrayUtils.findIndexById(students, 102, count);
     */
    private ArrayUtils(){

    }

    //查找指定id的学生在students数组中的位置
    public static int findIndexById(Student[] students, int id, int count){
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id){
                return i;
            }
        }
        return -1;
    }

    //冒泡排序
    public static void BubbleSort(Student[] students, int count){
        //外层循环控制比较的轮数
        for (int i = 0; i < count - 1; i++){
            boolean swapped = false;    //记录本轮是否发生交换
            for (int j = 0; j < count - 1 - i; j++){
                if (students[j].getId() > students[j + 1].getId()){
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                    swapped = true;
                }
            }
            //如果本轮未发生交换，说明数组已经有序，可以结束循环
            if (!swapped){
                break;
            }
        }
    }
}
