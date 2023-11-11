import com.xworkz.hospitalapp.Constant.BloodGroup;
import com.xworkz.hospitalapp.Constant.Gender;
import com.xworkz.hospitalapp.Dto.PatientDTO;
//import com.xworkz.hospitalapp.Exception.PatientIdNotFoundException;
import com.xworkz.hospitalapp.hospital.Hospital;


import java.util.Scanner;

public class Executer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The count of the patients is: ");
        int size = sc.nextInt();

        Hospital hos = new Hospital(size);
        for (int index = 0; index < hos.patient.length; index++) {


            PatientDTO dto = new PatientDTO();

            //System.out.println("Enter patient id:");
            //dto.setPatientId(sc.nextInt());
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

        /*System.out.println("Fetching attender name using patient id");
        System.out.println("Enter Id:");
        String attenderName = hos.getAttenderNameByPatientId(sc.nextInt());
        System.out.println(attenderName);

        System.out.println("Fetching patient age using patient id");
        System.out.println("Enter Id:");
        int age = hos.getPatientAgeByPatientId(sc.nextInt());
        System.out.println(age);

        System.out.println("Fetching patient address using patient name");
        System.out.println("Enter patient name:");
        String address = hos.getPatientAddressByPatientName(sc.next());
        System.out.println(address);

        System.out.println("Fetching the patient gender using patient name");
        System.out.println("Enter patient name:");
        Gender gender = hos.getPatientGenderByPatientName(sc.next());
        System.out.println(gender);

        System.out.println("Fetching the patient blood group using patient name");
        System.out.println("Enter patient name:");
        BloodGroup bloodGroup = hos.getPatientBloodGroupByPatientName(sc.next());
        System.out.println(bloodGroup);

        System.out.println("Fetching the patient method using patient id");
        System.out.println("Enter patient id");
        PatientDTO patient1 = hos.getPatientByPatientId(sc.nextInt());
        System.out.println(patient1);

        System.out.println("Updating the patient age using patient name");
        System.out.println("Enter present age and existing name:");
        boolean isAgeUpadated = hos.updatePatientAgeByPatientName(sc.nextInt(), sc.next());
        System.out.println(isAgeUpadated);
        hos.getPatient();

        System.out.println("Updating the patient name using patient id");
        System.out.println("Enter present name  and existing id");
        boolean isNameUpdated = hos.updatePatientNameByPatientId(sc.next(), sc.nextInt());
        System.out.println(isNameUpdated);
        hos.getPatient();

        System.out.println("updating ward no using patient name");
        System.out.println("Enter present wardNo and Existing patient name");
        boolean isWardNoUpdated = hos.updateWardNoByPatientName(sc.next(), sc.next());
        System.out.println(isWardNoUpdated);
        hos.getPatient();*/

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
//                case 2:
//                    System.out.println("Fetching attender name using patient id");
//                    System.out.println("Enter Id:");
//                        String attenderName = hos.getAttenderNameByPatientId(sc.nextInt());
//
//                    System.out.println(attenderName);
//                    break;
                case 3: System.out.println("Fetching patient age using patient id");
                    System.out.println("Enter Id:");
                    int age = hos.getPatientAgeByPatientId(sc.nextInt());
                    System.out.println(age);
                    break;
                case 4: System.out.println("Fetching patient address using patient name");
                    System.out.println("Enter patient name:");
                    String address = hos.getPatientAddressByPatientName(sc.next());
                    System.out.println(address);
                    break;
                case 5: System.out.println("Fetching the patient gender using patient name");
                    System.out.println("Enter patient name:");
                    Gender gender = hos.getPatientGenderByPatientName(sc.next());
                    System.out.println(gender);
                    break;
                case 6: System.out.println("Fetching the patient blood group using patient name");
                    System.out.println("Enter patient name:");
                    BloodGroup bloodGroup = hos.getPatientBloodGroupByPatientName(sc.next());
                    System.out.println(bloodGroup);
                    break;
                case 7: System.out.println("Fetching the patient method using patient id");
                    System.out.println("Enter patient id");
                    PatientDTO patient1 = hos.getPatientByPatientId(sc.nextInt());
                    System.out.println(patient1);
                    break;
                case 8: System.out.println("Updating the patient age using patient name");
                   /* System.out.println("Enter present age and existing name:");
                    boolean isAgeUpdated = hos.updatePatientAgeByPatientName(sc.nextInt(), sc.next());
                    System.out.println(isAgeUpdated);*/
                    System.out.println("Enter present age: ");
                    int age1 = sc.nextInt();
                    System.out.println("Enter existing name: ");
                    String name1 = sc.next();
                    boolean isAgeUpdated = hos.updatePatientAgeByPatientName(age1, name1);
                    System.out.println(isAgeUpdated);
                    hos.getPatient();
                    break;
                case 9: System.out.println("Updating the patient name using patient id");
                    System.out.println("Enter present name  and existing id");
                    boolean isNameUpdated = hos.updatePatientNameByPatientId(sc.next(), sc.nextInt());
                    System.out.println(isNameUpdated);
                    hos.getPatient();
                    break;
                case 10: System.out.println("updating ward no using patient name");
                    System.out.println("Enter present wardNo and Existing patient name");
                    boolean isWardNoUpdated = hos.updateWardNoByPatientName(sc.next(), sc.next());
                    System.out.println(isWardNoUpdated);
                    hos.getPatient();
                    break;

                case 11: System.out.println("Deleting the patient");
                System.out.println("Enter Patient Id: ");
                boolean isDeleted = hos.deletePatientByPatientId(sc.nextInt());
                System.out.println(isDeleted);
                hos.getPatient();
            }
            System.out.println("Do you want to continue yes/no");
            userInput = sc.next();
        } while (userInput.equals("yes"));
        System.out.println("Thank you!! Visit Again..");
    }
}


     /*PatientDTO patient1 = new PatientDTO();
        patient1.setGender(Gender.female);
        System.out.println(Gender.female);*/

        /*Scanner sc = new Scanner(System.in);

        Hospital hos = new Hospital();

        PatientDTO dto = new PatientDTO();*/
        /*dto.setPatientId(01);
        dto.setName("Anagha");
        dto.setAge(22);
        dto.setBloodGroup(BloodGroup.Bneg);
        dto.setGender(Gender.female);
        dto.setAddress("Rajajinagar");
        hos.savePatient(dto);
        //hos.getPatient();

        PatientDTO dto1 = new PatientDTO();
        dto1.setPatientId(02);
        dto1.setName("Anil");
        dto1.setAge(35);
        dto1.setBloodGroup(BloodGroup.ABneg);
        dto1.setGender(Gender.male);
        dto1.setAddress("Kolar");
        hos.savePatient(dto1);
        //hos.getPatient();

        PatientDTO dto2 = new PatientDTO();
        dto2.setPatientId(03);
        dto2.setName("Sunil");
        dto2.setAge(25);
        dto2.setBloodGroup(BloodGroup.Oneg);
        dto2.setGender(Gender.male);
        dto2.setAddress("Marathalli");
        hos.savePatient(dto2);*/

