package com.company;

import java.util.Scanner;

public class GFG {
    /* Driver program to test maxSubArraySum */
    public static void main(String[] args)
    {
        //int a[] = {2, 3, -6, -1, 2, -1, 6, 4, -8, 8};
        //
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int[] a = new int[k];
        int n = a.length;
        for(int i = 0; i < k; i++){
            a[i] = in.nextInt();
        }

        //        int i = 0;
//        while( i < k){
//            a[i] = in.nextInt();
//            k--;
//        }

        int max_sum = maxSubArraySum(a, n);
        System.out.println(max_sum);
    }
    static int maxSubArraySum(int a[], int size)
    {
        int max_so_far = a[0];
        int curr_max = a[0];

        for (int i = 1; i < size; i++)
        {
            curr_max = Math.max(a[i], curr_max+a[i]);
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }
}

