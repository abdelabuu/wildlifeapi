package com.example.wildlifeapi;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

    // Custom query: find animals by species
    List<Animal> findBySpecies(String species);

    // Custom query: find animals whose name contains a string
    List<Animal> findByNameContainingIgnoreCase(String name);
}
