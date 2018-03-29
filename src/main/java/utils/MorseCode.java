package utils;

import java.util.HashMap;
import java.util.Map;

public class MorseCode {

    private static final Map<String, String> map;

    static {
        map = new HashMap<>();
        map.put(".-", "A");
        map.put("-...", "B");
        map.put("-.-.", "C");
        map.put("-..", "D");
        map.put(".", "E");
        map.put("..-.", "F");
        map.put("--.", "G");
        map.put("....", "H");
        map.put("..", "I");
        map.put(".---", "J");
        map.put("-.-", "K");
        map.put(".-..", "L");
        map.put("--", "M");
        map.put("-.", "N");
        map.put("---", "O");
        map.put(".--.", "P");
        map.put("--.-", "Q");
        map.put(".-.", "R");
        map.put("...", "S");
        map.put("-", "T");
        map.put("..-", "U");
        map.put("...-", "V");
        map.put(".--", "W");
        map.put("-..-", "X");
        map.put("-.--", "Y");
        map.put("--..", "Z");
        map.put("/", " ");
        map.put(".----", "1");
        map.put("..---", "2");
        map.put("...--", "3");
        map.put("....-", "4");
        map.put(".....", "5");
        map.put("-....", "6");
        map.put("--...", "7");
        map.put("---..", "8");
        map.put("----.", "9");
        map.put("-----", "0");
        map.put(".-.-.-", ".");
        map.put("--..--", ",");
        map.put("---...", ":");
        map.put("..--..", "?");
        map.put(".----.", "\'");
        map.put("-....-", "-");
        map.put("-..-.", "/");
        map.put(".--.-.", "@");
        map.put("-...-", "=");
        map.put("...---...", "SOS");
        map.put("-.-.--", "!");
    }

    public static String get(String code) {
        return map.get(code);
    }
}
