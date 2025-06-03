package com.example.wildlifeapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @PostMapping
    public Animal createAnimal(@RequestBody Animal animal) {
        return animalService.saveAnimal(animal);
    }

    @GetMapping
    public List<Animal> getAllAnimals() {
        return animalService.getAllAnimals();
    }

    @GetMapping("/{id}")
    public Animal getAnimalById(@PathVariable Long id) {
        return animalService.getAnimalById(id);
    }

    @PutMapping("/{id}")
    public Animal updateAnimal(@PathVariable Long id, @RequestBody Animal updatedAnimal) {
        return animalService.updateAnimal(id, updatedAnimal);
    }

    @DeleteMapping("/{id}")
    public void deleteAnimal(@PathVariable Long id) {
        animalService.deleteAnimal(id);
    }

    @GetMapping("/search")
    public List<Animal> searchByName(@RequestParam String name) {
        return animalService.findByNameContains(name);
    }

    @GetMapping("/species/{species}")
    public List<Animal> findBySpecies(@PathVariable String species) {
        return animalService.findBySpecies(species);
    }
}
