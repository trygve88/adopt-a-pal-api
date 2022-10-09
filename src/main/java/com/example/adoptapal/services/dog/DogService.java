package com.example.adoptapal.services.dog;

import com.example.adoptapal.models.Dog;
import com.example.adoptapal.services.CrudService;
import org.springframework.stereotype.Service;

@Service
public interface DogService extends CrudService<Dog,Integer> {
}
