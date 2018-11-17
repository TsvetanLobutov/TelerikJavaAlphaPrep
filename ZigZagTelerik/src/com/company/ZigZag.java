package com.company;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class ZigZag {
    static void fakeInput() {
        String test = "5\n"+
                "6";
        System.setIn(new ByteArrayInputStream(test.getBytes()));
    }
    public static void main(String[] args) {
        //fakeInput();
        Scanner in = new Scanner(System.in);

        int rows = in.nextInt();
        int cols = in.nextInt();

        if (rows == 1 || cols ==1){
            System.out.println(getValue(0,0));
            return;
        }

        long result = getValue(0,0);
        int row = 1;
        int col = 1;
        int dRow = -1;
        int dCol = +1;

        while (!atCorner (row, col, rows, cols)) {
            result += getValue(row, col);

            int nextRow = row;
            int nextCol = col + dCol;
            if (nextCol<0|| nextCol > cols - 1) {
                dCol *= -1;
                dRow*=-1;

            }


            row += dRow;
            col += dCol;
            dRow*=-1;


        }
        result += getValue(row, col);
        System.out.println(result);

    }
    private static long getValue (int row, int col) {
        int sum = row + col;
        return (long) (sum*3)+1;
    }
    private static boolean atCorner(int row, int col, int rows, int cols) {
        return  ((row <= 0 || row >= rows - 1) && (col <= 0 || col >= cols -1));
    }
}
