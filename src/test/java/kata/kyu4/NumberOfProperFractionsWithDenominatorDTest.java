package kata.kyu4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfProperFractionsWithDenominatorDTest {
    @Test
    public void Smaller_Numbers() {
        assertEquals(0, new NumberOfProperFractionsWithDenominatorD().properFractions(1));
        assertEquals(1, new NumberOfProperFractionsWithDenominatorD().properFractions(2));
        assertEquals(4, new NumberOfProperFractionsWithDenominatorD().properFractions(5));
        assertEquals(8, new NumberOfProperFractionsWithDenominatorD().properFractions(15));
        assertEquals(20, new NumberOfProperFractionsWithDenominatorD().properFractions(25));
    }

    @Test
    public void Larger_Numbers() {
        assertEquals(6637344, new NumberOfProperFractionsWithDenominatorD().properFractions(9999999));
        assertEquals(58752000, new NumberOfProperFractionsWithDenominatorD().properFractions(99999999));
        assertEquals(648646704, new NumberOfProperFractionsWithDenominatorD().properFractions(999999999));
    }
}