package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n = in.nextLong();
        long[] arr1 = new long[1001];
        for (int i = 0; i < n; i++) {
            arr1[i] = in.nextLong();}

        long m = in.nextInt();
        long[] arr2 = new long[1001];
            for (int j = 0; j < m; j++) {
                arr2[j] = in.nextLong();
            }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        long br1 = 0;
        long br = 0;

        for(int i = 1; i <= 1000; i++) {
            if(arr1[i] != 0) br++;
        }

        for(int i = 1; i <= 1000; i++) {
            if(arr2[i] != 0) br1++;
        }
//        System.out.println(br);
//        System.out.println(br1);

        if(br != br1) {
            for(int i = 1; i<=1000; i++) {
                if(arr1[i]!=0 && arr2[i]==0) System.out.print(i + " ");
            }
        } else
        System.out.println(br1);
    }

}



