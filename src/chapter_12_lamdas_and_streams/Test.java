package chapter_12_lamdas_and_streams;

import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String> list = List.of("I", "am", "Suraj", "Biswas");
        List<String> result = list.stream().distinct().skip(2).collect(Collectors.toList());
        System.out.println(result);
    }
}
