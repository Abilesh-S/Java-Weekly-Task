package com.kovanlabs.intern.week1.task.matrix;

public class SpiralMatrix {

    void spiralnxn(int n){
        int r = 0 , c = 0 ,count = 0;
        boolean[][] visited = new boolean[n][n];
        int[][] matrix = new int[n][n];
        int[] dr = {0 , 1 , 0 , -1 };
        int[] dc = {1 , 0 , -1 , 0 };
        int idx = 0;
        for(int i = 0 ; i < n*n ; i++) {
            matrix[r][c] = i + 1;
            visited[r][c] = true;
            int newr = r + dr[idx];
            int newc = c + dc[idx];
            if (newr >= 0 && newr < n && newc >= 0 && newc < n && !visited[newr][newc]) {
                r = newr;
                c = newc;
            } else {
                idx = (idx + 1) % 4;
                r += dr[idx];
                c += dc[idx];
            }
        }
        new SpiralMatrix().display(matrix , n);
    }

    void display(int[][] matrix , int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        new SpiralMatrix().spiralnxn(5);
    }
}
