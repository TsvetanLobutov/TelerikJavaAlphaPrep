package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = 0;
        long k = 0;

        long[] arr = new long[2];
        for(int i = 0; i < 2; i++){
            arr[i] = in.nextLong();
            n = arr[0];
            k = arr[1];

        }


        long e = 0;
        int br = 0;
        int brb = 0;
        // int count = 0;

        while(k != 0) {

            e = k % 10;
            br++;

            k /= 10;

            if (e == 0) {
                brb++;
                // break;
            }

        }
        System.out.println(brb+(n-br));


    }
}

