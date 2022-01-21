package net.mirwaldt.aoc.year2015.day05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartTwoStringCheckerTest {
    private final static StringChecker stringChecker = new PartTwoStringChecker();

    private static Stream<Arguments> stringChecker() {
        return Stream.of(Arguments.of(stringChecker));
    }

    @ParameterizedTest
    @MethodSource("stringChecker")
    void test_niceStrings(StringChecker stringChecker) {
        Assertions.assertEquals(StringChecker.Result.NICE, stringChecker.checkString("qjhvhtzxzqqjkmpb"));
        Assertions.assertEquals(StringChecker.Result.NICE, stringChecker.checkString("xxyxx"));
        Assertions.assertEquals(StringChecker.Result.NICE, stringChecker.checkString("xyxy"));
        Assertions.assertEquals(StringChecker.Result.NICE, stringChecker.checkString("xxxxyx"));
        Assertions.assertEquals(StringChecker.Result.NICE, stringChecker.checkString("xyabcyxy"));
    }

    @ParameterizedTest
    @MethodSource("stringChecker")
    void test_naughtyStrings(StringChecker stringChecker) {
        Assertions.assertEquals(StringChecker.Result.NAUGHTY, stringChecker.checkString("aaa"));
        Assertions.assertEquals(StringChecker.Result.NAUGHTY, stringChecker.checkString("xyx"));
        Assertions.assertEquals(StringChecker.Result.NAUGHTY, stringChecker.checkString("xyyyx"));
        Assertions.assertEquals(StringChecker.Result.NAUGHTY, stringChecker.checkString("uurcxstgmygtbstg"));
        Assertions.assertEquals(StringChecker.Result.NAUGHTY, stringChecker.checkString("uurcxxtgmygtbstg"));
        Assertions.assertEquals(StringChecker.Result.NAUGHTY, stringChecker.checkString("ieodomkazucvgmuy"));
    }
}
