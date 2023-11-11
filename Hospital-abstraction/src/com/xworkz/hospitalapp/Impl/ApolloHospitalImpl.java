package com.xworkz.hospitalapp.Impl;

import com.xworkz.hospitalapp.Exception.*;
import com.xworkz.hospitalapp.constants.BloodGroup;
import com.xworkz.hospitalapp.constants.Gender;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.hospital.PatientDTO;

import java.util.Arrays;

public class ApolloHospitalImpl implements Hospital {
    public PatientDTO patient[];
    public ApolloHospitalImpl(int size){

        patient = new PatientDTO[size];
    }
    int index;

    int id = 0;

    //public PatientDTO patient[] = new PatientDTO[];
    //patient[0] =

    public boolean savePatient(PatientDTO patient){
        boolean isAdded = false;

        if(patient != null){
            patient.setPatientId(++id);

            this.patient[index++] = patient;
            isAdded = true;

        }
        else{
            System.out.println("Patient details are not provided..");
        }
        return isAdded;
    }

    public void getPatient(){
        System.out.println("The number of patients available are:");
        for(int patientIndex=0; patientIndex<patient.length; patientIndex++){
            System.out.println(patient[patientIndex]);
        }
    }

    public String getAttenderNameByPatientId(int patientId){
        String attenderName = null;
        for(int index=0; index < patient.length; index++){
            if(patient[index].getPatientId() == patientId){
                attenderName = patient[index].getAttenderName();
            }

        }
        if(attenderName == null){
           AttenderNotFoundException attenderNotFoundException = new AttenderNotFoundException("Attender not found for the given id: " +patientId);
            throw attenderNotFoundException;

            //throw new AttenderNotFoundException("Attender not found..");
        }
        return attenderName;
    }

    public int getPatientAgeByPatientId(int patientId) throws AgeNotFoundException{
        int age = 0;
        for(int index=0; index < patient.length; index++){
            if(patient[index].getPatientId() == patientId){
                age = patient[index].getAge();
            }
        }
        if(age == 0){
            AgeNotFoundException ageNotFoundException = new AgeNotFoundException("Age not found for the given Id: " +patientId);
            throw ageNotFoundException;

        }
        return age;
    }

    public String getPatientAddressByPatientName(String patientName) throws AddressNotFoundException{
        String address = null;
        for(int index=0; index < patient.length; index++){
            if(patient[index].getName().equals(patientName)){
                address = patient[index].getAddress();
            }
        }
        if(address == null){
            AddressNotFoundException addressNotFoundException = new AddressNotFoundException("Address not found for the given name: " +patientName);
            throw addressNotFoundException;

        }
        return address;
    }

    public Gender getPatientGenderByPatientName(String patientName){
        Gender gender = null;
        for(int index=0; index < patient.length; index++){
            if(patient[index].getName().equals(patientName)){
                gender = patient[index].getGender();
            }
        }
        if(gender == null){
            GenderNotFoundException genderNotFoundException = new GenderNotFoundException("Gender not found for the given name: " +patientName);
            throw genderNotFoundException;
        }

        return gender;
    }

    public BloodGroup getPatientBloodGroupByPatientName(String patientName){
        BloodGroup bloodGroup = null;
        for(int index=0; index < patient.length; index++){
            if(patient[index].getName().equals(patientName)){
                bloodGroup = patient[index].getBloodGroup();
            }
        }
        if(bloodGroup == null){
            BloodGroupNotFoundException bloodGroupNotFoundException = new BloodGroupNotFoundException("Blood Group not found for the given name: " +patientName);
            throw bloodGroupNotFoundException;

        }
        return bloodGroup;
    }

    public PatientDTO getPatientByPatientId(int patientId) throws PatientDtoNotFoundException{
        PatientDTO patient1 = null;
        for(int index = 0; index < patient.length; index++){
            if(patient[index].getPatientId() == patientId){
                patient1 = patient[index];
            }
        }
        if(patient1 == null) {
            PatientDtoNotFoundException patientDtoNotFoundException = new PatientDtoNotFoundException("Patient Details are not found for the given id: " +patientId);
            throw patientDtoNotFoundException;
        }
            return patient1;
    }


    public boolean updatePatientAgeByPatientName(int updatedAge, String existingPatientName) throws  AgeNotUpdatedException{
        boolean isAgeUpadated = false;

        for(int index=0; index<patient.length; index++) {
            if (existingPatientName != null && updatedAge > 0) {
                if (patient[index].getName().equals(existingPatientName)) {
                    patient[index].setAge(updatedAge);
                    isAgeUpadated = true;
                }
            }

        }
        if(isAgeUpadated == false){
            AgeNotUpdatedException ageNotUpdatedException = new AgeNotUpdatedException("Age is not updated for the given name: " +existingPatientName);
            throw ageNotUpdatedException;
        }
        return isAgeUpadated;
    }

    public boolean updatePatientNameByPatientId(String updateName, int existingPatientId){
        boolean isNameUpdated = false;
        for(int index = 0; index < patient.length; index++){
            if(patient[index].getPatientId() == existingPatientId){
                patient[index].setName(updateName);
                isNameUpdated = true;
            }
        }
        if(isNameUpdated == false){
            NameNotUpdatedException nameNotUpdatedException = new NameNotUpdatedException("Name not updated for the given id: " +existingPatientId);
            throw nameNotUpdatedException;
        }
        return isNameUpdated;
    }

    public boolean updateWardNoByPatientName(String updateWardNo, String existingPatientName) throws WardNoNotUpdatedException{
        boolean isWardNoUpdated = false;
        for(int index = 0; index < patient.length; index++){
            if(patient[index].getName().equals(existingPatientName)){
                patient[index].setWardNo(updateWardNo);
                isWardNoUpdated = true;
            }
        }
        if(isWardNoUpdated == false){
            WardNoNotUpdatedException wardNoNotUpdatedException = new WardNoNotUpdatedException("Ward No is not updated for the given patient name: " +existingPatientName);
            throw wardNoNotUpdatedException;
        }
        return isWardNoUpdated;
    }

    public boolean deletePatientByPatientId(int patientId) throws  PatientNotDeletedException{
        boolean isPatientDeleted = false;
        //PatientDTO newPatient[] = new PatientDTO[patient.length-1];
        int newIndex, oldIndex;
        for(oldIndex = 0, newIndex = 0; oldIndex < patient.length; oldIndex++){
            if(!(patient[oldIndex].getPatientId() == patientId)){
                patient[newIndex++] = this.patient[oldIndex];
                isPatientDeleted = true;
            }

        }
        if (isPatientDeleted == false){
            PatientNotDeletedException patientNotDeletedException = new PatientNotDeletedException("Patient not deleted for the given Id: " +patientId);
            throw patientNotDeletedException;

        }
        patient = Arrays.copyOf(patient, newIndex);
        //System.out.println(Arrays.toString(patient));
        return isPatientDeleted;
    }

}
