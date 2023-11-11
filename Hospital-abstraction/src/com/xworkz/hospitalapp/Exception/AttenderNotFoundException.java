package com.xworkz.hospitalapp.Exception;

public class AttenderNotFoundException extends RuntimeException{
    public AttenderNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
