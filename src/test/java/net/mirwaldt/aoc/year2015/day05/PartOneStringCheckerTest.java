package net.mirwaldt.aoc.year2015.day05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartOneStringCheckerTest {
    private final static StringChecker stringChecker = new PartOneStringChecker();

    private static Stream<Arguments> stringChecker() {
        return Stream.of(Arguments.of(stringChecker));
    }

    @ParameterizedTest
    @MethodSource("stringChecker")
    void test_niceStrings(StringChecker stringChecker) {
        Assertions.assertEquals(StringChecker.Result.NICE, stringChecker.checkString("aaa"));
        Assertions.assertEquals(StringChecker.Result.NICE, stringChecker.checkString("aaio"));
        Assertions.assertEquals(StringChecker.Result.NICE, stringChecker.checkString("ugknbfddgicrmopn"));
    }

    @ParameterizedTest
    @MethodSource("stringChecker")
    void test_naughtyStrings(StringChecker stringChecker) {
        Assertions.assertEquals(StringChecker.Result.NAUGHTY, stringChecker.checkString("ab"));
        Assertions.assertEquals(StringChecker.Result.NAUGHTY, stringChecker.checkString("cd"));
        Assertions.assertEquals(StringChecker.Result.NAUGHTY, stringChecker.checkString("pq"));
        Assertions.assertEquals(StringChecker.Result.NAUGHTY, stringChecker.checkString("xy"));
        Assertions.assertEquals(StringChecker.Result.NAUGHTY, stringChecker.checkString("daiod"));
        Assertions.assertEquals(StringChecker.Result.NAUGHTY, stringChecker.checkString("jchzalrnumimnmhp"));
        Assertions.assertEquals(StringChecker.Result.NAUGHTY, stringChecker.checkString("haegwjzuvuyypxyu"));
        Assertions.assertEquals(StringChecker.Result.NAUGHTY, stringChecker.checkString("dvszwmarrgswjxmb"));
    }
}
