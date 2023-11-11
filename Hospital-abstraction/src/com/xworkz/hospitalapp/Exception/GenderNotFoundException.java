package com.xworkz.hospitalapp.Exception;

public class GenderNotFoundException extends RuntimeException{

    public GenderNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }

}
