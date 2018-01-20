package kata.kyu4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareIntoSquaresProtectTreesTest {
    @Test
    public void test1() {
        SquareIntoSquaresProtectTrees d = new SquareIntoSquaresProtectTrees();
        long n = 2;
        assertEquals(null, d.decompose(n));
    }

    @Test
    public void test2() {
        SquareIntoSquaresProtectTrees d = new SquareIntoSquaresProtectTrees();
        long n = 11;
        assertEquals("1 2 4 10", d.decompose(n));
    }

    @Test
    public void test3() {
        SquareIntoSquaresProtectTrees d = new SquareIntoSquaresProtectTrees();
        long n = 12;
        assertEquals("1 2 3 7 9", d.decompose(n));
    }

    @Test
    public void test4() {
        SquareIntoSquaresProtectTrees d = new SquareIntoSquaresProtectTrees();
        long n = 12551;
        assertEquals("4 11 158 12550", d.decompose(n));
    }

    @Test
    public void test5() {
        SquareIntoSquaresProtectTrees d = new SquareIntoSquaresProtectTrees();
        long n = 13365;
        assertEquals("4 12 163 13364", d.decompose(n));
    }

    @Test
    public void test6() {
        SquareIntoSquaresProtectTrees d = new SquareIntoSquaresProtectTrees();
        long n = 13705;
        assertEquals("2 6 12 165 13704", d.decompose(n));
    }
}