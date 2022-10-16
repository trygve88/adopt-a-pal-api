package com.example.adoptapal.services.breed;

import com.example.adoptapal.models.Breed;
import com.example.adoptapal.services.CrudService;
import org.springframework.stereotype.Service;

@Service
public interface BreedService extends CrudService<Breed,Integer> {

}

