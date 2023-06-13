package chapter_7_better_living_in_objectville;

// abstract class has zero value unless it is extended
abstract public class Animal{
    String name;
    String food;
    int hunger;
    String location;

    public void makeNoise() {};
    public void eat() {};
    public void sleep() {};
    public void roam() {};
}
