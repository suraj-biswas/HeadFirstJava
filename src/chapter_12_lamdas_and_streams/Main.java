package chapter_12_lamdas_and_streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Function<Song, String> getGenre = Song::getGenre;
    }
}
