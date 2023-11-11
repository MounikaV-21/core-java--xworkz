package com.xworkz.hospitalapp.Exception;

public class AgeNotFoundException extends Exception{
    public AgeNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
