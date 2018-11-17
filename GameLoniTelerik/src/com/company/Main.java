package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[2];

        int n = 0;
        int k = 0;


        for(int i = 0; i < 2;i++){
            arr[i] = in.nextInt();
              n = arr[0];
              k = arr[1];
            }

        int[] arr1 = new int[n + 1];
        int max = 0;
        int count =0;
        int v = 0;
        for(int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();

            for(int j = 2; j <= k; j++) {
                if (arr1[i] % j == 0 && k % j == 0) {
                    count++;}

                    if(max < count){
                        max = count;
                    }else {count = 0;}

            }

        }
        if(max!=0) {
            System.out.println(max);
            v = 0;
            for(int i=1;i <= n;i++) {

                if(arr1[i] == max)
                    if(v == 0){
                        System.out.println(i); v = 1;}
                    else System.out.println(" " + i);
            }
        }
        else System.out.println("No winners");


    }
}
