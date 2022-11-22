package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Table(name = "categories")
@Entity
public class Category {
    @Id
    private Long id;

    @Column(nullable = false)
    private String category;

    @Column(name = "category_desc")
    private String categoryDesc;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
    private List<Cloth> cloth;


}
