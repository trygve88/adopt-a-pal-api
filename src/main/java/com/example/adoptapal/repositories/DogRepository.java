package com.example.adoptapal.repositories;

import com.example.adoptapal.models.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<Dog,Integer> {
}
