package com.example.demo.project.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "plan")
public class Plan implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "plan_id", nullable = false)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="price")
    private Double price;
    @Column(name="purchasedate")
    private LocalDateTime purchaseDate;
    @Column(name="description")
    private String description;
    @Column(name="expiredate")
    private LocalDateTime expireDate;
    @Enumerated(EnumType.STRING)
    @Column(length = 8)
    private PlanType type;
    @JsonBackReference
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    @JoinColumn(name="item_id")
    private List<Item> items=new ArrayList<>();

    @JsonBackReference
    @OneToMany(mappedBy = "currentPlan" , fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    private List<Customer> customers = new ArrayList<>();





}
