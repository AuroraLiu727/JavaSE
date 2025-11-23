package com.aurora.common_class.BigIntegerAndBigDecimal;

import java.math.BigInteger;

public class BigIntegerMethod {
    public static void main(String[] args) {
        BigInteger bigInteger1 = new BigInteger("9999999999999999999999999999999999999999999999999");
        BigInteger bigInteger2 = new BigInteger("8888888888888888888888888888888888888");

        //1.add
        BigInteger add = bigInteger1.add(bigInteger2);
        System.out.println("add:"+add);

        //2.subtract
        BigInteger sub = bigInteger1.subtract(bigInteger2);
        System.out.println("sub:"+sub);

        //3.multiply
        BigInteger mul = bigInteger1.multiply(bigInteger2);
        System.out.println("mul:"+mul);

        //4.divide
        BigInteger div = bigInteger1.divide(bigInteger2);
        System.out.println("div:"+div);
    }
}
