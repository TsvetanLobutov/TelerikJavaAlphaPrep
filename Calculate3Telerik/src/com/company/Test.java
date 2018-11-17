package com.company;


import java.math.BigInteger;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();

        int r = N - K;

        BigInteger numerator  = BigInteger.valueOf(1);
        BigInteger denumerator   = BigInteger.valueOf(1);
        for (int i = K + 1; i <= N; i++) {
            // numerator *= i;
            numerator = numerator.multiply(BigInteger.valueOf(i));
            // numerator = numerator.add(i);
            // denumerator = denumerator.add(r);
            denumerator = denumerator.multiply(BigInteger.valueOf(r));
            r--;
        }

        System.out.println(numerator.divide(denumerator));


    }
}
