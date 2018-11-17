package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Div {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");

        int firstNum = Integer.parseInt(input[0]);
        int secondNum = Integer.parseInt(input[1]);

        StringBuilder printout = new StringBuilder();

        int gcd = GCD(firstNum, secondNum);

        if (gcd == 1) {
            System.out.println(-1);
            return;
        }

        for (int i = 2; i <= gcd; i++) {
            if (!isPrime(i)) continue;

            if (gcd % i == 0) printout.append(i).append(" ");
        }

        System.out.print(printout);
    }

    private static int GCD(int a, int b) {
        if (b == 0) return a;
        return GCD(b, a % b);
    }

    private static boolean isPrime(int n) {
        if (n < 4) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
