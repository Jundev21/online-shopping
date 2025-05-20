package com.shopping.shopping.CategoryItem;

import com.shopping.shopping.Category.CategoryEntity;
import com.shopping.shopping.item.ItemEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class CategoryItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CATEGORYITEMENTITY_ID")
    private Long id;
    @ManyToOne
    private CategoryEntity categoryEntity;
    @ManyToOne
    private ItemEntity itemEntity;

}
