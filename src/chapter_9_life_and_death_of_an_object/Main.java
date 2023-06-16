package chapter_9_life_and_death_of_an_object;

import chapter_7_better_living_in_objectville.Dog;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // objects are created in the garbage-collectible heap area of memory
        // and if the local variable is reference to a object then it is stored in stack
        Dog dog = new Dog();
        System.out.println(dog.getName());
    }
}
