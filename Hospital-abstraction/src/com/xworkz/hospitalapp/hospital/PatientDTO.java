package com.xworkz.hospitalapp.hospital;



import com.xworkz.hospitalapp.constants.BloodGroup;
import com.xworkz.hospitalapp.constants.Gender;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString

public class PatientDTO{

        private int patientId;
        private String name;
        private int age;
        private BloodGroup bloodGroup;
        private Gender gender;
        private String address;
        private String attenderName;
        private String wardNo;
}
