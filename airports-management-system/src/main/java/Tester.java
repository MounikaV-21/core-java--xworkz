import com.xworkz.airportapp.dto.AirportDto;
import com.xworkz.airportapp.dto.TerminalDto;
import com.xworkz.airportapp.service.AirportService;
import com.xworkz.airportapp.service.impl.AirportServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the size");
                int size = sc.nextInt();

                List<TerminalDto> terminalDtos = new ArrayList<>();

               AirportDto airPortDto = new AirportDto();
//                System.out.println("Enter the name of Airport");
//                airPortDto.setAirportName(sc.next());
//                System.out.println("Enter the city");
//                airPortDto.setCity(sc.next());
//                System.out.println("Enter the type");
//                airPortDto.setType(sc.next());


                TerminalDto terminalDto1 = new TerminalDto();
                terminalDto1.setTerminalName("Thor");
                terminalDto1.setAirportDto(airPortDto);

                TerminalDto terminalDto2 = new TerminalDto();
                terminalDto2.setTerminalName("Iron man");
                terminalDto2.setAirportDto(airPortDto);

                TerminalDto terminalDto3 = new TerminalDto();
                terminalDto3.setTerminalName("HomLander");
                terminalDto3.setAirportDto(airPortDto);

//                terminalDtos.add(terminalDto1);
//                terminalDtos.add(terminalDto2);
//                terminalDtos.add(terminalDto3);
//
//                airPortDto.setDtos(terminalDtos);

                AirportService airportService = new AirportServiceImpl();
                airportService.validateAndSave(airPortDto);

                System.out.println("Enter the terminal id to get airport details");
                AirportDto airportDto = airportService.getAirportInfoByTerminalId(1);
                System.out.println(airportDto);


            }
        }


