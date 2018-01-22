package kata.kyu6;

public class VasyaClerk {
    public static String Tickets(int[] peopleInLine) {
        int d25 = 0;
        int d50 = 0;
        for (int i = 0; i < peopleInLine.length; i++) {
            if (peopleInLine[i] == 25) d25++;
            if (peopleInLine[i] == 50) {
                d25--;
                d50++;
            }
            if (peopleInLine[i] == 100) {
                if (d50 > 0) {
                    d50--;
                    d25--;
                } else {
                    d25 -= 3;
                }
            }
            if (d25 < 0 || d50 < 0) return "NO";
        }
        return "YES";
    }
}
