package com.xworkz.bankapp.dto;

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
public class AtmCardDto {
    @Id
    @GenericGenerator(name = "ref", strategy = "increment")
    @GeneratedValue(generator = "ref")
    private int atm_id;
    private String cardNo;
    private int cvv;
    private String cardHolderName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private BankAccountDto bankAccountDto;
}
