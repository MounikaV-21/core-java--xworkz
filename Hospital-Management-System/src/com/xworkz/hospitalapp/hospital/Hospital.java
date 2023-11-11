package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.Constant.BloodGroup;
import com.xworkz.hospitalapp.Constant.Gender;
import com.xworkz.hospitalapp.Dto.PatientDTO;
//import com.xworkz.hospitalapp.Exception.PatientIdNotFoundException;

import java.util.Arrays;

public class Hospital {
  public PatientDTO patient[];
    public Hospital(int size){

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

//    public String getAttenderNameByPatientId(int patientId) throws PatientIdNotFoundException{
//        String attenderName = null;
//        for(int index=0; index < patient.length; index++){
//            if(patient[index].getPatientId() == patientId){
//                attenderName = patient[index].getAttenderName();
//            }
//
//        }
//        if(attenderName == null){
//            PatientIdNotFoundException patientIdNotFoundException = new PatientIdNotFoundException("Patient Id Not Found...");
//            throw patientIdNotFoundException;
//        }
//        return attenderName;
//    }

    public int getPatientAgeByPatientId(int patientId){
        int age = 0;
        for(int index=0; index < patient.length; index++){
            if(patient[index].getPatientId() == patientId){
                age = patient[index].getAge();
            }
        }
        return age;
    }

   public String getPatientAddressByPatientName(String patientName){
       String address = null;
       for(int index=0; index < patient.length; index++){
           if(patient[index].getName().equals(patientName)){
               address = patient[index].getAddress();
           }
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
        return gender;
    }

    public BloodGroup getPatientBloodGroupByPatientName(String patientName){
        BloodGroup bloodGroup = null;
        for(int index=0; index < patient.length; index++){
            if(patient[index].getName().equals(patientName)){
                bloodGroup = patient[index].getBloodGroup();
            }
        }
        return bloodGroup;
    }

    public PatientDTO getPatientByPatientId(int patientId){
        PatientDTO patient1 = null;
        for(int index = 0; index < patient.length; index++){
            if(patient[index].getPatientId() == patientId){
                patient1 = patient[index];
            }
        }
        return patient1;
    }


    public boolean updatePatientAgeByPatientName(int updatedAge, String existingPatientName){
        boolean isAgeUpadated = false;

        for(int index=0; index<patient.length; index++) {
            if (existingPatientName != null && updatedAge > 0) {
                if (patient[index].getName().equals(existingPatientName)) {
                    patient[index].setAge(updatedAge);
                    isAgeUpadated = true;
                }
            }

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
        return isNameUpdated;
    }

    public boolean updateWardNoByPatientName(String updateWardNo, String existingPatientName){
        boolean isWardNoUpdated = false;
        for(int index = 0; index < patient.length; index++){
            if(patient[index].getName().equals(existingPatientName)){
                patient[index].setWardNo(updateWardNo);
                isWardNoUpdated = true;
            }
        }
        return isWardNoUpdated;
    }

    public boolean deletePatientByPatientId(int patientId){
        boolean isPatientDeleted = false;
        //PatientDTO newPatient[] = new PatientDTO[patient.length-1];
        int newIndex, oldIndex;
        for(oldIndex = 0, newIndex = 0; oldIndex < patient.length; oldIndex++){
            if(!(patient[oldIndex].getPatientId() == patientId)){
                patient[newIndex++] = this.patient[oldIndex];
                isPatientDeleted = true;
            }

        }
        patient = Arrays.copyOf(patient, newIndex);
        //System.out.println(Arrays.toString(patient));
        return isPatientDeleted;
    }

}
