package com.example.adoptapal.runner;

import com.example.adoptapal.repositories.DogRepository;
import com.example.adoptapal.services.dog.DogService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {
    private final DogService dogService;

    public AppRunner(DogService dogService) {
        this.dogService = dogService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(dogService.findAll());
    }
}
