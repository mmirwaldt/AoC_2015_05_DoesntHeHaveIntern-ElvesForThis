package net.mirwaldt.aoc.year2015.day05;

import java.util.Arrays;
import java.util.List;

public class PartOneStringChecker implements StringChecker {
    private final List<String> FORBIDDEN_STRINGS = Arrays.asList("ab", "cd", "pq", "xy");
    private final List<String> VOWELS = Arrays.asList("a", "i", "o", "u", "e");

    @Override
    public Result checkString(String input) {
        for (String forbiddenString : FORBIDDEN_STRINGS) {
            if(input.contains(forbiddenString)) {
                return Result.NAUGHTY;
            }
        }

        boolean hasDoubleLetterInRow = false;
        int vowelCounter = 0;
        String lastCharString = "";
        for (int i = 0; i < input.length(); i++) {
            final String charString = input.substring(i, i+1);
            if(VOWELS.contains(charString)) {
                vowelCounter++;
            }
            if(lastCharString.equals(charString)) {
                hasDoubleLetterInRow = true;
            }
            if(3 <= vowelCounter && hasDoubleLetterInRow) {
                return Result.NICE;
            }
            lastCharString = charString;
        }
        return Result.NAUGHTY;
    }
}
