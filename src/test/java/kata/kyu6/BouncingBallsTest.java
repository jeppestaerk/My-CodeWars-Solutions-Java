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

    @Test
    public void test3() {
        assertEquals(-1, BouncingBalls.bouncingBall(0, 0.66, 1.5));
    }

    @Test
    public void test4() {
        assertEquals(-1, BouncingBalls.bouncingBall(30.0, 0, 1.5));
    }

    @Test
    public void test5() {
        assertEquals(-1, BouncingBalls.bouncingBall(30.0, 1, 1.5));
    }

    @Test
    public void test6() {
        assertEquals(-1, BouncingBalls.bouncingBall(1, 0.66, 1.5));
    }
}