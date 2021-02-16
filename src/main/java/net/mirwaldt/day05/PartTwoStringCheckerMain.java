package net.mirwaldt.day05;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class PartTwoStringCheckerMain {
    public static void main(String[] args) throws IOException {
        final List<String> lines = Files.readAllLines(Path.of("input.txt"), StandardCharsets.US_ASCII);
        StringChecker stringChecker = new PartTwoStringChecker();
        int niceStrings = 0;
        for (String line : lines) {
            if(stringChecker.checkString(line).equals(StringChecker.Result.NICE)) {
                niceStrings++;
            }
        }
        System.out.println(niceStrings);
    }
}
