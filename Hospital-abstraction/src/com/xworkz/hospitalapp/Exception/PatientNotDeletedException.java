package com.xworkz.hospitalapp.Exception;

public class PatientNotDeletedException extends Exception{
    public PatientNotDeletedException(String errorMessage){
        System.out.println(errorMessage);
    }
}
