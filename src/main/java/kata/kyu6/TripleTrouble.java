package kata.kyu6;

public class TripleTrouble {

    public static int tripleDouble(long num1, long num2) {
        String n1 = Long.toString(num1);
        String n2 = Long.toString(num2);
        for (int i = 2; i < n1.length(); i++) {
            if (n2.lastIndexOf(n1.charAt(i)) > 0 && (n1.charAt(i) == n1.charAt(i - 1) && n1.charAt(i) == n1.charAt(i - 2)) && n2.charAt(n2.lastIndexOf(n1.charAt(i))) == n2.charAt(n2.lastIndexOf(n1.charAt(i)) - 1))
                return 1;
        }
        return 0;
    }
}
