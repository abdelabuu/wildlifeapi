package com.example.wildlifeapi;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    // 0) Root (“/”) goes to /animals
    @GetMapping("/")
    public String home() {
        return "redirect:/animals";
    }

    // 1) List view at /animals
    @GetMapping("/animals")
    public String list(Model model) {
        List<Animal> animals = List.of(
            new Animal("Zebra", "Striped animal", "Equid",
                "https://blog.education.nationalgeographic.org/wp-content/uploads/2014/04/burchellszebra.jpg?w=470",
                new Date()),
            new Animal("Frog", "Green jumper", "Treefrog",
                "https://static.wixstatic.com/media/b853e0_527748a79b914fa6b9d79649b191f711~mv2.png",
                new Date())
        );
        model.addAttribute("animalList", animals);
        return "animal-list";
    }

    // 2) Show “Add New” form
    @GetMapping("/animals/new")
    public String showForm(Model model) {
        model.addAttribute("animal", new Animal());
        return "animal-form";
    }

    // 3) Handle form submission
    @PostMapping("/animals/new")
    public String createFromForm(@ModelAttribute Animal animal) {
        animalService.saveAnimal(animal);
        return "redirect:/animals";
    }

    // 4) Detail view for one animal
    @GetMapping("/animals/{id}")
    public String details(@PathVariable Long id, Model model) {
        Animal animal = new Animal(
            "Elephant", "Big and strong", "Mammal",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/3/37/African_Bush_Elephant.jpg/1200px-African_Bush_Elephant.jpg",
            new Date()
        );
        model.addAttribute("animal", animal);
        return "animal-details";
    }
}
