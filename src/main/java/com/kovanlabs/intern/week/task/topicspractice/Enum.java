package com.kovanlabs.intern.week.task.topicspractice;

enum Month{
    January(1), February(2), March(3), April(4), May(5), June(6), July(7), August(8), September(9), October(10), November(11), December(12);

    private int monthNo;

    Month(int monthNo){
        this.monthNo = monthNo;
    }
    public int getMonth(){
        return monthNo;
    }
}

public class Enum {
    public static void main(String[] args) {
        for(Month s : Month.values()){
            System.out.println(s+" : "+s.getMonth());
        }
    }
}
