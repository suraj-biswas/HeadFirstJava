package chapter_9_life_and_death_of_an_object;

public class Point {
    private int x;
    private int y;

    // no-arg constructor
    public Point() {
        x = 0;
        y = 0;
    }

    // arg constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
