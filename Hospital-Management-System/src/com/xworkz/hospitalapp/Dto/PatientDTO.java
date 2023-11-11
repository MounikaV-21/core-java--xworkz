package com.xworkz.hospitalapp.Dto;

import com.xworkz.hospitalapp.Constant.BloodGroup;
import com.xworkz.hospitalapp.Constant.Gender;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class PatientDTO {
    private int patientId;
    private String name;
    private int age;
    private BloodGroup bloodGroup;
    private Gender gender;
    private String address;
    private String attenderName;
    private String wardNo;


    /*@Override
    public String toString(){
        return "PatientDTO-[Id="+this.patientId+", Name="+this.name+", Age="+this.age+". BloodGroup="+this.bloodGroup+", Gender="+this.gender+". Address="+this.address+"]";
    }*/





}
