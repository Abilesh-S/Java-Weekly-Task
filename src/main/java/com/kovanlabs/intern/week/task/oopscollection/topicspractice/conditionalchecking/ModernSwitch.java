package com.kovanlabs.intern.week.task.oopscollection.topicspractice.conditionalchecking;

import java.time.DayOfWeek;
import java.util.Scanner;

public class ModernSwitch {
    public static void main(String[] args) {
        System.out.print("Enter Any day in a weeks: ");
        DayOfWeek day = DayOfWeek.TUESDAY;
        System.out.println("day: " + day);
        Integer noOfDays  = switch (day) {
            case MONDAY , FRIDAY ,SUNDAY : yield   6;
            case TUESDAY : {
                System.out.println("Befor Yield");
                yield 7;

            }
            case THURSDAY , SATURDAY : yield 8;
            case WEDNESDAY : yield 9;
            default : yield null;
        };
        System.out.println("noOfDays: " + noOfDays);
    }

}
