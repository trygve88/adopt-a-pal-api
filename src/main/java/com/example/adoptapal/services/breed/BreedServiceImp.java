package com.example.adoptapal.services.breed;

import com.example.adoptapal.models.Breed;
import com.example.adoptapal.repositories.BreedRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BreedServiceImp implements BreedService {

    private final BreedRepository breedRepository;

    public BreedServiceImp(BreedRepository breedRepository) {
        this.breedRepository = breedRepository;
    }

    @Override
    public Breed findById(Integer integer) {
        return breedRepository.findById(integer).get();
    }

    @Override
    public Collection<Breed> findAll() {
        return breedRepository.findAll();
    }

    @Override
    public Breed add(Breed entity) {
        return breedRepository.save(entity);
    }

    @Override
    public Breed update(Breed entity) {
        return breedRepository.save(entity);
    }

    @Override
    public void deleteById(Integer integer) {
        breedRepository.deleteById(integer);
    }

    @Override
    public void delete(Breed entity) {
        breedRepository.delete(entity);
    }
}


