import chapter_7_better_living_in_objectville.Animal;
import chapter_7_better_living_in_objectville.Dog;
import chapter_7_better_living_in_objectville.Wolf;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Wolf());

        giveShot(animals);
    }

    // <T extends Animal> means we can use any arraylist that is animal or a subclass of a animal
    public static <T extends Animal> void giveShot(ArrayList<T> list) {
        for (T animal : list)
            animal.makeNoise();
    }

    // here we have to provide an arraylist of type Animal , no subclass of animal is allowed here
    public static  void shot(ArrayList<Animal> list) {
        for (Animal animal : list)
            animal.makeNoise();
    }
}