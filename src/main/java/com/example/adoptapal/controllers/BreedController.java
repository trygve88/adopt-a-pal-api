package com.example.adoptapal.controllers;

import com.example.adoptapal.models.Breed;
import com.example.adoptapal.services.breed.BreedService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping(path = "api/v1/breeds")

public class BreedController {

    private final BreedService breedService;

    public BreedController(BreedService breedService) {
        this.breedService = breedService;
    }

    @GetMapping()
    public ResponseEntity<Collection<Breed>> getAll() {
        return ResponseEntity.ok(breedService.findAll());
    }
}
