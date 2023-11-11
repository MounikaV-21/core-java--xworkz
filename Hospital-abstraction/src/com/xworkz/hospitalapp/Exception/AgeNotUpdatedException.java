package com.xworkz.hospitalapp.Exception;

public class AgeNotUpdatedException extends Exception{
    public AgeNotUpdatedException(String errorMessage){
        System.out.println(errorMessage);
    }
}
