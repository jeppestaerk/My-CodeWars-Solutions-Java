package kata.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiveMeADiamondTest {

    @Test
    public void testDiamondNull1() {
        assertEquals(null, GiveMeADiamond.print(2));
    }

    @Test
    public void testDiamondNull2() {
        assertEquals(null, GiveMeADiamond.print(-1));
    }

    @Test
    public void testDiamond3() {
        StringBuffer expected = new StringBuffer();
        expected.append(" *\n");
        expected.append("***\n");
        expected.append(" *\n");

        assertEquals(expected.toString(), GiveMeADiamond.print(3));
    }

    @Test
    public void testDiamond5() {
        StringBuffer expected = new StringBuffer();
        expected.append("  *\n");
        expected.append(" ***\n");
        expected.append("*****\n");
        expected.append(" ***\n");
        expected.append("  *\n");

        assertEquals(expected.toString(), GiveMeADiamond.print(5));
    }
}