package chapter_7;

public class Wolf extends Animal{
    @Override
    public void eat() {
        System.out.println("eating meat");
    }

    @Override
    public void makeNoise() {
        System.out.println("howl!!howl!");
    }
}
