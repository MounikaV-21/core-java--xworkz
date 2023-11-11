import com.xworkz.hospitalapp.dto.AddressDto;
import com.xworkz.hospitalapp.dto.PatientDto;
import com.xworkz.hospitalapp.service.PatientService;
import com.xworkz.hospitalapp.service.impl.PatientServiceImpl;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        PatientService patientService = new PatientServiceImpl();

        for(int i =0; i<=size; i++) {

            PatientDto patientDto = new PatientDto();

            System.out.println("Enter patient name");
            patientDto.setName(sc.next());
            System.out.println("Enter Patient address");
            patientDto.setAddress(sc.next());
            System.out.println("Enter patient contact no");
            patientDto.setContactNo(sc.nextLong());

            AddressDto addressDto = new AddressDto();

            System.out.println("Enter state");
            addressDto.setState(sc.next());
            System.out.println("Enter district");
            addressDto.setDistrict(sc.next());
            System.out.println("Enter pincode");
            addressDto.setPinCode(sc.nextLong());
            addressDto.setPatientDto(patientDto);

            patientService.validateAndSave(addressDto);
        }
    }
}
