package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();

        int[][] matrix = new int[row][col];

        // Enter Matrix Data
        enterMatrixData(in, matrix, row, col);

    }

    public static void enterMatrixData(Scanner in, int[][] matrix, int row, int col) {

        System.out.println("Enter Matrix Data");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
    }
}


