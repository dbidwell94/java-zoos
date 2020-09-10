package com.lambdaschool.javazoos.services;

import com.lambdaschool.javazoos.models.Animal;
import com.lambdaschool.javazoos.views.AnimalZooCount;

import java.util.List;

public interface AnimalsServices {
    List<Animal> getAllAnimals();
    List<AnimalZooCount> getAnimalZooCount();
}
