package com.xworkz.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputTester {
    public static void main(String[] args) {
        System.out.println("Main Started");
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter age:");
        try {
            System.out.println(sc.nextInt());
        }catch (InputMismatchException e){
            System.out.println("Provide correct input details");
        }
        System.out.println("Main Ended");
    }
}
