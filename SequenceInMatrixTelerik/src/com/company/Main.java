package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] sizeInput = reader.readLine().split(" ");

        final int rows = Integer.parseInt(sizeInput[0]);

        String[][] matrix = new String[rows][];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = reader.readLine().split(" ");
        }

        int maxSequence = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int currentSequence = checkHor(matrix, i, j) + checkVert(matrix, i, j) + checkDiagOne(matrix, i, j) + checkDiagTwo(matrix, i, j) + 1;
                if (currentSequence > maxSequence) maxSequence = currentSequence;
            }
        }

        System.out.println(maxSequence);
    }

    private static int checkHor(String[][] matrix, int row, int col) {
        int counter = 0;

        //Check right
        for (int i = col; i < matrix[row].length - 1; i++) {
            if (matrix[row][i].equals(matrix[row][i + 1])) {
                counter++;
            } else {
                break;
            }
        }

        //Check left
        for (int i = col; i >= 1; i--) {
            if (matrix[row][i].equals(matrix[row][i - 1])) {
                counter++;
            } else {
                break;
            }
        }

        return counter;
    }

    private static int checkVert(String[][] matrix, int row, int col) {
        int counter = 0;

        //Check up
        for (int i = row; i >= 1; i--) {
            if (matrix[i][col].equals(matrix[i - 1][col])) {
                counter++;
            } else {
                break;
            }
        }

        //Check down
        for (int i = row; i < matrix.length - 1; i++) {
            if (matrix[i][col].equals(matrix[i + 1][col])) {
                counter++;
            } else {
                break;
            }
        }

        return counter;
    }

    private static int checkDiagOne(String[][] matrix, int row, int col) {
        int counter = 0;

        //Check left-up
        int i = row;
        int j = col;
        while (i > 0 && j > 0) {
            if (matrix[i][j].equals(matrix[i - 1][j - 1])) {
                counter++;
                i--;
                j--;

            } else {
                break;
            }
        }

        //Check right-down
        i = row;
        j = col;

        while (i < matrix.length - 1 && j < matrix[0].length - 1) {
            if (matrix[i][j].equals(matrix[i + 1][j + 1])) {
                counter++;
                i++;
                j++;

            } else {
                break;
            }
        }

        return counter;
    }

    private static int checkDiagTwo(String[][] matrix, int row, int col) {
        int counter = 0;
        int i = row;
        int j = col;

        //Check right-up
        while (i > 0 && j < matrix[0].length - 1) {
            if (matrix[i][j].equals(matrix[i - 1][j + 1])) {
                counter++;
                i--;
                j++;

            } else {
                break;
            }
        }

        //Check left-down
        i = row;
        j = col;
        while (i < matrix.length - 1 && j > 0) {
            if (matrix[i][j].equals(matrix[i + 1][j - 1])) {
                counter++;
                i++;
                j--;

            } else {
                break;
            }
        }

        return counter;
    }
}
