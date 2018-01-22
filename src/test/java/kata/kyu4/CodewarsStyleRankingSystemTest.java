package kata.kyu4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CodewarsStyleRankingSystemTest {
    CodewarsStyleRankingSystem.User user;

    @Before
    public void setup() {
        user = new CodewarsStyleRankingSystem.User();
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidRangeNeg9() {
        new CodewarsStyleRankingSystem.User().incProgress(-9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidRange0() {
        new CodewarsStyleRankingSystem.User().incProgress(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidRange9() {
        new CodewarsStyleRankingSystem.User().incProgress(9);
    }

    @Test
    public void progressAdd3() {
        user.incProgress(-8);
        assertEquals(3, user.progress);
    }

    @Test
    public void progressAdd1() {
        user.rank = 1;
        user.incProgress(-1);
        assertEquals(1, user.progress);
    }

    @Test
    public void progressAdd0() {
        user.rank = 1;
        user.incProgress(-2);
        assertEquals(0, user.progress);
    }

    @Test
    public void progressAdd10() {
        user.rank = -1;
        user.incProgress(1);
        assertEquals(10, user.progress);
    }

    @Test
    public void progressAdd40() {
        user.incProgress(-6);
        assertEquals(40, user.progress);
    }

    @Test
    public void progressAdd90() {
        user.incProgress(-5);
        assertEquals(90, user.progress);
    }

    @Test
    public void progressAdd90AndRankUp() {
        user.incProgress(-4);
        assertEquals(60, user.progress);
        assertEquals(-7, user.rank);
    }

    @Test
    public void rank8max() {
        user.progress = 110;
        user.incProgress(8);
        assertEquals(0, user.progress);
        assertEquals(8, user.rank);
    }
}