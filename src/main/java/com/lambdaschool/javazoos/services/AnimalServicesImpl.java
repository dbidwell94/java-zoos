package com.lambdaschool.javazoos.services;


import com.lambdaschool.javazoos.models.Animal;
import com.lambdaschool.javazoos.views.AnimalZooCount;
import com.lambdaschool.javazoos.repositories.AnimalsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalServicesImpl implements AnimalsServices {

    @Autowired
    AnimalsRepository animalsRepository;

    @Override
    public List<Animal> getAllAnimals() {
        List<Animal> animals = new ArrayList<>();
        animalsRepository.findAll().iterator().forEachRemaining(animals::add);
        return animals;
    }

    @Override
    public List<AnimalZooCount> getAnimalZooCount() {
        return animalsRepository.getAnimalZooCount();
    }
}
