package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static int count = 0;
    public static int position = 0;
    public static boolean flag = false;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String data = in.nextLine();
        String tmpDataArray[] = data.split(",");
        int a[] = new int[tmpDataArray.length];
        for (int i = 0; i < a.length; ++i) {
            a[i] = Integer.parseInt(tmpDataArray[i]);
        }

        // Arrays.sort(a);

        findMissingNumbers(a, position);

    }

    private static void findMissingNumbers(int a[], int position) {

        if (position == a.length - 1)
            return;

        for (; position < a[a.length - 1]; position++) {

            if ((a[position] - count) != position) {
                System.out.println("Missing Number: " + (position + count));
                flag = true;
                count++;
                break;
            }
        }

        if (flag) {
            flag = false;
            findMissingNumbers(a, position);
        }
    }
}
