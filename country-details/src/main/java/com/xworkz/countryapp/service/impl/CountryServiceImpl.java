package com.xworkz.countryapp.service.impl;

import com.xworkz.countryapp.dto.CapitalDto;
import com.xworkz.countryapp.repository.CountryRepository;
import com.xworkz.countryapp.repository.impl.CountryRepositoryImpl;
import com.xworkz.countryapp.service.CountryService;

public class CountryServiceImpl implements CountryService {
CountryRepository countryRepository;

public  CountryServiceImpl(){
    countryRepository = new CountryRepositoryImpl();
}
    @Override
    public void saveAndValidate(CapitalDto dto) {
        System.out.println("----validation-----");
        boolean isNameValidated = false;
        boolean isPopulationValidated = false;
        boolean isFoundYearValidated = false;

        if(dto!=null){
            if(dto.getName()!=null){
                isNameValidated=true;
            }
            if(dto.getPopulation()>0){
                isPopulationValidated=true;
            }
            if(dto.getFoundYear()>0){
                isFoundYearValidated=true;
            }
            if(isNameValidated==true && isPopulationValidated==true && isFoundYearValidated==true){
                countryRepository.save(dto);
                System.out.println("Details are validated");
            }
        }

    }
}
