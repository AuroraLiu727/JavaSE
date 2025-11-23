package com.aurora.ProcessControl;

import java.util.Scanner;

public class switchDemo02 {
    /*
        case的穿透性
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data =  sc.nextInt();
        switch (data) {
            case 1:
                System.out.println("a");
            case 2:
                System.out.println("b");
            case 3:
                System.out.println("c");
            case 4:
                System.out.println("d");
                break;
            default:
                System.out.println("end");
                break;
        }
    }
}
