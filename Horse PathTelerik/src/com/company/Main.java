package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][] matrix = new int[n][n];

        int[] dRows = {-2, -2, -1, -1, +1, +1, +2, +2};
        int[] dCols = {-1, +1, -2, +2, -2, +2, -1, +1};

        int counter = 1;

        for(int r = 0; r < matrix.length; r++){
            for(int c = 0; c < matrix[r].length; c++){
                int row = r;
                int col = c;

                while(matrix[row][col] == 0){
                    matrix[row][col] = counter;
                    counter++;

                    for(int dir = 0; dir < dRows.length; dir++){
                        int nextRow = row + dRows[dir];
                        int nextCol = col + dCols[dir];

                        if (nextRow < 0 || nextRow >= matrix.length ||
                                nextCol < 0 || nextCol >= matrix.length) {
                            continue;
                        }

                        if (matrix[nextRow][nextCol] != 0) {
                            continue;
                        }

                        row = nextRow;
                        col = nextCol;
                        break;
                    }
                }
            }
        }
        for (int[] row : matrix) {
            String result = "";
            for (int cell : row) {
                result += cell + " ";
            }
            System.out.println(result.trim());
        }

    }
}
