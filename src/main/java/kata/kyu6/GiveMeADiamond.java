package kata.kyu6;

public class GiveMeADiamond {
    public static String print(int n) {
        if ((n % 2) == 0 || n <= 0) return null;
        StringBuilder diamond = new StringBuilder();
        for (int i = 1; i < n; i += 2) {
            for (int j = 0; j < (n - i) / 2; j++) diamond.append(" ");
            for (int k = 0; k < i; k++) diamond.append("*");
            diamond.append("\n");
        }
        for (int i = n; i > 0; i -= 2) {
            for (int j = 0; j < (n - i) / 2; j++) diamond.append(" ");
            for (int k = 0; k < i; k++) diamond.append("*");
            diamond.append("\n");
        }
        return diamond.toString();
    }
}
