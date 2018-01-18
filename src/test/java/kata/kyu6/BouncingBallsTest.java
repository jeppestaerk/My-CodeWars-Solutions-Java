package kata.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BouncingBallsTest {
    @Test
    public void test1() {
        assertEquals(3, BouncingBalls.bouncingBall(3.0, 0.66, 1.5));
    }

    @Test
    public void test2() {
        assertEquals(15, BouncingBalls.bouncingBall(30.0, 0.66, 1.5));
    }
}