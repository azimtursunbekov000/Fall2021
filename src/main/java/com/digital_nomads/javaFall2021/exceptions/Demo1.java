package com.digital_nomads.javaFall2021.exceptions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Demo1 {
    public static void main(String[] args) throws Exception {


//            FileWriter myWriter = new FileWriter("filename.txt");
//            myWriter.write("Files in Java might be tricky, but it is fun enough!");
//            myWriter.close();
//            System.out.println("Successfully wrote to the file.");


            int b [] = new int[4];
//        System.out.println(Demo1.test(b));
        throw new Exception("This is my Exception");
    }
    public static boolean test(int a[])throws Exception{
        int b[] = new int[a.length];
        return false;
    }
}
