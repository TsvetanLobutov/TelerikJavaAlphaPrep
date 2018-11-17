package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        Arrays.sort(arr);

        int max_count = 0;
        int res = arr[0];
        int curr_count = 0;

        for (int i = 1; i < n; i++) {
            arr[i] = in.nextInt();
            if (arr[i] == arr[i - 1]) {
                curr_count++;
            }else {
                if (curr_count > max_count)
                {
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

        System.out.println(max_count);

    }
}
