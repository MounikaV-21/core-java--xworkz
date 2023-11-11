package com.xworkz.usermanagementapp.repository.impl;

import com.xworkz.usermanagementapp.dto.CartItemDto;
import com.xworkz.usermanagementapp.entitymanager.EntityManagerFactorySingleton;
import com.xworkz.usermanagementapp.repository.UserCartRepository;

import javax.persistence.EntityManager;


public class UserCartRepositoryImpl implements UserCartRepository {


    @Override
    public void save(CartItemDto dto) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(dto);
        entityManager.getTransaction().commit();

    }
}
