package com.aurora.OOP.class_object;

public class CitizenDemo01 {
    public static void main(String[] args) {
        Citizen citizen = new Citizen();
        citizen.name = "liu";
        citizen.idCard = "123";

        citizen.birthday.year = 2000;
        citizen.birthday.month = 1;
        citizen.birthday.day = 1;

        System.out.println(citizen.name);
        System.out.println(citizen.idCard);
        System.out.println(citizen.birthday.year);
        System.out.println(citizen.birthday.month);
        System.out.println(citizen.birthday.day);
    }
}
