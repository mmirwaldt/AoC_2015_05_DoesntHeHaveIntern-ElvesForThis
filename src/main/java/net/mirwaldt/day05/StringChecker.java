package net.mirwaldt.day05;

public interface StringChecker {
    enum Result {
        NICE, NAUGHTY
    }

    Result checkString(String input);
}
