package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static long[][] matrix;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = in.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);
        matrix = new long[N][M];
        long result = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    if (i == 0 || j == 0 || i == matrix.length - 1 || j == matrix[i].length - 1) {
                        result += (3 * (i + j) + 1);
                    } else {
                        result += ((3 * (i + j) + 1) * 2);
                    }
                }
            }
        }
        System.out.println(result);
    }
}
