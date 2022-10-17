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
        return getFilterDogs(skillIds,breed);
    }

    public Collection<Dog> getFilterDogs(Collection<Integer> skillIds, String breed) {
        Collection<Dog> filterDogs = new ArrayList<>();
        Collection<Dog> allDogs = dogRepository.findAll();
        for (Dog dog: allDogs) {
            if (skillCheck(skillIds,dog) && breedCheck(breed,dog) ) {
                filterDogs.add(dog);
            }
        }
        return filterDogs;
    }

    public boolean skillCheck(Collection<Integer> skillIds, Dog dog) {
        if (skillIds.size() == 0) return true;
        if (dog.hasSkills(skillIds)) return true;
        return false;
    }

    public boolean breedCheck(String breed, Dog dog) {
        if (breed == "" || breed == "any" ) return true;
        if (dog.getBreed().getName().equals(breed)) return true;
        return false;
    }

}
