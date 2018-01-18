package kata.kyu6;

public class BouncingBalls {
    public static int bouncingBall(double h, double bounce, double window) {
        if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) return -1;
        double bounceHight = h * bounce;
        int count = 1;
        while (bounceHight > window) {
            count += 2;
            bounceHight = bounceHight * bounce;
        }
        return count;
    }
}
