package com.example.adoptapal.repositories;

import com.example.adoptapal.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill,Integer> {
}