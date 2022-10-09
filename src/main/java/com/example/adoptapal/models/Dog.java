package com.example.adoptapal.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column()
    private String name;
}
