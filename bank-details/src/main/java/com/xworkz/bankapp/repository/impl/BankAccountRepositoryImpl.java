package com.xworkz.bankapp.repository.impl;

import com.xworkz.bankapp.dto.AtmCardDto;
import com.xworkz.bankapp.entitymanager.EntityManagerFactorySingleton;
import com.xworkz.bankapp.repository.BankAccountRepository;

import javax.persistence.EntityManager;

public class BankAccountRepositoryImpl implements BankAccountRepository {
    @Override
    public void save(AtmCardDto dto) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(dto);
        entityManager.getTransaction().commit();
    }
}
