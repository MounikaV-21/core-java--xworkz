package com.xworkz.exceptionHandling;

public class NullTester {
    public static void main(String[] args) {
        System.out.println("Main Started");
        String str = null;
try {
    System.out.println(str.length());
}catch(NullPointerException e){
    System.out.println("Can't access null ref");
}
        System.out.println("Main Ended");



    }
}
