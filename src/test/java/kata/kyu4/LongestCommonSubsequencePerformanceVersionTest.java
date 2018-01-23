package kata.kyu4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonSubsequencePerformanceVersionTest {
    @Test
    public void fixedTests() {
        assertEquals("", new LongestCommonSubsequencePerformanceVersion().lcs("", ""));
        assertEquals("", new LongestCommonSubsequencePerformanceVersion().lcs("abc", ""));
        assertEquals("", new LongestCommonSubsequencePerformanceVersion().lcs("", "abc"));
        assertEquals("", new LongestCommonSubsequencePerformanceVersion().lcs("a", "b"));
        assertEquals("a", new LongestCommonSubsequencePerformanceVersion().lcs("a", "a"));
        assertEquals("ac", new LongestCommonSubsequencePerformanceVersion().lcs("abc", "ac"));
        assertEquals("abc", new LongestCommonSubsequencePerformanceVersion().lcs("abcdef", "abc"));
        assertEquals("acf", new LongestCommonSubsequencePerformanceVersion().lcs("abcdef", "acf"));
        assertEquals("nottest", new LongestCommonSubsequencePerformanceVersion().lcs("anothertest", "notatest"));
        assertEquals("12356", new LongestCommonSubsequencePerformanceVersion().lcs("132535365", "123456789"));
        assertEquals("final", new LongestCommonSubsequencePerformanceVersion().lcs("nothardlythefinaltest", "zzzfinallyzzz"));
        assertEquals("acdefghijklmnoq", new LongestCommonSubsequencePerformanceVersion().lcs("abcdefghijklmnopq", "apcdefghijklmnobq"));
    }

}