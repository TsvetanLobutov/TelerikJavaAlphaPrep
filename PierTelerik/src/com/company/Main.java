package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

import static java.lang.Math.abs;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Integer[] arr = new Integer[n];

        String input = "";
        for(int i = 0; i < n ; i++) {
            Integer num = in.nextInt();
            input = input + num + " ";
            arr[i] = num;
        }
        Arrays.sort(arr, Collections.reverseOrder());

        int leftSide = arr[0];
        int rightside = arr[1];

        for(int i = 2; i < arr.length; i++){
            if(leftSide > rightside){
                rightside = rightside + arr[i];
            }else{
                leftSide = leftSide + arr[i];
            }
        } int minSum = abs(leftSide - rightside);

        if (arr.length == 3 || arr.length == 2) {
            System.out.println(minSum);
        } else {
            System.out.println(input);
        }
    }
}
