package kata.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecodeTheMorseCodeTest {
    @Test
    public void testExampleFromDescription() {
        assertEquals("HEY JUDE", new DecodeTheMorseCode().decode(".... . -.--   .--- ..- -.. ."));
    }

}