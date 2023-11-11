package com.xworkz.bankapp.repository;

import com.xworkz.bankapp.dto.AtmCardDto;

public interface BankAccountRepository {
    public void save(AtmCardDto dto);
}
