package chapter_7;

public class Main {
    public static void main(String[] args) {
//        Animal[] animals = new Animal[2];
//        animals[0] = new Wolf();
//        animals[1] = new Dog();
//        for (Animal animal : animals)
//            giveShot(animal);
        Animal dog = new Dog();
//        dog.sneef(); // give you an error because compiler will not find any sneef method in the animal class
    }

    public static void giveShot(Animal animal) {
        animal.makeNoise();
    }
}