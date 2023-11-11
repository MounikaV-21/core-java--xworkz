package com.xworkz.hospitalapp.Exception;

public class PatientDtoNotFoundException extends Exception{
    public PatientDtoNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
