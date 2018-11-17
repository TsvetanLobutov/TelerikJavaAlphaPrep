package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        float sum = 0;
        int[] arr = new int[n];
        float res = 0;

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();

        }
        Arrays.sort(arr);
        int firstNum = arr[0];
        int lastNum = arr[arr.length-1];
        sum = IntStream.of(arr).sum() - (firstNum + lastNum);
        System.out.println(sum);
        res = sum / (n - 2);

        System.out.println(Math.round(res));

    }
}
