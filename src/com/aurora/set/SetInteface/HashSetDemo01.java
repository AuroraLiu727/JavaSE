package com.aurora.set.SetInteface;

import java.util.HashSet;

public class HashSetDemo01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        //add
        System.out.println(hashSet.add("jack"));    //true
        System.out.println(hashSet.add("lucy"));    //true
        System.out.println(hashSet.add("john"));    //true
        System.out.println(hashSet.add("rose"));    //true
        System.out.println(hashSet.add("jack"));    //false，重复，不能再添加一次

        System.out.println(hashSet);    //[john, rose, lucy, jack]

        //remove
        hashSet.remove("lucy");
        System.out.println(hashSet);    //[john, rose, jack]


    }
}
