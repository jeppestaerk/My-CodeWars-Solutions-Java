package kata.kyu4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsEncoderTest {
    @Test
    public void shouldCovertToRoman() {
        assertEquals("solution(1) should equal to I", "I", new RomanNumeralsEncoder().solution(1));
        assertEquals("solution(4) should equal to IV", "IV", new RomanNumeralsEncoder().solution(4));
        assertEquals("solution(6) should equal to VI", "VI", new RomanNumeralsEncoder().solution(6));
    }

}