package kata.kyu7;

import java.util.Arrays;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        char tempArray[] = String.valueOf(num).toCharArray();
        Arrays.sort(tempArray);
        return Integer.parseInt(new StringBuilder(new String(tempArray)).reverse().toString());
    }
}
