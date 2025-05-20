package com.shopping.shopping.orderItem;


import com.shopping.shopping.item.ItemEntity;
import com.shopping.shopping.order.OrderEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class OrderItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ORDERITEM_ID")
    private Long id;
    private int OrderPrice;
    private int OrderQuantity;
    @ManyToOne
    private ItemEntity item;
    @ManyToOne
    private OrderEntity order;
}
