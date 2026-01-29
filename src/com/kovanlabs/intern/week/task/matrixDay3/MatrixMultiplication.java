package com.kovanlabs.intern.week.task.matrixDay3;

public class MatrixMultiplication {

    public void matrixMultiply(int[][] matrix1, int[][] matrix2) {
        int row = matrix1.length;
        int col = matrix2[0].length;
        int[][] result = new int[row][col];

        for (int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++){
                for (int k = 0; k < matrix2.length ; k++) {
                    result[i][j] += matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        new MatrixMultiplication().matrixDisplay(result);
    }

    public void matrixDisplay(int[][] result) {
        System.out.println("Matrix Multiplication of A and B");
        for(int i = 0; i < result.length ; i++){
            for(int j = 0; j < result[i].length; j++ ){
                System.out.print(result[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{5,4,3},{7,1,2},{3,4,1}} ;
        int[][] matrix2 = {{3,4,7},{1,1,3},{4,7,2}} ;
        MatrixMultiplication m = new MatrixMultiplication();
        if(matrix1.length == matrix2[0].length){
            m.matrixMultiply(matrix1, matrix2);
        }
        else{
            System.out.println("Operation Cannot be Processed");
        }
    }
}
