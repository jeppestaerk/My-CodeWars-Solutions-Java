package kata.kyu4;

import org.junit.Before;
import org.junit.Test;

public class CodewarsStyleRankingSystemTest {
    CodewarsStyleRankingSystem.User user;

    @Before
    public void setup() {
        user = new CodewarsStyleRankingSystem.User();
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidRangeNeg9() {
        user.incProgress(-9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidRange0() {
        user.incProgress(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidRange9() {
        user.incProgress(9);
    }
}