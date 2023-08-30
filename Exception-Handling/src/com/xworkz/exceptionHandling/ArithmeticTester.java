package com.xworkz.exceptionHandling;

public class ArithmeticTester {
    public static void main(String[] args) {
        System.out.println("Main Started");
        int a = 20;
        int b = 0;
        int c;
        try {
            c = a / b;
        }catch (ArithmeticException e){
            System.out.println("Provide valid numbers");
        }
        System.out.println("Main Ended");


    }
}
