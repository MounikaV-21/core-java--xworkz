package com.xworkz.hospitalapp.service.impl;

import com.xworkz.hospitalapp.dto.AddressDto;
import com.xworkz.hospitalapp.repository.PatientRepository;
import com.xworkz.hospitalapp.repository.impl.PatientRepositoryImpl;
import com.xworkz.hospitalapp.service.PatientService;

public class PatientServiceImpl implements PatientService {
    PatientRepository patientRepository;

    public PatientServiceImpl(){
        patientRepository = new PatientRepositoryImpl();
    }
    @Override
    public void validateAndSave(AddressDto dto) {
        System.out.println("----Validation----");
        boolean isStateValidated = false;
        boolean isDistrictValidated = false;
        boolean isPinCodeValidated = false;
        if(dto!=null){
            if(dto.getState()!=null){
                isStateValidated = true;
            }
            if(dto.getDistrict()!=null){
                isDistrictValidated = true;
            }
            if(dto.getPinCode()>0){
                isPinCodeValidated = true;
            }
        if(isStateValidated == true && isDistrictValidated == true && isPinCodeValidated == true){
            patientRepository.save(dto);
            System.out.println("Details are validated");
        }
        }
    }
}
