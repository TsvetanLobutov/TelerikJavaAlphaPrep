package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Digits {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            String[] mask = in.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                matrix[i][j] = Integer.parseInt(mask[j]);
            }
        }
        int result = OneSum(matrix) + TwoSum(matrix) + ThreeSum(matrix) + FourSum(matrix) + FiveSum(matrix) + SixSum(matrix) + SevenSum(matrix) + EightSum(matrix) + NineSum(matrix);
        System.out.println(result);

    }

    public static int OneSum(int[][] matrix) {
        int sum = 0;

        for (int row = 2; row < matrix.length-2; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {
                if (matrix[row][col] == 1 && matrix[row - 1][col+1] == 1 && matrix[row-2][col+2] == 1 && matrix[row-1][col+2] == 1 && matrix[row][col+2] == 1 && matrix[row+1][col+2] == 1 && matrix[row+2][col+2] == 1) {
                    sum++;
                }
            }
        }

        return sum;
    }

    public static int TwoSum(int[][] matrix) {
        int sum = 0;

        for (int row = 1; row < matrix.length - 3; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {
                if (matrix[row][col] == 2 && matrix[row - 1][col + 1] == 2 && matrix[row][col + 2] == 2 && matrix[row + 1][col + 2] == 2 && matrix[row + 2][col + 1] == 2 && matrix[row + 3][col] == 2 && matrix[row + 3][col + 1] == 2 && matrix[row + 3][col + 2] == 2) {
                    sum += 2;
                }
            }
        }
        return sum;
    }

    public static int ThreeSum(int[][] matrix) {
        int sum = 0;

        for (int row = 0; row < matrix.length - 4; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {
                if (matrix[row][col] == 3 && matrix[row][col+1] == 3 && matrix[row][col+2] == 3 && matrix[row+1][col+2]==3 && matrix[row+2][col+1]==3 && matrix[row+2][col+2]==3 && matrix[row+3][col+2]==3 && matrix[row+4][col]==3&&matrix[row+4][col+1]==3&&matrix[row+4][col+2]==3) {
                    sum+=3;
                }
            }
        }
        return sum;
    }

    public static int FourSum(int[][] matrix) {
        int sum = 0;

        for (int row = 0; row < matrix.length - 4; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {
                if (matrix[row][col] == 4 && matrix[row][col+2] == 4 && matrix[row+1][col] == 4 && matrix[row+1][col+2] == 4 && matrix[row+2][col] == 4 && matrix[row+2][col+1] == 4 && matrix[row+2][col+2] == 4 && matrix[row+3][col+2] == 4 && matrix[row+4][col+2] == 4) {
                    sum+=4;
                }
            }
        }
        return sum;
    }

    public static int FiveSum(int[][] matrix) {
        int sum = 0;

        for (int row = 0; row < matrix.length - 4; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {
                if (matrix[row][col] == 5 && matrix[row][col+1] == 5 && matrix[row][col+2] == 5 && matrix[row+1][col] == 5 && matrix[row+2][col] == 5 && matrix[row+2][col+1] == 5 && matrix[row+2][col+2] == 5 && matrix[row+3][col+2]==5 && matrix[row+4][col] == 5 && matrix[row+4][col+1] == 5 && matrix[row+4][col+2] == 5) {
                    sum+= 5;
                }
            }
        }
        return sum;
    }

    public static int SixSum(int[][] matrix) {
        int sum = 0;

        for (int row = 0; row < matrix.length - 4; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {
                if (matrix[row][col] == 6 && matrix[row][col+1] == 6 && matrix[row][col+2] == 6 && matrix[row+1][col] == 6 && matrix[row+2][col] == 6 && matrix[row+2][col+1] == 6 && matrix[row+2][col+2] == 6 && matrix[row+3][col] == 6 && matrix[row+3][col+2] == 6 && matrix[row+4][col] == 6 && matrix[row+4][col+1] == 6 && matrix[row+4][col+2] == 6) {
                    sum+=6;
                }
            }
        }
        return sum;
    }

    public static int SevenSum(int[][] matrix) {
        int sum = 0;

        for (int row = 0; row < matrix.length - 4; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {
                if (matrix[row][col] == 7 && matrix[row][col+1] == 7 && matrix[row][col+2] == 7 && matrix[row+1][col+2] == 7 && matrix[row+2][col+1] == 7 && matrix[row+3][col+1] == 7 && matrix[row+4][col+1] == 7) {
                    sum+=7;
                }
            }
        }
        return sum;
    }

    public static int EightSum(int[][] matrix) {
        int sum = 0;

        for (int row = 0; row < matrix.length - 4; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {
                if (matrix[row][col] == 8 && matrix[row][col+1] == 8 && matrix[row][col+2] == 8 && matrix[row+1][col] == 8 && matrix[row+1][col+2] == 8 && matrix[row+2][col+1] == 8 && matrix[row+3][col] == 8 && matrix[row+3][col+2] == 8 && matrix[row+4][col] == 8 && matrix[row+4][col+1] == 8 && matrix[row+4][col+2] == 8) {
                    sum+=8;
                }
            }
        }
        return sum;
    }

    public static int NineSum(int[][] matrix) {
        int sum = 0;

        for (int row = 0; row < matrix.length - 4; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {
                if (matrix[row][col] == 9 && matrix[row][col+1] == 9 && matrix[row][col+2] == 9 && matrix[row+1][col] == 9 && matrix[row+1][col+2] == 9 && matrix[row+2][col+1] == 9 && matrix[row+2][col+2] == 9 && matrix[row+3][col+2] == 9 && matrix[row+4][col] == 9 && matrix[row+4][col+1] == 9 && matrix[row+4][col+2] == 9) {
                    sum+=9;
                }
            }
        }
        return sum;
    }
}
