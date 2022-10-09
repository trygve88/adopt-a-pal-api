package com.example.adoptapal.services.skill;

import com.example.adoptapal.models.Skill;
import com.example.adoptapal.repositories.SkillRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class SkillServiceImp implements SkillService {

    private final SkillRepository skillRepository;

    public SkillServiceImp(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    @Override
    public Skill findById(Integer integer) {
        return skillRepository.findById(integer).get();
    }

    @Override
    public Collection<Skill> findAll() {
        return skillRepository.findAll();
    }

    @Override
    public Skill add(Skill entity) {
        return skillRepository.save(entity);
    }

    @Override
    public Skill update(Skill entity) {
        return skillRepository.save(entity);
    }

    @Override
    public void deleteById(Integer integer) {
        skillRepository.deleteById(integer);
    }

    @Override
    public void delete(Skill entity) {
        skillRepository.delete(entity);
    }
}
