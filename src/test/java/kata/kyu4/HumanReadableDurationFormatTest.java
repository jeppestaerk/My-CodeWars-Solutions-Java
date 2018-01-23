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
        assertEquals("23 hours, 59 minutes and 2 seconds", new HumanReadableDurationFormat().formatDuration(86342));
        assertEquals("1 year, 11 days, 12 hours, 41 minutes and 34 seconds", new HumanReadableDurationFormat().formatDuration(32532094));
        assertEquals("2 years, 16 days, 1 hour, 31 minutes and 33 seconds", new HumanReadableDurationFormat().formatDuration(64459893));
        assertEquals("now", new HumanReadableDurationFormat().formatDuration(0));
    }

}