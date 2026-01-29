package com.kovanlabs.intern.week.task.pattern;
import java.util.Scanner;

public class DiamondPattern {
    public void upwardPyramid(int a){
        for(int i = 0 ;i <= a ; i++){
            for (int j = 0; j < a-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public void downwardPyramid(int a){
        for(int i = a-1 ;i >= 0 ; i--){
            for(int j = 0; j < a - i ; j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k <= i; k++ ){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Diamond size");
        n =sc.nextInt();
        new DiamondPattern().upwardPyramid(n);
        new DiamondPattern().downwardPyramid(n);
    }
}
