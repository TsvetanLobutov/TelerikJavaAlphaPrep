package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[] arr = new int[1024];

        for(int i = 1; i <= N; i++){
            arr[i] = i;
        }



        // loop through the numbers one by one
        for (int i = 1; i <= N; i++) {
            boolean isPrime = true;
            if (arr[i] == 0)
                isPrime = false;
            else {
                // check to see if the numbers are prime
                for (int j = 2; j <= arr[i] / 2; j++) {
                    if (arr[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            // print the number
            if (isPrime)
                System.out.print(arr[i] + " ");
        }
    }
}
