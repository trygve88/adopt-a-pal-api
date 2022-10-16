package com.example.adoptapal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Data
@Entity
@EqualsAndHashCode(exclude = "dogs")

public class Breed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column()
    private String name;

    @OneToMany(mappedBy = "dogs")
    @JsonIgnoreProperties("dogs")
    private Set<Skill> dogs;

}
