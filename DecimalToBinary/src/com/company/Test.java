package com.company;

import java.util.Scanner;

public class Test {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] binaryNum = new int[n];
        int i = 0;
        // counter for binary array

        while (n > 0) {
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }

        // printing binary array in reverse order
       for (int j = i - 1; j >= 0; j--){
            System.out.print(binaryNum[j]);
        }
    }
}

