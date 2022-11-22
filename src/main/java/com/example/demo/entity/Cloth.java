package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Table(name = "clothes")
@Entity
public class Cloth {
    @Id
    private Long id;

    private String size;

    private String color;

    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;

    private String sex;

    @Column(nullable = false)
    private Double price;

    private LocalDate release;

    @ManyToOne(fetch = FetchType.LAZY)
    private Supplier supplier;

//    @ManyToOne(fetch = FetchType.LAZY)
//    private Bucket bucket;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "cloth")
    private List<Order> order;

}
