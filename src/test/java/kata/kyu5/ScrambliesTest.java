package kata.kyu5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScrambliesTest {

    private static void testing(boolean actual, boolean expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void test() {
        System.out.println("Fixed Tests scramble");
        testing(new Scramblies().scramble("rkqodlw", "world"), true);
        testing(new Scramblies().scramble("cedewaraaossoqqyt", "codewars"), true);
        testing(new Scramblies().scramble("katas", "steak"), false);
        testing(new Scramblies().scramble("scriptjavx", "javascript"), false);
        testing(new Scramblies().scramble("scriptingjava", "javascript"), true);
        testing(new Scramblies().scramble("scriptsjava", "javascripts"), true);
        testing(new Scramblies().scramble("javscripts", "javascript"), false);
        testing(new Scramblies().scramble("aabbcamaomsccdd", "commas"), true);
        testing(new Scramblies().scramble("commas", "commas"), true);
        testing(new Scramblies().scramble("sammoc", "commas"), true);
    }

}