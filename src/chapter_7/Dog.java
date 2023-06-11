package chapter_7;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("eating dog food");
    }

    // method overloading
    public void makeNoise(int level) {
        System.out.println("Woof!!Woof!! at " + level + " level");
    }

    // method overriding
    @Override
    public void makeNoise() {
        System.out.println("Woof!!Woof!!");
    }

    public void sneef() {

    }
}
