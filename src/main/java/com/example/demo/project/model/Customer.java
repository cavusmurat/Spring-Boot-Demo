package com.example.demo.project.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
@Getter
@Setter
@Entity
@Table(name="customer" , schema = "public")
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id", nullable = false)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="surname")
    private String surname;
    @Column(name="phonenumber" ,unique = true)
    private String phoneNumber;
    @Column(name = "password")
    private String password;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name="plan_id")
    private Plan currentPlan;



}
