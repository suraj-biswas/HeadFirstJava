package chapter_7_better_living_in_objectville;

public class Cat extends Animal{
    public Cat() {

    }
    public Cat(String theName) {

    }

    @Override
    public void makeNoise() {
        System.out.println("Meow!!Meow!!");
    }

    @Override
    public void eat() {
        System.out.println("cat is eating cat food");
    }
}
