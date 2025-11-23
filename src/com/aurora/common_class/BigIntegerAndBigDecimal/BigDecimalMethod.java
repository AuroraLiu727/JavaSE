package com.aurora.common_class.BigIntegerAndBigDecimal;

import java.math.BigDecimal;

public class BigDecimalMethod {
    public static void main(String[] args) {
        //普通的double运算不精确
        double d1 = 0.1;
        double d2 = 0.2;
        double result = d1 + d2;
        System.out.println("result = " + result);

        //BigDecimal
        BigDecimal b1 = new BigDecimal("0.1");
        BigDecimal b2 = new BigDecimal("0.2");

        //1.add
        BigDecimal add = b1.add(b2);
        System.out.println("add = " + add);

        //2.subtract
        BigDecimal sub = b1.subtract(b2);
        System.out.println("sub = " + sub);

        //3.multiply
        BigDecimal mul = b1.multiply(b2);
        System.out.println("mul = " + mul);

        //4.divide
        BigDecimal div = b1.divide(b2, 10, BigDecimal.ROUND_HALF_UP);
        System.out.println("div = " + div);
    }
}
