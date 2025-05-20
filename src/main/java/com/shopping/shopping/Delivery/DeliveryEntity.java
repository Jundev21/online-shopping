package com.shopping.shopping.Delivery;

import com.shopping.shopping.order.OrderEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class DeliveryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DELIVERY_ID")
    private Long id;
    private String city;
    private String street;
    private String zipCode;
    @OneToOne(mappedBy = "ORDER_ID")
    private OrderEntity orderEntity;
}
