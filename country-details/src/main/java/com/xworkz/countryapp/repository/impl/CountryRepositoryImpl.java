package com.xworkz.countryapp.repository.impl;

import com.xworkz.countryapp.dto.CapitalDto;
import com.xworkz.countryapp.entitymanager.EntityManagerFactorySingleton;
import com.xworkz.countryapp.repository.CountryRepository;

import javax.persistence.EntityManager;

public class CountryRepositoryImpl implements CountryRepository {
    @Override
    public void save(CapitalDto dto) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(dto);
        entityManager.getTransaction().commit();

    }
}
