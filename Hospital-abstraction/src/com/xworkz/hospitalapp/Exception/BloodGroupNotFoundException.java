package com.xworkz.hospitalapp.Exception;

public class BloodGroupNotFoundException extends RuntimeException{
    public BloodGroupNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
