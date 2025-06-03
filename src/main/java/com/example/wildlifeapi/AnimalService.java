package com.example.wildlifeapi;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public Animal saveAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    public Animal getAnimalById(Long id) {
        return animalRepository.findById(id).orElse(null);
    }

    public Animal updateAnimal(Long id, Animal updatedAnimal) {
        Optional<Animal> optionalAnimal = animalRepository.findById(id);
        if (optionalAnimal.isPresent()) {
            Animal animal = optionalAnimal.get();
            animal.setName(updatedAnimal.getName());
            animal.setDescription(updatedAnimal.getDescription());
            animal.setSpecies(updatedAnimal.getSpecies());
            animal.setImageUrl(updatedAnimal.getImageUrl());
            animal.setActiveDate(updatedAnimal.getActiveDate());
            return animalRepository.save(animal);
        } else {
            return null;
        }
    }

    public void deleteAnimal(Long id) {
        animalRepository.deleteById(id);
    }

    public List<Animal> findBySpecies(String species) {
        return animalRepository.findBySpecies(species);
    }

    public List<Animal> findByNameContains(String name) {
        return animalRepository.findByNameContainingIgnoreCase(name);
    }
}
