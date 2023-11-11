package com.xworkz.bankapp.service;

import com.xworkz.bankapp.dto.AtmCardDto;

public interface BankAccountService {
    public void saveAndValidate(AtmCardDto dto);
}
