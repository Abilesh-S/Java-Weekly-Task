package com.kovanlabs.intern.week.task.regexDay5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextScrubber {

    private void replaceDigitsRemovePunctuation(String str){
        String regularExpressionPattern = "\\d";
        String patternToBeReplaced = "*";
        String punctuationRemoved = "[!._]";
        String replacementResult = str.replaceAll(regularExpressionPattern, patternToBeReplaced);
        String finalResult = replacementResult.replaceAll(punctuationRemoved, "");

        System.out.println(finalResult);

    }

    public static void main(String args[]){
        String text = "H3ll0 W0rld! Th1s is J4v4.";
        new TextScrubber().replaceDigitsRemovePunctuation(text);

    }
}
