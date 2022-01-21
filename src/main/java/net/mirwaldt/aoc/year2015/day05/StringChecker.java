package net.mirwaldt.aoc.year2015.day05;

public interface StringChecker {
    enum Result {
        NICE, NAUGHTY
    }

    Result checkString(String input);
}
