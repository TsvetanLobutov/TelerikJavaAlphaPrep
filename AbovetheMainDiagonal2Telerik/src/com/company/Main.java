package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(input.readLine());
        long sum = 0;

        for (int row = 0; row < size; row++) {
            for (int col = row; col < size; col++) {
                long current = longPow(2, row) * longPow(2, col);
                sum += current;
            }
        }

        System.out.println(sum);
    }
    public static long longPow(long a, long b) {
        long result = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                result *= a;
            }
            b >>= 1;
            a *= a;
        }
        return result;
    }
}
