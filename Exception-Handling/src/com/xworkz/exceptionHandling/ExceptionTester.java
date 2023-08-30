package com.xworkz.exceptionHandling;

public class ExceptionTester {

    public static void main(String[] args) {
        System.out.println("Main Started");
        int arr[] = new int[3];
        try {
            arr[0] = 400;
            arr[1] = 300;
            arr[2] = 200;
            arr[3] = 100;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array size is full");
        }
        System.out.println("Main Ended");
    }
}
