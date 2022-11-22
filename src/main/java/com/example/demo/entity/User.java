package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Table(name = "users")
@Entity
public class User {
    @Id
    private Long id;

    private String name;
    @Column(name = "last_name")
    private String lastName;

    private String phone;

    private String address;

    private LocalDate born;

//    @OneToOne(fetch = FetchType.LAZY)
//    private Bucket bucket;
//
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "user")
    private List<Order> order;
}
