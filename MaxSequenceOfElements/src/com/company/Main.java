package com.company;

import java.util.Scanner;

/*
    Write a program that finds the length of maximal sequence of equal elements in an array of N numbers.
    10
    2,1,1,2,3,3,3,2,2,2,1,3
     */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] numbers = new int[n];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = in.nextInt();
        }

        int max = 0;
        int current = 1;
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] == numbers[i - 1]){
                current++;
                max = Math.max(max, current);
            }else{
                max = Math.max(max, current);
                current = 1;
            }
        }

        System.out.println(max);
    }
}
