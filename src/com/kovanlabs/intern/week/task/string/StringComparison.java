package com.kovanlabs.intern.week1.task.string;

public class StringComparison {
    public void comparisonAndHashCode(){
        String s1 , s2;
        String s3 = new String("Hello");
        s1 = "Hello";
        s2 = "Hello";
        System.out.println("S1 and S2 are Equal "+(s1==s2));
        System.out.println("S1 ,S2 is not Equal to S3 "+(s1==s3));
        System.out.println("Hash Code for the \nS1 = "+s1.hashCode()+"\nS2 = "+s2.hashCode()+"\nS3 = "+s3.hashCode());
    }
    public static void main(String[] args) {
        new StringComparison().comparisonAndHashCode();
    }
}
