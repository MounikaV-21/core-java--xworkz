package com.xworkz.airportapp.dto;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Table(name = "terminal")
@NamedQuery(name="getAirportDetails", query = "select dto from TerminalDto dto where dto.terminalId= :id")
public class TerminalDto {
    @Id
    @GenericGenerator(name = "ref", strategy = "increment")
    @GeneratedValue(generator = "ref")
    //@Column(name = "terminal_id")
    private  int terminalId;
    //@Column(name = "terminal_name")
    private String terminalName;

    @ManyToOne
    @JoinColumn(name = "airportId")
    private AirportDto airportDto;

}
