package com.aurora.ExceptionDemo;

public class LoginUserException extends Exception {
    //无参构造
    public LoginUserException() {
    }

    //带有信息的构造
    public LoginUserException(String message) {
        super(message);
    }
}
