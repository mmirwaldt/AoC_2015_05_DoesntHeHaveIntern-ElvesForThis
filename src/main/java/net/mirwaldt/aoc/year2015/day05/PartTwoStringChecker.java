package net.mirwaldt.aoc.year2015.day05;

import java.util.HashMap;
import java.util.Map;

public class PartTwoStringChecker implements StringChecker {
    @Override
    public Result checkString(String input) {
        if(doesAnyPairOccurTwice(input) && hasOneLetterSurroundOneLetter(input)) {
            return Result.NICE;
        } else {
            return Result.NAUGHTY;
        }
    }

    private boolean hasOneLetterSurroundOneLetter(String input) {
        String surroundingLetter = input.substring(0, 1);
        String surroundedLetter = input.substring(1, 2);
        for (int i = 2; i < input.length(); i++) {
            final String charString = input.substring(i, i+1);
            if(surroundingLetter.equals(charString)) {
                return true;
            }
            surroundingLetter = surroundedLetter;
            surroundedLetter = charString;
        }
        return false;
    }

    private boolean doesAnyPairOccurTwice(String input) {
        Map<String, Integer> pairsWithPositions = new HashMap<>();
        for (int i = 0; i < input.length() - 1; i++) {
            final String newPair = input.substring(i, i + 2);
            final Integer position = pairsWithPositions.get(newPair);
            if(position != null && 2 <= i - position) {
                return true;
            } else if(position == null) {
                pairsWithPositions.put(newPair, i);
            }
        }
        return false;
    }
}
