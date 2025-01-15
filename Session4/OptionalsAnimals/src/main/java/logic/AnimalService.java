package logic;

import data.Animal;

import java.util.List;
import java.util.Optional;

public class AnimalService {
    public Optional<Animal> getBrownBull(List<Animal> animals) {
        return animals.stream()
                .filter(animal -> animal.color().equals("Brown") &&
                    animal.type().equals("Bull") &&
                    !animal.isFemale())
                .findFirst();
//        for (Animal animal : animals) {
//            if (animal.color().equals("Brown") &&
//                    animal.type().equals("Bull") &&
//                    !animal.isFemale()) {
//                return Optional.of(animal);
//            }
//        }
//        return Optional.empty();
    }
}
