package chapter_7_better_living_in_objectville;

public class Dog extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Woof!!Woof!!");
    }

    @Override
    public void eat() {
        System.out.println("dog is eating dof food");
    }
}
