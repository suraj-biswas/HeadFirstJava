package chapter_11_data_structures;

import java.util.ArrayList;
import java.util.List;

public class SortMountains {
    public static void main(String[] args) {
        new SortMountains().go();
    }

    public void go() {
        List<Mountain> mountains = new ArrayList<>();
        mountains.add(new Mountain("Longs", 14255));
        mountains.add(new Mountain("Elbert", 14433));
        mountains.add(new Mountain("Maroon", 14156));
        mountains.add(new Mountain("Castle", 14265));
        System.out.println("as entered:\n" + mountains);

        mountains.sort((one, two) -> one.getName().compareTo(two.getName()));
        System.out.println("by name:\n" + mountains);

        mountains.sort((one, two) -> {
            if (one.getHeight() == two.getHeight())
                return 0;
            else if (one.getHeight() > two.getHeight())
                return 1;
            else
                return -1;
        });
        System.out.println("by height:\n" + mountains);
    }
}
