package com.xworkz.airportapp.service.impl;

import com.xworkz.airportapp.dto.AirportDto;
import com.xworkz.airportapp.repository.AirportRepository;
import com.xworkz.airportapp.repository.impl.AirportRepositoryImpl;
import com.xworkz.airportapp.service.AirportService;

public class AirportServiceImpl implements AirportService {

    AirportRepository airportRepository;

    public AirportServiceImpl(){

        airportRepository = new AirportRepositoryImpl();
    }
    @Override
    public void validateAndSave(AirportDto dto) {
        System.out.println("--Validation---");

        boolean isAirportNameValidated = false;
        boolean isCityValidated = false;
        boolean isTypeValidated = false;

        if(dto!=null){

            if(dto.getAirportName()!=null){
                isAirportNameValidated=true;
            }
            if(dto.getCity()!=null){
                isCityValidated=true;
            }
            if(dto.getType()!=null){
                isTypeValidated=true;
            }
            if(isAirportNameValidated==true && isCityValidated==true && isTypeValidated==true){
                airportRepository.save(dto);
                System.out.println("Details are validated");
            }
        }
    }

    @Override
    public AirportDto getAirportInfoByTerminalId(int id) {
        AirportDto dto = null;
        if(id!=0){
           dto =  airportRepository.getAirportInfoByTerminalId(id);
        }
        return dto;
    }
}
