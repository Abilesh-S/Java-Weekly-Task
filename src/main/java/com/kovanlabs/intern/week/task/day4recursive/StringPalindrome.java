package com.kovanlabs.intern.week.task.day4recursive;

public class StringPalindrome {

    private String reverseString(String str,int lengthOfString){
        if(lengthOfString<0){
            return "";
        }
        return  str.charAt(lengthOfString) + reverseString(str , lengthOfString - 1);
    }

    public boolean recursiveStringPalindrome(String str) {
        String rev = reverseString(str , str.length()-1);
        if(rev.equals(str)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "levels";
        StringPalindrome palindrome = new StringPalindrome();
        System.out.println(palindrome.recursiveStringPalindrome(s));
    }
}
