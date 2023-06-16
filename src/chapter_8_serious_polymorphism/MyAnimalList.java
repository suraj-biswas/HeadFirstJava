package chapter_8_serious_polymorphism;

import chapter_7_better_living_in_objectville.Animal;

public class MyAnimalList {
    private Animal[] animals = new Animal[5];
    private int nextIndex = 0;

    public void add(Animal a) {
        if (nextIndex < animals.length) {
            animals[nextIndex] = a;
            nextIndex++;
        }
    }
}
