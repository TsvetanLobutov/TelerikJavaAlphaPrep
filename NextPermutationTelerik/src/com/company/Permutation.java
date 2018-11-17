package com.company;

import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
//        int n = Integer.parseInt(args[0]);
//        int[] a = new int[n];
//
//        // insert integers 0..n-1
//        for (int i = 0; i < n; i++)
//            a[i] = i;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }

        // shuffle
        for (int i = 0; i < 1; i++) {
           // int r = (int) (Math.random() * (i+1));     // int between 0 and i
            int r = a[a.length - 1];
            int swap = a[a.length - 2];
            a[a.length - 1] = swap;
            a[a.length -2] = r;
        }

        // print permutation
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
       // System.out.println("");

        // print checkerboard visualization
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (a[j] == i) //System.out.print("* ");
//                else           //System.out.print(". ");
//            }
         //   System.out.println("");
       // }
    }
}
