package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        System.out.println("The size you enetered is " + size);
        int[] a = new int[size];
        System.out.println("Enter the array: ");

        Arrays.sort(a);

        int max_count = 0;
        int res = a[0];
        int curr_count = 0;


        int j = 0;
        while (j < size) {
            System.out.print("Enter " + (j + 1) + ": ");
            a[j] = in.nextInt();
            ++j;

            if (a[j] == a[j - 1]) {
                curr_count++;
            }else {
                if (curr_count > max_count)
                {
                    max_count = curr_count;
                    res = a[j - 1];
                }
                curr_count = 1;
            }
        }

        // If last element is most frequent
        if (curr_count > max_count)
        {
            max_count = curr_count;
            res = a[size - 1];
        }

        System.out.println(max_count);
        in.close();
        }

    }
