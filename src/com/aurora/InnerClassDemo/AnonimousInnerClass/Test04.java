package com.aurora.InnerClassDemo.AnonimousInnerClass;

public class Test04 {
    public static void main(String[] args) {
        USB mouse = new_Mouse();
        mouse.open();
        mouse.close();
    }

    public static USB new_Mouse(){
        //匿名内部类作为返回值返回
        return new USB() {
            @Override
            public void open() {
                System.out.println("Mouse open");
            }

            @Override
            public void close() {
                System.out.println("Mouse close");
            }
        };
    }
}
