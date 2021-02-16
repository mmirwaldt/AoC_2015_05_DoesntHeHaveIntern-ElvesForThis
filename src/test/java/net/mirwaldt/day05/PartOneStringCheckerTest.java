package net.mirwaldt.day05;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static net.mirwaldt.day05.StringChecker.Result.NAUGHTY;
import static net.mirwaldt.day05.StringChecker.Result.NICE;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartOneStringCheckerTest {
    private final static StringChecker stringChecker = new PartOneStringChecker();

    private static Stream<Arguments> stringChecker() {
        return Stream.of(Arguments.of(stringChecker));
    }

    @ParameterizedTest
    @MethodSource("stringChecker")
    void test_niceStrings(StringChecker stringChecker) {
        assertEquals(NICE, stringChecker.checkString("aaa"));
        assertEquals(NICE, stringChecker.checkString("aaio"));
        assertEquals(NICE, stringChecker.checkString("ugknbfddgicrmopn"));
    }

    @ParameterizedTest
    @MethodSource("stringChecker")
    void test_naughtyStrings(StringChecker stringChecker) {
        assertEquals(NAUGHTY, stringChecker.checkString("ab"));
        assertEquals(NAUGHTY, stringChecker.checkString("cd"));
        assertEquals(NAUGHTY, stringChecker.checkString("pq"));
        assertEquals(NAUGHTY, stringChecker.checkString("xy"));
        assertEquals(NAUGHTY, stringChecker.checkString("daiod"));
        assertEquals(NAUGHTY, stringChecker.checkString("jchzalrnumimnmhp"));
        assertEquals(NAUGHTY, stringChecker.checkString("haegwjzuvuyypxyu"));
        assertEquals(NAUGHTY, stringChecker.checkString("dvszwmarrgswjxmb"));
    }
}
