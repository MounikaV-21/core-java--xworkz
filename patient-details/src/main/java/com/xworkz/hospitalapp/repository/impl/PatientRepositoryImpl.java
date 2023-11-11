package com.xworkz.hospitalapp.repository.impl;

import com.xworkz.hospitalapp.dto.AddressDto;
import com.xworkz.hospitalapp.entitymanager.EntityManagerFactorySingleton;
import com.xworkz.hospitalapp.repository.PatientRepository;

import javax.persistence.EntityManager;

public class PatientRepositoryImpl implements PatientRepository {
    @Override
    public void save(AddressDto dto) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(dto);
        entityManager.getTransaction().commit();
    }
}
