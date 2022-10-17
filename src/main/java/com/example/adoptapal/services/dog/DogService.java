package com.example.adoptapal.services.dog;

import com.example.adoptapal.models.Dog;
import com.example.adoptapal.services.CrudService;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface DogService extends CrudService<Dog,Integer> {

    Collection<Dog> getDogsWithSkill(Collection<Integer> skillIds);

    Collection<Dog> getDogsByFilter(Collection<String> filters);

}
