package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();


        int M = Math.abs(N - K);
        int factN = 1;
        int factK = 1;
        int factM = 1;

        for (int i = 1; 1 <= N; i++) {
            factN = factN * i;
        }

        for (int i = 1; 1 <= K; i++) {
            factK = factK * i;
        }
        for (int i = 1; 1 <= M; i++) {
            factM = factM * i;
        }


        System.out.println(factN / (factK * factM));


    }
}
