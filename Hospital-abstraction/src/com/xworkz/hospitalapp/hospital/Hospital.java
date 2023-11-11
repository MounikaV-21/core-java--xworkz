package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.Exception.*;
import com.xworkz.hospitalapp.constants.BloodGroup;
import com.xworkz.hospitalapp.constants.Gender;

import java.util.Arrays;

public interface Hospital {




    public boolean savePatient(PatientDTO patient);

    public void getPatient();

    public String getAttenderNameByPatientId(int patientId);

    public int getPatientAgeByPatientId(int patientId) throws AgeNotFoundException;

    public String getPatientAddressByPatientName(String patientName) throws AddressNotFoundException;

    public Gender getPatientGenderByPatientName(String patientName);

    public BloodGroup getPatientBloodGroupByPatientName(String patientName);

    public PatientDTO getPatientByPatientId(int patientId) throws PatientDtoNotFoundException;


    public boolean updatePatientAgeByPatientName(int updatedAge, String existingPatientName) throws AgeNotUpdatedException;

    public boolean updatePatientNameByPatientId(String updateName, int existingPatientId);

    public boolean updateWardNoByPatientName(String updateWardNo, String existingPatientName) throws WardNoNotUpdatedException;

    public boolean deletePatientByPatientId(int patientId) throws  PatientNotDeletedException;

}
