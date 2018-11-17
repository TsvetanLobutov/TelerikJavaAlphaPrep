package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        // set Up
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int[][] matrix = new int[n][m];

        boolean[][] isPassed = new boolean[n][m];

        for (int rows = 0; rows < n; rows++) {
            String[] line = in.readLine().split(" ");
            for (int cols = 0; cols < m; cols++) {
                matrix[rows][cols] = Integer.parseInt(line[cols]);
            }
        }
        int maxSizeNeighbour = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int localMax = findNeighbour(j, i, isPassed, matrix);
                if (localMax > maxSizeNeighbour) {
                    maxSizeNeighbour = localMax;
                }
            }
        }
        System.out.println(maxSizeNeighbour);
    }

    // Factory
    static int findNeighbour(int x, int y, boolean[][] isPassed, int[][] matrix) {
        int col = matrix[0].length;
        int row = matrix.length;

        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{-1, 0, 1, 0};

        int numberToCheck = matrix[y][x];
        int depth = 1;
        isPassed[y][x] = true;

        for (int i = 0; i < dx.length; i++) {
            int xx = x + dx[i];
            int yy = y + dy[i];
            if (xx >= 0 && yy >= 0 && xx < col && yy < row) {
                if (!isPassed[yy][xx] && matrix[yy][xx] == numberToCheck) {
                    isPassed[yy][xx] = true;
                    depth += findNeighbour(xx, yy, isPassed, matrix);
                }
            }
        }
        return depth;
    }
}