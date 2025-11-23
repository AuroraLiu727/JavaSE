package com.aurora.common_class.WrapperClass;

public class IntegerDemo01 {
    public static void main(String[] args) {
        int i = 10;
        double d = 3.14;
        boolean b = true;

        //1.手动装箱
        //方法一：使用构造方法装箱
        Integer integer01 = new Integer(i);
        Double d1 = new Double(d);
        Boolean bool1 = new Boolean(b);

        //方法二：使用valueOf()装箱
        Integer integer02 = Integer.valueOf(i);
        Double d2 = Double.valueOf(d);
        Boolean bool2 = Boolean.valueOf(b);

        //2. 手动拆箱,使用intValue()、doubleValue()、booleanValue()等方法
        int j = integer01.intValue();
        double d3 = d1.doubleValue();
        boolean bool3 = bool1.booleanValue();
    }
}
