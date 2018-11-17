package com.company;

import java.util.Scanner;

public class GFG {
    // Java code to print the
    // sum of the series
    static double sum(int x, int n)
    {
        double total = 1;
        int ifac = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                ifac *= j;
            }
            total += ifac / (Math.pow(x, n));
        }   return total;
    }

    // Driver code
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        System.out.printf("%.5f", sum(x, n));
    }
}

// This code is contributed by
// Smitha Dinesh Semwal


