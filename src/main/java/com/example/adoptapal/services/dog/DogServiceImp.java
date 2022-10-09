package com.example.adoptapal.services.dog;

import com.example.adoptapal.models.Dog;
import com.example.adoptapal.repositories.DogRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class DogServiceImp implements DogService {

    private final DogRepository dogRepository;

    public DogServiceImp(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    @Override
    public Dog findById(Integer integer) {
        return dogRepository.findById(integer).get();
    }

    @Override
    public Collection<Dog> findAll() {
        return dogRepository.findAll();
    }

    @Override
    public Dog add(Dog entity) {
        return dogRepository.save(entity);
    }

    @Override
    public Dog update(Dog entity) {
        return dogRepository.save(entity);
    }

    @Override
    public void deleteById(Integer integer) {
        dogRepository.deleteById(integer);
    }

    @Override
    public void delete(Dog entity) {
        dogRepository.delete(entity);
    }

}
