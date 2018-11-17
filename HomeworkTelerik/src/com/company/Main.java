package com.company;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();


        long p = 0;

        if (n == 1) {
            System.out.println(0);
        } else {

            int i = 2;
            p = 0;
            while (i <= sqrt(n)) {
                if (n % i == 0) {
                    p = i;
                    break;
                } else i++;
            }
            if (i > sqrt(n))
                System.out.println(n - 1);
            else
                System.out.println(n - n / p);
        }
    }
}
