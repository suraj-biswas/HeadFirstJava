package chapter_7_better_living_in_objectville;

import chapter_8_serious_polymorphism.Pet;

public class Dog extends Animal implements Pet {
    public Dog() {

    }
    public Dog(String name) {
        // calling the superclass constructor otherwise we can't apply the method getName() in dog
        super(name);
    }
    @Override
    public void makeNoise() {
        System.out.println("Woof!!Woof!!");
    }

    @Override
    public void eat() {
        System.out.println("dog is eating dof food");
    }

    public void bark() {
        System.out.println("Dog is barking");
    }

    @Override
    public void beFriendly() {
        System.out.println("Dogs are friendly");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing with me");
    }
}
