package com.example.demo.cloth.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Table(name = "clothes")
@Entity
public class Cloth {
    @Id
    private Long id;

    private String size;

    private String color;

    private String type;


    @Column(table = "categories",name = "category_id")
    private Long categoryId;

    private String sex;

    @Column(nullable = false)
    private Double price;

    private LocalDate release;

}
