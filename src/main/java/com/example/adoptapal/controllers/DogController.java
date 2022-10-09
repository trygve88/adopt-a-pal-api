package com.example.adoptapal.controllers;

import com.example.adoptapal.models.Dog;
import com.example.adoptapal.services.dog.DogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(path = "api/v1/dogs")

public class DogController {

    private final DogService dogService;

    public DogController(DogService dogService) {
        this.dogService = dogService;
    }

    @GetMapping()
    public ResponseEntity<Collection<Dog>> getAll() {
        return ResponseEntity.ok(dogService.findAll());
    }

    @GetMapping("withSkill")
    public ResponseEntity<Collection<Dog>> getDogsWithSkill(@RequestParam Collection<Integer> skillIds) {
        return ResponseEntity.ok(dogService.getDogsWithSkill(skillIds));
    }
}
