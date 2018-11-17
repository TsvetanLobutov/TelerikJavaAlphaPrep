package com.company;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);



        String inputString = in.nextLine();
        String[] arrString = inputString.split(" ");
        Integer[] arr = new Integer[arrString.length];
        for (int i = 0; i < arrString.length; i++) {
            arr[i] = Integer.parseInt(arrString[i]);
        }

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // swap the values at the left and right indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            // increase start counter
            start++;
            // decrease end counter
            end--;
        }



       for (int num = 0 ; num < arr.length; num++) {

            if (arr[num] != arr[arr.length - 1] ) {
                System.out.print(arr[num] + ", ");
            } else {
                System.out.print(arr[num]);
            }
   //       System.out.print(arr[num] + ", ");

       }

    }
}
