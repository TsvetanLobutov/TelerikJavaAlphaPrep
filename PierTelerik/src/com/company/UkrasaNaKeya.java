package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UkrasaNaKeya {
    public static void main(String[] args)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final int numberOfStatues = Integer.parseInt(reader.readLine());

        String[] arr = reader.readLine().split(" ");

        System.out.println(findMin(arr, numberOfStatues));

    }
    private static int findMinRec(int arr[], int i, int sumCalculated, int sumTotal){
        // If we have reached last element.
        // Sum of one subset is sumCalculated,
        // sum of other subset is sumTotal-
        // sumCalculated.  Return absolute
        // difference of two sums.
        if(i == 0)
            return Math.abs((sumTotal - sumCalculated) - sumCalculated);

        // For every item arr[i], we have two choices
        // (1) We do not include it first set
        // (2) We include it in first set
        // We return minimum of two choices
        return Math.min(findMinRec(arr,i -1, sumCalculated + arr[i -1],sumTotal),
                findMinRec(arr, i - 1, sumCalculated, sumTotal));
    }
    // Returns minimum possible difference between
    // sums of two subsets
    private static int findMin(String arr[], int n){
        int sumTotal = 0;
        int[] intArr = new int[arr.length];
        for(int i = 0; i < n; i++){
            intArr[i] = Integer.parseInt(arr[i]);
            sumTotal += intArr[i];
        }
        // Compute result using recursive function
        return findMinRec(intArr, n, 0,sumTotal);
    }
}
