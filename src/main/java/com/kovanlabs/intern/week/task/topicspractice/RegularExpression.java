package com.kovanlabs.intern.week.task.topicspractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

    private void onlyInteger(String n){
        if(Pattern.matches("\\d+", n)){
            System.out.println("Only integer numbers");
        }
        else{
            System.out.println("No integer numbers");
        }
    }

    private void onlyString(String n){
        if(Pattern.matches("[a-zA-Z]+",n)){
            System.out.println("Only strings");
        }
        else{
            System.out.println("No strings");
        }
    }

    private void printOnlyString(String s){
        Pattern p = Pattern.compile("[a-zA-Z]+");
        Matcher m = p.matcher(s);
        System.out.println("Only Characther Printing");
        while(m.find()){
            System.out.println(m.group()+" ");
        }
    }

    private void printOnlyDigits(String s){
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(s);
        System.out.println("Only digits Printing");
        while(m.find()){
            System.out.println(m.group()+"");
        }
    }

    public static void main(String[] args) {
        RegularExpression r = new RegularExpression();
        String s = "12345";
        r.onlyInteger(s);
        r.onlyString(s);
        String specificDataType = "Oorum Blood 10000 Aura";
        r.printOnlyString(specificDataType);
        r.printOnlyDigits(specificDataType);
      /*Sample Program with Below Condition
      * input : "Order 123 shipped on 2025"
       *output : 123
       *        2025
      * */
        String practice = "Order 123 shipped on 2025";
        System.out.println("Sample Program Practicing 1");
        r.printOnlyDigits(practice);
        /*Sample Program with Below Condition
         * input : "Java Python C++"
         *output : Java
         *        Python
         *          C
         * */
        String practice2 = "Java Python C++";
        System.out.println("Sample Program Practicing 2");
        r.printOnlyDigits(practice2);
    }


}

