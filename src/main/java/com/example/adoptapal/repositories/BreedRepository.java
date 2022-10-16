package com.example.adoptapal.repositories;

import com.example.adoptapal.models.Breed;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BreedRepository extends JpaRepository<Breed,Integer> {
}

