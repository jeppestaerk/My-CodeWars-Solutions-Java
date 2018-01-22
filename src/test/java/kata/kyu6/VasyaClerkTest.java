package kata.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VasyaClerkTest {
    @Test
    public void test1() {
        assertEquals("YES", new VasyaClerk().tickets(new int[]{25, 25, 50}));
    }

    @Test
    public void test2() {
        assertEquals("NO", new VasyaClerk().tickets(new int[]{25, 100}));
    }

    @Test
    public void test3() {
        assertEquals("YES", new VasyaClerk().tickets(new int[]{25, 25, 50, 100}));
    }

    @Test
    public void test4() {
        assertEquals("NO", new VasyaClerk().tickets(new int[]{25, 50, 100}));
    }
}