package com.kovanlabs.intern.week.task.day5regex;

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
