package chapter_11_data_structures;

import chapter_11_data_structures.SongV3;
import chapter_7_better_living_in_objectville.Animal;
import chapter_7_better_living_in_objectville.Cat;
import chapter_7_better_living_in_objectville.Dog;
import chapter_7_better_living_in_objectville.Wolf;

import java.util.*;

public class Main{
    public static void main(String[] args) {
//        List<Animal> animals = List.of(new Dog(), new Cat("mui"), new Wolf());
        List<Dog> dogs = List.of(new Dog(), new Dog());
    }

    public static void takeAnimals(List<? extends Animal> animals) {
        for (Animal a : animals)
            a.makeNoise();
    }
}
