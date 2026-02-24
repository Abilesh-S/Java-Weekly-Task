package com.kovanlabs.intern.week.task.oopscollection.topicspractice.datetime;

import java.util.Calendar;
import java.util.Date;

public class DateAndTime {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println("Before setTime : "+date1.toString());
        System.out.println("After setTime : "+date1.getTime());

        Date date2 = new Date(98,12,21);
        System.out.println("Date 2 Before Date 1 Operation : "+date1.before(date2));
        System.out.println("Date 2 After Date 1 Operation : "+date1.after(date2));

        System.out.println("Date 1 and 2 equals : "+date1.equals(date2));

        Calendar calendar = Calendar.getInstance();
        System.out.println("Year : "+calendar.getWeekYear());
    }

}
