package com.company;

import java.util.Arrays;

public class Missing {
    // Function to ind missing number
    static int getMissingNo (int a[], int n)
    {
        int i, total;
        total  = (n+1)*(n+2)/2;
        for ( i = 0; i< n; i++)
            total -= a[i];
        return total;
    }

    /* program to test above function */
    public static void main(String args[])
    {
        int a[] = {4,3,2,7,8,2,3,1};
        int miss = getMissingNo(a,5);
        System.out.println(miss);
    }
}
