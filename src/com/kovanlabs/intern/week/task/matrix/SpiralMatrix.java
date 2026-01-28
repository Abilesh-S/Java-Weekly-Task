package com.kovanlabs.intern.week.task.matrix;

public class SpiralMatrix {

    void spiralnxn(int n){
        int row = 0 , col = 0 ;
        boolean[][] visitedMatrix = new boolean[n][n];
        int[][] matrixToBeAdded = new int[n][n];
        int[] directionrow = {0 , 1 , 0 , -1 };
        int[] directioncol = {1 , 0 , -1 , 0 };
        int indexDirection = 0;
        for(int i = 0 ; i < n*n ; i++) {
            matrixToBeAdded[row][col] = i + 1;
            visitedMatrix[row][col] = true;
            int newrow = row + directionrow[indexDirection];
            int newcol = col + directioncol[indexDirection];
            if (newrow >= 0 && newrow < n && newcol >= 0 && newcol < n && !visitedMatrix[newrow][newcol]) {
                row = newrow;
                col = newcol;
            } else {
                indexDirection = (indexDirection + 1) % 4;
                row += directionrow[indexDirection];
                col += directioncol[indexDirection];
            }
        }
        new SpiralMatrix().display(matrixToBeAdded , n);
    }

    void display(int[][] matrixToBeAdded , int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n; j++){
                System.out.print(matrixToBeAdded[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        new SpiralMatrix().spiralnxn(5);
    }
}
