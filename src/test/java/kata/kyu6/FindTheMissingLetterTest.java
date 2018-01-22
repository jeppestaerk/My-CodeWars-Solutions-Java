package kata.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindTheMissingLetterTest {
    @Test
    public void exampleTests() {
        assertEquals('e', new FindTheMissingLetter().findMissingLetter(new char[]{'a', 'b', 'c', 'd', 'f'}));
        assertEquals('P', new FindTheMissingLetter().findMissingLetter(new char[]{'O', 'Q', 'R', 'S'}));
        assertEquals(' ', new FindTheMissingLetter().findMissingLetter(new char[]{'a', 'b', 'c', 'd', 'e'}));
    }
}