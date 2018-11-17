package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;

        for (int i = 0; i <= n; i = i + 2) {
            for (int j = 0; j <= n; j = j + 5) {
                for (int k = 0; k <= n; k = k + 7) {
                    if (i + j + k == n) {
                        count++;

                    }
                }
            }
        }
        System.out.println(count);


    }
}
