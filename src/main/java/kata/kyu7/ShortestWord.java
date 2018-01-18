package kata.kyu7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ShortestWord {
    public static int findShort(String s) {
        List<String> words = Arrays.asList(s.split(" "));
        words = words.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
        return words.get(0).length();
    }
}
