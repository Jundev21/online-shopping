package com.shopping.shopping.item;


import com.shopping.shopping.CategoryItem.CategoryItemEntity;
import com.shopping.shopping.orderItem.OrderItemEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class ItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ITEM_ID")
    private Long id;
    private String itemName;
    private String price;
    private int stockQuantity;
    @OneToMany(mappedBy = "ORDERITEM_ID")
    private List<OrderItemEntity> orderItemEntities = new ArrayList<>();
    @OneToMany(mappedBy = "CATEGORYITEM_ID")
    private List<CategoryItemEntity> categoryItemEntities = new ArrayList<>();
}
