package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Table(name = "suppliers")
@Entity
public class Supplier {
    @Id
    private Long id;

    private String supplier;

    @Column(name = "supplier_desc")
    private String supllierDesc;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "supplier")
    private List<Cloth> cloth;
}
