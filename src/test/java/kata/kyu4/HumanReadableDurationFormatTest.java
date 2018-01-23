package kata.kyu4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HumanReadableDurationFormatTest {
    @Test
    public void testFormatDurationExamples() {
        assertEquals("1 second", new HumanReadableDurationFormat().formatDuration(1));
        assertEquals("1 minute and 2 seconds", new HumanReadableDurationFormat().formatDuration(62));
        assertEquals("2 minutes", new HumanReadableDurationFormat().formatDuration(120));
        assertEquals("1 hour", new HumanReadableDurationFormat().formatDuration(3600));
        assertEquals("1 hour, 1 minute and 2 seconds", new HumanReadableDurationFormat().formatDuration(3662));
    }

}