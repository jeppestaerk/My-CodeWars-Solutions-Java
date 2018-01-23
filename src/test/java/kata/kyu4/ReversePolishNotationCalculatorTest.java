package kata.kyu4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReversePolishNotationCalculatorTest {

    @Test
    public void shouldWorkWithEmptyString() {
        assertEquals("Should work with empty string", 0, new ReversePolishNotationCalculator().evaluate(""), 0);
    }

    @Test
    public void shouldParseNumbers() {
        assertEquals("Should parse numbers", 3, new ReversePolishNotationCalculator().evaluate("1 2 3"), 0);
    }

    @Test
    public void shouldParseFloatNumbers() {
        assertEquals("Should parse float numbers", 3.5, new ReversePolishNotationCalculator().evaluate("1 2 3.5"), 0);
    }

    @Test
    public void shouldSupportAddition() {
        assertEquals("Should support addition", 4, new ReversePolishNotationCalculator().evaluate("1 3 +"), 0);
    }

    @Test
    public void shouldSupportMultiplication() {
        assertEquals("Should support multiplication", 3, new ReversePolishNotationCalculator().evaluate("1 3 *"), 0);
    }

    @Test
    public void shouldSupportSubstraction() {
        assertEquals("Should support substraction", -2, new ReversePolishNotationCalculator().evaluate("1 3 -"), 0);
    }

    @Test
    public void shouldSupportDivision() {
        assertEquals("Should support division", 2, new ReversePolishNotationCalculator().evaluate("4 2 /"), 0);
    }

}