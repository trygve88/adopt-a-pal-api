package com.example.adoptapal.services.dog;

import com.example.adoptapal.models.Dog;
import com.example.adoptapal.repositories.DogRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    @Override
    public Collection<Dog> getDogsWithSkill(Collection<Integer> skillIds) {
        Collection<Dog> dogsWithSKill = new ArrayList<>();
        Collection<Dog> allDogs = dogRepository.findAll();
        for (Dog d: allDogs) {
           if (d.hasSkills(skillIds)) {
               dogsWithSKill.add(d);
           }
        }
        return dogsWithSKill;
    }

    @Override
    public Collection<Dog> getDogsByFilter(Collection<String> filters) {
        // make filters into skill ids and breed
        Collection<Integer> skillIds = new ArrayList<>();
        String breed = "";
        for (String filter: filters) {
            if (filter.length()<3) {
                skillIds.add(Integer.parseInt(filter));
            }
            else {
                breed = filter;
            }
        }
        // get dogs that match skill ids and breed
        Collection<Dog> filterDogs = new ArrayList<>();
        Collection<Dog> allDogs = dogRepository.findAll();
        for (Dog d: allDogs) {
            if (d.hasSkills(skillIds) && d.getBreed().getName().equals(breed)) {
                filterDogs.add(d);
            }
        }
        return filterDogs;
    }
}
