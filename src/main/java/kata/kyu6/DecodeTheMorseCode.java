package kata.kyu6;

import utils.MorseCode;

public class DecodeTheMorseCode {
    public static String decode(String morseCode) {
        StringBuilder sb = new StringBuilder();
        for (String code : morseCode.trim().replace("   ", " / ").split(" "))
            sb.append(code.equals("/") ? " " : MorseCode.get(code));
        return sb.toString();
    }
}
