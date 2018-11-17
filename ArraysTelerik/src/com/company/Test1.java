package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);



        int n = in.nextInt();
        int[] arr1 = new int[1001];
        for (int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();

        }

        int m = in.nextInt();
        int[] arr2 = new int[1001];
        for (int j = 0; j < m; j++) {
            arr2[j] = in.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
//
//        for (int i = 0; i < n; i++) {
//
//
//            int[] temp = new int[n];
//
//            // Start traversing elements
//            int j = 0;
//            for (int k=0; k<n-1; k++)
//                // If current element is not equal
//                // to next element then store that
//                // current element
//                if (arr1[i] != arr1[i+1])
//                    temp[j++] = arr1[i];
//
//            // Store the last element as whether
//            // it is unique or repeated, it hasn't
//            // stored previously
//            temp[j++] = arr1[n-1];
//
//            // Modify original array
//            for (int k=0; k<j; k++)
//                arr1[i] = temp[i];
//
//        }
//        for (int j = 0; j < m; j++) {
//
//
//            int[] temp = new int[m];
//
//            // Start traversing elements
//            //int j = 0;
//            for (int i=0; i<m-1; i++)
//                // If current element is not equal
//                // to next element then store that
//                // current element
//                if (arr2[i] != arr2[i+1])
//                    temp[j++] = arr2[i];
//
//            // Store the last element as whether
//            // it is unique or repeated, it hasn't
//            // stored previously
//            temp[j++] = arr2[m-1];
//
//            // Modify original array
//            for (int i=0; i<j; i++)
//                arr2[i] = temp[i];
//        }

        for (int i=0; i<n; i++)
            System.out.print(arr1[i]+" ");


       for (int j=0; j < m; j++)
            System.out.print(arr2[j]+" ");




//        int same = 0;
//        for (int i = 0; i < m; i++) {
//
//
//                if(arr1[i] == arr2[i]){
//                    same++;
//
//                }
//
//
//        }
//        System.out.println(same);

    }
}
