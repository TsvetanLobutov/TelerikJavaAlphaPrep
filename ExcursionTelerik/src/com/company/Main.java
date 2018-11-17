package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr1 = new int[1][1];
        for (int a = 0; a < 1; a++) {
            for (int b = 0; b < 1; b++) {
                arr1[a][b] = in.nextInt();
            }
        }

        int n = in.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < 2; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int count = 0;
                if (arr[i][j] >= arr1[i][j]) {
                    System.out.println("No Crashes");

                } else {
                    count++;
                    System.out.println(count);
                }
            }
        }
    }
}
