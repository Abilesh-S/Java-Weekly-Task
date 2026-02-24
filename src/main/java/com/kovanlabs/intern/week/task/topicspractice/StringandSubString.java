package com.kovanlabs.intern.week.task.topicspractice;

public class StringandSubString {
    public static void main(String[] args) {
        String s = "0";

        for(int i = 0; i<10000; i++){
            s = s.concat(String.valueOf(i));
        }
        StringBuilder sb = new StringBuilder("0");
        for(int i = 0; i<10000; i++){
            sb = sb.append(String.valueOf(i));
        }
        StringBuffer sb2 = new StringBuffer("0");
        for(int i = 0; i<10000; i++){
            sb2 = sb2.append(String.valueOf(i));
        }
    }
}
