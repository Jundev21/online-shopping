package com.shopping.shopping.member;


import com.shopping.shopping.order.OrderEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MEMBER_ID")
    public Long id;
    public String city;
    public String street;
    public String zipCode;
    @OneToMany(mappedBy = "ORDER_ID")
    public List<OrderEntity> orderEntity = new ArrayList<>();
}



