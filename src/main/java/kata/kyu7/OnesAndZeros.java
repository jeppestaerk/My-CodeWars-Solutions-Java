package kata.kyu7;

import java.util.List;

public class OnesAndZeros {
    public static int convertBinaryArrayToInt(List<Integer> binary) {
        return binary.get(0) * 8 + binary.get(1) * 4 + binary.get(2) * 2 + binary.get(3) * 1;
    }
}
