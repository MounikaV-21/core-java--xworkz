import com.xworkz.hospitalapp.Exception.*;
import com.xworkz.hospitalapp.Impl.ApolloHospitalImpl;
import com.xworkz.hospitalapp.constants.BloodGroup;
import com.xworkz.hospitalapp.constants.Gender;
import com.xworkz.hospitalapp.hospital.PatientDTO;

import java.util.Scanner;

public class Executor {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
        System.out.println("The count of the patients is: ");
    int size = sc.nextInt();

    ApolloHospitalImpl hos = new ApolloHospitalImpl(size);
        for(int index = 0; index < hos.patient.length; index++) {


        PatientDTO dto = new PatientDTO();


        System.out.println("Enter patient's name:");
        dto.setName(sc.next());
        System.out.println("Enter patient's age:");
        dto.setAge(sc.nextInt());
        System.out.println("Enter patient's bloodGroup:");
        dto.setBloodGroup(BloodGroup.valueOf(sc.next()));
        System.out.println("Enter patient's Gender:");
        dto.setGender(Gender.valueOf(sc.next()));
        System.out.println("Enter patient's Address:");
        dto.setAddress(sc.next());
        System.out.println("Enter Attender's Name:");
        dto.setAttenderName(sc.next());
        System.out.println("Enter Patient's Ward No:");
        dto.setWardNo(sc.next());
        hos.savePatient(dto);
    }
        hos.getPatient();

    String userInput = null;
        do {
        System.out.println("Press 1. To get all the Patient's Info");
        System.out.println("Press 2. To get the Attender's Name");
        System.out.println("Press 3. To get the Patient's Age");
        System.out.println("Press 4. To get the Patient's Address");
        System.out.println("Press 5. To get the Patient's Gender");
        System.out.println("Press 6. To get the Patient's Blood Group");
        System.out.println("Press 7. To get the Patient Method");
        System.out.println("press 8. To update the Patient Age");
        System.out.println("Press 9. To update the Patient Name");
        System.out.println("Press 10. To update the Patient Ward No");
        System.out.println("Press 11. To discharge the Patient");
        int options = sc.nextInt();
        switch (options) {
            case 1:
                hos.getPatient();
                break;
            case 2:
                System.out.println("Fetching attender name using patient id");
                System.out.println("Enter Id:");
                try {
                    String attenderName = hos.getAttenderNameByPatientId(sc.nextInt());
                    System.out.println("The attender name is: " +attenderName);
                }catch (AttenderNotFoundException a){
                    a.printStackTrace();
                }

                break;
            case 3: System.out.println("Fetching patient age using patient id");
                System.out.println("Enter Id:");
                try {
                    int age = hos.getPatientAgeByPatientId(sc.nextInt());
                    System.out.println(age);
                }catch (AgeNotFoundException a){
                    a.printStackTrace();
                }
                break;
            case 4: System.out.println("Fetching patient address using patient name");
                System.out.println("Enter patient name:");
                try {
                    String address = hos.getPatientAddressByPatientName(sc.next());
                    System.out.println(address);
                }catch (AddressNotFoundException ae){
                    ae.printStackTrace();
                }
                break;
            case 5: System.out.println("Fetching the patient gender using patient name");
                System.out.println("Enter patient name:");
                try {
                    Gender gender = hos.getPatientGenderByPatientName(sc.next());
                    System.out.println("The patient genderis: " +gender);
                }catch(GenderNotFoundException p){
                    p.printStackTrace();
                }

                break;
            case 6: System.out.println("Fetching the patient blood group using patient name");
                System.out.println("Enter patient name:");
                try {
                    BloodGroup bloodGroup = hos.getPatientBloodGroupByPatientName(sc.next());
                    System.out.println(bloodGroup);
                }catch (BloodGroupNotFoundException be){
                    be.printStackTrace();
                }
                break;
            case 7: System.out.println("Fetching the patient method using patient id");
                System.out.println("Enter patient id");
                try {
                    PatientDTO patient1 = hos.getPatientByPatientId(sc.nextInt());
                    System.out.println(patient1);
                }catch (PatientDtoNotFoundException e){
                    e.printStackTrace();
                }
                break;
            case 8: System.out.println("Updating the patient age using patient name");
                System.out.println("Enter present age: ");
                int age1 = sc.nextInt();
                System.out.println("Enter existing name: ");
                String name1 = sc.next();
                try {
                    boolean isAgeUpdated = hos.updatePatientAgeByPatientName(age1, name1);
                    System.out.println(isAgeUpdated);
                    hos.getPatient();
                }catch (AgeNotUpdatedException a){
                    a.printStackTrace();
                }
                break;
            case 9: System.out.println("Updating the patient name using patient id");
                System.out.println("Enter present name  and existing id");
                try {
                    boolean isNameUpdated = hos.updatePatientNameByPatientId(sc.next(), sc.nextInt());
                    System.out.println(isNameUpdated);
                    hos.getPatient();
                }catch (NameNotUpdatedException n){
                    n.printStackTrace();
                }
                break;
            case 10: System.out.println("updating ward no using patient name");
                System.out.println("Enter present wardNo and Existing patient name");
                try {
                    boolean isWardNoUpdated = hos.updateWardNoByPatientName(sc.next(), sc.next());
                    System.out.println(isWardNoUpdated);
                    hos.getPatient();
                }catch (WardNoNotUpdatedException w){
                    w.printStackTrace();
                }
                break;
            case 11: System.out.println("Deleting the patient");
                System.out.println("Enter Patient Id: ");
                try {
                    boolean isDeleted = hos.deletePatientByPatientId(sc.nextInt());
                    System.out.println(isDeleted);
                    hos.getPatient();
                }
                //catch (Exception e){

                //}
                catch (PatientNotDeletedException p){
                    p.printStackTrace();
                }

        }
        System.out.println("Do you want to continue yes/no");
        userInput = sc.next();
    } while (userInput.equals("yes"));
        System.out.println("Thank you!! Visit Again..");
}
}

