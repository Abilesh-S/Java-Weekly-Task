package com.kovanlabs.intern.week1.task.pattern;

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
        new DiamondPattern().upwardPyramid(7);
        new DiamondPattern().downwardPyramid(7);
    }
}
