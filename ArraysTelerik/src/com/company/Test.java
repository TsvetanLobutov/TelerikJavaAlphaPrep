package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] arr2 = new int[m];
        for (int j = 0; j < m; j++) {
            arr2[j] = in.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

         int same = 0;
        for (int i = 0; i <= arr1.length - 1; i++) {
            for(int j = 0; j <= arr2.length - 1; j++) {
                if (arr1[i] == arr2[j]) {
                    same++;
                    arr2[j] = arr2[0] - 1;
                    break;
                }

                if(arr1[i] != arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    arr2[j] = arr2[0]-1 ;
                    break;
                }
            }

        }
      //  System.out.println(same);


    }
}
