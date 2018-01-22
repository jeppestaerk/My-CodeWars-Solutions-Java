package kata.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TripleTroubleTest {

    @Test
    public void test1() {
        assertEquals(1, TripleTrouble.tripleDouble(451999277L, 41177722899L));
    }

    @Test
    public void test2() {
        assertEquals(0, TripleTrouble.tripleDouble(1222345L, 12345L));
    }

    @Test
    public void test3() {
        assertEquals(0, TripleTrouble.tripleDouble(12345L, 12345L));
    }

    @Test
    public void test4() {
        assertEquals(1, TripleTrouble.tripleDouble(666789L, 12345667L));
    }

    @Test
    public void test5() {
        assertEquals(0, TripleTrouble.tripleDouble(451999277L, 411777228L));
    }
}