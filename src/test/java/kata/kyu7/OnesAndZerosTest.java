package kata.kyu7;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class OnesAndZerosTest {
    @Test
    public void convertBinaryArrayToInt() {
        assertEquals(1, OnesAndZeros.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 0, 0, 1))));
        assertEquals(15, OnesAndZeros.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 1, 1, 1))));
        assertEquals(6, OnesAndZeros.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 1, 1, 0))));
        assertEquals(9, OnesAndZeros.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 0, 0, 1))));
    }
}