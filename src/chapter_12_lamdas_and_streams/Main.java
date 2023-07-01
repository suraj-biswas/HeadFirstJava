package chapter_12_lamdas_and_streams;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        List<Integer> nums = List.of(1, 2, 3, 4, 5);
//        String output = "";
//        nums.forEach(num -> System.out.print(num + " "));
        List<String> strings = List.of("I", "am", "a", "list", "of", "Strings");
        Stream<String> stream = strings.stream();
        Stream<String> limit = stream.limit(4);
        List<String> result = limit.collect(Collectors.toList());
        System.out.println(result);
    }


}
