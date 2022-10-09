package com.example.adoptapal.services.skill;

import com.example.adoptapal.models.Skill;
import com.example.adoptapal.services.CrudService;
import org.springframework.stereotype.Service;

@Service
public interface SkillService extends CrudService<Skill,Integer> {
}
