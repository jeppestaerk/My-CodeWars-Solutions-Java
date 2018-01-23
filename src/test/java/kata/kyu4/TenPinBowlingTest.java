package kata.kyu4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TenPinBowlingTest {
    @Test
    public void BasicTests() {
        assertEquals(20, new TenPinBowling().bowlingScore("11 11 11 11 11 11 11 11 11 11"));
        assertEquals(300, new TenPinBowling().bowlingScore("X X X X X X X X X XXX"));
        assertEquals(118, new TenPinBowling().bowlingScore("5/ 17 8/ 8/ 6/ 23 00 9/ 16 XXX"));
    }

}