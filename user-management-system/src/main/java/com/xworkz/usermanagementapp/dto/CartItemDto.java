package com.xworkz.usermanagementapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "carts")

public class CartItemDto {
    @Id
    @Column(name = "cart_id")
    @GenericGenerator(name = "ref", strategy = "increment")
    @GeneratedValue(generator = "ref")
    private int cartId;
    @Column(name = "product_id")
    private int productId;
    @Column(name = "quantity")
    private int quantity;

    @OneToOne(cascade = CascadeType.ALL) // perform operations on associate entity - enum
    @JoinColumn(name = "id")
    private UserDto userDto;

    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "modified_at")
    private Date modifiedAt;


}
