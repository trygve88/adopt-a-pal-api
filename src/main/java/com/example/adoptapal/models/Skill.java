package com.example.adoptapal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@EqualsAndHashCode(exclude = "dogs")

public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column()
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "dog_skill",
        joinColumns = @JoinColumn(name = "skill_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "dog_id", referencedColumnName = "id")
    )
    @JsonIgnoreProperties("skills")
    private Set<Dog> dogs;

}
