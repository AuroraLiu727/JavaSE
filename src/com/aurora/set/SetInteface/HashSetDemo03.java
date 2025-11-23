package com.aurora.set.SetInteface;

import java.util.HashSet;

public class HashSetDemo03 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        hashSet.add(new String("tom"));
        hashSet.add(new String("tom"));

        System.out.println(hashSet);    //[tom]，只添加进去1个
    }
}
