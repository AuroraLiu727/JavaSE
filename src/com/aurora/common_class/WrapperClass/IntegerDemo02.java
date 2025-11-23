package com.aurora.common_class.WrapperClass;

public class IntegerDemo02 {
    public static void main(String[] args) {
        //自动装箱与拆箱
        int i1 = 1;
        double d1 = 3.14;
        boolean b1 = true;

        //自动装箱
        Integer interger01 = i1;
        Double Dou1 = d1;
        Boolean bool1 = b1;

        //自动拆箱
        int i2 = interger01;
        double d2 = Dou1;
        boolean b2 = bool1;
    }
}
