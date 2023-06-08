package chapter_2_trip_to_objectville;

import java.util.Random;

public class Player {
    public int number;
    public void guess() {
        number = (int) (Math.random() * 10);
    }
}
