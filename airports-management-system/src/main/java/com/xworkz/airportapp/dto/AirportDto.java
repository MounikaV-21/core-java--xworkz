package com.xworkz.airportapp.dto;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
//@Table(name = "airport")

public class AirportDto {
    @Id
    @GenericGenerator(name = "ref", strategy = "increment")
    @GeneratedValue(generator = "ref")
    //@Column(name = "airport_id")
    private  int airportId;
    //@Column(name = "airport_name")
    private String airportName;
    //@Column(name = "city")
    private String city;
    //@Column(name = "type")
    private  String type;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "airportDto")
    private List<TerminalDto> dtos;


}
