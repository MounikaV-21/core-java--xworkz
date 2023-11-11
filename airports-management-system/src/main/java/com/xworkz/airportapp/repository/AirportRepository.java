package com.xworkz.airportapp.repository;

import com.xworkz.airportapp.dto.AirportDto;

public interface AirportRepository {
    public void save(AirportDto dto);

    public AirportDto getAirportInfoByTerminalId(int id);
}
