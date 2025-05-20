package com.shopping.shopping.Category;

import com.shopping.shopping.CategoryItem.CategoryItemEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CATEGORY_ID")
    private Long id;
    private String name;
    @OneToMany
    private List<CategoryItemEntity> categoryItemEntities = new ArrayList<>();

}
