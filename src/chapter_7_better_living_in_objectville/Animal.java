package chapter_7_better_living_in_objectville;

// abstract class has zero value unless it is extended
 public abstract class Animal{
    private String name;
    String food;
    int hunger;
    String location;

    public Animal() {
       System.out.println("animal is making");
    }

    public Animal(String theName) {
       name = theName;
    }

    // abstract method must be implemented by its subclasses
    // you can't declare abstract method in concrete classes, you must have to declare class abstract
    public abstract void makeNoise();
    public abstract void eat();

    public void sleep() {
       System.out.println("sleeping!!!!");
    }
    public void roam() {};

    public String getName() {
       return name;
    }
}
