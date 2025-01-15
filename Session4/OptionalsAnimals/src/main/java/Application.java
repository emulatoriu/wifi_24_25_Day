import data.Animal;
import logic.AnimalService;

import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Animal> animals = List.of(
          new Animal("aaaaa", "brown", "Sheep", true),
          new Animal("bbbbb", "brown", "Sheep", true),
          new Animal("ccccc", "brown", "Sheep", true),
          new Animal("ddddd", "brown", "Sheep", true)
        );
        AnimalService animalService = new AnimalService();
        Optional<Animal> found = animalService.getBrownBull(animals);
        if(found.isPresent())
            System.out.println(found.get().name());
        else System.out.println("Not Found");
    }
}
