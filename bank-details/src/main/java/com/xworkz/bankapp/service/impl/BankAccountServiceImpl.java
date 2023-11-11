package com.xworkz.bankapp.service.impl;

import com.xworkz.bankapp.dto.AtmCardDto;
import com.xworkz.bankapp.repository.BankAccountRepository;
import com.xworkz.bankapp.repository.impl.BankAccountRepositoryImpl;
import com.xworkz.bankapp.service.BankAccountService;

public class BankAccountServiceImpl implements BankAccountService {

    BankAccountRepository bankAccountRepository;

    public BankAccountServiceImpl(){
        bankAccountRepository = new BankAccountRepositoryImpl();
    }
    @Override
    public void saveAndValidate(AtmCardDto dto) {
        System.out.println("---Validation---");
        boolean isCardNOValidated=false;
        boolean isCvvValidated=false;
        boolean isCardHolderNameValidated=false;

        if(dto!=null){
            if(dto.getCardNo()!=null){
                isCardNOValidated=true;
            }
            if(dto.getCvv()>0){
                isCvvValidated=true;
            }
            if(dto.getCardHolderName()!=null){
                isCardHolderNameValidated=true;
            }
            if(isCardNOValidated==true && isCvvValidated==true && isCardHolderNameValidated==true){
              bankAccountRepository.save(dto);
                System.out.println("Details are validated");
            }
        }
    }
}
