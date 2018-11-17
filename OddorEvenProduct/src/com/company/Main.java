package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        long oddsSum = 1;
        long evensSum = 1;

        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        // Loop to find even, odd sum
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                evensSum *= arr[i];
            else
                oddsSum *= arr[i];
        }

        if(evensSum == oddsSum){
            System.out.println("yes " + evensSum);
        }else{
            System.out.println("no " + evensSum  + " " + oddsSum );
        }

        }
    }

