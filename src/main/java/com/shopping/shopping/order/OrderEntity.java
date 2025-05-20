package com.shopping.shopping.order;

import com.shopping.shopping.Delivery.DeliveryEntity;
import com.shopping.shopping.member.MemberEntity;
import com.shopping.shopping.orderItem.OrderItemEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_ID")
    private Long id;
    private LocalDateTime orderDate;
    private Boolean status;
    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private MemberEntity member;
    @OneToMany(mappedBy = "ORDERITEM_ID")
    private List<OrderItemEntity> orderItemEntities = new ArrayList<>();
    @OneToOne
    private DeliveryEntity deliveryEntities;
}
