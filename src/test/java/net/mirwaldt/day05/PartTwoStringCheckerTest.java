package net.mirwaldt.day05;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static net.mirwaldt.day05.StringChecker.Result.NAUGHTY;
import static net.mirwaldt.day05.StringChecker.Result.NICE;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartTwoStringCheckerTest {
    private final static StringChecker stringChecker = new PartTwoStringChecker();

    private static Stream<Arguments> stringChecker() {
        return Stream.of(Arguments.of(stringChecker));
    }

    @ParameterizedTest
    @MethodSource("stringChecker")
    void test_niceStrings(StringChecker stringChecker) {
        assertEquals(NICE, stringChecker.checkString("qjhvhtzxzqqjkmpb"));
        assertEquals(NICE, stringChecker.checkString("xxyxx"));
        assertEquals(NICE, stringChecker.checkString("xyxy"));
        assertEquals(NICE, stringChecker.checkString("xxxxyx"));
        assertEquals(NICE, stringChecker.checkString("xyabcyxy"));
    }

    @ParameterizedTest
    @MethodSource("stringChecker")
    void test_naughtyStrings(StringChecker stringChecker) {
        assertEquals(NAUGHTY, stringChecker.checkString("aaa"));
        assertEquals(NAUGHTY, stringChecker.checkString("xyx"));
        assertEquals(NAUGHTY, stringChecker.checkString("xyyyx"));
        assertEquals(NAUGHTY, stringChecker.checkString("uurcxstgmygtbstg"));
        assertEquals(NAUGHTY, stringChecker.checkString("uurcxxtgmygtbstg"));
        assertEquals(NAUGHTY, stringChecker.checkString("ieodomkazucvgmuy"));
    }
}
