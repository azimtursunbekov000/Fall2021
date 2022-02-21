package com.digital_nomads.javaFall2021.exceptions;

public class Exceptions {
    public static void main(String[] args) {
        int a [] = new int[3];

        // run time анчекенд    ---- чекенд---- ошибка до запуска
        try {
            System.out.println(a[3]);
            System.out.println("Hello World");

        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();

        }
    }
}
