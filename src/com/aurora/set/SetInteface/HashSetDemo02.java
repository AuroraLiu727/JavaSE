package com.aurora.set.SetInteface;

import java.util.HashSet;

public class HashSetDemo02 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        //添加Dog对象
        hashSet.add(new Person("tom"));
        hashSet.add(new Person("tom"));

        System.out.println(hashSet);    //[Dog{name='tom'}, Dog{name='tom'}]，两个tom都被加进去了

    }
}
