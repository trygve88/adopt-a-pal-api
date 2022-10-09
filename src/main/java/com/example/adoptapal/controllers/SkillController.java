package com.example.adoptapal.controllers;

import com.example.adoptapal.models.Skill;
import com.example.adoptapal.services.skill.SkillService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping(path = "api/v1/skills")

public class SkillController {

    private final SkillService skillService;

    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    @GetMapping()
    public ResponseEntity<Collection<Skill>> getAll() {
        return ResponseEntity.ok(skillService.findAll());
    }

}
