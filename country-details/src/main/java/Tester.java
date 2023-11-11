import com.xworkz.countryapp.dto.CapitalDto;
import com.xworkz.countryapp.dto.CountryDto;
import com.xworkz.countryapp.service.CountryService;
import com.xworkz.countryapp.service.impl.CountryServiceImpl;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        CountryService countryService = new CountryServiceImpl();

        CountryDto countryDto = new CountryDto();
        System.out.println("Enter country name");
        countryDto.setName(sc.next());
        System.out.println("Enter country capital");
        countryDto.setCapital(sc.next());
        System.out.println("Enter country population");
        countryDto.setPopulation(sc.nextLong());
        System.out.println("Enter country official language");
        countryDto.setOfficialLanguage(sc.next());

        System.out.println(" ");

        CapitalDto capitalDto = new CapitalDto();
        System.out.println("Enter capital name");
        capitalDto.setName(sc.next());
        System.out.println("Enter capital city population");
        capitalDto.setPopulation(sc.nextLong());
        System.out.println("Enter capital city found year");
        capitalDto.setFoundYear(sc.nextInt());
        capitalDto.setCountryDto(countryDto);

        countryService.saveAndValidate(capitalDto);
    }
}
