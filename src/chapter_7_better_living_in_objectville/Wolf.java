package chapter_7_better_living_in_objectville;

public class Wolf extends Animal{
    @Override
    public void makeNoise() {
        System.out.println("howl!!howl!!");
    }

    @Override
    public void eat() {
        System.out.println("wolf is eating meat");
    }
}
