package com.xworkz.hospitalapp.dto;

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
@Table(name = "addres")
public class AddressDto {
    @Id
    @Column(name = "a_id")
    @GenericGenerator(name = "ref", strategy = "increment")
    @GeneratedValue(generator = "ref")
    private int id;
    @Column(name = "state")
    private String state;
    @Column(name = "district")
    private String district;
    @Column(name = "pincode")
    private long pinCode;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private PatientDto patientDto;
}
