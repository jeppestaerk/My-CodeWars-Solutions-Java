package kata.kyu4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfProperFractionsWithDenominatorDTest {
    @Test
    public void Smaller_Numbers() {
        assertEquals(0, NumberOfProperFractionsWithDenominatorD.properFractions(1));
        assertEquals(1, NumberOfProperFractionsWithDenominatorD.properFractions(2));
        assertEquals(4, NumberOfProperFractionsWithDenominatorD.properFractions(5));
        assertEquals(8, NumberOfProperFractionsWithDenominatorD.properFractions(15));
        assertEquals(20, NumberOfProperFractionsWithDenominatorD.properFractions(25));
    }

    @Test
    public void Larger_Numbers() {
        assertEquals(6637344, NumberOfProperFractionsWithDenominatorD.properFractions(9999999));
        assertEquals(58752000, NumberOfProperFractionsWithDenominatorD.properFractions(99999999));
        assertEquals(648646704, NumberOfProperFractionsWithDenominatorD.properFractions(999999999));
    }
}