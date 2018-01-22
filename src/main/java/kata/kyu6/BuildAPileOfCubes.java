package kata.kyu6;

public class BuildAPileOfCubes {
    public static int findNb(long m) {
        int n = 0;
        do {
            m = m - (long) Math.pow(n++ + 1d, 3d);
        } while (m > 0);
        return (m == 0) ? n : -1;
    }
}
