package com.example.demo.category.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

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


}
