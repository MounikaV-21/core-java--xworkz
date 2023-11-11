package com.xworkz.hospitalapp.Exception;

public class NameNotUpdatedException extends RuntimeException{
    public NameNotUpdatedException(String errorMessage){
        System.out.println(errorMessage);
    }
}
