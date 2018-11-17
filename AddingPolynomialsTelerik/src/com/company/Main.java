package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args)throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());

        int[] sumPolinome = new int[n];

        StringBuilder result = new StringBuilder();

        String[] firstPolinomeAsString = in.readLine().split(" ");
        String[] secondPolinomeAsString = in.readLine().split(" ");

        for(int i = 0; i < n; i++){
            sumPolinome[i] = Integer.parseInt(firstPolinomeAsString[i]) + Integer.parseInt(secondPolinomeAsString[i]);
            result.append(sumPolinome[i]).append(" ");
        }
        System.out.print(result.toString());


    }
}
