package kata.kyu4;

import utils.MorseCode;

public class DecodeTheMorseCodeAdvanced {
    public static String decodeBits(String bits) {
        String digits = bits.replaceAll("^0*|0*$", "");
        int timeUnit = digits.length();
        int i = 0;
        while (i < digits.length()) {
            int tempUnit = 0;
            while (i < digits.length() && digits.charAt(i) == '1') {
                tempUnit++;
                i++;
            }
            if (tempUnit != 0 && tempUnit < timeUnit) timeUnit = tempUnit;
            i++;
        }
        int j = 0;
        while (j < digits.length()) {
            int tempUnit = 0;
            while (j < digits.length() && digits.charAt(j) == '0') {
                tempUnit++;
                j++;
            }
            if (tempUnit != 0 && tempUnit < timeUnit) timeUnit = tempUnit;
            j++;
        }
        return digits.replaceAll("^0*|0*$", "").replaceAll("1{" + timeUnit * 3 + "}", "-").replaceAll("1{" + timeUnit + "}", ".").replaceAll("0{" + timeUnit * 6 + "}", "   ").replaceAll("0{" + timeUnit * 3 + "}", " ").replaceAll("0{" + timeUnit + "}", "");
    }

    public static String decodeMorse(String morseCode) {
        StringBuilder sb = new StringBuilder();
        for (String code : morseCode.trim().replaceAll("   ", " / ").split(" "))
            sb.append(code.equals("/") ? " " : MorseCode.get(code));
        return sb.toString();
    }
}
