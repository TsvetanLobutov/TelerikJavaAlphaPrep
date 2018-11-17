package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String data = in.nextLine();
        String tmpDataArray[] = data.split(",");
        int arr[] = new int[tmpDataArray.length];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = Integer.parseInt(tmpDataArray[i]);
        }

        Arrays.sort(arr);

         int k = arr.length;

        int n = arr.length;
        n = removeDuplicates(arr, n);

//        for (int i=0; i < n; i++)
//            System.out.print(arr[i]+" ");


        for (int i=0; i < k; i++) {
            if (arr[i] != (i + 1) && arr[i] == arr[arr.length - 1] ){
                System.out.print(i + 1);}
            if (arr[i] != (i+1) && arr[i] != arr[arr.length - 1]){
                System.out.print((i + 1)  + ",");

            }
        }

    }

    static int removeDuplicates(int arr[], int n)
    {
        // Return, if array is empty
        // or contains a single element
        if (n==0 || n==1)
            return n;

        int[] temp = new int[n];

        // Start traversing elements
        int j = 0;
        for (int i=0; i<n-1; i++)
            // If current element is not equal
            // to next element then store that
            // current element
            if (arr[i] != arr[i+1])
                temp[j++] = arr[i];

        // Store the last element as whether
        // it is unique or repeated, it hasn't
        // stored previously
        temp[j++] = arr[n-1];

        // Modify original array
        for (int i=0; i<j; i++)
            arr[i] = temp[i];

        return j;
    }
}
