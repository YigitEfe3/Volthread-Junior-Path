package org.example.RegularExpressions;

import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TestHarness {

    public static void main(String[] args){
        Console console = System.console();
        if (console == null) {
            System.err.println("No console.");
            System.exit(1);
        }
        while (true) {

            Pattern pattern = Pattern.compile(console.readLine("%nEnter your regex: "));
            //Pattern pattern2 = Pattern.compile(console.readLine("%nEnter your regex: "), Pattern.CASE_INSENSITIVE);
            //Pattern pattern3 = Pattern.compile("[az]$", Pattern.MULTILINE | Pattern.UNIX_LINES);

            Matcher matcher = pattern.matcher(console.readLine("Enter input string to search: "));

            boolean found = false;

            while (matcher.find()) {
                console.format("I found the text \"%s\" starting at index %d and ending at index %d.%n", matcher.group(), matcher.start(), matcher.end());

                found = true;
            }
            if(!found){
                console.format("No match found.%n");
            }
        }
    }
}