package com.company;

import java.io.*;
import java.util.Scanner;

public class EvenOddSum {
    public static void main(String args[]) {
       // Scanner in = new Scanner(System.in);
       // int n = in.nextInt();
       // int[] arr = new int[n];

       int arr[] = { 1, 2, 3, 4, 5, 6 };
        int even = 0, odd = 0;

        // Loop to find even, odd sum
        for (int i = 0; i < arr.length; i++) {
            //int n = in. nextInt();
            if (i % 2 == 0) {
                even *= arr[i];
                even++;
            }else{
                odd = odd * arr[i];
                odd++;
            }
        }

        System.out.println("Even index positions sum: " + even);
        System.out.println("Odd index positions sum: " + odd);
    }
}
