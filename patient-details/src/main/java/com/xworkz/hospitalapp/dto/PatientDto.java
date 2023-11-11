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
@Table(name = "patient")
public class PatientDto {
    @Id
    @Column(name = "id")
    @GenericGenerator(name = "ref", strategy = "increment")
    @GeneratedValue(generator = "ref")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name ="address")
    private String address;
    @Column(name = "contact_no")
    private long contactNo;
}
