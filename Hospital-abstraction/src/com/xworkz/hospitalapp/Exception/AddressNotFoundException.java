package com.xworkz.hospitalapp.Exception;

public class AddressNotFoundException extends Exception{
    public AddressNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
