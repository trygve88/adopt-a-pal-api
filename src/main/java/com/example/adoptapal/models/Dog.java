package com.example.adoptapal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Data
@Entity
@EqualsAndHashCode(exclude = "skills")

public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column()
    private String name;

    //@Column()
    //private String breed;

    @Column()
    private String img_url;

    @ManyToMany(mappedBy = "dogs")
    @JsonIgnoreProperties("dogs")
    private Set<Skill> skills;

    @ManyToOne()
    @JsonIgnoreProperties("dogs")
    private Breed breed;

    public boolean hasSkills(Collection<Integer> skillIds) {
        // for each skillid -> check that this dog has the skill
        for (int id: skillIds) {
            if (!hasSkill(id)) return false;
        }
        return true;
    }

    private boolean hasSkill(Integer skillId) {
        for (Skill s: skills) {
            if (s.getId() == skillId) return true;
        }
        return false;
    }

}
