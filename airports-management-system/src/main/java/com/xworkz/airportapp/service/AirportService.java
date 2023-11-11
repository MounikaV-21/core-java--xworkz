package com.xworkz.airportapp.service;

import com.xworkz.airportapp.dto.AirportDto;

public interface AirportService {
    public void validateAndSave(AirportDto dto);

    public AirportDto getAirportInfoByTerminalId(int id);
}
