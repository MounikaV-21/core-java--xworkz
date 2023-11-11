package com.xworkz.airportapp.repository.impl;

import com.xworkz.airportapp.dto.AirportDto;
import com.xworkz.airportapp.dto.TerminalDto;
import com.xworkz.airportapp.entitymanager.EntityManagerFactorySingleton;
import com.xworkz.airportapp.repository.AirportRepository;

import javax.persistence.EntityManager;

public class AirportRepositoryImpl implements AirportRepository {
    @Override
    public void save(AirportDto dto) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(dto);
        entityManager.getTransaction().commit();
    }

    @Override
    public AirportDto getAirportInfoByTerminalId(int id) {
        TerminalDto terminalDto = (TerminalDto) EntityManagerFactorySingleton.getFactory().createEntityManager().createNamedQuery("getAirportDetails").setParameter("id", id).getSingleResult();
        return terminalDto.getAirportDto();
    }
}
