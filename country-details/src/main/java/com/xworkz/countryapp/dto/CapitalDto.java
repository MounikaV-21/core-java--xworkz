package com.xworkz.countryapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CapitalDto {
    @Id
    @GenericGenerator(name = "ref", strategy = "increment")
    @GeneratedValue(generator = "ref")
private int capitalId;
private String name;
private long population;
private  int foundYear;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
private CountryDto countryDto;
}
