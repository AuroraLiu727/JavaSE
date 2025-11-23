package com.aurora.Annotaion;

public class Demo {

    /**
     * @Deprecated 请使用{@link #new_method()}代替
     */
    @Deprecated
    public void old_method(){
        System.out.println("老方法");
    }

    public void new_method(){
        System.out.println("新方法");
    }


}
