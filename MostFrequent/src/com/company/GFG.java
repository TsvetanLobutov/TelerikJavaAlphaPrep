package com.company;

import java.util.*;

public class GFG {

  public static void main (String[] args) {


      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int[] arr = new int[size];


      Arrays.sort(arr);


      int j = 0;
      while (j < size) {
          arr[j] = in.nextInt();
          ++j;

          }
      int n = arr.length;

      int[] result = mostFrequent(arr,n);

       System.out.println(result[0] + " (" + result[1] + " times)");


    }
    static int[] mostFrequent(int arr[], int n) {
      Arrays.sort(arr);

        int max_count = 1;
        int res = arr[0];
        int curr_count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                curr_count++;
            } else {
                if (curr_count > max_count) {
                    max_count = curr_count;
                    res = arr[i - 1];
                }
                curr_count = 1;
            }
        }

        // If last element is most frequent
        if (curr_count > max_count)
        {
            max_count = curr_count;
            res = arr[n - 1];
        }
        int[] arr1 = new int[2];
        arr1[0] = res;
        arr1[1] = max_count;


        return arr1;
    }
}
