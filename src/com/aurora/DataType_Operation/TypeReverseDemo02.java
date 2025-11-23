package com.aurora.DataType_Operation;

public class TypeReverseDemo02 {
    /*
        强制类型转换示例
     */
    public static void main(String[] args) {
        //float num = 2.5;  //这样定义float型变量时错误的，是因为2.5并不能用float精确表示，所以相当于将取值范围大的赋值给了取值范围小的
        //float num = 2.5F; //正确定义方法，后面加F也相当于进行了强转
        float num = (float) 2.5;
        System.out.println(num);
    }
}
